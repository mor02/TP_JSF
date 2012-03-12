package org.ubo.controller;

import java.util.Locale;

import javax.faces.context.FacesContext;

public class LocaleConfig {
	
	public String activeFR(){
		FacesContext c=FacesContext.getCurrentInstance();
		c.getViewRoot().setLocale(Locale.FRENCH);
		return null;
	}
public String activeEN(){
	FacesContext c=FacesContext.getCurrentInstance();
	c.getViewRoot().setLocale(Locale.ENGLISH);
	return null;
		
	}
}
