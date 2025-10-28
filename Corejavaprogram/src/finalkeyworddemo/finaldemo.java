package finalkeyworddemo;

//demo for final keyword
//variable
//method
//class

public class finaldemo {
	
	static int a=8;  // u cant change value
	
	static {
		a=9;
	}
	void display() { // cant override
		System.out.println("welcome to java");
	}
}
