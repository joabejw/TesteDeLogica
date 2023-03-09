package application;

public class Questao4 {

	public static void main(String[] args) {
		String str = "bar";
		String strInvertida = inverterString(str);
		System.out.println("String invertida: " + strInvertida);

	}

	public static String inverterString(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}