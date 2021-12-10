package model;

public class Autoveicolo extends Veicolo {

	private int porte;

	public Autoveicolo(String numSerie, String marca, int ruote, int porte) {
		super(numSerie, marca, ruote);
		this.porte = porte;
	}

	@Override
	public String stampa() {
		System.out.println("Autoveicolo:stampa");
		return this.getNumSerie() +" "+this.getMarca()+" " + this.getRuote() + " " + this.porte;
	}

	
}
