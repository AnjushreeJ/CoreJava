package Constructors;
//demo for constructor 

public class Conexample {
	Conexample(int i){
		System.out.println("constructor with 1 parameter");
	}
	
	Conexample(int i,int j){
		System.out.println("constructor with 2 parameter");
	}
	Conexample(int i, String g , float f){
		System.out.println("constructor with 3 parameter");
	}
	public static void main(String[] args) {
		//Conexample c=new Conexample(9,"gfhg");
		@SuppressWarnings("unused")
		Conexample c1=new Conexample(7,9);
		@SuppressWarnings("unused")
		Conexample c2=new Conexample(5);
		@SuppressWarnings("unused")
		Conexample c3=new Conexample(7,"rash",9.7f);
		
	}

}
