package a_oca.q177;

import day55_abstraction.interface_demo.ChromeDriver;
import day55_abstraction.interface_demo.FirefoxDriver;
import day55_abstraction.interface_demo.WebDriver;

class Bird {
	public void fly() {
		System.out.println("Fly.");
	}
}

	public class Peacock extends Bird {
		public void dance() {
			System.out.println("Dance.");
		}
		
			public static void main(String[] args) {
				
			
	/* insert code snippet here */
   // Bird p = new Peacock(); //dance gelmiyor
   //Bird b = new Bird();   Peacock p = (Peacock) b;//Bird cannot be cast to q177.Peacock
	//at q177.Peacock
  //Peacock p = new Peacock (); Bird p = (Bird) b;
   
				 Bird b = new Peacock ();
				 Peacock p = (Peacock) b;

			p.fly();
			p.dance();

				((Peacock)b).fly();
				((Peacock)b).dance();

//answer D
	//Which code snippet can be inserted to print Fly.Dance. ?

				WebDriver driver = new ChromeDriver();
				ChromeDriver chromeDriver = (ChromeDriver) driver;
				FirefoxDriver firefoxDriver = (FirefoxDriver) driver;

			}}
	