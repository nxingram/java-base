package base;

public class Es04 {

	public static void main(String[] args) {
		// Scrivere un programma che stampi a video i primi dieci interi pari 
		//compresi fra 20 e 0, partendo da 20.
		
		//modulo: resto della divisione
		
//		System.out.println(2%2==0);
//		System.out.println(3%2==0);
		
		for (int i = 20; i >= 0; i--) {
			if(i%2==0) {
				System.err.println(i);
			}
		}
		

	}

}
