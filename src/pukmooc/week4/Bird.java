package pukmooc.week4;

/**
 * @author zhengLiang
 * @description
 * @date 2020/3/25 10:40
 */
public class Bird extends Animal implements Fly {
    public Bird() {
        super();
    }
    /**
     * 开始飞翔
     */
    @Override
    public void startFly() {
        System.out.println("小鸟"+super.getName()+"开始飞翔");
    }
    /**
     * 完成飞翔
     */
    @Override
    public void finishFly() {
        System.out.println("结束飞翔");
    }
}
