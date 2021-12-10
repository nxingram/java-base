package singleton;

public class Demo {

	public static void main(String[] args) {

		ConnessioneSingleton conn = ConnessioneSingleton.getConn();
		
		System.out.println(conn.getStato());
		
		// stessa connessione, stessa istanza
		// stesso riferimento all'oggetto
		ConnessioneSingleton conn2 = ConnessioneSingleton.getConn();
		
		System.out.println("Stessa istanza: " + conn.equals(conn2));
	}

}
