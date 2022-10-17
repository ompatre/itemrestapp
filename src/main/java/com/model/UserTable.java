package com.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class UserTable {
	@Id
	@GeneratedValue
	private int userNo;
	private String userName;
	
	@JsonManagedReference
	@OneToOne(cascade=CascadeType.ALL, mappedBy="user", fetch=FetchType.EAGER)
	
	private UserAccount account;
	public UserTable() {}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserAccount getAccount() {
		return account;
	}
	public void setAccount(UserAccount account) {
		this.account = account;
	}
	
	
}
