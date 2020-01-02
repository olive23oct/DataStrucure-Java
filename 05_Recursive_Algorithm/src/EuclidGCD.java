import java.util.Scanner;

/**
 * 유클리드 호제법(Euclidean method of mutual division)
 * : 두 정수의 최대공약수(great common divisor)를 구하는 방법
 * 
 * 두 정수 x, y의 최대공약수 gcd(x,y)
 * x = az와  y = bz를 만족하는 정수 a, b와 최대의 정수 x가 존재할 떼 
 * z를 gcd(x,y)라고 할 수 있다
 * 최대공약수는 y가 0이면 x이고, y가 0이 아니면 gcd(y, x % y)로 구할 수 있다
 * 
 * @author rnsfhlqhrekrl
 *
 */
public class EuclidGCD {
	// 재귀 메서드 호출
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	// 비재귀적 factorial
	static int gcd2(int x, int y) {
		while(y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	
	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수
	static int gcdArray(int a[], int start, int no) {
		if (no == 1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수");
		
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("y: ");
		int y = sc.nextInt();
		
		//System.out.println("두 정수 x, y의 최대공약수: " + gcd(x, y));
		
		System.out.println("두 정수 x, y의 최대공약수: " + gcd2(x, y));
	}
}
