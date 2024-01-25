package com.tns.day7;

public class ConstrctOverloading {
	
	private float x;
	private float y;
	public ConstrctOverloading() {
		x=0.0f;
		y=0.00f;
	}
	public ConstrctOverloading(float x) {
		this.x = x;
	}
	public ConstrctOverloading(float x, float y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "ConstrctOverloading [x=" + x + ", y=" + y + "]";
	}
}
