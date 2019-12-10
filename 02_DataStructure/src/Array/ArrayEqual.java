package Array;

import java.util.Scanner;

public class ArrayEqual {

	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		} 
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a");
		
		int no1 = sc.nextInt();
		int[] a = new int[no1];
		
		for(int i = 0; i < no1; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		} 
		
		System.out.println("배열 b");
		int no2 = sc.nextInt();
		int[] b = new int[no2];
		for(int i = 0; i < no2; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		System.out.println("배열 a와 배열 b는 " + 
						(equals(a, b) ? "같습니다."
									  : "같지 않습니다."));
		
 	
	}
}
