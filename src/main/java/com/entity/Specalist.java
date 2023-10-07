package com.entity;

public class Specalist {
	private int id;
	private String SpecialistName;
	
	public Specalist(int id, String specialistName) {
		super();
		this.id = id;
		this.SpecialistName = specialistName;
	}
	
	public Specalist() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialistName() {
		return SpecialistName;
	}
	public void setSpecialistName(String specialistName) {
		SpecialistName = specialistName;
	}
}
