package 단계별로풀어보기;

import java.util.Scanner;

public class problem_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int isPalindrome = 1;
		String s = sc.next();
		
		for (int i=0; i<s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) { isPalindrome = 0; break; }
		}
		
		System.out.println(isPalindrome);

	}

}
