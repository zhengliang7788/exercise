package pukmooc.week6;

/**
 * @author zhengLiang
 * @description
 * @date 2020/4/9 13:57
 */
public class MyException extends  Exception {
    /**
     * 无参构造方法
     */
    public MyException() {
    }

    /**
     * 有参构造方法
     *
     * @param message
     */
    public MyException(String message) {
        super(message);
    }
}
