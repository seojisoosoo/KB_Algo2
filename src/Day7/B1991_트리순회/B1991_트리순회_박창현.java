package Day7.B1991_트리순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1991_트리순회_박창현 {
    static int[][] arr;
    static StringBuilder sb;
    static void dfs(int nodeidx,int logic) {
//        System.out.println(nodeidx+" "+ Arrays.toString(arr[nodeidx])+" "+logic+" "+(char)(arr[nodeidx][0]+65));
        if(logic==1)sb.append((char)(arr[nodeidx][0]+65));
        if(arr[nodeidx][1]>=0)dfs(arr[nodeidx][1],logic);
        if(logic==0)sb.append((char)(arr[nodeidx][0]+65));
        if(arr[nodeidx][2]>=0)dfs(arr[nodeidx][2],logic);
        if(logic==2)sb.append((char)(arr[nodeidx][0]+65));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = st.nextToken().toCharArray()[0]-65;
            arr[i][1] = st.nextToken().toCharArray()[0]-65;
            arr[i][2] = st.nextToken().toCharArray()[0]-65;
        }
//        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr,(Comparator.comparingInt(o -> o[0])));
//        System.out.println(Arrays.deepToString(arr));
//        for (int[] a :
//                arr)
//            System.out.println(Arrays.toString(a));
        sb = new StringBuilder();
        dfs(0,1);
        sb.append("\n");
        dfs(0,0);
        sb.append("\n");
        dfs(0,2);
        System.out.println(sb);
    }
}
