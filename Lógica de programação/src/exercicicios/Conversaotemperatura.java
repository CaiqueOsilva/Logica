/**
 * 
 */
package exercicicios;
/**
 * @author Caique
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversaotemperatura {

	
	public static void main(String[] args) {
		//variaveis
		String nome;
		double fahrenheit,celsius;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//Entrada
		System.out.println("Converso de Temperatura");
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite a temperatura fahrenheit ");
		fahrenheit = teclado.nextDouble();
		//processamento
		celsius = (5 * (fahrenheit-32)) /9;
		//processamento
		System.out.println("======================");
		System.out.println("== Converso de Temperatura ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println("conversao para celsius: " +  formatador.format(celsius) + "°");
		
		
		teclado.close();

	}

}
