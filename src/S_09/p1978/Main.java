package S_09.p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		while(str.hasMoreTokens()) {
			
			boolean isPrime = true;
			
			int num = Integer.parseInt(str.nextToken());
			
			if(num == 1) {
				continue;
			}
			
			for(int i = 2; i <= Math.sqrt(num); i++) {
				
				if(num % i == 0) {
					
					isPrime = false;
					break;
					
				}
				
			}
			
			if(isPrime) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}
	
}
