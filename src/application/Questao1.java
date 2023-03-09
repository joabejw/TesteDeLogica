package application;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] meses = { "", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
				"outubro", "novembro ", "dezembro" };

		System.out.println("infome o mês entre 1 e 12");
		int mes = sc.nextInt();
		if (mes < 1 || mes > 12) {
			System.out.println("Mes Inexistente");
		} else {
			System.out.println(meses[mes]);
		}
		sc.close();
	}
}
