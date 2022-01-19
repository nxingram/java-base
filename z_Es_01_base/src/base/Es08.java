package base;

import java.util.Scanner;

public class Es08 {
	
	
	public static int great;
	
	public static void main(String[] args) {
//		Parte 1
//		Scrivere una classe Java che chiede (tramite lo standard input - Scanner)  ripetutamente all'utente di inserire stringhe 
//		e che termina quando l'utente inserisce la stringa vuota. 
//		Al termine dell'inserimento delle stringhe, la classe deve stampare sullo standard output la lunghezza media delle stringhe inserite.
//		
//		Parte 2
//		Acquisire una stringa di caratteri, contenente pure degli spazi. Scrivere un procedimento tale che, ogni volta che viene trovato uno spazio, vengano soppressi eventuali altri spazi contigui (due o piu').
//		Ad esempio, se l'utente inserisce la stringa
//		"Oggi è una          bella giornata...         di pioggia!!!"
//		La stringa risultante sarà 
//		"Oggi è una bella giornata... di pioggia!!!"

		// partOne();
		// partTwo();
		partTwoStringBuilder();
		System.out.println("End");

	}

	private static void partTwoStringBuilder() {
		Scanner sc = new Scanner(System.in);
		StringBuilder in = null;
		System.out.println("Insert String");
		in = new StringBuilder(sc.nextLine().trim()); // stringa con spazi, tranne ad inizio e fine
		System.out.println("in = " + in);
		

		int index = 0;
		do {
			index = in.indexOf("  ");
			if (index > -1) {
				in.delete(index, index + 1);
				System.out.println(in);
			}
		} while (index != -1);

		sc.close();

	}

	private static void partTwo() {
		Scanner sc = new Scanner(System.in);
		String in = "";
		System.out.println("Insert String");
		in = sc.nextLine().trim(); // stringa con spazi, elimina spazio ad inizio e fine
		System.out.println("in = " + in);

		int index = 0;
		do {
			index = in.indexOf("  ");
			if (index > -1) {
				String begin = in.substring(0, index);
				String end = in.substring(index + 2);
				in = begin + " " + end;
				System.out.println(in);
			}
		} while (index != -1);

		sc.close();
	}

	private static void partOne() {
		Scanner sc = new Scanner(System.in);
		String in = "";
		do {
			System.out.println("insert string");
			// così non funziona, non accetta input vuoto
//			in = sc.next(); // stringa senza spazi => mettendo spazio esegue 2 volte il ciclo
			in = sc.nextLine(); // stringa con spazi
			System.out.println("in = " + in);
		} while (!in.equals(""));

		sc.close();
	}
	
}
