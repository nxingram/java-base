package base;

import java.util.Scanner;

public class Es06 {

	public static void main(String[] args) {
		// chiedere all'utente qual'è il suo linguaggio di programmazione preferito
		// stampare un elenco numerato
		// se la risposta è Java, stampare "Spacca di Brutto"
		// altrimenti "è una ciofeca"

//		usiamo una struttura di tipo switch-case

		System.out.println("Qual'è il tuo linguaggio di programmazione preferito?");
		System.out.println("1-Python");
		System.out.println("2-C#");
		System.out.println("3-C++");
		System.out.println("4-Java");
		System.out.println("5-Php");
		System.out.println("6-Javascript");
		System.out.println("Inserisci il numero intero corrispondente:");

		Scanner sc = new Scanner(System.in);

		byte sceltaUtente = sc.nextByte();
		sc.hasNextLine();

		switch (sceltaUtente) {
		case 4:
			System.out.println("Spacca di Brutto");
			break;
		case 1:
		case 2:
		case 3:
		case 5:
		case 6:
			System.out.println("E' una ciofeca! :)");
			break;
		default:
			System.out.println("Scelta errata");
			break;
		}

	}

}
