package com.tns.assignment1;
import java.util.Scanner;

public class NumberSwapperDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first,second;
        NumberSwapper numberSwapper = new NumberSwapper();
        System.out.print("Enter the first number: ");
        first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        second = scanner.nextInt();
        numberSwapper.setNumbers(first, second);
        numberSwapper.swapNumbers();
        scanner.close();
	}

}
