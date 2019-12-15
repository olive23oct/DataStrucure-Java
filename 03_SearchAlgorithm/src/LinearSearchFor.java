import java.util.Scanner;

public class LinearSearchFor {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색
	static int linSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return 1;
			}
		}
		return -1;
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
