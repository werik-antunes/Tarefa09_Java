package tarefa09Java;

import java.util.Scanner;

public class Exercicio05 {
	/*
	 * 5) Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros
	 * e no final apresente ototal do somatório da fatorial de cada valor lido.
	 * 
	 */
	private static long calcular(int n) {
		if (n == 0) {
			return 1;
		}

		long fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long somatorioFatoriais = 0;

		System.out.println("Digite 15 valores inteiros:");

		for (int i = 0; i < 15; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			int valor = sc.nextInt();
			long fatorial = calcular(valor);
			somatorioFatoriais += fatorial;
		}
		System.out.println("O total do somatório das fatoriais dos valores lidos é: " + somatorioFatoriais);
		sc.close();
	}
}
