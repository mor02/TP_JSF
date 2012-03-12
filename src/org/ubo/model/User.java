package org.ubo.model;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;



public class User {
private String name;
private String login;
private String password;


public User(){}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public void validAction(){
if(this.getLogin()==null || this.getPassword()==null)	{
	
}
}
}
