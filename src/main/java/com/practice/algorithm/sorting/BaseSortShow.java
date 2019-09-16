package com.practice.algorithm.sorting;

/**
 * @author Luo Bao Ding
 * @since 2019/9/6
 */
public abstract class BaseSortShow {

    public void show() {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        sort(arr);

        for (int value : arr) {
            System.out.println(value);
        }

    }

    protected abstract void sort(int[] arr);

    protected void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
