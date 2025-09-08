package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cnt = 0;
		ArrayList<Integer> alphabet = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			String s = sc.next();
			int flag = 1;
			
			for (int j=0; j<26; j++) {
				alphabet.add(0);
			}
			
			for (int j=0; j<s.length(); j++) {
//				System.out.println("지금 j = " + j);
				 if (alphabet.get(s.charAt(j) - 97) == 0) {
					 alphabet.set(s.charAt(j) - 97, alphabet.get(s.charAt(j) - 97) + 1);
				 } else {
					 if (j > 0 && s.charAt(j - 1) != s.charAt(j)) {
						 flag = 0; break;
					 }
				 }
			}
			
			if (flag == 1) cnt++;
			
//			System.out.println(alphabet);
			alphabet.clear();
//			System.out.println("현재 " + i + "번째: flag ->" + flag + " cnt ->" + cnt);
		}
		
		System.out.println(cnt);

	}

}
