package Array;

import java.util.Scanner;

/**
 * 기수 변환
 * 10진수 정수를 n진수 정수로 변환하려면 정수를 n으로 나눈 나머지를 구하는 동시에 그 몫에 대해 나눗셈을 반복
 * 이 과정을 몫이 0이 될 때까지 반복
 * 이 과정에서 구한 나머지를 거꾸로 늘어 놓은 숫자가 기수로 변환한 숫자
 * @author rnsfhlqhrekrl
 *
 */
public class CardinalConverse {
	// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIGKLMNOPQRSTUVWXZY";
		
		do {
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열 
		
		System.out.println("10진수를 기수 변환");
//		do {
//			do {
//				System.out.print("변환하는 음이 아닌 정수: ");
//				no = sc.nextInt();
//			} while (no < 0);
//			
//			do {
//				System.out.print("어떤 진수로 변환? (2~36): ");
//				cd = sc.nextInt();
//			} while (cd < 2 || cd > 36);
//			dno = cardConv(no, cd, cno); // no를 cd진수로 변환
//			
//			System.out.print(cd + "진수로는 ");
//			for(int i = dno - 1; i >= 0; i--) {
//				System.out.print(cno[i]);
//			}
//			System.out.println("입니다.");
//			
//			System.out.println("다시 시도 (1.예 / 2.아니오)");
//			retry = sc.nextInt();
//		} while (retry == 1);
		
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
