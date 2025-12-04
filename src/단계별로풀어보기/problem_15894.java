package 단계별로풀어보기;

import java.util.Scanner;

public class problem_15894 {

	public static void main(String[] args) {
		// 수학은 체육과목입니다
		// 맨 아랫층의 개수 N 을 입력받았을 때 도형의 둘레를 출력하라.
		// 말로 설명하기 애매하니까 그림 참고

		/**
		 * 1 -> 4 => 이건 정사각형 도형 1개 있는 거임.
		 * 3 -> 12 => 이건 정사각형 도형 3개가 있고 그 위에 2개가 있고 그 위에 1개가 피라미드 형태로 쌓인거임.
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		
		System.out.println(N*4);
	}

}
