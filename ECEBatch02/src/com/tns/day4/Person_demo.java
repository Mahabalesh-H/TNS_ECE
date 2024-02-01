package com.tns.day4;
import java.util.Scanner;

public class Person_demo {
	public static void main(String[] args) {
		Person A=new Person();
		String name,gender;
		int income,age,tax;
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=SC.next();
		System.out.println("Enter gender: ");
		gender=SC.next();
		System.out.println("Enter income: ");
		income=SC.nextInt();
		System.out.println("Enter age: ");
		age=SC.nextInt();
		System.out.println("Enter tax: ");
		tax=SC.nextInt();
		A.setName(name);
		A.setGender(gender);
		A.setIncome(income);
		A.setAge(age);
		A.setTax(tax);
		//System.out.println(A); 
		Taxcalculation  tax1 = new Taxcalculation ();
		tax1.calculateTax(A );
		System.out.println(A);
				 
	}

}
