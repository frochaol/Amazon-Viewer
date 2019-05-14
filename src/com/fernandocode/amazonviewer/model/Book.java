package com.fernandocode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Publication implements IVisualizable {

	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;

	public Book(String title, Date editorialDate, String editorial) {
		super(title, editorialDate, editorial);
		// TODO Auto-generated constructor stub
		setIsbn(isbn);
		setReaded(readed);
		setTimeReaded(timeReaded);
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String isReaded() {

		String visto = "";
		if (readed == true) {
			visto = "Si";
		} else {
			visto = "No";
		}
		return visto;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	@Override
	public String toString() {
		String detailBook = "\n Title: " + getTitle() + "\n Editorial: " + getEditorial() + "\n Edition Date: "
				+ getEditionDate() + "\n Authors: ";

		if (getAutors() != null ) {
			for (int i = 0; i < getAutors().length; i++) {
				detailBook += "\t" + getAutors()[i];
			}
		}

		return detailBook;
	}

	@Override
	public Date startToSee(Date dateInicio) {
		// TODO Auto-generated method stub
		return dateInicio;
	}

	@Override
	public void stopToSee(Date dateInicio, Date dateFinal) {
		// TODO Auto-generated method stub
		if (dateFinal.getSeconds() > dateInicio.getSeconds()) {
			setTimeReaded((int) (dateFinal.getTime() - dateInicio.getTime()));
		} else {
			setTimeReaded(0);
		}

	}

	public static ArrayList<Book> makeBooksList() {
		ArrayList<Book> books = new ArrayList<Book>();

		for (int i = 0; i < 5; i++) {
			books.add(new Book("Libro " + i, new Date(), "Editorial " + i));
		}
		return books;
	}

}
