package Accessmodifier;
//demo for access modifier


//public
//private
//protected
//default

public class Accessmodifierdemo {
	
	// public 
	 public int a=9;
	public String s="guru";
	
	public void display() {
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
		Accessmodifierdemo obj=new Accessmodifierdemo();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}

}