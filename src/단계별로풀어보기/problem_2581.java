package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2581 {

	public static void main(String[] args) {
		// 소수
		// 자연수 M과 N이 주어질 때 M이상 N이하인 자연수 중 소수인 것을 모두 골라 소수의 합과 최솟값을 구하여 출력하자.
		
		/**
		 * 첫째 줄에 M과 둘째 줄에 N이 주어진다.
		 * 60
		 * 100 -> 620 61
		 * 
		 * 단, M이상 N이하의 자연수 중에 소수가 없을 경우에는 -1을 출력한다.
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int M=sc.nextInt(), N=sc.nextInt(), max=0, min=0;
		boolean isPrime, isMinChanged = false;
		
		for (int i=M; i<=N; i++) {
			isPrime = true;
			if (i <= 1) continue;
			else if (i == 2) {
				max += i;
				if (!isMinChanged) {
					min += i;
					isMinChanged = true;
				}
			}
			else {
				for (int j=2; j<i; j++) {
					if (i%j==0) { 
						isPrime=false;
						break;
					}
				}
				if (isPrime) {
					max += i;
					if (!isMinChanged) {
						min += i;
						isMinChanged = true;
					}
				}
			}
		}
		
		if (max != 0 && min != 0) {
			System.out.println(max);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

}
