package step3_classe_anonima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import step1_comparable.LibroComparable;
import step2_comparator.LibroComparatorPagine;

public class Demo3 {

	public static void main(String[] args) {

		ArrayList<LibroComparable> listaLibriComp = new ArrayList<LibroComparable>();
		listaLibriComp.add(new LibroComparable("Il signore degli anelli", "Tolkien", 1225, 20.25));
		listaLibriComp.add(new LibroComparable("Dieci piccoli indiani", "Agatha Christie", 208, 10.20));
		listaLibriComp.add(new LibroComparable("Harry Potter e la Pietra Filosofale", "J. K. Rowling", 1402, 8.50));

		System.out.println("--------------originale--------------");
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
		
		
		System.out.println("--------------ordinata per Prezzo Decrescente--------------");
		// ordina i libri usando una classe anonima che implementa l'interfaccia Comparator
		// notare come non è presente il nome della classe ma solo l'interfaccia "new 'nomeClasse' Comparator<T>"
		Collections.sort(listaLibriComp, new Comparator<LibroComparable>() {

			@Override
			public int compare(LibroComparable libro1, LibroComparable libro2) {
				return (int) (libro2.getPrezzo() - libro1.getPrezzo()); //invertito i libri x decrescente
			}
			
		});
		stampaLista(listaLibriComp);
				
		

	}

	private static void stampaLista(ArrayList<LibroComparable> listaLibriComp) {
		for (LibroComparable libroComparable : listaLibriComp) {
			System.out.println(libroComparable);
		}

	}
}
