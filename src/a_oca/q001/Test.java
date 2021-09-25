package a_oca.q001;

public class Test {

	public static void main(String[] args) {

		long [][] arr = new long [][]{{1,2},{3,4}};
		int x = 1;
		int y = 1;	
		if (x++ < ++y) { // x is still 1,   y is 2 ==> true
			System.out.print("Hello ");
		}else {
			System.out.print("Welcome ");
		}
		System.out.print("Log " + x + ":" + y);  // x ix used again so x becomes 2		
	}
}
