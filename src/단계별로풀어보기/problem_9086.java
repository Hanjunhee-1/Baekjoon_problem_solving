package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			arr.add(sc.next());
		}
		
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i).charAt(0) + "" + arr.get(i).charAt(arr.get(i).length()-1));
		}

	}

}
