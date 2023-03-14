package Day4.B9742_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9742_순열_박창현 {
    static char[] rawArr;
    static int res;
    static int count;
    static int[] selArr;
    static boolean[] isIn;
    static int N;
    static String[] s;

    static void permutation(int r, StringBuilder sb) {
        if (r == N) {
            if (count == res - 1) {
                sb.append(s[0]).append(" ").append(s[1]).append(" = ");
                //System.out.print(s[0] + " "+s[1]+" = " );
                for (int i = 0; i < r; i++) {
                    //System.out.print(rawArr[selArr[i]]);
                    sb.append(rawArr[selArr[i]]);
                }
                sb.append("\n");
            }
            //System.out.println();
            count++;
//            count--;
//            count++;
            return;
        }
        for (int i = 0; i < rawArr.length; i++) {
            if (isIn[i]) continue;
            isIn[i] = true;
            selArr[r] = i;
            permutation(r + 1, sb);
            isIn[i] = false;
        }
    }
//    static void action(String[] s,StringBuilder sb){
//        rawArr = s[0].toCharArray();
//        res = Integer.parseInt(s[1]);
//        N = rawArr.length;
//        selArr = new int[rawArr.length];
//        isIn = new boolean[rawArr.length];
//        count = 0;
//        permutation(0, sb);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        do {
            input = br.readLine();
            if (input.length() <= 0) break;
            s = input.split(" ");
            rawArr = s[0].toCharArray();
            res = Integer.parseInt(s[1]);
            N = rawArr.length;
            selArr = new int[rawArr.length];
            isIn = new boolean[rawArr.length];
            count = 0;
            StringBuilder tmp = new StringBuilder();
            permutation(0, tmp);
            sb.append(tmp.length() > 0 ? tmp : input + " = " + "No permutation\n");
            //System.out.println(tmp.length());
            //input = (br.readLine());
            //System.out.println(input);
        } while (br.ready());
        br.close();
        System.out.println(sb);
    }
}
