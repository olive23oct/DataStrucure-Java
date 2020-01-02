import java.util.Scanner;

/**
 * 재귀적(recursive): 어떤 사건이 자기 자신을 포함하고 다시 자기 자신을 사용하여 정의될 때
 * 
 * 직접 재귀(direct) : 자신과 같은 메서드를 호출
 * 간접 재귀(indirect): 메서드 a가 메서드 b를 호출하고, 다시 메서드 b가 메서드 a를 호출하는 구조
 * @author rnsfhlqhrekrl
 *
 */
public class Factorial {
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n - 1); // 재귀 호출(recursive call)
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println("팩토리얼 x : " + factorial(x));
	}
}
