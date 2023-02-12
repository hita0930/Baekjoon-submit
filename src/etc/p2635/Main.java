package etc.p2635;

import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 4];
		int max = 0;
		
		StringBuilder sb = new StringBuilder();
		
		arr[0] = N;
				
		for (int i = 1; i <= N; i++) {
			
			arr[1] = i;
			int cnt = 2;
			
			while(true) {
				
				arr[cnt] = arr[cnt - 2] - arr[cnt - 1];
				
				if (arr[cnt] < 0) {
					break;
				}
				
				cnt ++;
				
			}
			
			if (max < cnt) {
				max = cnt;
				sb.setLength(0);
				for(int j = 0; j < max; j++) {
					sb.append(arr[j]).append(" ");
				}
			}
		
		}
		
		System.out.println(max);
		System.out.println(sb);
		
	}
	
}
