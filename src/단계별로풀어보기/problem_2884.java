package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m < 45) {
			if (h>=1) {
				h -= 1;
				m = 60 - (45 - m);
			} else {
				h = 24 - (1 - h);
				m = 60 - (45 - m);
			}
		} else {
			m -= 45;
		}
		
		System.out.println(h + " " + m);
	}

}
