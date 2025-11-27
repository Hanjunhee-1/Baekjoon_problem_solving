package 단계별로풀어보기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class problem_2869 {

	public static void main(String[] args) throws IOException {
		// 달팽이는 올라가고 싶다
		// 땅에 있는 달팽이가 총 V 높이인 나무막대를 오르려고 한다.
		// 낮에는 A 만큼 오를 수 있고 밤에는 B 만큼 떨어진다.
		// 단, 정상에 오르고 난 다음에는 안 떨어진다.
		// 입력은 A B V 순으로 입력받는다. (1 <= B < A <= V <= 1,000,000,000)
		// 시간제한 0.25초. while(true) {} 는 쓰면 어려울 듯.
		
		/**
		 * case1: 2 1 5 -> 4
		 * case2: 5 1 6 -> 2
		 * case3: 100 99 1000000000 (10억) -> 999,999,901 (9억 9천9백9십9만 9천9백0십1)
		 * 
		 * case1을 분석해보면 다음과 같다.
		 * 첫째날: 2 올라갔다가 밤에 1이 됨.
		 * 둘째날: 3 올라갔다가 밤에 2가 됨.
		 * 셋째날: 4 올라갔다가 밤에 3이 됨.
		 * 넷째날: 5 올라감 이미 정상에 도달했으므로 떨어지지 않음. 즉, 넷째날에 도착완료.
		 * 
		 * 실제 값에 영향을 주는 것은 A-B.
		 * (V-B) / (A-B)
		 * 
		 * V에서 B를 빼는 이유는 마지막 날 아침에 도착하는 경우 때문. 
		 */

		// declare
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		// ceil() 을 사용한 이유는 다음과 같음.
		// 예를 들어 (V-B) / (A-B) 가 1.xxx 가 나왔다고 가정. 이는 1일보다 좀 더 걸린다는 것임. 때문에 무조건 올림을 해줘야함.
		double result = Math.ceil((double)(V-B) / (double)(A-B));
		bw.write(String.valueOf((int) result));
		bw.flush();
		bw.close();
	}

}
