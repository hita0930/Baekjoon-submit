package etc.swea14555;

import java.io.*;

public class Solution {

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {			
			String str = br.readLine();

			int cnt = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(' && i != str.length() - 1) {
					if(str.charAt(i + 1) == '|' || str.charAt(i + 1) == ')') cnt++;		
				}
				
				else if(str.charAt(i) == ')' && i != 0) {
					if(str.charAt(i - 1) == '|') cnt++;
				}
			}	
			System.out.printf("#%d %d\n", test_case, cnt);
		}
		
	}
	
}
