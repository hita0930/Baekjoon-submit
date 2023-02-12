package s_10.p25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());;
		}

		//Á¤·Ä
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
					
				}
				
			}
			
		}
		
		System.out.println(arr[K - 1]);
		
	}
	
}
