package com.warehouse.web.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class RegisterForm {

	private Integer id;

	@Pattern(regexp = "/^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$/",message="��������ȷ�������ʽ")
	private String email;
	
	@NotBlank(message="����������")
	@Min(message="��������6λ", value = 6)
	private String password;

	private Byte isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getIsActive() {
		return isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}
}