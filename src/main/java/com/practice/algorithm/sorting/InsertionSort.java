package com.practice.algorithm.sorting;

/**
 * // 分类 ------------- 内部比较排序
 * // 数据结构 ---------- 数组
 * // 最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
 * // 最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
 * // 平均时间复杂度 ---- O(n^2)
 * // 所需辅助空间 ------ O(1)
 * // 稳定性 ------------ 稳定
 *
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public class InsertionSort extends BaseSortShow {

    public static void main(String[] args) {
        new InsertionSort().show();
    }
    @Override
    protected void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int get = arr[i];
            int j = i - 1;
            while (get < arr[j]) {

                arr[j + 1] = arr[j];

                j--;
                if (j < 0) {
                    break;
                }

            }
            arr[j + 1] = get;

        }

    }
}
