package ejercicios.excepciones;

import java.util.Scanner;

public class ExcepcionesEjercicio3 {

	/**
	 * Realice un método que reciba como argumento un String y un número y muestre la letra de la posición indicada. Llámelo pasando como
	 * parámetro un String sin inicializar. Dicha llamada se encontrara dentro de un bloque try catch, que en caso de producirse una
	 * excepción por un paso de parámetros a null, no acabe con la ejecución del programa. Así mismo, se controlara también que si el numero
	 * pasado es mayor que el tamaño del string, capturara el error y nos solicitara meter un numero valido, indicándonos los valores en los
	 * que puede estar comprendido (para este apartado se le pasa como string la cadena de texto “La lluvia en Sevilla no es una maravilla”)
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posicion = 0;
		String frase = "";
		char letra = ' ';

		try {
			System.out.println("Dime una frase");
			frase = sc.nextLine();

			System.out.println("Dime un numero de posicion");
			posicion = Integer.parseInt(sc.nextLine());

			letra = letraDeLaPosicion(frase, posicion);

			System.out.println("La letra es " + letra);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("la poscion no es correcta, por favor escribe desde el 0 al " + (frase.length() - 1));

		} catch (Exception e) {
			System.out.println("Eso no es un numero");

		} finally {
			sc.close();
		}

	}

	/**
	 * Conseguimos la letra de la posicion indicada de la frase
	 * 
	 * @param frase    String
	 * @param posicion int
	 * @return char letra de la posicion indicada de la frase
	 */
	static char letraDeLaPosicion(String frase, int posicion) {
		return frase.charAt(posicion);

	}

}
