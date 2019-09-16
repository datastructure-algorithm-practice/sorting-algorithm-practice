package com.practice.algorithm.sorting;

/**
 * // 分类 -------------- 内部比较排序
 * // 数据结构 ---------- 数组
 * // 最差时间复杂度 ---- O(nlogn)
 * // 最优时间复杂度 ---- O(nlogn)
 * // 平均时间复杂度 ---- O(nlogn)
 * // 所需辅助空间 ------ O(n)
 * // 稳定性 ------------ 稳定
 *
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public class MergeSort extends BaseSortShow {

    public static void main(String[] args) {
        new MergeSort().show();
    }

    @Override
    protected void sort(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;

        doSort(arr, head, tail);
//        merge_sort(arr);

    }

    private void doSort(int[] arr, int head, int tail) {
        if (head >= tail ) {
            return;
        }
        int mid = head + ((tail - head) >> 1);
        doSort(arr, head, mid);
        doSort(arr, mid + 1, tail);

        merge(arr, head, mid, tail);

    }

    private void merge(int[] arr, int head, int mid, int tail) {

        int[] temp = new int[tail - head + 1];
        int i = 0;

        int leftIndex = head;
        int rightIndex = mid + 1;

        while (leftIndex <= mid && rightIndex <= tail) {
            temp[i++] = arr[leftIndex] <= arr[rightIndex] ? arr[leftIndex++] : arr[rightIndex++];
        }

        if (leftIndex <= mid) {
            while (leftIndex <= mid) {
                temp[i++] = arr[leftIndex++];
            }
        } else {
            while (rightIndex <= tail) {
                temp[i++] = arr[rightIndex++];
            }
        }


        for (int j = 0; j < temp.length; j++) {
            arr[head + j] = temp[j];
        }

    }

    //================ wikipedia
    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
    }
}
