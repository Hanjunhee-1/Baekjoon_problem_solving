package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class problem_9063 {

	public static void main(String[] args) {
		// 대지
		// 점의 개수 N을 입력받고 N개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력하라.
		
		/**
		 * 3
		 * 20 24
		 * 40 21
		 * 10 12 -> 360
		 * 
		 * 1
		 * 15 13 -> 0 => 점이 1개일 때는 직사각형이 나올 수 없다.
		 * ※ 마찬가지로 점이 2개인데 x 좌표가 같거나 y 좌표가 같으면 최소 크기의 직사각형의 넓이는 0일 것이다.
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> X = new ArrayList<>();
		ArrayList<Integer> Y = new ArrayList<>();
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			X.add(sc.nextInt());
			Y.add(sc.nextInt());
		}
		
		X.sort(Comparator.naturalOrder());
		Y.sort(Comparator.naturalOrder());
		
		System.out.println( Math.abs(X.get(X.size()-1) - X.get(0)) * Math.abs(Y.get(Y.size()-1) - Y.get(0)) );
	}

}
