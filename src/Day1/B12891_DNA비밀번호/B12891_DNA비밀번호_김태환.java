package Day1.B12891_DNA비밀번호;

import java.util.Scanner;

public class B12891_DNA비밀번호_김태환 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S=sc.nextInt();
		int P=sc.nextInt();
		
		String s=sc.next();
		
		int cnt=0;
		int n1=0,n2=0,n3=0,n4 =0;

		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		for(int i=0;i<=S-P;i++) {
			String a;
			a=s.substring(i,P+1);
			String [] dna= new String[P];
			dna=a.split("");
			System.out.println(dna[1]);
		
			for(int j=0;j<P;j++) {
				if (dna[j]=="A") {
					n1+=1;
				}
				else if (dna[j]=="C") {			
					n2+=1;
				}
				else if (dna[j]=="G") {				
					n3+=1;
				}
				else if (dna[j]=="T") {				
					n4+=1;
				}
				System.out.println(cnt);
		}
		if(n1>=s1 &&n2>=s2&&n3>=s3&&n4>=s4) {
			cnt++;
		}
		}
		sc.close();

		System.out.println(cnt);

}
}

