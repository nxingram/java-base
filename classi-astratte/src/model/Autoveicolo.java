package model;

public class Autoveicolo extends Veicolo {

	private int porte;
	public final short kmLitro = 20;
	
	public Autoveicolo(String numSerie, String marca, int ruote, int porte) {
		super(numSerie, marca, ruote);
		this.porte = porte;
	}

	@Override
	public String stampa() {
		System.out.println("Autoveicolo:stampa");
//		return this.numSerie +" "+this.marca+" " + this.ruote + " " + this.porte;
		return super.stampa() + " " + this.porte;
	}

	@Override
	public double consumo(int Km) {
		return Km/this.kmLitro;
	}

	
}
