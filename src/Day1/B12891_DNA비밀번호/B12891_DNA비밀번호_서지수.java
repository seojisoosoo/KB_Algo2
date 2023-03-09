package Day1.B12891_DNA비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891_DNA비밀번호_서지수 {

	public static void main(String[] args)  throws Exception{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine(), " ");
		
		int S=Integer.parseInt(st.nextToken());
		int P=Integer.parseInt(st.nextToken());

		st=new StringTokenizer(bf.readLine(), " ");

		String dna[]=new String[S];
		for(int i=0;i<S;i++) {
			if(st.hasMoreTokens()) {
				dna[i]=st.nextToken();
			}
			
		}
		
		
		int cnt[]=new int[4];

		st=new StringTokenizer(bf.readLine(), " ");
		for(int i=0;i<4;i++) {
			cnt[i]=Integer.parseInt(st.nextToken());
		}

		int start=0, end=P;
		int count=0;
		
		while(true) {
			
			if(end>=S) break;
			int a=0, c=0, g=0, t=0;
			for(int i=start;i<end;i++) {
				if(dna[i] != null) {

					if(dna[i].equals("A")) {
						a++;
					}
					else if(dna[i].equals("C")) {
						c++;
					}
					else if(dna[i].equals("G")) {
						g++;
					}
					else {
						t++;
					}
				}
				
			}
			if(a>=cnt[0]&&c>=cnt[1]&&g>=cnt[2]&&t>=cnt[3]) {
				count++;
			}

			end++;
		}

		System.out.println(count);
	}

}
