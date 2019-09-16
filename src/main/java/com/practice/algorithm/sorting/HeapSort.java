package com.practice.algorithm.sorting;

/**
 * // 分类 -------------- 内部比较排序
 * // 数据结构 ---------- 数组
 * // 最差时间复杂度 ---- O(nlogn)
 * // 最优时间复杂度 ---- O(nlogn)
 * // 平均时间复杂度 ---- O(nlogn)
 * // 所需辅助空间 ------ O(1)
 * // 稳定性 ------------ 不稳定
 *
 * @author Luo Bao Ding
 * @since 2019/9/16
 */
public class HeapSort extends BaseSortShow {
    public static void main(String[] args) {
        new HeapSort().show();
    }

    private int currentSize;
    private int[] arr;

    private int remove() {
        int root = arr[0];
        arr[0] = arr[currentSize - 1];
        currentSize--;
        trickleDown(0);
        return root;
    }

    private void trickleDown(int index) {
        //backup top
        int top = arr[index];
        while (index < currentSize / 2) {
            //find the larger child node
            int largerChild;
            int leftNode = 2 * index + 1;
            int rightNode = leftNode + 1;


            if (rightNode < currentSize) {
                largerChild = arr[leftNode] > arr[rightNode] ? leftNode : rightNode;
            } else {
                largerChild = leftNode;
            }

            if (top >= arr[largerChild]) {
                break;
            }
            //copy the larger child node to the parent node
            arr[index] = arr[largerChild];

            index = largerChild;
        }
        arr[index] = top;

    }

    @Override
    protected void sort(int[] arr) {
        this.arr = arr;
        this.currentSize = arr.length;
        int j = currentSize / 2 - 1;
        //heapify
        while (j >= 0) {
            trickleDown(j);
            j--;
        }

        //take the top of the heap
        while (currentSize > 0) {
            int top = remove();//currentSize--
            arr[currentSize] = top;
        }


    }
}
