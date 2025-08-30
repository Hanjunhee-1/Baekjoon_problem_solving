package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String i = sc.next();
		
		for (int j=0; j<26; j++) {
			arr.add(-1);
		}
		
		for (int j=0; j<i.length(); j++) {
			if (arr.get(i.charAt(j) - 97) == -1) arr.set(i.charAt(j) - 97, j);
		}
		
		for (int j=0; j<arr.size(); j++) {
			System.out.print(arr.get(j) + " ");
		}

	}

}
