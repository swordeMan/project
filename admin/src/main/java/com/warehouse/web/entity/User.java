package com.warehouse.web.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {

	private Integer id;

	private String userName;

	private Integer age;

	/*@Min(message = "请输入至少6位密码", value = 6)
	@Max(message = "密码最多30位", value = 30)*/
	@Size(min=6 , max = 30)
	private String password;

	//@Pattern(regexp = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", message = "请输入正确的邮箱格式")
	@Email
	private String email;

	private Byte isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	public Byte getIsActive() {
		return isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}
}