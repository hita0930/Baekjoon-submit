package etc.swea2581;

import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <=T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			for(int j = 1; j <= N; j++ ) {
				if(j % 2 == 0) {
					System.out.println("*");
				}
				else {
					System.out.println("*");
				}
				
			}
			
		}
		
	}
	
}
