import java.util.Scanner;

/**
 * 보초법(Sentinel Method)
 * [선행 검색의 종료 조건]
 * 1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
 * 2. 검색할 값과 같은 요소를 발견한 경우
 * -> 종료 조건을 검사하는 비용을 50% 줄이는 방법 : 보초법
 * 
 * 검색하기 전 검색하고자 하는 키 값을 맨 끝 요소에 저장
 * 이 때 저장하는 값 = 보초(sentinel)
 * 이렇게 하면 종료조건 1이 없어도 됨
 * 보초는 반복문에서 종료 판단 횟수를 2회에서 1회로 줄이는 역할
 * @author rnsfhlqhrekrl
 *
 */
public class SentinelMethod {
	static int sentinel(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; // 보초를 추가
		
		while(true) {
			if(a[i] == key) { // 검색 성공
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = sentinel(x, num ,key);
		
		if (idx == -1) {
			System.out.println("검색 결과 없음");
		} else {
			System.out.println(key + "은 x[" + idx + "]");
		}
	}
}
