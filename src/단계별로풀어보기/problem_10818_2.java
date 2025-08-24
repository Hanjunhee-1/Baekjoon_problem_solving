package 단계별로풀어보기;

import java.util.*;

public class problem_10818_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		
		arr.sort(Comparator.naturalOrder());
		
		System.out.println(arr.get(0) + " " + arr.get(arr.size() - 1));

	}

}
