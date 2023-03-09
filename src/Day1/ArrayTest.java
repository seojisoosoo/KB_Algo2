package Day1;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] arr = new int [6];
		
		// Arrays.toString(배열) >> 해당 배열 출력
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

		// Arrays.fill(배열 , 값) >> 해당 배열을 특정값으로 채움
		Arrays.fill(arr , 100);
		System.out.println(Arrays.toString(arr));	
		
		// 배열은 사이즈 고정 >> 사이즈 변경시 재할당
		arr = new int[] {5,2,4,3,1};
		System.out.println(Arrays.toString(arr));		
		
		// Arrays.sort(배열) >> 값을 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// Arrays.copyofRange(배열 . 시작인덱스 , 끝인덱스)
		int [] copyArr = Arrays.copyOfRange(arr , 1, 3);
		System.out.println(Arrays.toString(copyArr));
		
		// 2차원 배열 생성
		int [][] arr2d = {{1,2} , {3,4} , {5,6}};
		System.out.println(arr2d);
		
		System.out.println( Arrays.toString(arr2d[0]));
		
		for(int i=0; i<arr2d.length; i++) {
			System.out.println(Arrays.toString(arr2d[i]));
		}

		// Arrays.deepToString(배열) >> 2차원 이상 배열 출력
		System.out.println(Arrays.deepToString(arr2d));
		
	}

}
