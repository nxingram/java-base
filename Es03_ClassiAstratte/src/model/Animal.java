package model;

public abstract class Animal {

	private String specie;
	private String genere;
	
	public Animal(String specie, String genere) {
		this.specie = specie;
		this.genere = genere;
		System.out.println("Costruttore Animale");
	}
	
//	public abstract String nome();
	public String  nome() {
		return this.getGenere() + " " + this.getSpecie();
	}

	public String getSpecie() {
		return this.specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getGenere() {
		return this.genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}	
	
	
	
}
