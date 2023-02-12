package s_10.p2587;

import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		sum /= 5;
			
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
					
				}
				
			}
			
		}
		
		System.out.println(sum);
		System.out.println(arr[2]);
		
	} 
	
}
