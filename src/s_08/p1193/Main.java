package s_08.p1193;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int n = 0;
		int num_cnt = 0;
		int line_cnt = 0;
		int child = 1;
		int mother = 1;
		
		if(X == 1) {
			System.out.println("1/1");
		}
		
		else {
			while(line_cnt < X) {
				n++;
				line_cnt = n * (n + 1) / 2;		
			}
			
			num_cnt = X - (n - 1) * n / 2;
			
			if(n % 2 == 0) {
				child = num_cnt;
				mother = n - num_cnt + 1;
			}
			
			else {
				child = n - num_cnt + 1;
				mother = num_cnt;
			}
			
			System.out.println(child + "/" + mother);
			
		}
		
	}
	
}
