package a_oca.q095;
import java.util.*;
public class Q95 {
}
class Product{
	int id;
	String name;
	
	public  Product(int id, String name) { 
		this.id = id;
		this.name = name;
	}
}
class Shop {
	
	public static void main(String[] args) {
		
		List<Product> st = new ArrayList<>() ;
		st.add(new Product(10, "IceCream")); //st deil 1st. hata verince st cevirdim.
		st.add(new Product(11, "Chocolate"));
		Product p1 = new Product(10, "IceCream"); // 10 is not the index of icecream, it's just the argument of the constructor, consider the whole as a object
		System.out.println(st.indexOf(p1));
		System.out.println(st.indexOf("IceCream"));
		System.out.println(st.indexOf(new Product(10, "IceCream")));
		System.out.println(st.get(1));
			
		}
	}

/*
 *What is the result?
		A. true
		B. false
		C. -1
		D. 0
		Answer: C 
 */
