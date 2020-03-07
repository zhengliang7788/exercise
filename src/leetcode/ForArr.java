package leetcode;

/**
 * @author zhengLiang
 * @description 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。
 * 请你统计并返回 grid 中 负数 的数目。
 * @date 2020/3/7 9:36
 */
public class ForArr {
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int num = grid[i][j];
                if (num < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int num = ForArr.countNegatives(grid);
        System.out.println(num);
    }
}
