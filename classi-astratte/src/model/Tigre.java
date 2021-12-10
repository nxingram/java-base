package model;

public class Tigre extends Animal {

	private String famiglia;
	
	public Tigre(String specie, String genere, String famiglia) {
		super(specie, genere);
		this.famiglia = famiglia;
		System.out.println("Costruttore Tigre");
	}

	@Override
	public String nome() {
		return this.famiglia + " " + this.getGenere() + " " + this.getSpecie();
	}
	
	public String nomeAnimale() {
		return super.nome();
	}

	public String getFamiglia() {
		return famiglia;
	}

	public void setFamiglia(String famiglia) {
		this.famiglia = famiglia;
	}
	
	



}
