package Day6.B1931_회의실배정;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931_회의실배정_조아영 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int start = 0;
		int cnt = 0;

		int[][] room = new int[N][2];

		for (int i = 0; i < N; i++) {
			room[i][0] = sc.nextInt();
			room[i][1] = sc.nextInt();
		}

		Arrays.sort(room, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) { // 종료시간이 같으면
					return o1[0] - o2[0]; // 시작시간이 빠른 대로 오름차순 정렬
				}
				return o1[1] - o2[1]; // 종료시간이 같지 않으면 종료시간이 빠른대로 오름차순 정렬
			}
		});

		for (int i = 0; i < N; i++) { // N=11
			if ( start <= room[i][0]) {
				start = room[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
