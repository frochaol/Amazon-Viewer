package com.fernandocode.amazonviewer.db;

import java.sql.Connection;
import java.sql.DriverManager;
//Importa los datos desde database.java
import static com.fernandocode.amazonviewer.db.DataBase.*;

public interface IDBConnection {

	default Connection connectToDB() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL + DB, USER, PASSWORD);
			if (connection != null) {
				System.out.println("Se establecída la conexión :)");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return connection;
		}

	}

}
