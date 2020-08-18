package exercicicios;
		/**
		 * @author Caique Oliveira
		 */
		import java.text.DecimalFormat;
		import java.util.Scanner;

		public class CálculodoIMC {

			public static void main(String[] args) {
				//variaveis
				String nome;
				double peso,altura,imc;
				//objetos
				Scanner teclado = new Scanner(System.in);
				DecimalFormat formatador = new DecimalFormat("#0.00");
				//Entrada
				System.out.println("Cálculo do IMC");
				System.out.println("Digite o seu nome: ");
				nome = teclado.nextLine();
				System.out.println("Digite o seu peso: ");
				peso = teclado.nextDouble();
				System.out.println("Digite a sua altura: ");
				altura = teclado.nextDouble();
				//processamento
				imc = peso / (altura * altura);
				//saida
				System.out.println("======================");
				System.out.println("== Cálculo do IMC ==");
				System.out.println("======================");
				System.out.println("");
				System.out.println("Nome: " + nome);
				System.out.println("IMC: " +  formatador.format(imc));
				teclado.close();
				
	
	}

}
