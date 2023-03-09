package application;

import java.util.HashMap;
import java.util.Map;

public class Questao7 {
	public static void main(String[] args) {
		int[] array = { 2, 2, 3, 1, 1, 6 };
		int primeiroNaoRepetido = primeiroElementoNaoRepetido(array);
		System.out.println("Primeiro elemento não repetido: " + primeiroNaoRepetido);
	}

	public static int primeiroElementoNaoRepetido(int[] array) {
		Map<Integer, Integer> contador = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (contador.containsKey(num)) {
				contador.put(num, contador.get(num) + 1);
			} else {
				contador.put(num, 1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (contador.get(num) == 1) {
				return num;
			}
		}
		return -1; // se todos os elementos se repetirem
	}
}