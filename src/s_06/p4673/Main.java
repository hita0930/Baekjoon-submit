package s_06.p4673;

public class Main {
	
	public static int d(int n) {
		// 생성자 d(n)
		// 자기 자신의 수에다가 각 자리의 숫자를 더하는것 ex) 33 -> 33 + 3 + 3 = 39 
		
		int sum = n; // 자기 자신
		
		while (n > 0) { // 각 자릿수를 더하기
			sum += n % 10;
			n /= 10;
		}
		return sum; // 결과 반환
	}
	
	public static void main(String[] args) {
		
		boolean [] arr = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) { // 테스트 케이스 10000개
			int n = d(i); // 함수호출, 값 저장
			
			if (n < 10001) { // 생성자가 있는 숫자는 True
				arr[n] = true;
			}
		}
		
		for (int i = 1; i < 10001; i++) { // 다시 반복
			if(arr[i] != true) { // 생성자가 없는 숫자 = 셀프 넘버
				System.out.println(i); // 출력
			}
		}
		
	}

}
