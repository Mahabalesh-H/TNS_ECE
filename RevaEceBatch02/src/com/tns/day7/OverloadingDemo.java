package com.tns.day7;

public class OverloadingDemo {

	public static void main(String[] args) {
		ConstrctOverloading c=new ConstrctOverloading();//default constructor is invoked
		System.out.println(c);
		ConstrctOverloading c1=new ConstrctOverloading(10.25f);
		System.out.println(c1);
		ConstrctOverloading c2=new ConstrctOverloading(12.35f,25.15f);
		System.out.println(c2);
		System.out.println(MethodOverloading.add(10,25)+"\n"+
				MethodOverloading.add(15.265f,31.25f)+"\n"+
				MethodOverloading.add(17.25f,25)+"\n"+
				MethodOverloading.add("ECE","ECM"));
	}
}
