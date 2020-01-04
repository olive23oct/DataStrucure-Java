
public class Hanoi {
	static int count = 0;
	static void move(int no, int x, int y) {
		// no 개의 원반을 x번 기둥에서 y번 기둥으로 옮김
		if(no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		
		System.out.println("원반[" + no + "]을" + x + "기둥에서 " + y + "기둥으로 옮김, 횟수 " + count);
		if(no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}
	
	public static void main(String[] args) {
		move(3, 1, 3);
	}
}
