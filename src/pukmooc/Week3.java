package pukmooc;

/**
 * @author zhengLiang
 * @description 用“埃氏筛法”求2～100以内的素数。2～100以内的数，先去掉2的倍数，再去掉3的倍数，再去掉5的倍数，……依此类推，最后剩下的就是素数
 * @date 2020/3/2 11:11
 */
public class Week3 {
    public static void main(String[] args) {
        int N = 100;
        boolean [] a = new boolean[N+1];
        for( int i=0; i<=N; i++ ) {
            a[i] = true;
        }
        for( int i=2; i<=N; i++ ){
            for( int j=2*i; j<=N; j += i ){
                a[j] = false;
            }
        }

        for( int i=2; i<=N; i++ ){
            if( a[i] ){
                System.out.println( i );
            }
        }

    }
}
