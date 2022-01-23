package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		String[] nomi = { "nome1", "nome2", "nome3" };
		String[] cognomi = { "cognome1", "cognome2", "cognome3" };
		int[] eta = { 21, 22, 23 };

		// Write
		// try-with-resources: chiude stream automaticamente
		try (DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("folder/dati.bin")))) {
			for (int i = 0; i < nomi.length; i++) {
				dos.writeUTF(nomi[i]);
				dos.writeChar('\t'); // tab di spaziatura
				dos.writeUTF(cognomi[i]);
				dos.writeChar('\t'); // tab di spaziatura
				dos.writeInt(eta[i]);
			} // fine for

			System.out.println("Terminato scrittura file binario");

		} catch (FileNotFoundException fnfe) {
			System.out.println("File non trovato");
		} catch (IOException ioe) {
			System.out.println("Errore i/o");
		}

		// Read
		// try-with-resources: chiude stream automaticamente
		try (DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new FileInputStream("folder/dati.bin")))) {

			while (true) {
				System.out.print(dis.readUTF());
				System.out.print(dis.readChar());
				System.out.print(dis.readUTF());
				System.out.print(dis.readChar());
				System.out.print(dis.readInt() + "\n");
			}

		} catch (EOFException ioe) {
			// End of file exception: terminato il file
			System.out.println("Terminato lettura file binario");
		} catch (FileNotFoundException fnfe) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		}
	}
}
