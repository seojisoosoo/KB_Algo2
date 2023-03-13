package Day3.B2750_병합정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// B2750_버블정렬
public class B2750_병합정렬_박창현 {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int center = (left + right) / 2;

        mergeSort(arr, left, center);
        mergeSort(arr, center + 1, right);

        int[] res = new int[right - left + 1];
        int idx = 0;
        int lidx = left, ridx = center + 1;
        while (lidx <= center && ridx <= right) {
            if (arr[lidx] <= arr[ridx]) {
                res[idx++] = arr[lidx++];
            } else {
                res[idx++] = arr[ridx++];
            }
        }
        while (lidx <= center) {
            res[idx++] = arr[lidx++];
        }
        while (ridx <= right) {
            res[idx++] = arr[ridx++];
        }
        System.arraycopy(res, 0, arr, left, res.length);
//        if (arr[center]<arr[left])swap(arr,center,left);
//        if (arr[center]>arr[right])swap(arr,center,right);
//
//        while (resIdx<mid){
//            if (rightIdx.issafe ?&&rightIdx.val > leftIdx.val){
//            arr[resIdx++] = rightIdx.val;
//            rightIdx++;
//        } else if (leftIdx.issafe ?&&rightIdx.val <= leftIdx.val){
//            arr[resIdx++] = leftIdx.val;
//            leftIdx++;
//        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        //insertionSort(arr);
        //quickSort(arr);
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
