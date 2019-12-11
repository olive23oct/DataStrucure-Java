package Array;
/**
 * 소수의 나열
 * 소수 : 자신과 1 이외의 정수로 나누어떨어지지 않는 정수
 * 합성수 : 나누어떨어지는 정수가 하나 이상 존재하는 수
 * @author rnsfhlqhrekrl
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int i = 2; i <= 1000; i++) {
			int j;
			for(j = 2; j < i; j++) {
				counter++;
				if(i % j == 0)
					break;
			}
			if(i == j)
				System.out.println(i);
		}
		
		System.out.println("나눗셈을 수행한 횟수: " + counter);
	}
}
