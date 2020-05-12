package com.trm.executive.Model;

public class Trainer {
	private int id;
	private String name;
	private String type;
	private String technology;
	
	public Trainer(int id, String name, String type, String technology) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.technology = technology;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}

}
