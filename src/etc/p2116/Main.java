package etc.p2116;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] arr = new int [T][6];
		
		for (int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
			arr[i][3] = Integer.parseInt(st.nextToken());
			arr[i][4] = Integer.parseInt(st.nextToken());
			arr[i][5] = Integer.parseInt(st.nextToken());
			
		}
		
		int max = 0;
		for(int i = 0; i < 6; i ++ ) {
			
			
			
		}
		
		
	}
	
}
