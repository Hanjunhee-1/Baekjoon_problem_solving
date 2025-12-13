package 단계별로풀어보기;

import java.util.Scanner;

public class problem_24264 {

	public static void main(String[] args) {
		// 알고리즘 수업 - 알고리즘의 수행 시간 2
		
		/**
		 * MenOfPassion(A[], n) {
    		sum <- 0;
    		for i <- 1 to n
        		for j <- 1 to n
            		sum <- sum + A[i] × A[j]; # 코드1
    		return sum;
			}
		 */
		
		// 입력의 크기 n 이 주어지면 MenOfPassion 알고리즘의 수행시간을 다음과 같이 출력하자. (1 <= n <= 500000)
		
		/**
		 * 7 -> 49
		 * 		2
		 * 
		 * 첫째 줄에는 코드1의 실행 횟수를 출력하고 둘째 줄에는 수행 횟수를 다항식으로 나타내었을 때 최고 차항의 차수를 출력한다.
		 * 
		 * MenOfPassion 알고리즘의 시간복잡도는 O(n^2) 이다. 이중 for 문이 있고 outer loop 가 n번, inner loop 가 n번 실행되기 때문이다. 
		 * 최고차항은 n^2 이기 때문에 차수는 2로 고정이다.
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		
		System.out.println(n*n);
		System.out.println(2);

	}

}
