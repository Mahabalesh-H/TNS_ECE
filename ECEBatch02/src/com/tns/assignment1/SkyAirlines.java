package com.tns.assignment1;

public class SkyAirlines {
	private String name;
    private String source;
    private String destination;
    public void setName(String name) {
        this.name = name;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void printMessage() {
        System.out.println("Dear "+name+", welcome onboard with service from "+source+" to "+destination+
        		". Thank you for choosing Sky Airlines. Enjoy your flight.");
    }
}
