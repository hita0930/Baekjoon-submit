package s_08.p1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(str.nextToken());
		int B = Integer.parseInt(str.nextToken());
		int C = Integer.parseInt(str.nextToken());
	
		if(C <= B) { // C - B < 0 
			System.out.println("-1");
		}
		
		else {  // A / (C - B) + 1 손익 분기점(이익을 넘기는 판매량 계산식)
			System.out.println((A / (C-B)) + 1);
		}
		
	}
	
}
