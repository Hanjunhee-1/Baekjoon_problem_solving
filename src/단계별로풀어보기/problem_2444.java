package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// (각 줄 공백 개수)
		// (각 줄 별 개수)
		
		// 4, 3, 2, 1, 0, 1, 2, 3, 4
		// 1, 3, 5, 7, 9, 7, 5, 3, 1
		
		// 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5
		// 1, 3, 5, 7, 9, 11, 9, 7, 5, 3, 1

		/**
		 * 마름모의 윗부분과 아랫부분을 나눠서 출력할거임.
		 * 예측 입력값: 5
		 * **/
		// 마름모 윗부분
		for (int i=1; i<=n; i++) { // 1~5
			for (int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int k=2*i-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 마름모 아랫부분
		for (int i=1; i<n; i++) { // 1~4
			for (int j=n; j>n-i; j--) {
				System.out.print(" ");
			}
			for (int k=2*(n-i)-1; k>0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
