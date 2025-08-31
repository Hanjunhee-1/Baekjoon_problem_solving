package 단계별로풀어보기;

import java.util.Scanner;

public class problem_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine(); // next() 와 다르게 라인 전체를 입력받는다. 즉, 공백도 입력받을 수 있다.
		int cnt = 0; // 단어 카운터
		
		for (int j=1; j<i.length(); j++) {
//			if (i.charAt(j-1) == ' ' && i.charAt(j) != ' ' ) System.out.println("단어가 시작됐습니다. index: " + j);
//			else if (i.charAt(j-1) != ' ' && i.charAt(j) != ' ') System.out.println("단어가 이어지고 있습니다. index: " + j);
//			else if (i.charAt(j-1) != ' ' && i.charAt(j) == ' ') { System.out.println("단어가 끝났습니다. index: " + j); cnt++; 
			if (i.charAt(j-1) != ' ' && i.charAt(j) == ' ') cnt++;
			
		}
		
		if (i.charAt(i.length()-1) != ' ') cnt++;
		
		System.out.println(cnt);

	}

}
