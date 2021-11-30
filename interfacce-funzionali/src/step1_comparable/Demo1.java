package step1_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<LibroComparable> listaLibriComp = new ArrayList<LibroComparable>();
		listaLibriComp.add(new LibroComparable("Il signore degli anelli", "Tolkien", 1225, 20.25));
		listaLibriComp.add(new LibroComparable("Dieci piccoli indiani", "Agatha Christie", 208, 10.20));
		listaLibriComp.add(new LibroComparable("Harry Potter e la Pietra Filosofale", "J. K. Rowling", 1402, 8.50));
		

		System.out.println("--------------Originale--------------");
		stampaLista(listaLibriComp);
		
		// ordina i libri usando compareTo
		Collections.sort(listaLibriComp);
		
		System.out.println("--------------ordinata per Titolo--------------");
		stampaLista(listaLibriComp);
		
		
	}

	private static void stampaLista(ArrayList<LibroComparable> listaLibriComp) {
		for (LibroComparable libroComparable : listaLibriComp) {
			System.out.println(libroComparable);
		}
		
	}

}
