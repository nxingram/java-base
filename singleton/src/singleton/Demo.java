package singleton;

public class Demo {

	public static void main(String[] args) {

		SingletonConnessione conn = SingletonConnessione.getConn();
		
		System.out.println(conn.getStato());
		
		// stessa connessione, stessa istanza
		// stesso riferimento all'oggetto
		SingletonConnessione conn2 = SingletonConnessione.getConn();
		
		System.out.println("Stessa istanza: " + conn.equals(conn2));
		
		
		
		// thread safe		
		SingletonThreadSafe instance = SingletonThreadSafe.getInstance();
	}

}
