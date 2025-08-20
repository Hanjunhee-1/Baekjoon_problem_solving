package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		
		for (int i=b.length()-1; i>=0; i--) {
			System.out.println( a * (b.charAt(i) - '0'));
		}
		System.out.println(a * Integer.parseInt(b));
	}

}
