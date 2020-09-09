package pob;

public class Chevete {

	public static void main(String[] args) {
		Carro chevete = new Carro();
		chevete.modelo = ("LS");
		chevete.ano = 1986;
		chevete.cor = ("Preto Fosco");
		System.out.println("Chevete: " + chevete.modelo);
		System.out.println("Ano: " + chevete.ano);
		System.out.println("Cor: " + chevete.cor);
		System.out.println("=====================");
		chevete.ligar();
		chevete.acelerar();
		chevete.frear();
		chevete.desligado();

	}

}
