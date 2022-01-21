package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import model.Persona;

public class ObjectStream {

	public static void main(String[] args) {
		
		// Oggetto Persona deve implementare l'interfaccia Serializable
		List<Persona> listaPersone = Arrays.asList(new Persona("nome1", "cognome1", 21), 
				new Persona("nome2", "cognome2", 22),
				new Persona("nome3", "cognome3", 23));

		// Write
		// try-with-resources: chiude stream automaticamente
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("folder/obj.bin")))) {

			for (Persona persona : listaPersone) {
				oos.writeObject(persona);
			}
			
			System.out.println("Fine scrittura oggetti serializzabili");
			
		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		}
		
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("folder/obj.bin")))){
			
			while (true) {
				Persona persona = (Persona) ois.readObject();
				System.out.println(persona); // toString()
			}
			
		}catch (EOFException ioe) { 
			// End of file exception: terminato il file
			System.out.println("Terminato lettura file binario");
		} catch (FileNotFoundException fnfe) {
			System.out.println("File non trovato");
		} catch (IOException e) {
			System.out.println("Errore i/o");
		} catch (ClassNotFoundException e) {
			System.out.println("Classe per deserializzare l'oggetto non trovata");
		}
	}
}
