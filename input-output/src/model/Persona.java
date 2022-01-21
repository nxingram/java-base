package model;

import java.io.Serializable;

public class Persona implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 5427278803435823051L;
//	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}


	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	 
	
}
