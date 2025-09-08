package 단계별로풀어보기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem_25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum_result = 0, sum_grade = 0; 
		Map<String, Float> grade = new HashMap<String, Float>();
		grade.put("A+", (float) 4.5);
		grade.put("A0", (float) 4.0);
		grade.put("B+", (float) 3.5);
		grade.put("B0", (float) 3.0);
		grade.put("C+", (float) 2.5);
		grade.put("C0", (float) 2.0);
		grade.put("D+", (float) 1.5);
		grade.put("D0", (float) 1.0);
		grade.put("F", (float) 0.0);
		
		// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
		for (int i=0; i<20; i++) {
			String[] input = sc.nextLine().split(" ");
			
			if (!input[2].equals("P")) {
				sum_grade += Float.parseFloat(input[1]);
				sum_result += (Float.parseFloat(input[1]) * grade.get(input[2]));
			}
		}
		
		System.out.println(String.format("%.6f", sum_result / sum_grade));
	}

}
