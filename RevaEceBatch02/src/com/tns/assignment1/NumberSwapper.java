package com.tns.assignment1;

public class NumberSwapper {
	private int first;
    private int second;
    public void setNumbers(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public void swapNumbers() {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println("After swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}