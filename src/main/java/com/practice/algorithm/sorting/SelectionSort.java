package com.practice.algorithm.sorting;

/**
 * // 分类 -------------- 内部比较排序
 * // 数据结构 ---------- 数组
 * // 最差时间复杂度 ---- O(n^2)
 * // 最优时间复杂度 ---- O(n^2)
 * // 平均时间复杂度 ---- O(n^2)
 * // 所需辅助空间 ------ O(1)
 * // 稳定性 ------------ 不稳定
 *
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public class SelectionSort extends BaseSortShow {
    public static void main(String[] args) {
        new SelectionSort().show();
    }
    @Override
    protected void sort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int min=i;

            for (int j = i + 1; j < size; j++) {

                if (arr[j] < arr[min]) {
                    min=j;
                }

            }
            if (min != i) {
                swap(arr, min, i);
            }

        }

    }
}
