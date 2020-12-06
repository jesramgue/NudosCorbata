package rycom.nudoscorbatas;

import rycom.nudoscorbatas.datos.listaImagenes;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;


public class rycom_nudoscorbatas extends Activity {
	private AdView adView;
	Spinner lsLista = null;
	Button lbAnt = null;
	Button lbSig = null;
	ImageView livImagen = null;
	int liPunteroImg = 0;
	String lsTipoNudo = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	    // Crear la adView
	    adView = new AdView(this, AdSize.BANNER, "a150ad02d4e0938");

	    // Buscar el LinearLayout suponiendo que se le haya asignado
	    // el atributo android:id="@+id/mainLayout"
	    LinearLayout layout = (LinearLayout)findViewById(R.id.banner);

	    // Añadirle la adView
	    layout.addView(adView);

	    // Iniciar una solicitud genérica para cargarla con un anuncio
	    adView.loadAd(new AdRequest());

		lsLista = ((Spinner)findViewById(R.id.spinner1));
		lsLista.setOnItemSelectedListener(new miControladorDeSpinner());
		lbAnt = ((Button)findViewById(R.id.ant));
		lbAnt = ((Button)findViewById(R.id.sig));
		livImagen = ((ImageView)findViewById(R.id.visorImagen));
		liPunteroImg = 0;
		lsTipoNudo = "Simple";
		listaImagenes.rellenaListaImg(0);
	}
	
	/**
	 * Controlador de la vista.
	 * @param avVista Vista a controlar.
	 */
	public void miControladorDeVista(View avVista) {
		switch (avVista.getId()) {
		case R.id.ant:

			if (liPunteroImg > 0) {
				liPunteroImg = liPunteroImg - 1;
				livImagen.setBackgroundDrawable(getResources().getDrawable(
						listaImagenes.getSimples().get(liPunteroImg).intValue()));
			} else {
				livImagen.setBackgroundDrawable(getResources().getDrawable(
						listaImagenes.getSimples().get(liPunteroImg).intValue()));
			}


			break;
		case R.id.sig:
			if (lsTipoNudo.equals("Simple") || lsTipoNudo.equals("Windsor")) {
				if (liPunteroImg < 4) {
					liPunteroImg = liPunteroImg + 1;
					livImagen.setBackgroundDrawable(getResources().getDrawable(
							listaImagenes.getSimples().get(liPunteroImg)));
				}
			} else if (lsTipoNudo.equals("Doble") || lsTipoNudo.equals("Pequeno")
					|| lsTipoNudo.equals("Medio Windsor")) {
				if (liPunteroImg < 3) {
					liPunteroImg = liPunteroImg + 1;
					livImagen.setBackgroundDrawable(getResources().getDrawable(
							listaImagenes.getSimples().get(liPunteroImg)));
				}
			} else {
				if (liPunteroImg < 7) {
					liPunteroImg = liPunteroImg + 1;
					livImagen.setBackgroundDrawable(getResources().getDrawable(
							listaImagenes.getSimples().get(liPunteroImg)));
				}
			}
			break;
		}//switch
	}
	
	@Override
	public void onDestroy() {
		adView.destroy();
		super.onDestroy();
	}


	/**
	 * Controlador del Spinner
	 * @param avVista Vista a controlar (donde se encuentra el boton)
	 */
	public class miControladorDeSpinner implements OnItemSelectedListener {

		@Override
		public void onItemSelected(AdapterView<?> asSpinner, View avVista, int pos,
				long id) {
			// TODO Auto-generated method stub
			lsTipoNudo = asSpinner.getItemAtPosition(pos).toString();
			listaImagenes.rellenaListaImg(pos);
			liPunteroImg = 0;
			livImagen.setBackgroundDrawable(getResources().getDrawable(
					listaImagenes.getSimples().get(liPunteroImg)));
			//vista.mostrarAlerta(avVista.getContext(), "El elemento elegido es: " +
			//asSpinner.getItemAtPosition(pos).toString());
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub

		}

	} 
}

