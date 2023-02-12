package S_09.p11653;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 2;
		
		while(true) {
			
			if(N < 2) {
				break;
			}
			
			if(N % cnt != 0) {
				cnt++;
				continue;
			}
			
			else {
				N = N / cnt;
				System.out.println(cnt);
			}
			
		}
		
	}
	
}
