package model;

public abstract class Veicolo {

	protected String numSerie;
	protected String marca;
	protected int ruote;
			
	public Veicolo(String numSerie, String marca, int ruote) {
		this.numSerie = numSerie;
		this.marca = marca;
		this.ruote = ruote;
	}
	
	public String stampa() {
		System.out.println("Veicolo::stampa");
		return this.numSerie + " "+ this.marca + " " + this.ruote;
	}
	
	public abstract double consumo(int Km);
	
	
}
