package com.newServlet.tn;
import java.io.Serializable;

public class people implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	
	public people() {
		this.name = "";
	}
	public people(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
