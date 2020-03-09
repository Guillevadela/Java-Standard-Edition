package ejercicios.excepciones;

import java.util.Scanner;

public class ExcepcionesEjercicio2 {

	/**
	 * Realice un programa que nos solicite por teclado dos números, y leerlos usando la clase Scanner mediante la función nextLine(). Transformar ambos strings
	 * a números enteros usando la siguiente sentencia Integer.parseInt(numeroLeido). Agrupar el código entre un bloque try catch y procesar para que no se
	 * produzca una interrupción y finalización del programa si alguno de los números leídos no puede convertirse, retomando el control en el punto del fallo,
	 * hasta que se solucione.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String linea = "";
		boolean repetir = true;
		// se hace dentro de un do while para que siga pidiendo datos correctos hasta que se introduzcan y entonces termine el programa
		do {

			try {

				System.out.println("1º numero:");
				linea = sc.nextLine();
				a = Integer.parseInt(linea);

				System.out.println("2º numero:");
				linea = sc.nextLine();
				b = Integer.parseInt(linea);

				System.out.println("1º numero=" + a + " 2º numero=" + b);
				// con el siguiente valor a false hacemos que termine el bucle y no vuelva a pedir los numeros o datos por pantalla.
				repetir = false;

			} catch (Exception e) {
				System.out.println("Por favor introduce de nuevo dos numeros validos");

			}
		} while (repetir);

		System.out.println("Termina App");
		sc.close();

	}

}
