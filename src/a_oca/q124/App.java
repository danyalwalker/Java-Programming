package a_oca.q124;

public class App {
	
	String myStr = "7007";
	
	public void doStuff(String str) {
		int myNum = 0;

	try {
		String  myStr = str;   // if you go as myStr = str, then it would assign to the instance ans myStr would print 9009
		myNum = Integer.parseInt(myStr);
	}catch (NumberFormatException ne) {
		System.err.println("Error");
	}
    System.out.println("myStr: " + myStr + ", myNum: "+myNum);
    
	}
	public static void main(String[] args) {
		App obj = new App();
		obj.doStuff("9009");
// Answer C myStr: 7007, myNum: 9009
	}
}
