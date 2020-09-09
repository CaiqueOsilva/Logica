package minecraft;

public class Itens {

	public static void main(String[] args) {
		Enxada enxada = new Enxada();
		enxada.textura = "madeira";
		enxada.resistencia = 3;
		enxada.conquista = false;
		System.out.println("Item: Enxada");
        System.out.println("Texturaa: " + enxada.textura);
        enxada.minerar();
        enxada.arar();
        if (enxada.conquista == true) {
        	System.out.println("Conquista obtida!");
        	System.out.println("Dedicação séria. Hora do plantio");
        }
	}

}
