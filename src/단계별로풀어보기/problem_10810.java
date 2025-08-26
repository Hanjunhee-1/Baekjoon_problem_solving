package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 바구니 갯수 -> 바구니에는 공을 한 번만 넣을 수 있음.
		int m = sc.nextInt(); // 공을 넣을 횟수 -> 반복문에 사용
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			arr.add(0);
		}
		
		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			for (int j = a-1; j<b; j++) {
				arr.set(j, c);
			}
		}
		
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

	}

}
