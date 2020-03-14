package examen.pruebas.ejercicios.andermios;

import java.util.Scanner;

public class ConcesionarioConMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Inicializamos variables
		String matricula = "";
		String marca = "";
		String modelo = "";
		String color = "";
		float potencia = 0f;
		float cilindrada = 0f;
		String potenciaTeclado = "";
		String cilindradateclado = "";

		String masCoches = "";
		boolean continuar = true;
		int contador = 0;

		// creamos el array
		Coche[] arrayCoches = new Coche[5];

		System.out.println("Vamos a guardar los datos de tu coche");
		System.out.println(" ");

		// Rellenamos el array y vamos preguntando si introducimos mas datos

		do {
			// Pedimos por pantalla las especificaciones
			System.out.println("Dame la matricula: ");
			matricula = sc.nextLine();
			System.out.println("Dame la marca: ");
			marca = sc.nextLine();
			System.out.println("Dame el modelo: ");
			modelo = sc.nextLine();
			System.out.println("Dame el color: ");
			color = sc.nextLine();
			System.out.println("Dame la potencia ");
			potenciaTeclado = sc.nextLine();
			potencia = Float.parseFloat(potenciaTeclado);
			System.out.println("Dame la cilindrada");
			cilindradateclado = sc.nextLine();
			cilindrada = Float.parseFloat(cilindradateclado);

			// creamos el objeto coche y le asignamos valores
			Coche coche1 = new Coche();
			coche1.setMatricula(matricula);
			coche1.setMarca(marca);
			coche1.setModelo(modelo);
			coche1.setColor(color);
			coche1.setPotencia(0);
			coche1.setCilindrada(cilindrada);

			// guardamos el coche creado en un array
			arrayCoches[contador] = coche1;
			contador++;

			// preguntamos si se van a crear mas coches
			if (contador <= (arrayCoches.length - 1)) {
				System.out.println(" ");
				System.out.println("Quieres crear mas coches? escribe 'si' o 'no'");
				System.out.println(" ");
				masCoches = sc.nextLine();

				if ("no".equals(masCoches)) {
					continuar = false;
				}
			}

		} while (continuar && contador <= (arrayCoches.length));
		// mostramos por pantallael array completo
		for (int i = 0; i < arrayCoches.length; i++) {
			System.out.println(" ");
			System.out.println(arrayCoches[i]);
		}

		sc.close();

	}

}
