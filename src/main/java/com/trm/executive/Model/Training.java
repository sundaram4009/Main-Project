package com.trm.executive.Model;

public class Training {
	private int id;
	private String name;
	private int trainerId;
	private String vertical;
	private String startDate;
	private String endDate;
	private String status;
	private int nodays;
	private String roomno;
	
	
	public Training(int id, String name, int trainerId, String vertical, String startDate, String endDate,
			String status, int nodays, String roomno) {
		super();
		this.id = id;
		this.name = name;
		this.trainerId = trainerId;
		this.vertical = vertical;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
		this.nodays = nodays;
		this.roomno = roomno;
	}
	public Training() {}
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
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getNodays() {
		return nodays;
	}
	public void setNodays(int nodays) {
		this.nodays = nodays;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	
	
	
	
}
