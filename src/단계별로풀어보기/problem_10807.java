package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, c=0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		
		a = sc.nextInt();
		
		for (int i=0; i<arr.size(); i++) {
			if (a == arr.get(i)) c++;
		}
		
		System.out.println(c);

	}

}
