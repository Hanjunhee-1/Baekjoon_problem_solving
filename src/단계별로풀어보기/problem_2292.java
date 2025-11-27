package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2292 {

	public static void main(String[] args) {
		// 벌집
		// 벌집의 중앙 육각형에 1이 적혀있고 그 주위로 2~7이 적혀있고 이런식으로 계속해서 숫자가 적혀있음.
		// N을 입력받았을 때 1번 육각형에서 해당 N 이 적혀있는 방을 가기 위해서는 최소 몇 개의 방을 이동해야하는지 출력하기
		// (1 <= N <= 1,000,000,000)
		
		/**
		 * 13 -> 3
		 * 58 -> 5
		 * 
		 * 1번방을 기준으로 층을 나눠봤음.
		 * 1번방 -> 1층, 방 개수 -> 1개
		 * 2~7번방 -> 2층, 방 개수 -> 6개
		 * 8~19번방 -> 3층, 방 개수 -> 12개
		 * 20~37번방 -> 4층, 방 개수 -> 18개
		 * 38~61번방 -> 5층, 방 개수 -> 24개
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		
		if (N > 1) {
			// 애초에 cnt 값을 1로 해두었기 때문에 N이 2이상일 경우에만 while 문 반복하면 됨.
			while (N >= 2) {
				N = N - cnt*6;
				cnt++;
			}	
		}
		
		System.out.println(cnt);
	}

}
