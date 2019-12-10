
public class MaxNum_MinNum{
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > a) max = b;
		if(c > max) max = c;
		
		return max;		
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > a) b = max;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max; 
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < a) min = b;
		if(c < min) min = b;
		
		return min;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < a) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println(max3(4,12,7));
		System.out.println(max4(4,6,9,8));
		
		System.out.println(min3(10,4,7));
		System.out.println(min4(1, 5, 2, 4));
	}
}
