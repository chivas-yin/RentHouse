package com.rent.model;

public class User {

	private int id;
	private String userName;
	private Integer userAge;
	private String userAddress;
	
	public User(){}
	
	public User(String userName,Integer userAge,String userAddress){
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
	}
	
	@Override
	public String toString(){
		return "my name is "+userName+","+userAge+" years old,my address is "+userAddress;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
}
