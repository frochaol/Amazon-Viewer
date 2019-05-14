package com.fernandocode.amazonviewer.model;
import java.util.Date;

public class Publication {
	
	private String title;
	private Date editionDate;
	private String editorial;
	private String [] autors;
	
	
	public Publication(String title, Date editorialDate, String editorial) {
		super();
		this.title = title;
		this.editionDate = editorialDate;
		this.editorial = editorial;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getEditionDate() {
		return editionDate;
	}


	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String[] getAutors() {
		return autors;
	}


	public void setAutors(String[] autors) {
		this.autors = autors;
	}
	
	

}
