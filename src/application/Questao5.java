package application;

public class Questao5 {

	public static void main(String[] args) {
		String str = "Bar";
		String strSubstituida = substituirVogais(str);
		System.out.println("String substituída: " + strSubstituida);

	}

	public static String substituirVogais(String str) {
		return str.replaceAll("[aeiouAEIOU]", "?");
	}
}