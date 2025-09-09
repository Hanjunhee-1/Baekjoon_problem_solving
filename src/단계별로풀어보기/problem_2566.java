package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		int max = 0;
		int x = 0;
		int y = 0;
		
		for (int i=0; i<9; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				int input = sc.nextInt();
				arr.get(i).add(input);
				
				if (input >= max) {
					max = input;
					x = i+1;
					y = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(x + " " + y);

	}

}
