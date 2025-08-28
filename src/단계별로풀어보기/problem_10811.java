package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			arr.add(i+1);
		}
		
		int m = sc.nextInt();
		for (int i=0; i<m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			for (int j=0; j<=(b-a)/2; j++) {
				int save = arr.get(a+j);
				arr.set(a+j, arr.get(b-j));
				arr.set(b-j, save);
			}
			
		}
		
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

	}

}
