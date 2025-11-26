package 단계별로풀어보기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_2720 {

	public static void main(String[] args) {
		// 세탁소 사장 동혁
		// 손님이 받는 거스름돈은 항상 $5 이하
		// Q -> $0.25, D -> $0.1, N -> $0.05, P -> $0.01
		// 테스트케이스 개수 T 와 C(센트) 단위로 값이 입력됨. 100센트는 $1.
		
		/**
		 * 3 124 25 194 -> 4 2 0 4
		 *                 1 0 0 0
		 *                 7 1 1 4
		 *                 
		 * 1. 사용자에게 입력받은 센트 값을 Q, D, N, P 순으로 비교하여 센트 값이 특정 단위보다 작을 경우 다음 단위로 넘어가는 식으로 하면됨.
		 */
		
		// declare
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int C = 0;
		int Qcnt, Dcnt, Ncnt, Pcnt;
		Map<String, Integer> price = new HashMap<>();
		price.put("Q", 25);
		price.put("D", 10);
		price.put("N", 5);
		price.put("P", 1);
		
		for (int i=0; i<T; i++) {
			Qcnt=0; Dcnt=0; Ncnt=0; Pcnt=0;
			C = sc.nextInt();

			while (C > 0) {
				if (C >= price.get("Q")) {
					Qcnt++;
					C -= price.get("Q");
				} else if (C >= price.get("D")) {
					Dcnt++;
					C -= price.get("D");
				} else if (C >= price.get("N")) {
					Ncnt++;
					C -= price.get("N");
				} else {
					Pcnt++;
					C -= price.get("P");
				}
			}
			
			System.out.println(Qcnt + " " + Dcnt + " " + Ncnt + " " + Pcnt);
		}
	}

}