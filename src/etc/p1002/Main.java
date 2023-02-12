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
			//�ο� �߽��� ���� �Ÿ�
			
			if(r1 > r2) {
				// ū���� r2�� �ؼ� ����� �����ϰ� ��
				int tmp = r1;
				r1 = r2;
				r2 = tmp;
				
			}
			
			int cnt = 0;
			//������ ����
			
			if(R > r2) {
				// �� �ȿ� �ٸ� ���� ���� �� �� ����
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
				// ū �� ���ο� ���� �� ����
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
				// R == 0 case, ��ġ or ���� ��
				if(r1 != r2) {
					cnt = 0; 
				}
				else {
				//r1 == r2
					cnt = -1; //���� ���Ѵ�
				}
				
			}
			
			System.out.println(cnt);
			
		}
		
	}
	
}
