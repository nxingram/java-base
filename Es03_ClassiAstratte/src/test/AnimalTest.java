package test;

import model.Animal;
import model.Tigre;

public class AnimalTest {

	public static void main(String[] args) {
		Tigre animale = new Tigre("Tigris", "Panthera", "Felidae");
		
		System.out.println(animale.nome());
		System.out.println(animale.nomeAnimale());
	}
	
	
	
}
