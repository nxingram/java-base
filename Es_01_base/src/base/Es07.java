package base;

import java.util.Scanner;

public class Es07 {

	public static void main(String[] args) {
//		Scrivi un programma che stampa un pattern come il seguente triangolo, chiedendo all'utente il numero di righe:
//			1
//			12
//			123
//			1234
//			12345
		
//			12345...9
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("quante righe vuoi fare?");
		int righe = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= righe; i++) {//righe
			
			for (int j = 0; j < i; j++) {//colonne
				System.out.print(j+1);
			}
			System.out.println();
		}
		

	}

}
