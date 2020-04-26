package pukmooc.week8;

import java.io.*;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

/**
 * @author zhengliang
 */
public class Downloader extends Thread {
    private URL url;
    private String file;
    CountDownLatch start ;
    CountDownLatch  end;
    public Downloader(URL url, String file) {
        this.url = url;
        this.file = file;
    }

    public void downLoad(URL url, String file) {
        try {
            InputStream input = url.openStream();
            OutputStream output = new FileOutputStream(file);
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        downLoad(url, file);
        long end = System.currentTimeMillis();
        System.out.println(url + "下载完成所用时间为:" + (end - start));
    }

    public static void main(String[] args) throws Exception {
        final URL[] urls = {
                new URL("http://www.pku.edu.cn"),
                new URL("http://www.baidu.com"),
                new URL("http://www.sina.com.cn"),
                new URL("http://www.dstang.com")
        };
        final String[] files = {
                "pku.htm",
                "baidu.htm",
                "sina.htm",
                "study.htm",
        };
        for (int idx = 0; idx < urls.length; idx++) {
            try {
                Thread thread = new Thread(new Downloader(urls[idx], files[idx]));
                thread.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
