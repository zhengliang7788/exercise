package leetcode;

/**
 * @author zhengLiang
 * @description 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 以数组形式返回答案。
 * @date 2020/3/6 10:15
 */
public class LessCurrentNo {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != nums[i] && nums[j] < nums[i]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arrs = {8, 1, 2, 2, 3};
        int arr[] = LessCurrentNo.smallerNumbersThanCurrent(arrs);
        for (int a : arr) {
            System.out.println(a);
        }

    }
}
