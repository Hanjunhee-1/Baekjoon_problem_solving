package 단계별로풀어보기;

import java.util.Scanner;

public class problem_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) System.out.println("<");
		else if (a > b) System.out.println(">");
		else System.out.println("==");

	}

}
