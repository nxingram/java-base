package singleton;

/**
 * Non Gang of Four 
 * https://www.baeldung.com/creational-design-patterns
 */
public class SingletonThreadSafe {
	
	// costruttore privato
	private SingletonThreadSafe(){};
	
	// classe nidificata (interna) privata
	private static class SingletonHolder{
		// attributo pubblico della classe nidificata
		public static final SingletonThreadSafe instance = new SingletonThreadSafe();
	}
	
	public static SingletonThreadSafe getInstance() {
		// istanza viene creata solo quando viene chimato questo metodo,
		// non quando viene caricata la classe esterna
		return SingletonHolder.instance;
	}

}
