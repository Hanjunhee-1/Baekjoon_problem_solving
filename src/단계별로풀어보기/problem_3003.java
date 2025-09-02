package 단계별로풀어보기;

import java.util.Scanner;

public class problem_3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chess = new int[] { 1, 1, 2, 2, 2, 8 };
		int[] result = new int[6];
		
		for (int i=0; i<chess.length; i++) {
			result[i] = chess[i] - sc.nextInt();
		}
		
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		sc.close();
	}

}
