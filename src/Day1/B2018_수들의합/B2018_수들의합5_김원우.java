package Day1.B2018_수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2018_수들의합5_김원우 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;


        for (int i = 1; i < n; i++) {
            int tmp = i;
            for (int j = i + 1; j <= n; j++) {
                tmp += j;
                if (tmp == n) {
                    cnt++;
                    break;
                } else if (tmp > n) {
                    break;
                }
            }
        }

        System.out.println(cnt+1); // 자기 자신 추가

    }
}
