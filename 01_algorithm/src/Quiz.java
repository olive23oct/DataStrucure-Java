
public class Quiz {
	
	static String sum(int n) {
		int sum = 0;
	    String answer = "";			
		for(int i = 1; i < n + 1; i++) {
			if(i != n) {
				sum += i;
				answer += i + "+";			
			}else {
				answer += i + "=" + sum;
			}
		}
		return answer;
	}
	
	static int GaussSum(int n) {		
		int sum = 0;
		for(int i = 1; i < n+1; i++) {
			sum = (1 + n) * n/2;
		}
		return sum;
	}
	
	static int sumof(int a, int b) {
		int sum = 0;
		if(b > a) {
			for(int i = a; i < b + 1; i++) {
				sum += i;
			}
		}else {
			for(int i = b; i < a + 1; i++) {
				sum += i;
			}	
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sum(7));
		System.out.println(GaussSum(100));
		
		System.out.println(sumof(4,1));
	}
}
