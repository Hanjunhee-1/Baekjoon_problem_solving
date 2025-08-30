package 단계별로풀어보기;

import java.util.Scanner;

public class problem_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		
		if ((i.charAt(0) - 0) >= 65 && (i.charAt(0) - 0) <= 122) System.out.println(i.charAt(0) - 0);
		else System.out.println(i.charAt(0) - 48 + 48);
	}

}
