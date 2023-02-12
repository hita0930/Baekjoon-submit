package s_07.p2908;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		int X = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
		int Y = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
		
		if (X > Y) {
			System.out.println(X);
		}
		
		else {
			System.out.println(Y);
		}
		
	}
	
}
