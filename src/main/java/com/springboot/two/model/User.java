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
	
	public User(long id, @NotEmpty(message ="Name cannot be empty") String name, @NotEmpty(message = "email cannot be empty") String email, String password)
	{
		super();
		
	}

}
