package 단계별로풀어보기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem_2908 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<Integer> arr_i = new ArrayList<Integer>();
		
		for (int i=0; i<2; i++) {
			String s = sc.next();
			String s_rev = new String();
			for (int j=s.length()-1; j>=0; j--) {
				s_rev += s.charAt(j);
			}
			
			arr.add(s_rev);
		}
		
		for (int i=0; i<2; i++) {
			arr_i.add(Integer.parseInt(arr.get(i)));
		}
		
		Collections.sort(arr_i);
		
		System.out.println(arr_i.get(arr_i.size()-1));

	}

}
