package Utilidades;

import java.util.Calendar;
import java.util.Date;

public class Utils {

	public static Date obterData(int dias) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}

	
}