package pob;
   
public class Maverick {
        int chassis;
	public static void main(String[] args) {
		Carro maverick = new Carro();
		maverick.modelo = ("GT");
		maverick.ano = 1987;
		maverick.cor = ("Laranja");
		System.out.println("Maverick: " + maverick.modelo);
		System.out.println("Ano: " + maverick.ano);
		System.out.println("Cor: " + maverick.cor);
		System.out.println("=====================");
		maverick.ligar();
		maverick.acelerar();
		maverick.frear();
		maverick.desligado();
		System.out.println("");
		System.out.println("==================================");
		System.out.println("");
		
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
