package tarefa09Java;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * 8) Elaborar um programa que possibilite calcular a área total de uma
	 * residência (sala, cozinha, banheiro, quartos, área de serviço, quintal,
	 * garagem, etc.). O programa deve solicitar a entrada do nome, a largura e o
	 * comprimento de um determinado cômodo. Em seguida, deve apresentar a área do
	 * cômodo lido e também uma mensagem solicitando do usuário a confirmação de
	 * continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa
	 * deve apresentar o valor total acumulado da área residencial.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double areaTotal = 0;
		while (true) {
			System.out.print("Digite o nome do cômodo: ");
			String nome = sc.nextLine();

			System.out.print("Digite a largura do cômodo em metros: ");
			double largura = sc.nextDouble();

			System.out.print("Digite o comprimento do cômodo em metros: ");
			double comprimento = sc.nextDouble();

			double area = largura * comprimento;

			areaTotal += area;

			System.out.println("Área do " + nome + ": " + area + " metros quadrados");

			sc.nextLine();

			System.out.print("Deseja calcular a área de mais um cômodo? (SIM/NAO): ");
			String continuar = sc.nextLine();

			if (continuar.equalsIgnoreCase("NAO")) {
				break;
			}
		}
		System.out.println("Área total da residência: " + areaTotal + " metros quadrados");
		sc.close();
	}
}
