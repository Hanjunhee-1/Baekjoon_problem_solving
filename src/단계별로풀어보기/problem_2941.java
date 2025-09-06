package 단계별로풀어보기;

import java.util.Scanner;

public class problem_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		
		/**
		 * 주어진 알파벳이 총 몇 자인지 출력.
		 * 크로아티아 알파벳을 제외한 알파벳은 1자로 간주.
		 * 
		 * 크로아티아 알파벳 목록 
		 * c=
		 * c-
		 * dz=
		 * d-
		 * lj
		 * nj
		 * s=
		 * z=
		 */
		
		for (int i=0; i<s.length(); i++) {
			// c, d, l, n, s, z 중에 아닌 것이 나오면 무조건 cnt 1증가
			if (s.charAt(i) == 'c') {
				// 그 다음 인덱스 값도 살펴보기 전에 범위를 벗어나는지 체크.
				if ((i+1) >= s.length()) {
					cnt++;
				}
				else {
					if (s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
						cnt++; i++;
					}
					// 여기까지 조건문 통과 기준 i 기준 크로아티아 알파벳 시작부분과 동일해야함.
					// i+1 이 문자열의 범위를 넘지 않아야 함.
					// 즉, else 는 i+1 의 위치의 문자가 크로아티아 알파벳을 만족해주지 않는 경우임. 
					else {
						cnt++;
					}
				}
			}
			else if (s.charAt(i) == 'd') {
				// 그 다음 인덱스 값도 살펴보기 전에 범위를 벗어나는지 체크.
				if ((i+1) >= s.length()) {
					cnt++;
				}
				else {
					if (s.charAt(i+1) == '-') {
						cnt++; i++;
					}
					else if (s.charAt(i+1) == 'z') {
						// 그 다음 인덱스 값도 범위를 벗어나는지 체크
						if ((i+2) >= s.length()) {
							cnt++;
						}
						else {
							if (s.charAt(i+2) == '=') {
								cnt++; i+=2;
							} 
							else {
								cnt++;
							}
						}
					}
					else {
						cnt++;
					}
				}
			}
			else if (s.charAt(i) == 'l' || s.charAt(i) == 'n') {
				// 그 다음 인덱스 값도 살펴보기 전에 범위를 벗어나는지 체크.
				if ((i+1) >= s.length()) {
					cnt++;
				}
				else {
					if (s.charAt(i+1) == 'j') {
						cnt++; i++;
					}
					// 여기까지 조건문 통과 기준 i 기준 크로아티아 알파벳 시작부분과 동일해야함.
					// i+1 이 문자열의 범위를 넘지 않아야 함.
					// 즉, else 는 i+1 의 위치의 문자가 크로아티아 알파벳을 만족해주지 않는 경우임. 
					else {
						cnt++;
					}
				}
			}
			else if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
				// 그 다음 인덱스 값도 살펴보기 전에 범위를 벗어나는지 체크.
				if ((i+1) >= s.length()) {
					cnt++;
				}
				else {
					if (s.charAt(i+1) == '=') {
						cnt++; i++;
					}
					// 여기까지 조건문 통과 기준 i 기준 크로아티아 알파벳 시작부분과 동일해야함.
					// i+1 이 문자열의 범위를 넘지 않아야 함.
					// 즉, else 는 i+1 의 위치의 문자가 크로아티아 알파벳을 만족해주지 않는 경우임. 
					else {
						cnt++;
					}
				}
			}
			else {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
