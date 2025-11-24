package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2745 {

	public static void main(String[] args) {
		// N 과 B 가 주어짐. (N = 0, 1, ..., 9, A=10, B=11, ..., Z=35), (2 <= B <= 36)
		// B진법으로 나타낸 N을 10진법으로 바꾸기
		
		// ex) ZZZZZ 36 -> 60466175
		// 35, 1260, 45360, 1632960, 58786560

		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int sum = 0;
		
		// (char) 0 -> 48, (char) 9 -> 57
		// (char) A -> 65, (char) Z -> 90
		
		for (int i=N.length()-1; i>=0; i--) {
			int n = N.charAt(i);
			long b = 1l;
			int exponent = N.length() - 1 - i;
			
			if (n >= 48 && n <= 57) n -= 48;
			else if (n >= 65 && n <= 90) n -= 55;
			
			for (int j=0; j<exponent; j++) {
				b *= B;
			}
			
			sum += n*b;
		}
		
		System.out.println(sum);
	}

}
