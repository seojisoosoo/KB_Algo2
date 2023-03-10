import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B1158_요세푸스문제 {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
		
        Deque <Integer> deque = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        
        for(int i=1; i<=N; i++) deque.add(i);
        builder.append("<");
        while(!deque.isEmpty()) {
        	
        	for(int i=0; i<K-1; i++) {
        		deque.add(deque.remove());
        	}
        	builder.append(deque.remove() + ", ");
        	
        }
        
        builder.deleteCharAt(builder.length()-1);
        builder.deleteCharAt(builder.length()-1);
        builder.append(">");
        System.out.print(builder.toString());
        
        
        
        
        
        
	}
}
