package etc.swea1208;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[100];
		
		for (int t_c = 1; t_c <= 10; t_c++) {
			
			
			int dumpCnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			for(int i = 0; i < dumpCnt; i++) {
				arr[0] += 1;
				arr[99] -= 1;
				Arrays.sort(arr);
			}
			
			int result = arr[99] - arr[0];
			System.out.printf("#%d %d\n", t_c, result);
			
		}
		
	}
	
}
