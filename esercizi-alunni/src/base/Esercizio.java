package base;

import java.util.Scanner;

public class Esercizio {
	public static void main(String[] args) {
		String fraseInserita = null;
		String parolaInserita = null;
		String[] arrayFraseInserita = new String[30];
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire frase");
		fraseInserita = sc.nextLine();
		System.out.println("Inserire parola da ricercare");
		parolaInserita = sc.nextLine();
		arrayFraseInserita = fraseInserita.split(" ");
		System.out.println("Il numero di occorrenze nella frase per la 		parola inserita è:" + numeroOccorrenze(arrayFraseInserita, parolaInserita));
		// gni volta devo richiamare oltre al metodo anche ciò che gli ho inserito?
	}

	private static int numeroOccorrenze(String[] arrayFraseInserita, String parolaInserita) {
		// va inserito sempre lo static? o c'è qualche altro termine?, inoltre il tipo
		// anche va inserito sempre?
		int occorrenzeParola = 0;
		for (int i = 0; i < arrayFraseInserita.length; i++) {
			if (parolaInserita.equals(arrayFraseInserita[i])) {
				// perchè non posso confrontare
				occorrenzeParola++;
				// parolaInserita == arrayFraseInserita[i] ?
			}
		}
		return occorrenzeParola;
	}
}
