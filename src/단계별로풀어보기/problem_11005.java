package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_11005 {

	public static void main(String[] args) {
		// N 과 B 가 주어짐. (2 <= B <= 36)
		// 10진법 수인 N을 B진법 수로 바꿔주는 문제. 2745번 문제와 정확히 반대 문제임.
		
		/**
		 * 60466175 36 -> ZZZZZ
		 * 
		 * N을 B로 계속해서 나눠야함.
		 * 
		 * 1. 총 몇 번 나눠지는지 구하기.
		 * 2. (1) 의 결과를 통해서 N을 B로 나눈 몫을 B의 (1)제곱 수로 나눠서 값을 구하기.
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int N = sc.nextInt();
		int B = sc.nextInt();
		String result = new String();
		
		// store the quotient of N divided by B in an array
		while (N > B) {
			arr.add(N);
			N /= B;
		} arr.add(N);
		
		// calculate
		for (int i=arr.size()-1; i>=0; i--) {
			int exponent = arr.size() - 1 - i;
			int n = 1;
			
			for (int j=0; j<exponent; j++) {
				n *= B;
			}
			
			int index = arr.get(i) / n;
			
			if (index < 10) {
				result += index + "";
			} else {
				index += 55;
				result += (char) index;
			}
			
			System.out.println("i: " + i + ", arr.get(i): " + arr.get(i) + ", exponent: " + exponent + ", n: " + n + ", index: " + index + ", result: " + result);
		}
		
		System.out.println(result);
	}

}
