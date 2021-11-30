package util;

import java.util.Scanner;

public class ScannerUtil {
	private  Scanner sc = new Scanner(System.in);
	
	public  int readNumber09() {
		String input = sc.nextLine();
		if (input.length() < 2) {
			int numero = Integer.parseInt(input);
			return numero;
		} else {
			System.out.println("hai sbagliato ad inserire il numero");
			return -1;
		}
	}

	
}


