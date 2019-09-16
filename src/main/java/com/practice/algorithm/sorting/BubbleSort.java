package com.practice.algorithm.sorting;

/**
 * // 分类 -------------- 内部比较排序
 * // 数据结构 ---------- 数组
 * // 最差时间复杂度 ---- O(n^2)
 * // 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
 * // 平均时间复杂度 ---- O(n^2)
 * // 所需辅助空间 ------ O(1)
 * // 稳定性 ------------ 稳定
 *
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public class BubbleSort extends BaseSortShow {

    public static void main(String[] args) {
        new BubbleSort().show();
    }


    @Override
    public void sort(int[] arr) {
        int size = arr.length;
        int right = size;
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < right - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
            right--;

        }
    }


}
