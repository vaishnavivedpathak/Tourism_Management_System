package com.tour.tour.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Register {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private long id ;
private String name,address,emailid,password;
public Register() {
	super();
	// TODO Auto-generated constructor stub
}
public Register(String name, String address, String emailid, String password) {
	super();
	this.name = name;
	this.address = address;
	this.emailid = emailid;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Register [id=" + id + ", name=" + name + ", address=" + address + ", emailid=" + emailid + ", password="
			+ password + "]";
}


}
