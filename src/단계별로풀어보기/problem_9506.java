package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_9506 {

	public static void main(String[] args) {
		// 약수들의 합
		// 어떤 숫자 n 이 자신을 제외한 모든 약수들의 합과 같다면 그 수를 완전수라고 한다.
		// N 을 입력받고 그 숫자가 완전수라면 N = a + b + c + ... 의 꼴로 출력해주고
		// 완전수가 아니라면 N is NOT perfect. 라고 출력해주자.
		// (2 < N < 100,000)
		
		/**
		 * 6 -> 6 = 1 + 2 + 3
		 * 12 -> 12 is NOT perfect.
		 * 28 -> 28 = 1 + 2 + 4 + 7 + 14
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int sum=0;
		ArrayList<Integer> arr = new ArrayList<>();
		String s = new String();
		
		while (true) {
			N = sc.nextInt();
			if (N == -1) break;
			sum = 0;
			s = "";
			arr.clear();
			
			for (int i=1; i<=N; i++) {
				if (N%i == 0) {
					arr.add(i);
					if (i != N) sum += i;
				}
			}
			
			if (sum != N) System.out.println(N + " is NOT perfect.");
			else {
				s += N + " = " + arr.get(0);
				
				for (int i=1; i<arr.size()-1; i++) {
					s += " + " + arr.get(i);
				}
				System.out.println(s);
			}
		}
	}

}
