package com.tns.day2;

public class Prog3 {

	public static void main(String[] args) {
		//implicit type casting
		float f=45.8f;
		double d=f;
		int i=311;
		float f1=i;
		char ch='M';
		int i2=ch;
		System.out.println(d+"\n"+f1+"\n"+i2);
		//explicit type casting
		double d1=32.6789d;
		int i1=(int) d1;
		int x=69;
		char c1=(char) x;
		char c2='e';
		byte b1=(byte) c2;
		System.out.println(i1+"\n"+c1+"\n"+b1);
	}
}