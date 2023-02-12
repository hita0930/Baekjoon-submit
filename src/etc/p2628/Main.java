package etc.p2628;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken()); //가로
		int col = Integer.parseInt(st.nextToken()); //세로
		
		boolean[] rowArr = new boolean[row + 1];
		boolean[] colArr = new boolean[col + 1];
		rowArr[row] = true;
		colArr[col] = true;
		
		int cut = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < cut; i++) {
			
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int side = Integer.parseInt(st2.nextToken());
			int lineNum = Integer.parseInt(st2.nextToken());
			
			//자르는 지점 true로 마킹
			if (side == 1) {
				rowArr[lineNum] = true;
			}
			
			else if(side == 0) {
				colArr[lineNum] = true;
			}			
			
		}
		
		//가로 세로 종이 자르기 수행
		int rowHead = 0;
		int colHead = 0;
		int rMax = 0;
		int cMax = 0;
		int rTmp = 0;
		int cTmp = 0;
		
		//최대 가로 길이 확인
		for ( int i = 0; i < rowArr.length; i++ ) {
				
			if(rowArr[i] == true) {
				rTmp = i - rowHead;
				rMax = Math.max(rMax, rTmp);
				rowHead = i;
			}
			
		}
		
		//최대 세로 길이 확인
		for ( int i = 0; i < colArr.length; i++ ) {
		
			if(colArr[i] == true) {
				cTmp = i - colHead;
				cMax = Math.max(cMax, cTmp);
				colHead = i;
			}
			
		}

		System.out.println(rMax * cMax);
		
	}
	
}
