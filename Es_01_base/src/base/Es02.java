package base;

import java.util.Scanner;

public class Es02 {

	// chiedere all'utente nome e l'et� da console e stamparla a video su una riga sola
	public static void main(String[] args) {

		// sposto una riga con alt+freccia su/gi�
		
		// duplico riga con ctrl+alt+freccia su/gi�
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("inserisci stringa");
//		
//		String nome = sc.nextLine(); // legge l'input dell'utente e lo salvo in una variabile
//		
//		System.out.println("input: " + nome); // stampo l'input
		
		System.out.println("inserisci un intero");
		
		byte numero = sc.nextByte();
		
		System.out.println("numero: " + numero);
		
		// se l'utente ha inserito un intero minore di 30
		// stampo � uno studente
		// altrimenti � un docente
		
		boolean risultato = numero < 30; // vero o falso (true or false)
		
//		if(risultato) { // condizione booleana  => true
//			System.out.println("� uno studente");
//		}else if(numero < 70)		
//			System.out.println("� un docente");
//		else {//false
//			System.out.println("� in vacanza");
//		}
		
//		if(numero != 30) {
//			System.out.println("numero diverso da 30");
//		}
		
		if(!(numero <= 30)) { // non minore di
			System.out.println("numero maggiore 0 uguale a 30");
		}else if(!(numero > 30)) { // maggiore o uaguale a
			System.out.println("numero minore di 30");
		}
		
		

	}

}
