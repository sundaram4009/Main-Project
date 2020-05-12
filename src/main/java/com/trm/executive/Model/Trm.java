package com.trm.executive.Model;

public class Trm {

	private String trm;
	public String getTrm() {
		return trm;
	}
	public void setTrm(String trm) {
		this.trm = trm;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	private int availability;
	public Trm(String trm, int availability) {
		super();
		this.trm = trm;
		this.availability = availability;
	}
	public Trm()
	{
	}
}
