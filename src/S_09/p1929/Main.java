package S_09.p1929;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(str.nextToken());
		int N = Integer.parseInt(str.nextToken());
		
		for (int i = M; i <= N; i++) {
			
			boolean isPrime = true;
			
			if(i == 1) {
				continue;
			}
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if(i % j == 0) {
					
					isPrime = false;
					break;
					
				}
				
			}
			
			if(isPrime) {
				System.out.println(i);
			}
			
		}
		
	}
	
}
