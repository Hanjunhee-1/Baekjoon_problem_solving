package 단계별로풀어보기;

import java.util.Scanner;
import java.util.ArrayList;

// Quick sort 를 사용했음.
// Quick sort 는 partition(분할) 과 conquest(정복) 부분으로 나뉜다.
// 분할-정복은 컴퓨터 과학에서 어떤 일을 해결할 때 그것보다 작은 일로 만들어서 해결한다는 이념과 동일하다.

public class problem_10818 {

	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.sortMyArray();
//		myArray.printMyArray();
		myArray.printMin(); System.out.print(" "); myArray.printMax();
	}

}

class MyArray {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int n=0;
	
	public MyArray() {
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
	}
	
	public void printMyArray() {
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
	
	public void sortMyArray() {
		this.quickSort(arr, 0, arr.size() - 1);
	}
	
	public Integer partition(ArrayList<Integer> arr, int left, int right) {
		int pivot = arr.get((left+right) / 2); // 배열의 중앙값을 pivot 으로 설정
		int start = left;
		int end = right;
		
		while (start <= end) {
			while (arr.get(start) < pivot) start++;
			while (arr.get(end) > pivot) end--;
			
			if (start <= end) {
				int save = arr.get(start);
				arr.set(start, arr.get(end));
				arr.set(end, save);
				start++;
				end--;
			}	
		}
		return start;
	}
	
	public void quickSort(ArrayList<Integer> arr, int left, int right) {
		if (left < right) {
			int p = this.partition(arr, left, right);
			
			this.quickSort(arr, left, p-1);
			this.quickSort(arr, p, right);
		}
	}
	
	public void printMin() {
		System.out.print(arr.get(0));
	}
	
	public void printMax() {
		System.out.println(arr.get(arr.size() - 1));
	}
	
}