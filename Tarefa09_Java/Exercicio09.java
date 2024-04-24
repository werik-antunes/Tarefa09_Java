package tarefa09Java;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite valores positivos inteiros digite um valor negativo para parar:");
		while (true) {
			System.out.print("Digite um valor: ");
			int valor = sc.nextInt();
			if (valor < 0) {
				break;
			}
			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
		}
		if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
			System.out.println("Maior valor inserido: " + maior);
			System.out.println("Menor valor inserido: " + menor);
		} else {
			System.out.println("Nenhum valor positivo foi inserido.");
		}
		sc.close();
	}

}
