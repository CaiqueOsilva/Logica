package pob;

public class Ferrari {

	public static void main(String[] args) {
		Carro Ferrari = new Carro();
		Ferrari.modelo = ("Enzo");
		Ferrari.ano = 2002;
		Ferrari.cor = ("Vermelho");
		System.out.println("Ferrari : " + Ferrari.modelo);
		System.out.println("Ano: " + Ferrari.ano);
		System.out.println("Cor: " + Ferrari.cor);
		System.out.println("=====================");
		Ferrari.ligar();
		Ferrari.acelerar();
		Ferrari.frear();
		Ferrari.desligado();
	

	}
	

}
