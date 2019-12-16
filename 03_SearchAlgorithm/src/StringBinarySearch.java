import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import",
				"instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public",
				"return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws",
				"transient", "try", "void", "volatile", "while"
		};
		
		System.out.print("키워드 입력: ");
		String key = sc.next();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) {
			System.out.println("해당값 없음");
		} else {
			System.out.println("idx : " + idx);
		}
		
	}
}
