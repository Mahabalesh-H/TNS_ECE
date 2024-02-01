package com.tns.day5.hierarical;

public class RBI {
	private int bankId;
	private String address;
	public RBI() {
		System.out.println("RBI is created");
	}
	public RBI(int bankId, String address) {
		super();
		this.bankId = bankId;
		this.address = address;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "RBI [bankId=" + bankId + ", address=" + address + "]";
	}
	
}
