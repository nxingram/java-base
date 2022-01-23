package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		// Raw Bytes Streams: es. immagini, audio, and video
		// anche per leggere testo, ma non come uso primario
		unbufferedStream();
		bufferedStream();
	}

	private static void bufferedStream() {
		// buffered
		// Stream: binary input/output
		// try-with-resources: chiude file stream automaticamente
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("folder/Dati-in.txt"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("folder/Dati-out.txt"))) {

			int b; // -1: fine stream
			while ((b = in.read()) != -1) { // legge un byte alla volta
				out.write(b); // scrive un byte

				// numeri interi con range 0 to 65535 traformati in caratteri UTF-16
				System.out.println((char) b); // cast a carattere
			}

			System.out.println("Lettura e scrittura effettuata correttamente");

		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		}

	}

	private static void unbufferedStream() {
		// unbuffered
		// Stream: binary input/output
		// try-with-resources: chiude stream automaticamente
		try (FileInputStream in = new FileInputStream("folder/Dati-in.txt");
				FileOutputStream out = new FileOutputStream("folder/Dati-out.txt")) {

			int b; // -1: fine stream
			while ((b = in.read()) != -1) { // legge un byte alla volta
				out.write(b); // scrive un byte

				// numeri interi con range 0 to 65535 traformati in caratteri UTF-16
				System.out.println((char) b); // cast a carattere
			}

			System.out.println("Lettura e scrittura effettuata correttamente");

		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		}
	}

}
