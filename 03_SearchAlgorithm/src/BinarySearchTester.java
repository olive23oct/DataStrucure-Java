import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		for(int i = 1; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
			if(x[i] <= x[i - 1]) {
				System.out.println("다시 입력하시오");
				i--;
				continue;
			}
		}
		
		System.out.print("key: ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx > 0) {
			System.out.println("key: " + key + ", index: " + idx);
		} else {
			System.out.println("해당값 없음");
		}
	}
}
