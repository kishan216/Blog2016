package com.mns.blog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_login")
public class UserLogin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="login_id")
	private String login_id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="is_admin")
	private int is_admin;

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(int is_admin) {
		this.is_admin = is_admin;
	}
	
	

}
