package etc.swea1859;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			int num = 0;
			long max = Long.MIN_VALUE; //int 선언시 오버플로우 가능성떄문에 long 타입 선언
			long cost = 0;
			long sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			/*
			 * 배열 역순으로 탐색
			 * 
			 */
			for (int i = N - 1; i >= 0; i--) {
				//최대값을 찾았을 경우 판매
				if(arr[i] > max) {
					sum += (max * num - cost);
					max = arr[i];
					cost = 0;
					num = 0;
				}
				//최대값보다 작을 경우 구매
				else {
					cost += arr[i];
					num++;
				}
			}
			
			//마지막 경우 추가
			sum += (max * num - cost);
			
			System.out.printf("#%d %d\n", test_case, sum);
			
		}
	}
	
}
