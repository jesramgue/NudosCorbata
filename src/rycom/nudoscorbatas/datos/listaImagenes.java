package rycom.nudoscorbatas.datos;

import java.util.ArrayList;

import rycom.nudoscorbatas.R;

public class listaImagenes {
	static ArrayList<Integer> laSimples = new ArrayList<Integer>();
	static Integer liAux = null;
	
	public static ArrayList<Integer> getSimples() {
		return laSimples;
	}
	
	public static void rellenaListaImg(int aiTipo) {
		if (aiTipo == 0) {
			//Rellenamos la lista de Simples
			liAux = new Integer(R.drawable.sim_1);
			laSimples.add(0,liAux);
			liAux = new Integer(R.drawable.sim_2);
			laSimples.add(1,liAux);
			liAux = new Integer(R.drawable.sim_3);
			laSimples.add(2,liAux);
			liAux = new Integer(R.drawable.sim_4);
			laSimples.add(3,liAux);
			liAux = new Integer(R.drawable.sim_5);
			laSimples.add(4,liAux);
		} else if (aiTipo == 1) {
			//Rellenamos la lista de Dobles
			liAux = new Integer(R.drawable.dob_1);
			laSimples.add(0,liAux);
			liAux = new Integer(R.drawable.dob_2);
			laSimples.add(1,liAux);
			liAux = new Integer(R.drawable.dob_3);
			laSimples.add(2,liAux);
			liAux = new Integer(R.drawable.dob_4);
			laSimples.add(3,liAux);
		} else if (aiTipo == 2) {
			//Rellenamos la lista de Dobles
			liAux = new Integer(R.drawable.win_1);
			laSimples.add(0,liAux);
			liAux = new Integer(R.drawable.win_2);
			laSimples.add(1,liAux);
			liAux = new Integer(R.drawable.win_3);
			laSimples.add(2,liAux);
			liAux = new Integer(R.drawable.win_4);
			laSimples.add(3,liAux);
			liAux = new Integer(R.drawable.win_5);
			laSimples.add(4,liAux);
		} else if (aiTipo == 3) {
			//Rellenamos la lista de Dobles
			liAux = new Integer(R.drawable.mwi_1);
			laSimples.add(0,liAux);
			liAux = new Integer(R.drawable.mwi_2);
			laSimples.add(1,liAux);
			liAux = new Integer(R.drawable.mwi_3);
			laSimples.add(2,liAux);
			liAux = new Integer(R.drawable.mwi_4);
			laSimples.add(3,liAux);
		} else if (aiTipo == 4) {
			//Rellenamos la lista de Dobles
			liAux = new Integer(R.drawable.peq_1);
			laSimples.add(0,liAux);
			liAux = new Integer(R.drawable.peq_2);
			laSimples.add(1,liAux);
			liAux = new Integer(R.drawable.peq_3);
			laSimples.add(2,liAux);
			liAux = new Integer(R.drawable.peq_4);
			laSimples.add(3,liAux);
		} else if (aiTipo == 5) {
			//Rellenamos la lista de Dobles
			liAux = new Integer(R.drawable.mar_1);
			laSimples.add(0,liAux);
			liAux = new Integer(R.drawable.mar_2);
			laSimples.add(1,liAux);
			liAux = new Integer(R.drawable.mar_3);
			laSimples.add(2,liAux);
			liAux = new Integer(R.drawable.mar_4);
			laSimples.add(3,liAux);
			liAux = new Integer(R.drawable.mar_5);
			laSimples.add(4,liAux);
			liAux = new Integer(R.drawable.mar_6);
			laSimples.add(5,liAux);
			liAux = new Integer(R.drawable.mar_7);
			laSimples.add(6,liAux);
			liAux = new Integer(R.drawable.mar_8);
			laSimples.add(7,liAux);
			
		}
	}
}
