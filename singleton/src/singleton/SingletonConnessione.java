package singleton;

/**
 * DEPRECATO: non thread safe
 */
public class SingletonConnessione {

	// singleton design pattern (Gang of Four)
	
	// proprietà e costruttore PRIVATE!!
	private static SingletonConnessione conn;
	
	// proprietà da inizializzare nel costruttore
	private String stato;
	
	private SingletonConnessione() {
		stato = "connessa";
	}
	
	public static SingletonConnessione getConn() {
		if(conn == null) // se non inizializzata, la inizializzo
			conn = new SingletonConnessione();
		
		return conn;
	}
	
	public String getStato() {
		return stato;
	}
}
