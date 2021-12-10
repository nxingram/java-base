package base;

public class Es05 {

	public static void main(String[] args) {
//		Stampare a video la seguente figura:
//
//			******
//			*****
//			****
//			***
//			**
//			*
		
		for (int riga = 6; riga > 0; riga--) {
			
			for (int colonna = 0; colonna < riga; colonna++) { 
				System.out.print("*"); // colonne				
			}
			
			System.out.println();// a capo
		
		}
		
		// riga=6, colonna=0 => cicla fino a quando colonna<6 => stampa *
		// riga=6, colonna=1 => cicla fino a quando colonna<6 => stampa *
		// riga=6, colonna=3 => cicla fino a quando colonna<6 => stampa *
		//..
		// riga=6, colonna=5 => cicla fino a quando colonna<6 => stampa *
		

		
	}

}
