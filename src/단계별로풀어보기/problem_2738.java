package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			matrix1.add(new ArrayList<Integer>());
			for (int j=0; j<m; j++) {
				matrix1.get(i).add(sc.nextInt());
			}
		}
		
		for (int i=0; i<n; i++) {
			matrix2.add(new ArrayList<Integer>());
			for (int j=0; j<m; j++) {
				matrix2.get(i).add(sc.nextInt());
			}
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print(matrix1.get(i).get(j) + matrix2.get(i).get(j) + " ");
			} System.out.println();
		}
		
	}

}
