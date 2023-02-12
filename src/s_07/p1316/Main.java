package s_07.p1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			boolean[] check = new boolean[26];
			boolean tmp = true;
			String str = br.readLine();
			
			for(int j = 0; j < str.length(); j++) {
				int idx = str.charAt(j) - 'a';
				
				if(check[idx]) {
					if(str.charAt(j) != str.charAt(j - 1)) {
						tmp = false;
						break;
					}
				}
				
				else {
					check[idx] = true;
				}
				
			}
			
			if(tmp) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		
	}
	
}
