package com.fernandocode.amazonviewer.model;
import java.util.*;

public interface IVisualizable {
	
	
	/**
	 * Este mètodo captura el tiempo exacto de visualización
	 * @param dateInicio es un objeto {@code Date} con el tiempo exacto
	 * @return Devuelve la fecha y hora capturada
	 */
	Date startToSee(Date dateInicio);
	/**
	 * Este mètodo captura el tiempo exacto de inicio y final de visualización
	 * @param dateInicio es un objeto {@code Date} con el tiempo exacto
	 * @param dateFinal es un objeto {@code Date} con el tiempo exacto
	 *  
	 */
	void stopToSee(Date dateInicio, Date dateFinal);
}
