package a_oca.q050;

public class Q050 {
//  Which two code fragments cause compilation errors? (Choose two.)
	public static void main(String[] args) {
		double y1 = 203.22; //float fit = y1; //Type mismatch: cannot convert from double to float
		
		float fit1 = (float) 1_11.0;
		
		//Float fit2  =  100.00; 						// Wrapper class, add F or f  to the end to compile
		
		int y2 = 100; float fit3= (float)y2;
		
		float fit4 = 100.00f;
	}
}
