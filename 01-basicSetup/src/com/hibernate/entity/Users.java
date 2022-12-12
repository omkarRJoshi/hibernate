package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "users")
public class Users {
	@Id
	@Column (name = "user_id")
	int userId;
	
	@Column (name = "user_name")
	String userName;
	
	@Column (name = "password")
	String password;
	
	@Column (name = "first_name")
	String firstName;
	
	@Column (name = "last_name")
	String lastName;
}
