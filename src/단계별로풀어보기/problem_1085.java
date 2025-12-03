package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem_1085 {

	public static void main(String[] args) {
		// 직사각형에서 탈출
		// 당신은 지금 (x, y) 에 있다. 직사각형은 각 변이 좌표축에 평행하고 왼쪽 아래 꼭짓점은 (0,0) 이고 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지의 거리의 최솟값을 구하라.
		
		/**
		 * 첫째 줄에 x y w h 가 주어진다.
		 * 
		 * 6 2 10 3 -> 1
		 * 1 1 5 5 -> 1
		 * 653 375 1000 1000 -> 347
		 * 161 181 762 375 -> 161
		 */

		// declare
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(), y=sc.nextInt(), w=sc.nextInt(), h=sc.nextInt(), X=w-x, Y=h-y;
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(x);
		arr.add(y);
		arr.add(X);
		arr.add(Y);
		
		System.out.println(Collections.min(arr));
	}

}
