package application;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Questao10 {
	public static void main(String[] args) {
		int valor = 150;
		int[] cedulas = { 2, 5, 10 };
		Map<Integer, Integer> resultado = sacar(valor, cedulas);
		System.out.println(resultado);

	}

	public static Map<Integer, Integer> sacar(int valor, int[] cedulas) {
		Map<Integer, Integer> resultado = new HashMap<>();
		Arrays.sort(cedulas);
		for (int i = cedulas.length - 1; i >= 0; i--) {
			int cedula = cedulas[i];
			int quantidade = valor / cedula;
			if (quantidade > 0) {
				resultado.put(cedula, quantidade);
				valor -= quantidade * cedula;
			}
		}
		if (valor > 0) {
			throw new RuntimeException("Valor não pode ser sacado");
		}
		return resultado;
	}

}