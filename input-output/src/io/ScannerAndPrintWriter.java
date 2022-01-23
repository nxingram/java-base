package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerAndPrintWriter {
	public static void main(String[] args) {

		int eta = 0;
		String nome = "";
		float valore = 0f;

		// buffered
		// try-with-resources: chiude stream automaticamente
		try (Scanner sc = new Scanner(new BufferedReader(new FileReader("folder/record-in.txt")));
				PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("folder/record-out.txt")))) {

			while (sc.hasNext()) { // continua se c'è un altro "token" = righe separate da "new line" \n
				if (sc.hasNextInt())
					eta = sc.nextInt();
				else if (sc.hasNextFloat())
					valore = sc.nextFloat();
				else
					nome = sc.nextLine();
			}

			// output in console
			System.out.printf("nome=%s; eta=%d; compenso=%.2f;", nome, eta, valore);

			// output in file
			pw.format("nome=%s; eta=%d; compenso=%.2f;", nome, eta, valore);

		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
		} catch (IOException e1) {
			System.out.println("Errore i/o");
		}
	}
}
