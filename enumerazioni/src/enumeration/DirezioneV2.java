package enumeration;

public enum DirezioneV2 {

	// valori di enum sono istanze della classe, 
	// NORD() è la chiamata al costruttore di default
	NORD(), 
	SUD("S"), 
	OVEST("O"),
	EST("E");
	
	// proprietà e costruttore sono private
	// non si può accedere dall'esterno
	// non si può creare un'istanza di un enum (come per un singlton)
	private final String codice;
	
	// costruttore vuoto (optional)
	private DirezioneV2() {
		// codice deve essere inizializzato, anche se uso il costruttore vuoto
		this.codice = "N"; 
	}
	
	// private costruttore con parametro
	private DirezioneV2(String codice) {
		this.codice = codice;
	}
	
	// metodo accessorio che restituisce il codice relativo ai valori enum
	public String getCodice() {
		return this.codice;
	}
	
}
