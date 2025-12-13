package 단계별로풀어보기;

import java.util.Scanner;

public class problem_24262 {

	public static void main(String[] args) {
		// 알고리즘 수업 - 알고리즘의 수행 시간 1
		
		/**
		 * MenOfPassion(A[], n) {
		 * 	i = Math.floor(n/2);
		 *  return A[i]; // 코드1
		 * }
		 */
		
		// 입력의 크기 n 이 주어지면 MenOfPassion 알고리즘의 수행시간을 다음과 같이 출력하자. (1 <= n <= 500000)
		
		/**
		 * 1 -> 1
		 * 		0
		 * 
		 * 첫째 줄에는 코드1의 실행 횟수를 출력하고 둘째 줄에는 수행 횟수를 다항식으로 나타내었을 때 최고 차항의 차수를 출력한다.
		 * 
		 * MenOfPassion 알고리즘의 시간복잡도는 O(1) 이다. 즉, 다항식의 최고 차항의 차수는 0으로 고정이되고 코드 1의 실행횟수 또한 1로 고정된다.
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(1);
		System.out.println(0);
	}

}
