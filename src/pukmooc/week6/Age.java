package pukmooc.week6;

/**
 * @author zhengLiang
 * @description
 * @date 2020/4/9 14:04
 */
public class Age {
    public static void checkAge(int age) throws MyException{
        if(age>120||age<=0){
            throw  new MyException("年龄不正常,请输入正常年龄");
        }else{
            System.out.println("正常年龄！");
        }
    }

}
