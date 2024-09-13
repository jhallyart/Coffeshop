package model;

import java.io.Serializable;

public class Member implements Serializable{
	private Integer memberno;
	//private String memberno;
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;
	private Integer sum;
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member( String name, String username, String password, String address, String phone) {
		super();
		//this.memberno = memberno;
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}
	/*
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	*/
	public Integer getMemberno() {
		return memberno;
	}
	public void setMemberno(Integer memberno) {
		this.memberno = memberno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
