package Algorithm_class;

import java.util.Arrays;

public class threeWayMergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int third = low + (high - low) / 3;
            int twoThird = low + 2 * (high - low) / 3;

            mergeSort(arr, low, third);
            mergeSort(arr, third + 1, twoThird);
            mergeSort(arr, twoThird + 1, high);

            merge(arr, low, third, twoThird, high);
        }
    }

    public static void merge(int[] arr, int low, int third, int twoThird, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = third + 1, k = twoThird + 1, index = 0;

        while (i <= third && j <= twoThird && k <= high) {
            if (arr[i] <= arr[j] && arr[i] <= arr[k]) {
                temp[index++] = arr[i++];
            } else if (arr[j] <= arr[i] && arr[j] <= arr[k]) {
                temp[index++] = arr[j++];
            } else {
                temp[index++] = arr[k++];
            }
        }

        while (i <= third) {
            temp[index++] = arr[i++];
        }
        while (j <= twoThird) {
            temp[index++] = arr[j++];
        }
        while (k <= high) {
            temp[index++] = arr[k++];
        }

        for (int m = 0; m < temp.length; m++) {
            arr[low + m] = temp[m];
        }
    }
}