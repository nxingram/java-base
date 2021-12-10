package singleton;

public class ConnessioneSingleton {

	// singleton design pattern (Gang of Four)
	
	// proprietÓ e costruttore PRIVATE!!
	private static ConnessioneSingleton conn;
	
	// proprietÓ da inizializzare nel costruttore
	private String stato;
	
	private ConnessioneSingleton() {
		stato = "connessa";
	}
	
	public static ConnessioneSingleton getConn() {
		if(conn == null) // se non inizializzata, la inizializzo
			conn = new ConnessioneSingleton();
		
		return conn;
	}
	
	public String getStato() {
		return stato;
	}
}
