package com.ems;

public class Employee {
	int id;
	String name;
	String adress;
	public Employee(int id, 	String name, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public 	String getName() {
		return name;
	}
	public void setName(	String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	

}
