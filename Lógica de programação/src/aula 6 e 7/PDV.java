 package exercicicios;
/**
  @author Caique Oliveira 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {
	public static void main(String[] args) {
		//variaveis
		double total, desconto, totalDesconto, valorPago, troco;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//Entrada
		System.out.println("PDV");
		System.out.println("Valor total:  ");
		total= teclado.nextDouble();
		System.out.println("Desconto(%):  ");
		desconto= teclado.nextDouble(); 
		//Processamento//
		totalDesconto = total - (desconto * total) / 100;
		//saida
		System.out.println("======================");
		System.out.println("== Cálculo do PDV ==");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Total com desconto: R$ " + totalDesconto);
		System.out.println("Valor pago em dinheiro");
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: R$  " + formatador.format(troco));
  		
		 
		teclado.close();
		
	}
} 
