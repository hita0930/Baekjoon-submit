package etc.swea12368;
//24½Ã°£ D3

import java.io.*;
import java.util.StringTokenizer;

public class Solution {

public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int time = 0;
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			time = (A + B) % 24;

			System.out.printf("#%d %d\n",test_case ,time);
		}
		
	}
	
}
