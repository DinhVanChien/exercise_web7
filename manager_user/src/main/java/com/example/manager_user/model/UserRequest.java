package com.example.manager_user.model;

public class UserRequest {
	private String name;
	private String address;
	private String phone;
	private Long age;
	
	public UserRequest(String name, String address, String phone,Long age) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	public UserRequest() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
