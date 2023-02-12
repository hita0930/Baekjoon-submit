package s_10.p2750;

import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//선택정렬
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
					
				}
				
			}
			
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
