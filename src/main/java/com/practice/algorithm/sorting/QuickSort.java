package com.practice.algorithm.sorting;

/**
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public class QuickSort extends BaseSortShow {

    public static void main(String[] args) {
        new QuickSort().show();
    }

    @Override
    protected void sort(int[] arr) {
        doSort(arr, 0, arr.length - 1);
//        qSort(arr, 0, arr.length - 1);

    }

    private void doSort(int[] arr, int head, int tail) {
        if (head >= tail) {
            return;
        }

        int pivotVal = arr[(head + tail) / 2];


        int leftIndex = head;
        int rightIndex = tail;

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivotVal) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivotVal) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;

            } else if (leftIndex == rightIndex) {
                leftIndex++;
            }

        }


        doSort(arr, head, rightIndex);

        doSort(arr, leftIndex, tail);


    }

    public void qSort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                ++i;
            }
            while (arr[j] > pivot) {
                --j;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                ++i;
                --j;
            } else if (i == j) {
                ++i;
            }
        }
        qSort(arr, head, j);
        qSort(arr, i, tail);
    }
}
