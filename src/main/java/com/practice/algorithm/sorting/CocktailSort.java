package com.practice.algorithm.sorting;

/**
 * // 分类 -------------- 内部比较排序
 * // 数据结构 ---------- 数组
 * // 最差时间复杂度 ---- O(n^2)
 * // 最优时间复杂度 ---- 如果序列在一开始已经大部分排序过的话,会接近O(n)
 * // 平均时间复杂度 ---- O(n^2)
 * // 所需辅助空间 ------ O(1)
 * // 稳定性 ------------ 稳定
 *
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public class CocktailSort extends BaseSortShow {
    public static void main(String[] args) {
        new CocktailSort().show();

    }

    @Override
    public void sort(int[] arr) {

        int size = arr.length;
        int left = 0;
        int right = arr.length;
        while (left < right) {
            for (int j = left; j < right - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            right--;

            for (int j = right - 1; j >= left + 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }

            }
            left++;


        }

    }
}
