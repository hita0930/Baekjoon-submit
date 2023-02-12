package etc.swea14413;

import java.io.*;
import java.util.StringTokenizer;

class Solution {
	
	char[][] arr;

	static String check(char[][] arr) {
		
		boolean isF = true;
		int hwcase = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				if(isF == true){
					if(arr[i][j] == '#') {
						if((i + j) % 2 == 0) {
							hwcase = 1; // #이 짝수인 케이스
							isF = false;
						}
						else if((i + j) % 2 != 0) {
							hwcase = 2; //.이 짝수인 케이스
							isF = false;
						}
						
					}
					else if (arr[i][j] == '.') {
						if((i + j) % 2 == 0) {
							hwcase = 2; //.이 짝수인 케이스
							isF = false;
						}
						else if((i + j) % 2 != 0) {
							hwcase = 1; // #이 짝수인 케이스
							isF = false;
						}
					}
					
				}
				
				else if(isF == false) {
					if(hwcase == 1) { // i+j 짝수일때 # 인 케이스
						if((i + j) % 2 == 0 && arr[i][j] == '.') {
							return "impossible";
						}
						else if((i + j) % 2 != 0 && arr[i][j] == '#') {
							return "impossible";
						}
						else {
							continue;
						}
					}
					else if(hwcase == 2) { // i+j 짝수일때 . 인 케이스
						if((i + j) % 2 == 0 && arr[i][j] == '#') {
							return "impossible";
						}
						else if((i + j) % 2 != 0 && arr[i][j] == '.') {
							return "impossible";
						}
						else {
							continue;
						}
					}
				}
				
			}
		}
		
		return "possible";
		
	}
	
	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			char[][] arr = new char[N][M];
			for (int i = 0; i < N; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			
			String result = check(arr);
			System.out.printf("#%d %s\n", test_case, result);
		}
		
	}
	
}
