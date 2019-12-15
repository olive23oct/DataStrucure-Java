import java.util.Scanner;

/**
 * 이진 검색(Binary Search)
 * 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
 * 이진 검색을 한 단계씩 진행할 때마다 검색 범위가 반으로 좁혀짐
 * 종료조건
 * 1. a[n] = key 일 경우
 * 2. 검색 범위가 더 이상 없는 경우
 * @author rnsfhlqhrekrl
 *
 */
public class BinarySearch {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
			if(a[pc] == key) {
				return pc; // 검색 성공
			} else if (a[pc] < key) {
				pl = pc + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
			} else {
				pr = pc - 1; // 검색 범위를 앞쪽 절반으로 좁힘 
			}
		} while (pl <= pr);
		return -1; // 검색 실패
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름 차순으로 입력");
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		for(int i = 1; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
			if(x[i] < x[i - 1]) {
				System.out.println("다시 입력하시오");
				i--;
				continue;
			}
		}
		
		System.out.println("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("검색 실패");
		} else {
			System.out.println("key: " + key + ", idx: " + idx);
		}
		
	}
}
