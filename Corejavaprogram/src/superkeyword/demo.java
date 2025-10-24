package superkeyword;

//child class
public class demo extends superdemo {

	int a=50;
	
	void drinking() {
		System.out.println("hi java");
	}
	
	void show() {
		System.out.println(a);
		System.out.println(super.a);
		drinking();
		super.drinking();
	}
	
	demo(){
		super();
		System.out.println("child class");
	}
	public static void main(String[] args) {
		demo d=new demo();
		//System.out.println(d.a);
		d.show();
		
	}
}
