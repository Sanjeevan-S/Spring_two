package com.springboot.two.model;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {

	//setting up our primary key to be id with auto increments
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotEmpty(message = "Name cannot be empty")
	private String name;
	
	@NotEmpty(message = "Email cannot be empty")
	private String email;
	private String mobNo;
	private String password;
	
	//constructor
	public User() {
	}
	
	public User(long id, @NotEmpty(message ="Name cannot be empty") String name, @NotEmpty(message = "email cannot be empty") String email,String mobNo, String password)
	{
		super();
		this.id = id;
		this.name= name;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
