package s_08.p2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int A = 1;
		int B = 0;
		int cnt = 0;
		
		while(true) {
			
			if (N == 1) {
				cnt = 1;
				break;
			}
			
			if (A >= N) {
				break;
			}
			
			else {
				A += 6 * B;
				B += 1;
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}
	
}
