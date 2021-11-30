package step2_comparator;

import java.util.Comparator;

import step1_comparable.LibroComparable;


public class LibroComparatorPagine implements Comparator<LibroComparable> {

	// per ordinare in altri modi, creo altre classi che implementano Comparator<T>
	
	
	// compare: di interfaccia Comparator
	@Override
	public int compare(LibroComparable libro1, LibroComparable libro2) {
		// restituisce o se ==
		// positivo o negativo se uno dei 2 libri ha piu' pagine
		return libro1.getPagine() - libro2.getPagine();
	}

}
