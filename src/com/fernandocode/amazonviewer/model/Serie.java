package com.fernandocode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends Film {

	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;

	public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
	}

	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter>chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "\n Title: " + getTitle() + "\n Genero: " + getGenre() + "\n Year: " + getYear() + "\n Creator: "
				+ getCreator() + "\n Duration: " + getDuration();
	}
	
	
	public static ArrayList<Serie> makeSeriesList()
	{
		ArrayList<Serie> series = new ArrayList<Serie>();
				
		for (int i = 0; i < 5; i++) {
			series.add(new Serie("Titulo " + i, "Género " + i, "Creador " + i, 120, 4, Chapter.makeChaptersList() ));
		}
				
		return series;		
	}

	

}
