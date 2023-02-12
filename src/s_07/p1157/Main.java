package s_07.p1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		int max = 0;
		int maxIndex = 0;
		int cnt = 0; 
		
		for(int i = 0; i < str.length(); i++){
			int index = str.charAt(i) - 'A';
			arr[index] ++;
		}
		
		for(int j = 0; j < arr.length; j++) {

			if(arr[j] > max) {
				max = arr[j];
				maxIndex = j;
				cnt = 0;
			}
			else if(arr[j] == max) {
				cnt++;
			}
		}
		
		if(cnt > 0) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(maxIndex+65));
		}
		
	}
	
}
