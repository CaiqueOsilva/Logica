
/**
 * @author klaus
 *
 */
package exercicicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cartoletas {

	public static void main(String[] args) {
		// variáveis
		        int jogador;
		        
				double preço,media,valor = 0;
				// objetos
				Scanner teclado = new Scanner(System.in);
				DecimalFormat formatador = new DecimalFormat("#00.00");
				// Entrada
				System.out.println("== PARA GANHAR CARTOLETAS ==");
			    System.out.println("");
			    System.out.print("Digite o preço do jogador: ");
				preço = teclado.nextDouble();
				System.out.print("Digite a media do jogador: ");
				media = teclado.nextDouble();
				// processamento	
				jogador = (int) (preço * (1.2 + valor) - media);
			     //saida
			     System.out.println("====================");
			     System.out.println("");
			     System.out.println("== Pontuaçao do jogador ==");
			     System.out.println("");
			   
			     System.out.println("Jogador: R$  " + formatador.format(jogador));
			    
			  // estrutura de controle condicional
			     if (media >= 0.50 ) {
			    	 System.out.println("Valorizou");
			     } else {
			    	 System.out.println("Desvalorizou");
			     }
			     
			     teclado.close();
			}

		} 

			