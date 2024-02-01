package com.tns.assignment1;
import java.util.Scanner;

public class NumberGameDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        NumberGame numberGame = new NumberGame();
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        numberGame.setNumbers(num1, num2, num3);
        numberGame.findSmallest();
        scanner.close();
	}
}