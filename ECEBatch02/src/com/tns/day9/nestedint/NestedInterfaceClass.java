package com.tns.day9.nestedint;

public class NestedInterfaceClass implements MyInterface.MyInnerInterface{

	@Override
	public void print() {
		 System.out.println("Print method of nested interface");
	}
}