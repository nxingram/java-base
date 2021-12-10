package enumeration;

public enum DirezioneV2 {

	// valori di enum sono istanze della classe, 
	// NORD() � la chiamata al costruttore di default
	NORD(), 
	SUD("S"), 
	OVEST("O"),
	EST("E");
	
	// propriet� e costruttore sono private
	// non si pu� accedere dall'esterno
	// non si pu� creare un'istanza di un enum (come per un singlton)
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
