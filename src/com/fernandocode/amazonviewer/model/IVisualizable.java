package com.fernandocode.amazonviewer.model;
import java.util.*;

public interface IVisualizable {
	
	Date startToSee(Date dateInicio);
	void stopToSee(Date dateInicio, Date dateFinal);
}
