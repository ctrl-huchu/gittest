package com.tj.hu;

public class MemberBean {
	private String name;
	private String id;
	private String nickname;
	private String password;
	private String email;
	private String phone;
	public MemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberBean(String name, String id, String nickname, String password, String email, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	 
}
