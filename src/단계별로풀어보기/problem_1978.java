package 단계별로풀어보기;

import java.util.Scanner;

public class problem_1978 {

	public static void main(String[] args) {
		// 소수 찾기
		// 주어진 숫자들 중에 소수의 개수가 몇 개인지 출력해주자.
		
		/**
		 * 4
		 * 1 3 5 7 -> 3
		 * 
		 * 1을 제외하고 1과 자기자신만을 약수로 갖는 수가 소수.
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), input=0, cnt=0;
		boolean flag;
		
		for (int i=1; i<=N; i++) {
			input = sc.nextInt();
			flag = true;
			
			if (input <= 1) continue;
			else if (input == 2) cnt++;
			else {
				for (int j=2; j<input; j++) {
					if (input%j==0) flag = false;
				}
				if (flag) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
