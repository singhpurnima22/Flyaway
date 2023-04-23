package com.hybernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Logininfo")
public class UserAdmin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int personid;
private String personame;
private String phone,email,pwd;





public int getPersonid() {
	return personid;
}
public void setPersonid(int personid) {
	this.personid = personid;
}
public String getPersoname() {
	return personame;
}
public void setPersoname(String personame) {
	this.personame = personame;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
