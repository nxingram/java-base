package model;

public class Motoveicolo extends Veicolo {
	
	public final short kmLitro = 50;
	
	public Motoveicolo(String numSerie, String marca, int ruote) {
		super(numSerie, marca, ruote);
	}

	@Override
	public double consumo(int Km) {
		return Km/this.kmLitro;
	}


}
