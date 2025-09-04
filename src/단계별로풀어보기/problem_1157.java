package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String s = sc.next().toUpperCase();
		int index = 0;
		int max = 0;
		int maxCnt = 0;
		
		// 알파벳 인덱스 초기화
		for (int i=0; i<26; i++) {
			arr.add(0);
		}
		
		// 알파벳 얼마나 나왔는지 카운트
		for (int i=0; i<s.length(); i++) {
			arr.set(s.charAt(i) - 65, arr.get(s.charAt(i) - 65) + 1);
		}
		
		// 많이 나온 알파벳 찾는 구간
		for (int i=0; i<arr.size(); i++) {
			if (arr.get(i) > max) { index = i; max = arr.get(i); }
		}
		
		// 최대로 많이 나온 알파벳 중복 존재하는지 확인하는 구간
		for (int i=0; i<arr.size(); i++) {
			if (max == arr.get(i)) maxCnt++;
		}
		
		// 중복이 없다면 최대로 많이 나온 알파벳 출력하는 구간
		if (maxCnt > 1) {
			System.out.println("?");
		} else {
			System.out.println((char)(index+65));
		}

	}

}
