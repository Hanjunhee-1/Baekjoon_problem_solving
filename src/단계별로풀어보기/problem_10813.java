package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			arr.add(i, i+1);
		}
		
		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int save = arr.get(a-1);
			arr.set(a-1, arr.get(b-1));
			arr.set(b-1, save);
		}
		
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

	}

}
