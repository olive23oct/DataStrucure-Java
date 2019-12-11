package Array;

import java.util.Scanner;

public class Quiz2 {
	// 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXZY";
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);
		
		for(int i = 0; i < digits; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits -i -1] = temp;
		}
		return digits;
	}
	// 기수 변환 과정을 자세히
//	static void cardConvR(int x, int r) {
//		int digits = 0;
//		char[] d = null;
//		String dchar = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXZY";
//		while(true) {
//			x /= r;
//			System.out.println(r + " |\t" + x);
//			System.out.println("  +------" );
//			if((x % r) == 0) {
//				System.out.println(r + " |\t" + x + "...");
//				System.out.println("  +------" );
//			}
//			System.out.println(r + " |\t" + x + "..." + (x % r));
//			System.out.println("  +------" );
//			d[digits++] = dchar.charAt(x % r);
//		}
//
//	}
//	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열 
		while(true) {
			System.out.print("변환하는 음이 아닌 정수: ");
			no = sc.nextInt();
			if(no > 0) {
				System.out.print("어떤 진수로 변환? (2~36): ");
				cd = sc.nextInt();
				if(cd > 1 && cd < 36) {
					dno = cardConv(no, cd, cno);
					System.out.print(cd + "진수로는 ");
					for(int i = dno - 1; i >= 0; i--) {
						System.out.print(cno[i]);
					}
					System.out.println("입니다.");
				
					System.out.println("다시 시도 (1.예 / 2.아니오)");
					retry = sc.nextInt();
					if(retry != 1) {
						System.out.println("기수 변환을 종료합니다.");
						break;
					}
				} 
			} else {
				System.out.println("양수만 입력가능합니다.\n");
			}
		}
	}
}
