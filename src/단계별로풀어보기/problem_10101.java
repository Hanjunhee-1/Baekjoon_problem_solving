package 단계별로풀어보기;

import java.util.Scanner;

public class problem_10101 {

	public static void main(String[] args) {
		// 삼각형 외우기
		// 다음의 조건에 맞게 답을 출력하라.
		// 
		// 세 각의 크기가 모두 60이면, Equilateral
		// 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
		// 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
		// 세 각의 합이 180이 아닌 경우에는 Error
		
		// declare
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if (a+b+c == 180) {
			
			if (a==60 && b==60 && c==60) {
				System.out.println("Equilateral");
			} else if (a==b) {
				System.out.println("Isosceles");
			} else if (a==c) {
				System.out.println("Isosceles");
			} else if (b==c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
			
		} else {
			System.out.println("Error");
		}

	}

}
