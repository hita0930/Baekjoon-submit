package etc.swea1945;
//간단한 소인수분해 D2

import java.io.*;

public class Solution {

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {			
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[5];
			
			while(N > 1) {
				if(N % 2 ==0) {
					N /= 2;
					arr[0]++;
				}
				else if(N % 3 ==0) {
					N /= 3;
					arr[1]++;
				}
				else if(N % 5 ==0) {
					N /= 5;
					arr[2]++;
				}
				else if(N % 7 ==0) {
					N /= 7;
					arr[3]++;
				}
				else if(N % 11 ==0) {
					N /= 11;
					arr[4]++;
				}
			}
			
			System.out.printf("#%d %d %d %d %d %d\n", test_case, arr[0], arr[1], arr[2], arr[3], arr[4]);
		}
		
	}
	
}
