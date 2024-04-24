package tarefa09Java;

public class Exercicio02 {

	// 2) Elaborar um programa que apresente no final o somatório dos valores pares
	// existentes na faixa de 1 até 500.

	public static void main(String[] args) {
		int somatorio = 0;
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				somatorio += i;
			}
		}
		System.out.println("O somatório dos valores pares de 1 até 500 é: " + somatorio);
	}
}
