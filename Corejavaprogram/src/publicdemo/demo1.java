package publicdemo;

import Accessmodifier.Accessmodifierdemo;

public class demo1 {
public static void main(String[] args) {
	Accessmodifierdemo obj=new Accessmodifierdemo();
	System.out.println(obj.a);
	System.out.println(obj.s);
	
	obj.display();
}
}