package tarefa09Java;

public class Exercicio07 {

	/*
	 * 7) Elaborar um programa que apresente como resultado o valor do fatorial dos
	 * valores ímpares situados na faixa numérica de 1 a 10.
	 */

	private static long calcular(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		long fatorial = 1;
		for (int i = 2; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}

	public static void main(String[] args) {

		long resultado = 1;

		for (int i = 1; i <= 10; i += 2) {

			long fatorial = calcular(i);

			resultado *= fatorial;
		}

		System.out.println("O valor do fatorial dos valores ímpares de 1 a 10 é: " + resultado);

	}
}
