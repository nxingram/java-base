package base;

import java.util.Scanner;

public class Es02Bis {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci una parola");
		
		String parola1 = sc.next();
		
		System.out.println(parola1);
		
		System.out.println("inserisci una parola");
		String parola2 = sc.next(); // non prende una frase con spazi
		
		System.out.println(parola2);
		
		String parola3 = sc.next();
		System.out.println(parola3);
		
	}
}
