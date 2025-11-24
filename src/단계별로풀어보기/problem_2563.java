package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 흰색 도화지 크기 -> 100 x 100
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		
		for (int i=0; i<100; i++) {
			arr.add(new ArrayList<Integer>());
			for (int j=0; j<100; j++) {
				arr.get(i).add(0);
			}
		}

		// 색종이 크기-> 10 x 10
		int n = sc.nextInt(); // 색종이 붙일 횟수
		int x = 0, y = 0; // 색종이 붙이는 위치
		int sum_area = 0; // 색종이가 붙여진 총 영역

		for (int i=0; i<n; i++) {
			x = sc.nextInt(); // 도화지 왼쪽 변에서부터 떨어진 위치
			y = sc.nextInt(); // 도화지 아랫쪽 변에서부터 떨어진 위치
			int overLapped = 0;
			
			for (int j = x; j<=x+9; j++) {
				for (int k = 99-y; k>=90-y; k--) {
					if (arr.get(k).get(j) == 0) arr.get(k).set(j, 1);
					else arr.get(k).set(j, 2);
				}
			}
			sum_area += 100;
			
			for (int j = x; j<x+10; j++) {
				for (int k = 99-y; k>89-y; k--) {
					if (arr.get(k).get(j) == 2) { overLapped++; arr.get(k).set(j, 1); }
				}
			}
			
			sum_area -= overLapped;
		}
		
		System.out.println(sum_area);
	}

}
