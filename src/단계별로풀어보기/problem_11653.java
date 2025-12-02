package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_11653 {

	public static void main(String[] args) {
		// 소인수분해
		// 정수 N이 주어졌을 때, N을 소인수분해하는 프로그램을 작성하자. (1 <= N <= 10,000,000)
		
		/**
		 * 72 -> 2 2 2 3 3
		 * 3 -> 3
		 * 6 -> 2 3
		 * 2 -> 2
		 * 9991 -> 97 103
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();

		while (N > 1) {
			for (int i = 2; i<=N; i++) {
				if (N%i == 0) {
					System.out.println(i); 
					N /= i;
					break;
				}
			}
		}
		
	}

}
