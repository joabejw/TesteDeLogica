package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao8 {
	public static void main(String[] args) {
		int numLinhas = contadorLinhas();
		System.out.println("Número de linhas que atendem as condições: " + numLinhas);

	}

	public static int contadorLinhas() {
		int contador = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("data.dat"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				int zeros = 0;
				int uns = 0;
				for (int i = 0; i < linha.length(); i++) {
					char c = linha.charAt(i);
					if (c == '0') {
						zeros++;
					} else if (c == '1') {
						uns++;
					}
				}
				if (zeros % 3 == 0 || uns % 2 == 0) {
					contador++;
				}
			}
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo data.dat: " + e.getMessage());
		}
		return contador;
	}

}