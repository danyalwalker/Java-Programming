package a_oca.q143;

public class Fieldint { //Public class Fieldinit
	
	
	char c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c= "+c);//c=
		System.out.println("b= "+b);//b=false
		System.out.println("f= "+f);//f=0.0
	}
	public static void main(String[] args) {
		Fieldint f=new Fieldint();
		f.printAll();
	}

}


//Answer: c=
//		b = false
//		f = 0.0