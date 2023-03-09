package application;

import java.util.Arrays;

public class Questao6 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 0, 7, 3, 3 };
		ordenarArray(array);
		System.out.println("Array ordenado: " + Arrays.toString(array));

	}

	public static void ordenarArray(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}