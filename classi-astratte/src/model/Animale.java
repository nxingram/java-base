package model;

public abstract class Animale {

	protected String specie;
	protected String genere;
	
	protected Animale(String specie, String genere) {
		this.specie = specie;
		this.genere = genere;
		System.out.println("Costruttore Animale");
	}
	
//	public abstract String nome();
	public String  nome() {
		return this.genere + " " + this.specie;
	}	
	
}
