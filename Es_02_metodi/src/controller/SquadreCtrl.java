package controller;

import java.util.ArrayList;

import model.Calciatore;
import model.Squadra;

public class SquadreCtrl {

	// proprietà:
	// lista di squadre
	private ArrayList<Squadra> squadreList;

	// metodi:

	public SquadreCtrl() {
		this.squadreList = new ArrayList<Squadra>();
	}

	// aggiungi squadra
	public void aggiungiSquadra(String nome, String campionato) {
		Squadra ns = new Squadra(nome, campionato);
		squadreList.add(ns);
	}

	// stampa squadre
	public void stampaSquadre() {
		System.out.println("Lista squadre:");
		for (int i = 0; i < squadreList.size(); i++) {
			System.out.println(i+"- "+squadreList.get(i));
		}
		System.out.println("--------------------\n");
	}

	// aggiungi calciatore ad una squadra
	public void aggiungiCalciatore(int numeroSquadra, String nomeC, String cognomeC) {
		// TODO Auto-generated method stub
		Calciatore c =  new Calciatore();
		c.setNome(nomeC);
		c.setCognome(cognomeC);
		squadreList.get(numeroSquadra).aggiungiCalciatore(c);
	}

	// stampa calciatori di una squadra
	public void stampaCalciatoriSquadra(int numero) {
		
		Squadra squadra =  squadreList.get(numero);
		System.out.println("Lista calciatori:");
		for (Calciatore c : squadra.getCalciatoriList()) {
			System.out.println(c);
		}
		System.out.println("--------------------\n");
	}
	
	
}
