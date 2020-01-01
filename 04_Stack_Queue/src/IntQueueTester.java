import java.util.Scanner;

public class IntQueueTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue que = new IntQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + que.size() + " / "
					+ que.capacity());
			System.out.print("1.인큐 2.디큐 3.피크 4.덤프 0.종료");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					que.enque(x);
				} catch(IntQueue.OverflowIntQueException e) {
					System.out.println("큐가 가득 참");
				}
				break;
			
			case 2:
				try {
					x = que.deque();
					System.out.println("디큐한 데이터는 " + x);
				} catch(IntQueue.EmptyIntQueExcption e) {
					System.out.println("큐가 비어있음");
				}
				
				break;
			
			case 3:
				try {
					x = sc.nextInt();
					System.out.println("피크한 데이터 " + x);
				} catch(IntQueue.EmptyIntQueExcption e) {
					System.out.println("큐가 비어있음");
				}
				break;
			
			case 4:
				que.dump();
				break;
			}
		}
	}
}
