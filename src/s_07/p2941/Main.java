package s_07.p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			
			if(i != (str.length() - 1)) {
				
				if(str.charAt(i) == 'c') {
					
					if(str.charAt(i+1) =='=') {
						i++;
					}
					
					else if(str.charAt(i+1) =='-') {
						i++;
					}
					
				}
				
				else if(str.charAt(i) == 'd') {
					
					if(str.charAt(i+1) =='-') {
						i++;
					}
					
					else if(i != (str.length() - 2)) {
						
						if(str.charAt(i+1) =='z' && str.charAt(i+2) =='=') {
							i += 2;
						}
						
					}	
					
				}
				
				else if(str.charAt(i) == 'l' && str.charAt(i+1) =='j') {
					i++;
				}
				
				else if(str.charAt(i) == 'n' && str.charAt(i+1) =='j') {
					i++;
				}
				
				else if(str.charAt(i) == 's' && str.charAt(i+1) =='=') {
					i++;
				}
				
				else if(str.charAt(i) == 'z' && str.charAt(i+1) =='=') {
					i++;
				}
				
			}
			
			cnt++;
			
		}
		
		System.out.println(cnt);
		
	}	
	
}
