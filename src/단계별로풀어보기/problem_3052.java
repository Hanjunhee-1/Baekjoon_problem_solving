package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_3052 {
	public static int cnt = 10;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = 0;
		ArrayList<Integer> mod = new ArrayList<Integer>();
		
		for (int i=0; i<43; i++) {
			mod.add(0);
		}
		
		for (int i=0; i<cnt; i++) {
			int a = sc.nextInt() % 42;
			mod.set(a, mod.get(a) + 1);
		}
		
		for (int i=0; i<mod.size(); i++) {
			if (mod.get(i) != 0) f++; 
		}
		
		System.out.println(f);

	}

}
