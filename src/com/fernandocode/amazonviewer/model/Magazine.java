package com.fernandocode.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication{
	
	private int id;
	
	public Magazine(String title, Date editorialDate, String editorial) {
		super(title, editorialDate, editorial);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "\n Title: " + getTitle() + "\n Editorial: " + getEditorial() + "\n Edition Date: " + getEditionDate() ;
	}
	
	

}
