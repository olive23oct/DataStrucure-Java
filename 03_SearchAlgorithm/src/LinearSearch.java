import java.util.Scanner;

/**
 * 선형 검색(Linear Search) / 순차 검색(sequential Search)
 * 요소가 직선 모양으로 늘어선 배열에서 원하는 키 값을 갖는 요소를 찾는 검색
 * 맨 앞에서부터 순서대로 요소를 검색하는 방식
 * 
 * @author rnsfhlqhrekrl
 *
 */
public class LinearSearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색
	static int linSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n) {
				return -1;
			}
			if(a[i] == key) {
				return i;
			}
			
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = linSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("검색결과 없음");
		} else {
			System.out.println(key + "은 x[" + idx + "]에 있습니다.");
		}
	}
}
