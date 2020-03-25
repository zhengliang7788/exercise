package pukmooc;

/**
 * @author zhengLiang
 * @description
 * @date 2020/3/16 17:52
 */
public class TestMain {
    public static void main(String[] args) {
        double num = Math.pow(27,1.0/3);
        System.out.println(num);
        int sum =0;
        for(int i= 0;i< 100;i++){
            sum+=Math.pow(i,3);
           int a = (int )Math.pow(sum,1.0/3);
           if(a == Math.pow(num,1.0/3)){
               System.out.println(a);
           }
        }
    }
}
