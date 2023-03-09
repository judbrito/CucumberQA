package Utilidades;

import java.util.Calendar;
import java.util.Date;

public class UtilsNull {

	public static Date obterData(int dias) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, dias);
		return cal.getTime();
	}

	
}