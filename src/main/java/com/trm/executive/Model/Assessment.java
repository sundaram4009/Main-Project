package com.trm.executive.Model;

public class Assessment {
	
	private int id;
	private String name;
	private String date;
	private String dateOfSubmission;
	private int marks;
	private int candidateId;
	
	public Assessment() {}
	public Assessment(int id, String name, String date, String dateOfSubmission, int marks, int candidateId) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.dateOfSubmission = dateOfSubmission;
		this.marks = marks;
		this.candidateId = candidateId;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDateOfSubmission() {
		return dateOfSubmission;
	}
	public void setDateOfSubmission(String dateOfSubmission) {
		this.dateOfSubmission = dateOfSubmission;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	
	
	

}
