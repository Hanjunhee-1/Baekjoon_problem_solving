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
		 * N을 B로 계속해서 나눠주고 나머지 값을 알아야함.
		 * 
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int N = sc.nextInt();
		int B = sc.nextInt();
		String result = new String();
		
		// N을 B로 계속 나눠주면서 나머지값을 저장.
		while (N >= B) {
			arr.add(N%B);
			N /= B;
		} arr.add(N%B);
		
		for (int i=arr.size()-1; i>=0; i--) {
			if (arr.get(i) < 10) result += arr.get(i) + "";
			else result += (char)(arr.get(i)+55);
		}
		
		System.out.println(result);
	}

}
