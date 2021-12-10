package model;

public abstract class Veicolo {

	private String numSerie;
	private String marca;
	private int ruote;
	
	public Veicolo(String numSerie, String marca, int ruote) {
		this.numSerie = numSerie;
		this.marca = marca;
		this.ruote = ruote;
	}
	
	public String stampa() {
		System.out.println("Veicolo::stampa");
		return this.numSerie +" "+this.marca+" " + this.ruote;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}


	
	
	
}
