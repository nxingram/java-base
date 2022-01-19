package model;

public class Tigre extends Animale {

	private String famiglia;
	
	public Tigre(String specie, String genere, String famiglia) {
		super(specie, genere);
		this.famiglia = famiglia;
		System.out.println("Costruttore Tigre");
	}

	@Override
	public String nome() {
//		return this.famiglia + " " + this.genere + " " + this.specie;
		return this.famiglia + " " + super.nome();
	}

//	public String getFamiglia() {
//		return famiglia;
//	}
//
//	public void setFamiglia(String famiglia) {
//		this.famiglia = famiglia;
//	}
//	
	



}
