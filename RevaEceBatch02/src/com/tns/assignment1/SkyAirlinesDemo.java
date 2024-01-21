package com.tns.assignment1;
import java.util.Scanner;

public class SkyAirlinesDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SkyAirlines flightMessage = new SkyAirlines();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        flightMessage.setName(name);
        System.out.print("Enter source: ");
        String source = scanner.nextLine();
        flightMessage.setSource(source);
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        flightMessage.setDestination(destination);
        flightMessage.printMessage();
        scanner.close();
	}
}
