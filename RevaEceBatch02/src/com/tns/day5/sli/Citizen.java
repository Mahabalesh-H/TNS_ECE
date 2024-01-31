package com.tns.day5.sli;

public class Citizen {
	private String name;
	private String aadharno;
	private String address;
	private long phno;
	public Citizen() {
		System.out.println("Citizen Object Created");
	}
	public Citizen(String name, String aadharno, String address, long phno) {
		super();
		this.name = name;
		this.aadharno = aadharno;
		this.address = address;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharno=" + aadharno + ", address=" + address + ", phno=" + phno + "]";
	}
}
