package Array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
	
	static int maxof(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키 값은 ");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + ran.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("최대값은 " + maxof(height));
	}
}
