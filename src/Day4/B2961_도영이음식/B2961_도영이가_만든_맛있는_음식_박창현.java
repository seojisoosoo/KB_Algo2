package Day4.B2961_도영이가_만든_맛있는_음식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2961_도영이가_만든_맛있는_음식_박창현 {
    static int[][] arr;
    static int N;
    static int count=0;
    static boolean[] isSel;
    static int min=Integer.MAX_VALUE;
    static void subset(int num){

        // 종료조건
        if (num == N) {
            count++;
            int S=1,B=0;
            for (int i = 0; i < N; i++) {
                if (isSel[i] && arr[i].length > 1) {
                    //System.out.print(Arrays.toString(arr[i]) + " ");
                    S *= arr[i][0];
                    B += arr[i][1];
                    //System.out.println(S + " " + B+" "+Math.abs(S-B)+" "+min);
                    min = Math.min(Math.abs(S-B),min);
                }
            }
            return;
        }
        isSel[num]=false;
        subset(num+1);
        isSel[num]=true;
        subset(num+1);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        isSel = new boolean[N];
        subset(0);

        System.out.println(min);

    }
}
