package io;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerAndPrintWriter {
	public static void main(String[] args) {
		
		int eta = 0;
		String nome= "";
		float valore = 0f;

		// buffered
		// try-with-resources: chiude stream automaticamente
		try(Scanner sc = new Scanner(new BufferedReader(new FileReader("folder/record-in.txt")));
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("folder/record-out.txt")))){
			
			while(sc.hasNext()) { // continua se c'� un altro "token" = righe separate da "new line" \n
				if(sc.hasNextInt()) 
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
			// file non trovato
			e.printStackTrace();
		}
	}
}
