package etc.swea1204;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t_c = 1; t_c <= T; t_c++) {
			int max = Integer.MIN_VALUE;
			int maxIdx = 0;
			int[] arr = new int[101];
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 1000; i++) {
				arr[Integer.parseInt(st.nextToken())]++;
			}
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= max) {
					if(arr[i] == max) {
						maxIdx = Math.max(i, maxIdx);
					}
					else {
						max = arr[i];
						maxIdx = i;
					}
				}
			}
			
			System.out.printf("#%d %d\n", t_c, maxIdx);
		}
	}
	
}
