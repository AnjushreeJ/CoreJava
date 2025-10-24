package polymorphism;

//demo for method overloading
public class overloadingdemo {
	
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
	overloadingdemo d=new overloadingdemo();
	
	System.out.println(d.add(1, 2));
	System.out.println(d.add(1, 2, 3));
	}

}
