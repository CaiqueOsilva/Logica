package pob;

public class Caca {

	public static void main(String[] args) {
		Aviao caca = new Aviao();
		caca.modelo = ("F-16 Falcon");
		caca.ano = 1972;
		caca.cor = ("Cinza Chumbo");
		caca.envergadura = 9;
		System.out.println("Caça: " + caca.modelo);
		System.out.println("Ano: " + caca.ano);
		System.out.println("Cor: " + caca.cor);
		System.out.println("Envergadura: " +caca.envergadura + "m");
		System.out.println("==================================");
		caca.aterrizar();
		caca.desligado();
		caca.acelerar();
		
		
	}
	
	
}
