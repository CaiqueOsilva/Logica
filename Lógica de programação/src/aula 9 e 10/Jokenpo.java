/**
 * @author Caique
 *
 */
package exercicicios;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		//variaveis
		String nome;
		int jogador;
		int computador = (int) (Math.random() * 3 + 1);
        //objetos
		Scanner teclado = new Scanner(System.in);
		Scanner mao = new Scanner(System.in);
		int face = (int) (Math.random()); 
		System.out.println(face);
		//entrada
		System.out.println("JOKENPO");
		System.out.println("1. Pedra");
		System.out.println("2. Tesoura");
		System.out.println("3. Tesoura");
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println(" Escolha uma opção e joga");
        jogador = mao.nextInt();
        //processamento 
        switch (jogador) {
		case 1:
		System.out.println("Jogador escolheu Pedra");
		if (computador == 1) {
			System.out.println("Computador escolheu Pedra");
			System.out.println("======================");
			System.out.println("=== Empate!===");
			System.out.println("");
			break;
		}else if (computador == 2) {
			System.out.println("Computador escolheu Papel");
			System.out.println("======================");
			System.out.println("===Computador Venceu!===");
			System.out.println("");
			break;
		}else if (computador == 3) {
			System.out.println("Computador escolheu Tesoura");
			System.out.println("======================");
			System.out.println("===Jogador Venceu!===");
			System.out.println("");
			break;
		}
		case 2:
			System.out.println("Jogador escolheu Papel");
			if (computador == 1) {
				System.out.println("Computador escolheu Pedra");
				System.out.println("======================");
				System.out.println("===Jogador Venceu!===");
				System.out.println("");
				break;
			}else if (computador == 2) {
				System.out.println("Computador escolheu Papel");
				System.out.println("======================");
				System.out.println("===Empate!===");
				System.out.println("");
				break;
			}else if (computador == 3){
				System.out.println("Computador escolheu Tesoura");
				System.out.println("======================");
				System.out.println("===Computador Venceu!===");
				System.out.println("");
				break;
			}
			
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			if (computador == 1) {
				System.out.println("Computador escolheu Pedra");
				System.out.println("======================");
				System.out.println("===Computador Venceu!===");
				System.out.println("");
				break;
			}else if (computador == 2) {
				System.out.println("Computador escolheu Papel");
				System.out.println("======================");
				System.out.println("===Jogador Venceu!===");
				System.out.println("");
				break;
			}else{
				System.out.println("Computador escolheu Tesoura");
				System.out.println("======================");
				System.out.println("===Empate!===");
				System.out.println("");
				break;
			}
		
		}
			
		teclado.close();
	}
}


