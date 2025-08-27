package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

public class problem_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<30; i++) {
			arr.add(i+1);
		}
		
		for (int i=0; i<28; i++) {
			arr.set(sc.nextInt()-1, 0);
		}
		
		for (int i=0; i<30; i++) {
			if (arr.get(i) != 0) System.out.println(arr.get(i));
		}

	}

}
