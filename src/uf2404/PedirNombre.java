package uf2404;

import java.util.Scanner;

public class PedirNombre {

	public static void main(String[] args) {

		System.out.println("Dime un numero:");

		Scanner teclado = new Scanner(System.in);

		int numero = teclado.nextInt(); // lee un numero introducido por el usuario

		System.out.println("has escrtito " + numero);

		teclado.close(); // cerramos el teclado

	}

}
