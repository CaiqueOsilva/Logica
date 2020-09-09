package pob;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	String modelo;
	
	public Carro() {
	    Random chassi = new Random();
	    int placa = chassi.nextInt(10000); 
	    String caracteres = "COVD-";
	 
	    
	    System.out.println("Placa: " + caracteres + placa);
		
	}
		
	void ligar() {
		System.out.println("Contato LIGADO");
	}
	
	void desligado() {
		System.out.println("Contato DESLIGADO");
	}
	
	void acelerar() {
		System.out.println("brannnnnnnnnnn====tchiuuu");
		
	}
	
	void frear() {
		System.out.println("yuuuuurrrrrrr");
	


	}
}

