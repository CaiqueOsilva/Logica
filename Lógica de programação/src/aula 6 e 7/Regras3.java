
package exercicicios;
/**
 * @author Caique
 *
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regras3 {

	public static void main(String[] args) {
	//variaveis 
		double x,y,valor;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Cálculo da Regra3");
		System.out.println("x% de y = valor");
		System.out.println("valor de X: ");
		x = teclado.nextDouble();
		System.out.println("valor de Y: ");
		y = teclado.nextDouble();
		//processamento
		valor = (y * x) / 100;
		System.out.println("======================");
		System.out.println("== Cálculo da Regra3 ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println(x + "% de " + y + " = " + 
		formatador.format(valor)); 
	

		teclado.close();

	}

}
