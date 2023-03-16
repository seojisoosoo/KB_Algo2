package Day6.B2839_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2839_설탕배달_박예린 {
    static int findMin(int N) {

        int res = 0;

        if(N % 5 == 0) {
            // 
            res = N / 5;
        } else if(N % 3 == 0) {
            res = N / 3;
        } else if(N > 5) {
            // 7, 8, 11, 12, 13, ...

            /* 

         * 13 = 5*2 + 3*1
         * 16 = 5*2 + 3*2
         * 19 = 5*2 + 3*3
         * 22 = 5*2 + 3*4
         * 
         * 18 = 5*3 + 3*1
         * 21 = 5*3 + 3*2
         * */
        for(int i = 0; i < 5; i++) {
            N -= 3;
            res++;
            if((N % 5) == 0) {
                res += N / 5;
                break;
            }
        }
    } else {
        res = -1;

    }
    return res;
}

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    System.out.println(findMin(N));
}
}

