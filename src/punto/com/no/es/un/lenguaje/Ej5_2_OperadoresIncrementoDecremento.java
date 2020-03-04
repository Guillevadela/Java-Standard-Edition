package punto.com.no.es.un.lenguaje;

public class Ej5_2_OperadoresIncrementoDecremento {

	public static void main(String[] args) {
		char A = 'c';
		char B;
		System.out.println(A++);
		System.out.println(A++);
		System.out.println(++A);
		B = --A;
		System.out.println(++A);
		A++;
		--B;
		System.out.println(B++);
		System.out.println(++B);
		System.out.println(++A);
		System.out.println(B--);
		System.out.println(A);
		System.out.println(B);

	}

}
