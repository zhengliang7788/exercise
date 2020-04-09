package algorithm;

/**
 * @author zhengLiang
 * @description 冒泡排序
 * @date 2020/3/26 22:27
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int []arr ={4,5,3,2,6,9,7,0,1,8};
         BubbleSort.sort(arr);
    }


}
