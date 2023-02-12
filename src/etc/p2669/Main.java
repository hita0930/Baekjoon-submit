package etc.p2669;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][] map = new int[101][101];
		int cnt = 0;
		
		for(int i = 0; i < 4; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(str.nextToken());
			int y1 = Integer.parseInt(str.nextToken());
			int x2 = Integer.parseInt(str.nextToken());
			int y2 = Integer.parseInt(str.nextToken());
			
			for(int x = x1; x < x2; x++) {
				for(int y = y1; y < y2; y++) {
					//중복 좌표 카운팅 안하기
					if(map[x][y] == 1) { 
						continue;
					}
					else {
						map[x][y] = 1;
						cnt++;
					}
				}
			}
			
		}
		
		System.out.println(cnt);
		
	}
	
}
