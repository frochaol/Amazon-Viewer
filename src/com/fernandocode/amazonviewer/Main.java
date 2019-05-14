package com.fernandocode.amazonviewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.fercode.makereport.Report;
import com.fernandocode.amazonviewer.model.Book;
import com.fernandocode.amazonviewer.model.Chapter;
import com.fernandocode.amazonviewer.model.Movie;
import com.fernandocode.amazonviewer.model.Serie;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		byte i = 1;
		byte j = 1;
		byte k = (byte) (i + j);
		System.out.println(k);
		showMenu();
	}

	public static void showMenu() {
		int exit = 0;

		do {
			System.out.println("Bienvenidos a Amazon Viewer");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Libros");
			System.out.println("4. Revistas");
			System.out.println("5. Reporte");
			System.out.println("6. Reporte Hoy");
			System.out.println("0. Exit");

			// Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int respuesta = Integer.parseInt(sc.nextLine());
			// int respuesta = Integer.valueOf(sc.nextLine());

			switch (respuesta) {
			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				ShowBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				// Date date = new Date();
				makeReport(new Date());
				break;
			case 0:
				exit = 0;
				System.out.println("saliste del programa");
				break;
			default:
				System.out.println("debe ingresar un número dentro de las opciones");
				break;
			}

		} while (exit != 0);
	}

	// Variable global
	static ArrayList<Movie> movies;

	public static void showMovies() {
		int exit = 1;
		movies = Movie.makeMoviesList();

		do {
			System.out.println();
			System.out.println(":: Movies ::");
			System.out.println();
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i + 1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menú");
			System.out.println();

			// Leer respuesta del usuario

			Scanner sc = new Scanner(System.in);
			int response = Integer.parseInt(sc.nextLine());

			if (response == 0) {
				showMenu();
			}

			if (response > 0) {
				Movie movieSelected = movies.get(response - 1);
				movieSelected.setViewed(true);
				Date dateInicio = movieSelected.startToSee(new Date());

				for (int i = 0; i < 10000; i++) {
					System.out.println(".....................");
				}

				// Termine de verla

				movieSelected.stopToSee(dateInicio, new Date());

				System.out.println();
				System.out.println("Viste esta pelicula: " + movieSelected);
				System.out.println("Por " + movieSelected.getTimeViewed() + " milisegundos");
			}

		} while (exit != 0);
	}

	public static void showSeries() {
		int exit = 1;

		ArrayList<Serie> series = Serie.makeSeriesList();

		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();

			for (int i = 0; i < series.size(); i++) {
				System.out.println(i + 1 + ". " + series.get(i).getTitle() + "Visto: " + series.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menú");
			System.out.println();

			Scanner sc = new Scanner(System.in);
			int response = Integer.parseInt(sc.nextLine());

			if (response == 0) {
				showMenu();
			}

			showChapters(series.get(response - 1).getChapters());

		} while (exit != 0);
	}

	public static void ShowBooks() {
		int exit = 1;

		ArrayList<Book> books = Book.makeBooksList();

		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
			for (int i = 0; i < books.size(); i++) {
				System.out.println(i + 1 + "." + books.get(i).getTitle() + "Visto: " + books.get(i).isReaded());
			}
			System.out.println("0. Regresar al Menú");
			System.out.println();

			// Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.parseInt(sc.nextLine());

			if (response == 0) {
				showMenu();
			}

			Book bookSelected = books.get(response - 1);
			bookSelected.setReaded(true);
			Date dateInicio = bookSelected.startToSee(new Date());

			for (int i = 0; i < 10000; i++) {
				System.out.println(".....................");
			}

			// Termine de verla

			System.out.println(dateInicio);

			bookSelected.stopToSee(dateInicio, new Date());

			System.out.println();
			System.out.println("Leiste el libro: " + bookSelected);
			System.out.println("Por " + bookSelected.getTimeReaded() + " milisegundos");

		} while (exit != 0);
	}

	public static void showMagazines() {
		int exit = 0;

		do {
			System.out.println();
			System.out.println(":: Magazines ::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 0;

		do {
			System.out.println();
			System.out.println(":: Chapters ::");
			System.out.println();

			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) {
				System.out.println(i + 1 + "." + chaptersOfSerieSelected.get(i).getTitle() + " Visto: "
						+ chaptersOfSerieSelected.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menú");
			System.out.println();

			Scanner sc = new Scanner(System.in);
			int response = Integer.parseInt(sc.nextLine());

			if (response == 0) {
				showSeries();
			}

			Chapter chapterSelected = chaptersOfSerieSelected.get(response - 1);
			chapterSelected.setViewed(true);
			Date dateInicio = chapterSelected.startToSee(new Date());

			for (int i = 0; i < 10000; i++) {
				System.out.println(".....................");
			}

			// Termine de verla
			chapterSelected.stopToSee(dateInicio, new Date());
			System.out.println();
			System.out.println("Viste: " + chapterSelected);
			System.out.println("Por " + chapterSelected.getTimeViewed() + " milisegundos");

		} while (exit != 0);
	}

	public static void makeReport() {
		Report report = new Report();
		report.setNameFile("Reporte");
		report.setTitle(":: VISTOS ::");
		report.setExtension("txt");
		String contentReport = "";

		for (Movie movie : movies) {

			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
			}
		}
		report.setContent(contentReport);
		report.makeReport();

	}

	public static void makeReport(Date date) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report ();
		report.setNameFile("Reporte "+ dateString);
		
		report.setTitle(":: VISTOS ::");
		report.setExtension("txt");
		String contentReport = "";

		for (Movie movie : movies) {

			if (movie.getIsViewed()) {
				contentReport += movie.toString() + "\n";
			}
		}
		report.setContent(contentReport);
		report.makeReport();
	}

	
	
	
	
	
	
}
