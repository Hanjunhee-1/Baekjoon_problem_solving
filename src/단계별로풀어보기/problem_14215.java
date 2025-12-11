package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class problem_14215 {

	public static void main(String[] args) {
		// 세 막대
		// 길이가 a, b, c 인 세 막대로 만들 수 있는 가장 큰 삼각형의 둘레의 길이를 구하자.
		
		// declare
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum=0;
		
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		arr.add(sc.nextInt());
		
		arr.sort(Comparator.naturalOrder());
		
		if (arr.get(2) >= (arr.get(0) + arr.get(1))) {
			sum = arr.get(2) - (arr.get(2) - (arr.get(0) + arr.get(1))) - 1;
		} else {
			sum = arr.get(2);
		}
		
		sum += (arr.get(0) + arr.get(1));
		
		System.out.println(sum);
		
	}

}
