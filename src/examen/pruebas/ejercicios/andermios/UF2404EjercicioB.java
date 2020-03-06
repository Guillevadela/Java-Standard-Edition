package examen.pruebas.ejercicios.andermios;

import java.util.Scanner;

public class UF2404EjercicioB {

	/**
	 * Crear un proyecto en modo consola que nos muestre un menú de 3 opciones:
	 * <ol>
	 * <li>Calcular la letra del dni</li>
	 * <li>Calcular medida de cm a pulgadas</li>
	 * <li>Salir</li>
	 * </ol>
	 * 
	 * 
	 * Hacer que dicho menú se ejecute en bucle hasta que se pulse salir, y si el
	 * usuario escoge cada una de las funciones, que permita introducir los datos
	 * correspondientes por teclado para poder dar el resultado
	 * 
	 * @author ur00
	 *
	 */
	static Scanner sc;

	public static void main(String[] args) {
		// Abrir scanner

		// do

		// pintar menu

		// pedir una opcion al usuario por pantalla
		// switch case

		// while( continuar )

		// cerrrar scanner

		int opcion = 0;
		sc = new Scanner(System.in);
		boolean continuar = true;

		do {
			pintarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				calcularDNI();
				break;

			case 2:
				convertirCMaPulgadas();
				break;

			case 3:
				System.out.println("Hasta pronto");
				continuar = false;
				break;

			default:
				System.out.println("Por favor selecciona una opcion valida");
				break;

			}// switch

		} while (continuar);

		sc.close();

	}// main

	private static void pintarMenu() {
		System.out.println("1. Calcular letra DNI");
		System.out.println("2. Cm a Pulgadas");
		System.out.println("3. salir");
		System.out.println("Por favor selecciona una opcion del 1 al 3");

	}

	private static void convertirCMaPulgadas() {
		final double PULGADAS_A_METROS = 2.54;

		System.out.println("Dime cuantos centimetros quieres convertir a pulgadas");
		String cmTexto = sc.nextLine();
		// aqui es necesario hacer este parse para cambiar de letras que recoge el
		// scanner a numeros y poder hacer la operacion de conversion
		double pulgadas = Double.parseDouble(cmTexto);

		double resultado = pulgadas / PULGADAS_A_METROS;
		System.out.println("En " + cmTexto + " cm hay " + resultado + " pulgadas");

	}

	private static void calcularDNI() {
		//
		System.out.println("Dime tu dni");
		String dniTexto = sc.nextLine();
		System.out.println(dniTexto);

		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

		int numeroDni = Integer.parseInt(dniTexto);

		int restoDivision = numeroDni % 23;

		System.out.println("La letra es " + LETRA_DNI[restoDivision]);

	}// ultimo de los metodos

}// clase
