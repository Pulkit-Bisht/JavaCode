package com.studentcrud.dto.response;

public class StudentResponseDto {

	private int id;
	private String name;
	private String address;
	private String distric;
	private String state;
	private String mobNo;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
	public StudentResponseDto(int id, String name, String address, String distric, String state, String mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.distric = distric;
		this.state = state;
		this.mobNo = mobNo;
	}
}
