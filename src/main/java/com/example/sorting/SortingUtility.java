package com.example.sorting;

public class SortingUtility {


    public static void gnomeSort(Comparable[] a) {
        int pos = 0;
        while (pos < a.length) {
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos++;
            } else {
                SortingUtility.swap(a, pos, pos - 1);
                pos--;
            }
        }
    }


    public static void cocktailShakerSort(Comparable[] A) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i].compareTo(A[i + 1]) > 0) {
                    SortingUtility.swap(A, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;

            swapped = false;
            for (int i = A.length - 2; i >= 0; i--) {
                if (A[i].compareTo(A[i + 1]) > 0) {
                    SortingUtility.swap(A, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }



    public static void shellSort(Comparable[] a) {
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int n = a.length;

        for (int gap : gaps) {
            for (int i = gap; i < n; i++) {
                Comparable temp = a[i];
                int j = i;
                while (j >= gap && a[j - gap].compareTo(temp) > 0) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = temp;
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





