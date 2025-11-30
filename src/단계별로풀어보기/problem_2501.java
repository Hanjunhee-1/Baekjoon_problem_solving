package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_2501 {

	public static void main(String[] args) {
		// 약수 구하기
		// 어떤 자연수 p 와 q 가 있고 p 를 q 로 나눈 나머지가 0 이면 q 는 p 의 약수이다.
		// 두 개의 자연수 N 과 K 가 주어질 때 N 의 약수들 중에서 K번째로 작은 수를 출력하기. 
		// (1 <= N <= 10,000), (1 <= K <= N)
		
		/**
		 * 6 3 -> 3
		 * 25 4 -> 0 (25의 약수는 1, 5, 25 이므로 약수의 개수는 총 3개 하지만 4번째로 작은 약수를 원했으므로 답은 0)
		 * 2735 1 -> 1
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i=1; i<=N; i++) {
			if (N%i==0) arr.add(i);
		}
		
		if (K>arr.size()) System.out.println(0);
		else System.out.println(arr.get(K-1));
	}

}
