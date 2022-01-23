package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharacterStream {

	public static void main(String[] args) {
		// "Reader-Writer": consigliato per la lettura di stream di caratteri
		fileReader();
		inputStreamReader(); // stessa cosa

	}

	private static void fileReader() {
		// buffered
		// Reader: character input/output
		// try-with-resources: chiude file stream automaticamente
		try (BufferedReader in = new BufferedReader(new FileReader("folder/Dati-in.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("folder/Dati-out.txt"))) {

			String s; // null: fine stream
			while ((s = in.readLine()) != null) { // legge una riga alla volta
				out.write(s); // scrive una stringa/riga

				// syso console
				System.out.println(s);
			}

			System.out.println("Lettura e scrittura effettuata correttamente");

		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		}

	}

	private static void inputStreamReader() {
		// buffered
		// Stream: binary input/output => traformato in Reader
		// try-with-resources: chiude stream automaticamente
		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("folder/Dati-in.txt")));
				BufferedWriter out = new BufferedWriter(
						new OutputStreamWriter(new FileOutputStream("folder/Dati-out.txt")))) {

			String s; // null: fine stream
			while ((s = in.readLine()) != null) { // legge una riga alla volta
				out.write(s); // scrive una stringa/riga

				// syso console
				System.out.println(s);
			}

			System.out.println("Lettura e scrittura effettuata correttamente");

		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		}

	}
}
