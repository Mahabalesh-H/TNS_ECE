package com.tns.day7;

public class OveridingDemo {

	public static void main(String[] args) {
		RBI r1;
		r1=new SBI();
		System.out.println(r1.getRateofinterest());
		r1=new ICICI();
		System.out.println(r1.getRateofinterest());
	}

}
