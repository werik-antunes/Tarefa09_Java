package tarefa09Java;

import java.util.Scanner;

public class Exercicio06 {
	/*
	 * 6) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	 * apresente no final o total do somatório, a média aritmética e o total de
	 * valores lidos. O programa deve fazer as leituras dos valores enquanto o
	 * usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar
	 * quando o usuário fornecer um valor negativo. Não se esqueça que o usuário
	 * pode entrar como primeiro número um número negativo, portanto, cuidado com a
	 * divisão por zero no cálculo da média.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somatorio = 0;
		int totalValores = 0;
		System.out.println("Digite valores numéricos (parar com um valor negativo):");
		while (true) {
			System.out.print("Digite um valor: ");
			int valor = sc.nextInt();

			if (valor < 0) {
				break;
			}
			somatorio += valor;
			totalValores++;
		}
		if (totalValores > 0) {

			double media = (double) somatorio / totalValores;

			System.out.println("O total do somatório dos valores é: " + somatorio);
			System.out.println("A média aritmética dos valores é: " + media);
			System.out.println("O total de valores lidos é: " + totalValores);
		} else {
			System.out.println("Nenhum valor foi fornecido.");
		}

		sc.close();
	}

}
