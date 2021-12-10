package test;

import java.util.ArrayList;

import model.Calciatore;
import model.Squadra;

public class Test {

	public static void main(String[] args) {
		Calciatore c = new Calciatore("Ciro", "Immobile", "Attaccante", 17, 31);
		Calciatore c3 = new Calciatore("Nicolò", "Barella", "centrocampista", 23, 24);
		
//		System.out.println(c);
		
		Calciatore c2 = new Calciatore();
		
		c2.setNome("Daniel");
		c2.setCognome("Maldini");
		c2.setPosizione("Attaccante");
		c2.setNumero(8);
		c2.setEta(19);
		
		
		Squadra milan = new Squadra("Milan","Serie A");
		
		ArrayList<Calciatore> calciatoriList2 = milan.getCalciatoriList();
		ArrayList<Calciatore> calciatoriList = calciatoriList2;
		System.out.println(milan.getNome() +" - calciatori n: " + calciatoriList.size());

		// aggiungo maldini al milan
		boolean esito = milan.aggiungiCalciatore(c2);
//		System.out.println(esito);
		milan.aggiungiCalciatore(c);
		milan.aggiungiCalciatore(c3);
		
		System.out.println(milan.getNome() +" - calciatori n: " + calciatoriList.size());
		
//		
//		System.out.println(milan.getNome() +" - calciatori n: " + calciatoriList.size());
		
		ArrayList<Calciatore> lista =  milan.getCalciatoriList();
		for (Calciatore calciatore : lista) {
			System.out.println(calciatore);
		}
		
		milan.vendiCalciatore(c3);
		
		System.out.println("------------------");
		lista =  milan.getCalciatoriList();
		for (Calciatore calciatore : lista) {
			System.out.println(calciatore);
		}

	}

}
