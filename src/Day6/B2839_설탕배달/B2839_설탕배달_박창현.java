package Day6.B2839_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2839_설탕배달_박창현 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N + 1];
        Arrays.fill(arr, 0);
        if (N >= 3) arr[3] = 1;
        if (N >= 5) arr[5] = 1;

        for (int i = 5; i < N + 1; i++) {
            if (arr[i - 3] == 0 && arr[i - 5] == 0) continue;
            if (arr[i - 3] == 0) arr[i] = arr[i - 5] + 1;
            else if (arr[i - 5] == 0) arr[i] = arr[i - 3] + 1;
            else arr[i] = Math.min(arr[i - 3], arr[i - 5]) + 1;
        }

        if (arr[N] == 0) System.out.println(-1);
        else System.out.println(arr[N]);
    }
}
