package tarefa09Java;

import java.util.Scanner;

public class Exercicio10 {
	/*
	 * 10) Elaborar um programa que apresente o resultado inteiro da divisão de dois
	 * números quaisquer.
	 * 
	 * Para a elaboração do programa, não utilizar em hipótese alguma o conceito do
	 * operador aritmético DIV. A solução deve ser alcançada com a utilização de
	 * looping. Ou seja, o programa deve apresentar como resultado (quociente)
	 * quantas vezes o divisor cabe no dividendo.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dividendo:");
		int dividendo = sc.nextInt();

		System.out.println("Digite o divisor:");
		int divisor = sc.nextInt();
		int resultado = 0;
		while (dividendo >= divisor) {
			dividendo -= divisor;
			resultado++;
		}
		System.out.println("Resultado inteiro da divisão: " + resultado);
		sc.close();
	}

}
