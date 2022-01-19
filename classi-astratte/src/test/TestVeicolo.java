package test;

import model.Autoveicolo;
import model.Motoveicolo;
import model.Veicolo;

public class TestVeicolo {

	// 1- Classe astratta Veicolo
	// con un paio di proprietà, un costruttore, e un metodo astratto
	// per esempio "public abstract String Stampa()"

	// 2- Classe Motoveicolo che eredita le proprietà e metodi di Veicolo
	// 3- Classe Autoveicolo che eredita le proprietà e metodi di Veicolo

	// 4 - Classe TestVeicolo
	// creare istanze di moto e auto veicolo che stampa le proprie proprietà


	public static void main(String[] args) {
		Veicolo auto = new Autoveicolo("123456789", "Ferrari", 4, 3);
		Veicolo moto = new Motoveicolo("987654321", "Honda", 2);
		
		System.out.println("Moto: " + moto.stampa());
		System.out.println("Auto: " + auto.stampa());
		
		System.out.println("Moto consumo x 100Km=" + moto.consumo(100) + " litri");
		System.out.println("Auto consumo x 100Km=" + auto.consumo(100) + " litri");
		
	}
}
