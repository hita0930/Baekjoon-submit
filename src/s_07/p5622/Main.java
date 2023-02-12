package s_07.p5622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int total = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C') {
				total += 3;
			}
			
			else if (str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F') {
				total += 4;
			}
			
			else if (str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I') {
				total += 5;
			}
			
			else if (str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L') {
				total += 6;
			}
			
			else if (str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O') {
				total += 7;
			}
			
			else if (str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S') {
				total += 8;
			}
			
			else if (str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V') {
				total += 9;
			}
			
			else if (str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
				total += 10;
			}
			
		}
		
		System.out.println(total);
		
	}
	
}
