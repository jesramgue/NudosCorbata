package rycom.nudoscorbatas.util;

import android.app.AlertDialog;
import android.content.Context;

public class vista {
	private vista () {
	}
	public static void mostrarAlerta(Context acContexto, String asAlerta) {
		AlertDialog.Builder alt_bld = new AlertDialog.Builder(acContexto);
		//Mensaje: al menos 2 campos deben estar rellenos.
		alt_bld.setMessage(asAlerta)  
		.setCancelable(true);  
		//Creamos la alerta
		AlertDialog alert = alt_bld.create();  
		// Titulo e icono 
		alert.setTitle("Alerta");    
		//alert.setIcon(R.drawable.ley_de_ohm);
		//Y mostramos
		alert.show();		
	}
	/* Devuelve la siguiente imagen a mostrar.
	 * String asActual nombre de la imagen actual.
	 */
	public static String obtenerSiguienteImg(String asActual) {
		if (asActual.substring(4, 5).equals("5")) {
			return asActual;
		} else {
			int liPos = Integer.parseInt(asActual.substring(4, 5));
			return asActual.substring(0,4) + liPos++;
		}
	}
}
