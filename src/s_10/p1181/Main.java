package s_10.p1181;

import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String arg[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		
		/*
		 람다식 말고 원래 구현
		 Arrays.sort(arr, new Comparator<String>() {
		 	@override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				else {
					return s1.length() - s2.length();
				}
			}
		});
		 */
		Arrays.sort(arr, (s1, s2) -> {
			if(s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}
			else {
				return s1.length() - s2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();

		
		for(int i = 0; i < N; i++) {
			if(i == 0) {
				sb.append(arr[i]).append("\n");
			}
			else if(!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
}

