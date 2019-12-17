/**
 * Stack 
 * 데이터를 일시적으로 저장하기 위해 사용하는 구조
 * 후입선출(LIFO, Last In First Out)
 * pop : 스택에서 데이터를 꺼내는 작업
 * push : 데이터를 넣는 작업
 * 
 * @author rnsfhlqhrekrl
 *
 */
public class IntStack {
	private int max; // 스택 용량 : 스택에 쌓을 수 있는 최대 데이터의 수
	private int ptr; // 스택 포인터 : 스택에 쌓여 있는 데이터의 수
	private int[] stk; // 스택 본체
	
	// 실행 시 예외 : 스택이 비어 있음 
	public class EmptyintStackException extends RuntimeException {
		public EmptyintStackException() {
			System.out.println("빈 스택");
		}
	}
	
	// 실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			System.out.println("스택이 가득 참");
		}
	}
	
	// 생성자
	public IntStack(int capacity) {
		ptr = 0; // 생성 시 스택은 비어 있으므로 스택 포인터 값은 0
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}
	
	// 스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	// push
	public int pop() throws EmptyintStackException {
		if (ptr <= 0) {
			throw new EmptyintStackException();
		}
		return stk[--ptr];
	}
	
	// peek : 꼭대기에 있는 데이터를 확인할 수 있는 메서드
	public int peek() throws EmptyintStackException {
		if (ptr <= 0) {
			throw new EmptyintStackException();
		}
		return stk[ptr -1];
	}
	
	// 검색 메서드 : indexOf
	// 꼭대기 쪽에서 바닥 쪽으로 선형 검색을 수행
	// 배열 인덱스가 큰 쪽에서 작은 쪽으로 스캔
	// 검색 성공 시 찾아낸 요소의 인덱스를 반환, 실패 시 -1을 반환
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	// 삭제 : clear
	// 스택에 쌓여 있는 모든 데이터를 삭제
	public void clear() {
		ptr = 0;
	}
	
	// 용량 : capacity
	// max 값을 그대로 반환
	public int capacity() {
		return max;
	}
	
	// size : 현재 스택에 쌓여 있는 데이터 수(ptr의 값)을 반환
	public int size() {
		return ptr;
	}
	
	// IsEmpty 
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// IsFull
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0) {
			System.out.println("스택이 비어 있음");
		} else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
		
	}
}
