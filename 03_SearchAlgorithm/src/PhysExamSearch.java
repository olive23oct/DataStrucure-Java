import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER
			= new HeightOrderComparator();
		
		private static class HeightOrderComparator implements 
		Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
						(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("ABC", 165, 0.5),
				new PhyscData("CDF", 189, 1.2),
				new PhyscData("DDD", 132, 0.2),
				new PhyscData("EEE", 176, 1.0),
				new PhyscData("ZZZ", 145, 0.7),
				new PhyscData("QQQ", 159, 0.4)
		};
		
		System.out.print("키 입력: ");
		
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(x,
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
				);
		
		if(idx < 0) {
			System.out.println("해당 키 없음");
		} else {
			System.out.println("index: " + idx);
			System.out.println("찾은 데이터: " + x[idx]);
		}
		
	}
}
