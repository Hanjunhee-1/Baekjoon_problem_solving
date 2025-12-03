package 단계별로풀어보기;

import java.util.Scanner;

public class problem_3009 {

	public static void main(String[] args) {
		// 네 번째 점
		// 세 개의 점이 주어질 때, 축에 평행한 직사각형을 만들기 위해 필요한 네 번째 점을 찾아라.
		
		/**
		 * 5 5
		 * 5 7
		 * 7 5 -> 7 7
		 * 
		 * 30 20
		 * 10 10
		 * 10 20 -> 30 10
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		int [] Xarr = new int[1001];
		int [] Yarr = new int[1001];
		int max = 0, x=0, y=0;
		
		for (int i=0; i<3; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			Xarr[X] += 1;
			Yarr[Y] += 1;
			
			if (X >= Y) {
				if (X >= max) max = X;
			} else {
				if (Y >= max) max = Y;
			}
		}
		
		for (int i=0; i<=max; i++) {
			if (Xarr[i] == 1) x = i;
			if (Yarr[i] == 1) y = i;
//			if (arr[i][0] == 1) x = i;
//			if (arr[0][i] == 1) y = i;
		}

		System.out.println(x + " " + y);
	}

}
