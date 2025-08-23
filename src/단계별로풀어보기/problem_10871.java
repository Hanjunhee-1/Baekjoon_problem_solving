package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = sc.nextInt();
		int f = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		
		for (int i=0; i<arr.size(); i++) {
			if (arr.get(i) < f) System.out.print(arr.get(i) + " ");
		}
	}

}
