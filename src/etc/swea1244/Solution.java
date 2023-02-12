package etc.swea1244;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {
	
	static int result;
	
	//dfs
	static void dfs(int cnt, int start, char[] arr) {
		
		if (cnt == 0) {
			int current = Integer.parseInt(new String(arr));
			if(current > result) {
				result = current;
			}
			return;
		}
		
		for(int i = start; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int src = Integer.parseInt(String.valueOf(arr[i]));
				int trg = Integer.parseInt(String.valueOf(arr[j]));
				
				arr[i] = (char)(trg + '0');
				arr[j] = (char)(src + '0');
				dfs(cnt - 1, i, arr);
				arr[i] = (char)(src + '0');
				arr[j] = (char)(trg + '0');
			}
		}
		
	}

	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int cnt = Integer.parseInt(st.nextToken());
			
			char[] arr = str.toCharArray();
			result = 0;
			
			if(arr.length < cnt) cnt = arr.length;
			dfs(cnt, 0, arr);
			
			System.out.printf("#%d %d%n", test_case, result);
			
		}
	}
	
}
