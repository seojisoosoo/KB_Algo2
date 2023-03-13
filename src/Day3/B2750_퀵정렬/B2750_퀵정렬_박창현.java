package Day3.B2750_퀵정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// B2750_버블정렬
public class B2750_퀵정렬_박창현 {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left + 1, r = right;
        while (r >= l) {
            while (l <= right && arr[l] < arr[left]) {
                l++;
            }
            while (r > left && arr[r] > arr[left]) {
                r--;
            }
            if (r >= l) {
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        swap(arr, left, r);
        quickSort(arr, left, r - 1);
        quickSort(arr, r + 1, right);
    }
/*
10
10
8
6
4
2
1
3
5
7
9
 */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //insertionSort(arr);
        quickSort(arr);
        //System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.println(i);
        }
    }
}