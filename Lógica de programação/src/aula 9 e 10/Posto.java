/**
 * @author Caique
 *
 */
package exercicicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		//variáveis
		double gasolina,alcool,total;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("GASOLINA ou ALCOOL");
		System.out.println("valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		System.out.println("valor do Alcóol: ");
		alcool = teclado.nextDouble();
		//processamento
		total = (alcool * 10) / (gasolina * 10);
		//saida
		System.out.println("======================");
		System.out.println("== MELHO OPÇÃO ==");
		System.out.println("======================");
		System.out.println("");
		
		//estrutura de controle condicional
		if (total <= 0.70) {   //custo por km
			System.out.println("Alcool");
		} else {
			System.out.println("Gasolina");
		}
		teclado.close();
}

}
