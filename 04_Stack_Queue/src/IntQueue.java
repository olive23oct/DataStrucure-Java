import java.util.EmptyStackException;


/**
 * Queue 
 * 선입선출(FIFO, First In First Out)
 * enqueue : 데이터를 넣는 작업
 * dequeue : 데이터를 꺼내는 작업
 * front/rear
 * 
 * ring buffer : 배열 요소를 앞쪽으로 옮기지 않는 큐
 * 디큐를 하게 되면 데이터를 꺼낸 자리에 다음 인덱스의 요소들이 하나씩 앞으로 이동해야 함
 * -> 링 버퍼로 큐를 구현하면 front와 rear 값을 업데이트 하면서 인큐와 디큐를 수행
 * @author rnsfhlqhrekrl
 *
 */
public class IntQueue {
	private int max; // 큐의 용량
	private int front; 
	private int rear;
	private int num; // 현재 데이터 수
	private int[] que; 
	
	public class EmptyIntQueExcption extends RuntimeException {
		public EmptyIntQueExcption() {}
	}
	
	public class OverflowIntQueException extends RuntimeException{
		public OverflowIntQueException() {}
	}
	
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueException {
		if(num >= max) {
			throw new OverflowIntQueException();
		}
		que[rear++] = x;
		num++;
		
		if(rear == max) {
			rear = 0;
		}
		return x;
	}
	
	public int deque() throws EmptyIntQueExcption {
		if (num <= 0) {
			throw new EmptyIntQueExcption();
		}
		int x = que[front++];
		num--;
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	public int peek() throws EmptyIntQueExcption {
		if (num <= 0) {
			throw new EmptyIntQueExcption();
		}
		return que[front];
	}
	
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num >= max;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있음");
		}
		for(int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % max] + " ");
		}
		System.out.println();
	}
	// search
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x) // 검색성공
				return i + 1;
		return 0; // 검색실패
	}
}
