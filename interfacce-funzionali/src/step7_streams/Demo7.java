package step7_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import step1_comparable.LibroComparable;

public class Demo7 {
	public static void main(String[] args) {
		// consumer
		// passo una stringa, consuma la stringa, restituisce void
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("ciao");
		
		// predicate
		// passo un intero, restituisce un booleano
		Predicate<Integer> predicate  = i -> i< 20;
		System.out.println(predicate.equals(33));
		
		// function
		// passo una stringa, restituisce un intero
		Function<String, Integer> funzione = s -> s.length();		
		System.out.println(funzione.apply("nome"));
		
		// supplier
		// non passo nulla, restituisce una stringa
		Supplier<String> supplier = () -> "Ciao!";
		System.out.println(supplier.get());
		
		// filter
		// passo un predicate
		IntStream
			.range(1, 91)
			.filter(n -> n%3==0)
			.forEach(n -> System.out.println(n));
		
		
		// somma
		int somma = IntStream
			.range(1, 91)
			.filter(n -> n%3==0)
			.sum();
		System.out.println("somma: " + somma);
		
		
		// collect
		// vuole un Collector
		// e sorted
		// su stringa senza comparator
		String[] nomi = {"romolo", "remo", "giovanni", "francesca"};
		List<String> listaNomiCorti = Arrays.stream(nomi)
			.filter(n -> n.length()<6)
			.sorted()
			.collect(Collectors.toList()); // da Java 8
//			.toList(); // da Java 16
		
		
		// method reference
		// nome metodo abbreviato
		listaNomiCorti.forEach(System.out::println);
		// alternativa a
//		listaNomiCorti.forEach(nome -> System.out.println(nome););
		
		
		
		
		
		
		// summary statistics
		// elenco di statistiche sugli elementi dello stream
		IntSummaryStatistics summaryStatistics = IntStream.of(34,27,89,66,10,1,59).summaryStatistics();
		System.out.println(summaryStatistics);
		
		
		ArrayList<LibroComparable> listaLibriComp = new ArrayList<LibroComparable>();
		listaLibriComp.add(new LibroComparable("Il signore degli anelli", "Tolkien", 1225, 20.25));
		listaLibriComp.add(new LibroComparable("Dieci piccoli indiani", "Agatha Christie", 208, 10.20));
		listaLibriComp.add(new LibroComparable("Harry Potter e la Pietra Filosofale", "J. K. Rowling", 1402, 8.50));

		// map		
		// prende una function che prende un libro e restituisce una stringa
		List<String> listAutori = listaLibriComp
			.stream()
			.map(libro -> libro.getAutore())
			.distinct() // elimina doppioni
			.sorted()
			.collect(Collectors.toList());
		
		listAutori.forEach(System.out::println);
	}
	


}
