package enumeration;

public enum Livello {

	// non essendoci un costruttore di default, vanno tutti inizializzati
	BASSO(1,3),
	MEDIO(4,6),
	ALTO(7,9);
	
	private final int min;
	private final int max;
	
	// costruttore a 2 parametri
	private Livello(int min, int max) {
		this.min = min;
		this.max = max;
	}


	public Integer getMin() {
		return min;
	}


	public Integer getMax() {
		return max;
	}
	
	
	
}
