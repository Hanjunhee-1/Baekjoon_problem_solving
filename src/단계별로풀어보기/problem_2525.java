package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int c_a = c/60;
		int c_b = c%60;
		
		if ((b+c_b) > 59) {
			b = (b + c_b) - 60;
			a += 1;
			if ((a+c_a) > 23) {
				a = (a + c_a) - 24;
			} else {
				a += c_a;
			}
		} else {
			b += c_b;
			if ((a+c_a) > 23) {
				a = (a + c_a) - 24;
			} else {
				a += c_a;
			}
		}
		
		System.out.println(a + " " + b);

	}

}
