package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<9; i++) {
			arr.add(sc.nextInt());
		}
		
		int max = arr.get(0);
		int maxIndex = 0;
		for (int i=1; i<9; i++) {
			if (max < arr.get(i)) {
				max = arr.get(i);
				maxIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex + 1);

	}

}
