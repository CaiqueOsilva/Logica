package pob;

public class Nissan {

	public static void main(String[] args) {
		Carro nissan = new Carro();
		nissan.modelo = ("SKYLINE GT-R");
		nissan.ano = 2020;
		nissan.cor = ("blue");
		System.out.println("Nissan: " + nissan.modelo);
		System.out.println("Ano: " + nissan.ano);
		System.out.println("Cor: " + nissan.cor);
		System.out.println("=====================");
		nissan.ligar();
		nissan.acelerar();
		nissan.frear();
		nissan.desligado();

	}

}
