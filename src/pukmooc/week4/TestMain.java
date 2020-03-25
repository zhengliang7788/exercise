package pukmooc.week4;

/**
 * @author zhengLiang
 * @description
 * @date 2020/3/25 10:37
 */
public class TestMain {
    Animal[] animals = new Animal[4];

    public void init() {
        Bird bird1 = new Bird();
        bird1.setName(Util.BIRD1_NAME);
        Bird bird2 = new Bird();
        bird2.setName(Util.BIRD2_NAME);
        Bird bird3 = new Bird();
        bird3.setName(Util.BIRD3_NAME);
        Bird bird4 = new Bird();
        bird4.setName(Util.BIRD4_NAME);
        animals[0] = bird1;
        animals[1] = bird2;
        animals[2] = bird3;
        animals[3] = bird4;

    }

    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        System.out.println("******4X100米飞翔接力开始******");
        testMain.init();
        for (Animal animal : testMain.animals) {
            Bird bird = (Bird) animal;
            bird.startFly();
            System.out.println("用时:" + (int) (Math.random() * 10+9) + "秒");
            bird.finishFly();

        }
        System.out.println("******飞翔接力结束******");
    }
}
