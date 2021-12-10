package view;

import java.util.Scanner;

import controller.SquadreCtrl;
import util.ScannerUtil;

public class FootballManager {
	private static Scanner sc = new Scanner(System.in);
	private static SquadreCtrl ctrl;

	public static void main(String[] args) {
		// interfaccia utente
		// per aggiungere squadre e calciatori
		
		benvenuto();
		init();
		saluto();	

	}

	private static void init() {
		ctrl = new SquadreCtrl();
		boolean continua = true;

		while (continua) {
			menu();
			int numero = readNumber();
			continua = selezioneUtente(numero);
		}
	}
	
	private static int readNumber() {
		String input = sc.nextLine();
		if (input.length() < 2) {
			int numero = Integer.parseInt(input);
			return numero;
		} 
		else {
//			System.out.println("hai sbagliato ad inserire il numero");
			return -1;
		}		
	}
	
	private static String readString(String messaggio) {
		System.out.println(messaggio);
		return sc.nextLine();
	}

	private static boolean selezioneUtente(int numero) {
//		System.out.println("numero scelto: " + numero);
		
		
		switch (numero) {
		case 1:
			String nome = readString("Inserire nome squadra");
			String campionato = readString("inserire campionato");
			ctrl.aggiungiSquadra(nome, campionato);
			break;
			
		case 2:
			ctrl.stampaSquadre();			
			System.out.println(" a quale squadra vuoi aggiungere il calciatore?");
			int numeroSquadra = readNumber();
			String nomeC = readString("Inserire nome");
			String cognomeC = readString("Inserire cognome");
			ctrl.aggiungiCalciatore(numeroSquadra, nomeC, cognomeC);
			break;
			
		case 3:
			ctrl.stampaSquadre();			
			break;
			
		case 4:
			ctrl.stampaSquadre();			
			System.out.println(" di quale squadra vuoi stampare i calciatori?");
			int numeroSquadraC = readNumber();
			ctrl.stampaCalciatoriSquadra(numeroSquadraC);
			break;
			
		case 9:			
			return false; // esce dal programma

		default:
			System.out.println("*Selezione non esiste, riprova!*");
			break;
		}
		
		return true;
	}

	private static void menu() {
		System.out.println("Menù:");
		System.out.println("1- aggiungi squadra");
		System.out.println("2- calciatore ad una squadra");
		System.out.println("3- stampa squadre");
		System.out.println("4- stampa calciatori di una squadra");
		System.out.println("9- esci");
		System.out.println("fai la tua scelta!");
	}

	private static void benvenuto() {
		System.out.println("Benvenuto a *Football Manager*");
		System.out.println("---------------------------------\n");
	}

	private static void saluto() {
		System.out.println("Ciao");

	}

}
