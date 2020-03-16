package leetcode;


/**
 * @author zhengLiang
 * @description
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * @date 2020/3/7 14:30
 */
public class ToLowerCase {
    public static  String toLowerCase(String str){
         char [] chars = str.toCharArray();
         for (int i= 0;i<chars.length;i++){
             if(64<chars[i] && chars[i]<91){
                  chars[i] += 32;
             }
         }
        return  String.valueOf(chars);
    }
    public static  void  toTop(String str3){
        StringBuffer buffer = new StringBuffer(str3);
        System.out.println(buffer.reverse());

    }

    public static void main(String[] args) {
        ToLowerCase.toTop(".spleh A+lrtC/dmC .thgis fo tuo si ti semitemos ,etihw si txet nehw sa drah kooL .tseretni wohs dluohs uoy ecalp a si ,dessecorp si xat hctuD erehw esac ehT .sedih tseuq fo txen eht erehw si ,deificeps era segaugnal cificeps-niamod tcudorp ehT");
    }
}
