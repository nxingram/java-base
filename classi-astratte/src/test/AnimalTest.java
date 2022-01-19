package test;

import model.Animale;
import model.Tigre;

public class AnimalTest {

	public static void main(String[] args) {
		Animale animale = new Tigre("Tigris", "Panthera", "Felidae");
		
		System.out.println(animale.nome());
	}
	
	
	
}
