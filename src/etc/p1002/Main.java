package etc.p1002;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(str.nextToken());
			int y1 = Integer.parseInt(str.nextToken());
			int r1 = Integer.parseInt(str.nextToken());
			int x2 = Integer.parseInt(str.nextToken());
			int y2 = Integer.parseInt(str.nextToken());
			int r2 = Integer.parseInt(str.nextToken());
			
			double R = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
			//두원 중심점 간의 거리
			
			if(r1 > r2) {
				// 큰값을 r2로 해서 계산을 용이하게 함
				int tmp = r1;
				r1 = r2;
				r2 = tmp;
				
			}
			
			int cnt = 0;
			//교점의 개수
			
			if(R > r2) {
				// 원 안에 다른 원이 포함 될 수 없음
				if(R > r1 + r2) {
					cnt = 0; 
				}
				else if( R == r1 + r2) {
					cnt = 1; 
				}
				else {
				//R < r1 + r2
					cnt = 2; 
				}
				
			}
			
			else if(r2 >= R && R > 0) {
				// 큰 원 내부에 작은 원 포함
				if(r2 > R + r1) {
					cnt = 0; 
				}
				else if(r2 == R + r1) {
					cnt = 1; 
				}
				else {
				//r2 < R + r1
					cnt = 2; 
				}
				
			}
			
			else {
				// R == 0 case, 일치 or 내부 원
				if(r1 != r2) {
					cnt = 0; 
				}
				else {
				//r1 == r2
					cnt = -1; //교점 무한대
				}
				
			}
			
			System.out.println(cnt);
			
		}
		
	}
	
}
