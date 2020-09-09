package minecraft;

public class Enxada extends Bloco {
	boolean conquista; 
	void arar( ) {
		System.out.println("Terra preparada para o plantio");
		conquista = true;
		
		
	}
	
	void minerar() {
		System.out.println("Dano atribuido");
	}
}
