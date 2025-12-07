package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class problem_5073 {

	public static void main(String[] args) {
		// 삼각형과 세 변
		// 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의함.
		// Equilateral :  세 변의 길이가 모두 같은 경우
		// Isosceles : 두 변의 길이만 같은 경우
		// Scalene : 세 변의 길이가 모두 다른 경우
		// 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력함. 
		// 예를 들어 6, 3, 2가 이 경우에 해당함. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못함.
		
		//declare
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int a=0, b=0, c=0;
		
		while (true) {
			a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
			if (a==0 && b==0 && c==0) break;
			
			arr.clear(); arr.add(a); arr.add(b); arr.add(c);
			arr.sort(Comparator.naturalOrder());
			
			if (arr.get(2) >= (arr.get(0) + arr.get(1))) System.out.println("Invalid");
			else {
				if (a==b && b==c) System.out.println("Equilateral");
				else {
					if (a==b) System.out.println("Isosceles");
					else if (a==c) System.out.println("Isosceles");
					else if (b==c) System.out.println("Isosceles");
					else System.out.println("Scalene");
				}
			}
		}

	}

}
