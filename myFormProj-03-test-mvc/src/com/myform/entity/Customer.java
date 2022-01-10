package com.myform.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.myform.validation.VerifyIdentityNumber;

@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private int id;
	
	@Column(name = "the_name")
	@NotNull(message="不可空白")
	@Size(min=2,message="不可空白")
	private String theName;
	
	@Column(name = "gender")	
	@NotNull(message="不可空白")
	private String gender;
	
	@Column(name = "email")	
	@NotNull(message="不可空白")
	private String email;
	
	@Column(name = "identity")
	@NotNull(message="輸入錯誤")
	@Size(min=10,message="輸入錯誤")
	@VerifyIdentityNumber
	private String identity;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", theName=" + theName + ", gender=" + gender + ", email=" + email + ", identity="
				+ identity + "]";
	}

	
	
}
