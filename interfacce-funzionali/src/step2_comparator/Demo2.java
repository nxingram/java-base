package step2_comparator;

import java.util.ArrayList;
import java.util.Collections;

import step1_comparable.LibroComparable;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<LibroComparable> listaLibriComp = new ArrayList<LibroComparable>();
		listaLibriComp.add(new LibroComparable("Il signore degli anelli", "Tolkien", 1225, 20.25));
		listaLibriComp.add(new LibroComparable("Dieci piccoli indiani", "Agatha Christie", 208, 10.20));
		listaLibriComp.add(new LibroComparable("Harry Potter e la Pietra Filosofale", "J. K. Rowling", 1402, 8.50));

		System.out.println("--------------Originale--------------");
		stampaLista(listaLibriComp);

		System.out.println("--------------ordinata per Titolo--------------");
		// ordina i libri usando compareTo
		Collections.sort(listaLibriComp);
		stampaLista(listaLibriComp);

		System.out.println("--------------ordinata per numero di Pagine Crescente--------------");
		// ordina i libri usando compare di LibroComparatoPagine
		// come secondo argomento vuole una classe che implementa l'interfaccia Comparator
		Collections.sort(listaLibriComp, new LibroComparatorPagine());
		stampaLista(listaLibriComp);

	}

	private static void stampaLista(ArrayList<LibroComparable> listaLibriComp) {
		for (LibroComparable libroComparable : listaLibriComp) {
			System.out.println(libroComparable);
		}

	}
}
