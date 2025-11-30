package 단계별로풀어보기;

import java.util.Scanner;

public class problem_5086 {

	public static void main(String[] args) {
		// 배수와 약수
		// 두 수가 주어졌을 때, 다음의 3가지 중에 어떤 관계인지 구하는 프로그램을 작성하기.
		// 1. 첫 번째 숫자가 두 번째 숫자의 약수이다. (factor)
		// 2. 첫 번째 숫자가 두 번째 숫자의 배수이다. (multiple)
		// 3. 첫 번째 숫자가 두 번째 숫자의 약수와 배수가 모두 아니다. (neither)
		
		/**
		 * 8 16 -> factor
		 * 32 4 -> multiple
		 * 17 5 -> neither
		 * 0 0 -> 해당 케이스는 종료를 의미한다.
		 */
			
		// declare
		Scanner sc = new Scanner(System.in);
		int A=0, B=0;
		
		while (true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (A == 0 && B == 0) break;
			
			if (A > B) {
				if (A%B == 0) System.out.println("multiple");
				else System.out.println("neither");
			} else {
				if (B%A == 0) System.out.println("factor");
				else System.out.println("neither");
			}
		}
	}

}
