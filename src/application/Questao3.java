package application;

public class Questao3 {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5 };
		int quantidadePares = contarNumeros(numeros);
		System.out.println("Quantidade de números pares: " + quantidadePares); // imprime "Quantidade de números pares:

	}

	public static int contarNumeros(int[] numeros) {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) { // verifica se o número é par
				contador++;
			}
		}
		return contador;
	}
}