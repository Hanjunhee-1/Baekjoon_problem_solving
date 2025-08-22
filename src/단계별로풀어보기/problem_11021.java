package 단계별로풀어보기;

import java.util.Scanner;

public class problem_11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b;
		
		for (int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.print("Case #"); System.out.print(i+1); System.out.print(": ");
			System.out.println(a+b);
		}

	}

}
