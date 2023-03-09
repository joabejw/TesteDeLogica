package application;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = { 4, 6, 8 };
		double media1 = calcularMedia(array1);
		System.out.println(media1); // Imprime 6.0

		int[] array2 = { 1, 2 };
		double media2 = calcularMedia(array2);
		System.out.println(media2); // Imprime false

		sc.close();
	}

	public static double calcularMedia(int[] array) {
		if (array.length < 3) {
			System.out.println(false);
		}
		double soma = 0.0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		return soma / array.length;
	}
}