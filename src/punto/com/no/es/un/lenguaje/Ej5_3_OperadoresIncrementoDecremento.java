package punto.com.no.es.un.lenguaje;

public class Ej5_3_OperadoresIncrementoDecremento {

	public static void main(String[] args) {

		int i = 1, j = 1, k = 1;

		i = ++j;
		i = k++;
		i = k + ++j;

		System.out.println(k);

	}

}
