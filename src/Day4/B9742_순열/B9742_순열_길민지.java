package Day4.B9742_순열;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B9742_순열_길민지 {
	static int N; // 찾아야 하는 위치
	static String str; // 주어진 문자열
	static char[] charArr; // 주어진 문자열을 배열로 변환
	static char[] resultArr; // 출력될 순열 배열
	static boolean [] isSelected; // 해당 알파벳이 선택되었는 지 체크
	static boolean isChecked; // N에 해당하는 순열을 찾았는 지 체크
	static int num; // 순열 등장 순서
	
	static void permutation(int r) {
		if (r==charArr.length) { // 재귀 종료 조건
			num++;
			if (num==N) { // N 번째 순열인 경우 출력 후 return;
				System.out.print(str + " " + N + " = ");
				for(int i=0; i<charArr.length;i++) System.out.print(resultArr[i]);
				System.out.println();
				isChecked = true;
				return;
			}
			return;
		}
		
		for (int i = 0; i<charArr.length; i++) {
			if (isSelected[i]) continue; // 이미 선택된 문자라면 break
			resultArr[r] = charArr[i]; // 결과 배열에 해당 문자 넣기
			isSelected[i] = true; // 선택
			permutation(r+1); // 재귀
			isSelected[i] = false; // 선택 해제
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) { // EOF 처리
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			str = st.nextToken();

			// 변수 초기화
			N = Integer.parseInt(st.nextToken());
			charArr = new char[str.length()];
			charArr = str.toCharArray();
			resultArr = new char[str.length()];
			isSelected = new boolean[str.length()];
			num = 0;
			isChecked = false;
				
			// 순열
			permutation(0);
			
			// 찾아야되는 순열을 찾지 못한 경우
			if (!isChecked) {
				System.out.print(str + " " + N + " = No permutation");
				System.out.println();
			}
		}
		sc.close();
	}
}