package s_07.p10809;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			
			if(arr[index] == -1) {
				arr[index] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
