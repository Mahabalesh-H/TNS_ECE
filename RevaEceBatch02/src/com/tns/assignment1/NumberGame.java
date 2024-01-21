package com.tns.assignment1;

public class NumberGame {
	private int num1;
	private int num2;
	private int num3;
	public void setNumbers(int num1, int num2, int num3) {
	    this.num1 = num1;
	    this.num2 = num2;
	    this.num3 = num3;
	}
	public void findSmallest() {
	    int smallest = (num1 <= num2) ? ((num1 <= num3) ? num1 : num3) : ((num2 <= num3) ? num2 : num3);
	    if (num1 == num2 && num2 == num3) {
	        System.out.println("All numbers are equal");
	    } else {
	        System.out.println("The smallest number is: " + smallest);
	    }
	}
}