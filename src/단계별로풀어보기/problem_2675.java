package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = new String();
		int a = 0;
		int n = sc.nextInt();
		
		for (int j=0; j<n; j++) {
			a = sc.nextInt();
			i = sc.next();
			
			for (int k=0; k<i.length(); k++) {
				for (int p=0; p<a; p++) {
					System.out.print(i.charAt(k));
				}
			} System.out.println();
		}
	}

}
