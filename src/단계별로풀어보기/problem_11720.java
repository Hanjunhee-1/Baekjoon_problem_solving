package 단계별로풀어보기;

import java.util.Scanner;

public class problem_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String i = sc.next();
		int sum=0;
		
		for (int j=0; j<n; j++) {
			sum += (i.charAt(j) - 48);
		}
		
		System.out.println(sum);

	}

}
