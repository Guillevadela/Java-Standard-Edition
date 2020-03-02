package uf2404;

public class PruebaTecnica {

	public static void main(String[] args) {

		System.out.println("** Empezamos Bucle");

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Es par");
			} else {
				if (i == 0) {
					System.out.println("El 0 es 0");
				}
				System.out.println(i + " Es impar");
			}
			System.out.println("esta es la iteracion numero " + i);

		} // for

		System.out.println("terminamos el bucle");

	}// main

}
