package examen.pruebas.ejercicios.andermios;

import java.util.Scanner;

public class UF2404EjercicioA {

	/**
	 * Realizar un programa en java que realice la siguiente función: Crear un array
	 * de 5 notas que almacenara en formato double. Una vez creado dicho array se
	 * rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
	 * contenido, se calculara la media de las notas así como se mostraran las notas
	 * más altas y más bajas de dicho array
	 * 
	 * @author ur00
	 *
	 */

	public static void main(String[] args) {

		// declarar variables : arrayNotas, media, maxima, minima
		// Abrir Scanner

		// hacer un for con la longitud del array

		// preguntar por pantalla la nota
		// guardar en el array la nota

		// sumar la nota en la variable media

		// comprobar si es la nota maxima para guardarla en la variable 'maxima'
		// lo mismo con la minima

		// end for

		// usar la variable media para conseguir la 'media' de notas

		// Cerrar Scanner

		// TODO Pedir datos al usuario por scanner

		Scanner entrada = new Scanner(System.in);

		double[] arrayNotas = new double[5];
		double total = 0;
		double maxima = Double.MIN_VALUE;
		double minima = Double.MAX_VALUE;

		for (int i = 0; i < arrayNotas.length; i++) {

			System.out.println("Dime la nota ");
			String linea = entrada.nextLine();
			double nota = Double.parseDouble(linea);

			arrayNotas[i] = nota;

			// System.out.println(arrayNotas[i]); //dato por pantalla de control
			total += arrayNotas[i];
			// comprobar si la temp
			if (arrayNotas[i] > maxima) {
				maxima = arrayNotas[i];
			}
			if (arrayNotas[i] < minima) {
				minima = arrayNotas[i];
			}
		}

		double media = total / 5;

		System.out.println("Media " + media);
		System.out.println("Maxima " + maxima);
		System.out.println("Minima " + minima);

		entrada.close();

	}

}
