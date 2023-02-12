package etc.p1244;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];		
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		
		int stuNum = Integer.parseInt(br.readLine());
		int[][] stuArr = new int[stuNum][2];
		
		for (int i = 0; i < stuNum; i++) {
			
			StringTokenizer str2 = new StringTokenizer(br.readLine());
			stuArr[i][0] = Integer.parseInt(str2.nextToken()); //성별
			stuArr[i][1] = Integer.parseInt(str2.nextToken()); //받은 수
			
		}
		
		//스위치 전환
		for (int i = 0; i < stuNum; i++) {
			
			//남학생일 경우, 받은 수의 배수에 해당하는 숫자만 바꿈
			if(stuArr[i][0] == 1) {
				
				for (int j = 1; j <= N; j++) {
					
					if(j >= (stuArr[i][1]) && j % (stuArr[i][1]) == 0) {
						arr[j] = (arr[j] == 0) ? 1 : 0;
					}
					
				}
				
			}
			
			//여학생일 경우, 받은 수를 중심으로 좌우 대칭이며 가장 많은 스위치를 포함하는 구간 전부를 바꿈
			else if(stuArr[i][0] == 2) {
				
				for (int j = 1; j <= N; j++) {
					
				}
				
			}
			
		}
		
		for(int i = 1; i <= N; i++) {
			if(i != 1 && i % 20 == 0) {
				sb.append(arr[i]).append('\n');
			}
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
		
	}
	
}
