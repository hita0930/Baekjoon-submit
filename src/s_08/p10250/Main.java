package s_08.p10250;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T =  Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(str.nextToken());
			int W = Integer.parseInt(str.nextToken());
			int N = Integer.parseInt(str.nextToken());
			
			if(N % H == 0) {
				
				System.out.println((H * 100) + (N / H));
				
			}
			
			else {
				
				System.out.println(((N % H) * 100) + ((N / H) + 1));
				
			}
			
		}
		
	}
	
}
