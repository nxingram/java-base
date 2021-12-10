package model;

import java.util.ArrayList;

public class Squadra {

	private String nome;
	private String campionato;
	private ArrayList<Calciatore> calciatoriList;
//	private int length;

	public Squadra() {
		// inizializza una lista di calciatori vuota
		this.calciatoriList = new ArrayList<Calciatore>(); // alt+freccia-su-giù
	}

	public Squadra(String nome, String campionato) {
		this.nome = nome;
		this.campionato = campionato;
		// inizializza una lista di calciatori vuota
		this.calciatoriList = new ArrayList<Calciatore>(); // ctrl+alt+freccia-giù
	}

	// visibilità-tipo di ritorno-nome del metodo-(tipo param-nome parametro){}
	public boolean aggiungiCalciatore(Calciatore c) {
		return this.calciatoriList.add(c);
	}

	public void vendiCalciatore(Calciatore c) {

		for (int i = 0; i < this.calciatoriList.size(); i++) {
			Calciatore cAttuale = calciatoriList.get(i);			
			
			// confrontare il nome e cognome dell'ennesiomo giocatore nella lista 
			// con il giocatore che devo vendere
			if(cAttuale.getNome().equals(c.getNome()) && cAttuale.getCognome().equals(c.getCognome())){ 
				// salvol'indice  del calciatore passato
				this.calciatoriList.remove(i);				
			}
		}
		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCampionato() {
		return campionato;
	}

	public void setCampionato(String campionato) {
		this.campionato = campionato;
	}

	public ArrayList<Calciatore> getCalciatoriList() {
		return calciatoriList;
	}

	@Override
	public String toString() {
		return "Squadra [nome=" + nome + ", campionato=" + campionato + "]";
	}
	
	

}
