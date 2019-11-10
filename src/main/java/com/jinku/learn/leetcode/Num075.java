package com.jinku.learn.leetcode;

/**
 * 颜色分类
 */
public class Num075 {

    public static void main(String[] args) {
        int[] color = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(color);
        System.out.println(color);
    }

    public static void sortColors(int[] nums) {
        int N = 3;
        int[] count = new int[N];
        for (int num : nums) {
            count[num] = count[num] + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            int color = 0;
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += count[j];
                if (i + 1 <= sum) {
                    color = j;
                    break;
                }
            }
            nums[i] = color;
        }
    }
}
