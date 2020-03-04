package punto.com.no.es.un.lenguaje;

public class Ej8_OperadorCondicional_I {

	public static void main(String[] args) {

		// Operadores ternarios en lugar de if else se usa una estructura diferente
		// usanfo ? : que son equivalentes

		int A = 15;
		System.out.println(A + (A % 2 == 0 ? " es par " : " es impar "));

		int B = -1;
		System.out.println(B + (B >= 0 ? " es positivo " : " es negativo "));

	}

}
