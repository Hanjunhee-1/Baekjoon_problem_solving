package 단계별로풀어보기;

import java.util.Scanner;

public class problem_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = 0;
		int y = 0;
		
		for (int i=0; i<a; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println(x+y);
		}

	}

}
