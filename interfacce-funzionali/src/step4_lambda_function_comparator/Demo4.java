package step4_lambda_function_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import step1_comparable.LibroComparable;
import step2_comparator.LibroComparatorPagine;

public class Demo4 {

	public static void main(String[] args) {

		ArrayList<LibroComparable> listaLibriComp = new ArrayList<LibroComparable>();
		listaLibriComp.add(new LibroComparable("Il signore degli anelli", "Tolkien", 1225, 20.25));
		listaLibriComp.add(new LibroComparable("Dieci piccoli indiani", "Agatha Christie", 208, 10.20));
		listaLibriComp.add(new LibroComparable("Harry Potter e la Pietra Filosofale", "J. K. Rowling", 1402, 8.50));

		System.out.println("--------------originale--------------");
		stampaListaForeach(listaLibriComp);

		System.out.println("--------------ordinata per Titolo--------------");
		// ordina i libri usando compareTo
		Collections.sort(listaLibriComp);
		stampaListaForeach(listaLibriComp);

		System.out.println("--------------ordinata per numero di Pagine Crescente--------------");
		// ordina i libri usando compare di LibroComparatoPagine
		// come secondo argomento vuole una classe che implementa l'interfaccia Comparator
		Collections.sort(listaLibriComp, new LibroComparatorPagine());
		stampaListaForeach(listaLibriComp);
		
		
		System.out.println("--------------ordinata per Prezzo Decrescente--------------");
		// ordina i libri usando una classe anonima che implementa l'interfaccia Comparator
		// notare come non è presente il nome della classe ma solo l'interfaccia "new 'nomeClasse' Comparator<T>"
		Collections.sort(listaLibriComp, new Comparator<LibroComparable>() {

			@Override
			public int compare(LibroComparable libro1, LibroComparable libro2) {
				return (int) (libro2.getPrezzo() - libro1.getPrezzo()); //invertito i libri x decrescente
			}
			
		});
		stampaListaForeach(listaLibriComp);
		
		System.out.println("--------------ordinata per numero Pagine Decrescente--------------");
		// ordina i libri usando una lambda function Comparator
		// rimane solo il metodo compare, senza tipi o nome del metodo
		// return viene sostituito da freccia magra "->"
		Collections.sort(listaLibriComp, (libro1, libro2) ->  libro2.getPagine() - libro1.getPagine()  );  //invertito i libri x decrescente
		stampaListaForeach(listaLibriComp);		

		// stessa operazione ma in 2 passaggi
		Comparator<LibroComparable> comparator = (libro1, libro2) ->  libro2.getPagine() - libro1.getPagine();
		Collections.sort(listaLibriComp, comparator); 
					

	}

	private static void stampaListaForeach(ArrayList<LibroComparable> listaLibriComp) {
		for (LibroComparable libroComparable : listaLibriComp) {
			System.out.println(libroComparable);
		}

	}
}
