package leetcode;

/**
 * @author zhengLiang
 * @description 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 * @date 2020/3/7 8:59
 */
public class Ipv4 {
    public static String ipAddress(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(Ipv4.ipAddress("123.10.10.1"));
    }
}
