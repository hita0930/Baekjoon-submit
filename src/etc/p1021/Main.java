package etc.p1021;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
	
	static class Deque{
		
		int[] arr;
		int front = 0, back = 0, cnt = 0;
		
		public Deque(int size) {
			this.arr = new int[size];
		}
		
		public boolean isEmpty() {
			return cnt == 0;
		}
		
		public int count() {
			return cnt;
		}
		
		public int front() {
			if (cnt == 0) {
				return -1; 
			}
			return arr[front];
		}
		
		public int back() {
			if(cnt == 0) {
				return -1; 
			}
			return arr[(back - 1 + arr.length) % arr.length];
		}
		
		public void addLast(int value) {
			if (cnt == arr.length) {
				expand(); 
			}
			arr[back] = value;
			back = (back + 1) % arr.length;
			cnt++;
		}
		
		public void addFirst(int value) {
			if (cnt == arr.length) {
				expand(); 
			}
			front = (front + arr.length - 1) % arr.length;
			arr[front] = value;
			cnt++;
		}
		
		public int removeFirst() {
			if (cnt == 0) {
				return -1;
			}
			int value = arr[front];
			front = (front + 1) % arr.length;
			cnt--;
			return value;
		}
		
		public int removeLast() {
			if (cnt == 0) {
				return -1;
			}
			back = (back + arr.length - 1) % arr.length;
			cnt--;
			return arr[back];
		}
		
		public void expand() {
			int size = arr.length * 2;
			int[] arr2 = new int[size];
			for (int i = 0; i < cnt; i++) {
				int index = (front + i) % arr.length;
				arr2[i] = arr[index];
			}
			arr = arr2;
			front = 0;
			back = cnt;
		}
	
		public int get(int index) {
			int real_index = (front + index) % arr.length;
			return arr[real_index];
		}
		
		public int findIndex(int value) {
			for(int i = 0; i < count(); i++) {
				if(get(i) == value) {
					return i;
				}
			}
			return -1;
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 0; i < count(); i++) {
				sb.append(get(i)).append(", ");
			}
			return sb.append("]").toString();
		}
		
	}
	
	static final int LEFT = 0, RIGHT = 1;
	
	static class RotatingQueue extends Deque {
		
		public RotatingQueue(int size) {
			super(size);
		}
		
		public void rotate(int direction) {
			if(direction == LEFT) {
				int value = super.removeFirst();
				super.addLast(value);
			}
			else {
				int value = super.removeLast();
				super.addFirst(value);
			}
		}
		
		public int pop() {
			return super.removeFirst();
		}
		
		public int close(int value) {
			int index = findIndex(value);
			return (index <= super.count() / 2) ? LEFT : RIGHT;
		}
		
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		RotatingQueue queue = new RotatingQueue(N);
		for (int i = 0; i < N; i++) {
			queue.addLast(i + 1);
		}
		
		int R = 0;
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			
			int value = Integer.parseInt(st2.nextToken());
			int Direction = queue.close(value);
			while (queue.front() != value) {
				
				queue.rotate(Direction);
				R++;
				
			}
			
			queue.pop();
			
		}
		
		System.out.println(R);
		
	}
	
}
