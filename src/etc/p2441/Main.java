package etc.p2441;

import java.io.*;

public class Main {

	public static void main(String args[])throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = N; i > 0; i--) {
			for(int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
