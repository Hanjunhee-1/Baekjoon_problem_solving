package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Scanner;

public class problem_10798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<String>> arr = new ArrayList<>();
		
		for (int i=0; i<5; i++) {
			arr.add(new ArrayList<>());
			arr.get(i).add(sc.next());
		}
		
		int maxLength = 0;
		for (int i=0; i<arr.size(); i++) {
			if (arr.get(i).get(0).length() >= maxLength) maxLength = arr.get(i).get(0).length();
		}
		
		for (int i=0; i<arr.size(); i++) {
			int diff = maxLength - arr.get(i).get(0).length();
			if (diff != 0) {
				for (int j=0; j<diff; j++) {
					arr.get(i).set(0, arr.get(i).get(0) + " ");
				}
			}
		}

		for (int i=0; i<maxLength; i++) {
			for (int j=0; j<arr.size(); j++) {
				if (arr.get(j).get(0).charAt(i) != ' ') {
					System.out.print(arr.get(j).get(0).charAt(i));
				}
			}
		}

	}

}
