package Array;

public class Quiz {
	// 배열 b의 요소를 배열 a에 복사
	static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}
	
	// 배열 b의 요소를 배열 a에 역순복사
	static void rCopy(int[] a, int[] b) {
		// int num = a.length <= b.length ? a.length : b.length;
		int num = 0;
		if (a.length <= b.length) {
			num = a.length;
		} else {
			num = b.length;
		}
		for(int i = 0; i < num; i++) {
			a[i] = b[b.length - i - 1];
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
		int[] c = new int[5];
		copy(c, a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		rCopy(b, a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(b[i] + " ");
		}
 	}
}
