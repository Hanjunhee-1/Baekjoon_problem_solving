package 단계별로풀어보기;

import java.util.Scanner;

public class problem_5622 {

	public static void main(String[] args) {
		// ABC = 3, DEF = 4, GHI = 5, JKL = 6, MNO = 7, PQRS = 8, TUV = 9, WXYZ = 10
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[] { null, null, "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		String s = sc.next();
		int sum = 0;
		
		for (int i=0; i<s.length(); i++) {
			String tmp = Character.toString(s.charAt(i));
			for (int j=2; j<10; j++) {
				if (arr[j].contains(tmp)) {
					sum += j+1;
					break;
				}
			}
		}
		
		System.out.println(sum);
		
	}

}
