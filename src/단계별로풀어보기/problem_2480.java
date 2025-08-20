package 단계별로풀어보기;

import java.util.*;

public class problem_2480 {

	public static void main(String[] args) {
		/** 
		 * 주사위 3개를 던져서 아래의 규칙에 따라 상금을 가져간다.
		 * 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금
		 * 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원
		 * 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금
		 * 
		 **/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = {a, b, c};
		
		if (a==b && b==c) {
			System.out.println(10000 + 1000*a);
		} else if (a==b) {
			System.out.println(1000 + 100*a);
		} else if (a==c) {
			System.out.println(1000 + 100*a);
		} else if (b==c) {
			System.out.println(1000 + 100*b);
		} else {
			// stream API 활용
			OptionalInt max = Arrays.stream(arr).max();
			System.out.println(max.getAsInt()*100);
		}
	}

}
