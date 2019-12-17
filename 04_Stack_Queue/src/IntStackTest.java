import java.util.Scanner;

public class IntStackTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntStack stack = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터의 수: " + stack.size() + " / " 
											   + stack.capacity());
			System.out.print("1.push 2.pop 3.peek 4.dump 0.exit : ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			
			switch(menu) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					stack.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다");
				}
				break;
			case 2:
				try {
					x = stack.pop();
					System.out.println(x);
				} catch (IntStack.EmptyintStackException e) {
					System.out.println("스택이 비어 있음");
				}
				break;
			case 3:
				try {
					x = stack.peek();
					System.out.println(x);
				} catch (IntStack.EmptyintStackException e) {
					System.out.println("스택이 비어 있음");
				}
				break;
			case 4:	
				stack.dump();
				break;
			default : 
				System.out.println("다시 입력");
			}
				
		}
	}
}
