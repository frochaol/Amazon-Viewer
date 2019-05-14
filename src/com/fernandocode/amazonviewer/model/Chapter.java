package com.fernandocode.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie {

	private int id;
	private int sessionNumber;

	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.sessionNumber = sessionNumber;
	}

	public int getId() {
		return id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	@Override
	public String toString() {
		return "\n Title: " + getTitle() + "\n Year: " + getYear() + "\n Creator: " + getCreator() + "\n Duration: "
				+ getDuration();
	}
	
	public static ArrayList<Chapter> makeChaptersList()
	{
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			chapters.add(new Chapter("Capìtulo " + i, "Género " + i, "Creador " + i , 120 + i, (short)(2017 + i), 1 + i));
		}
		return chapters;
	}

}
