package examen.pruebas.ejercicios.andermios;

import java.util.Scanner;

public class EjercicioAExamen {

	public static void main(String[] args) {
		// TODO calcular media
		// TODO altura maxima
		// TODO altura minima

		Scanner sc = new Scanner(System.in);
		double total = 0;
		int maxima = 300;
		int minima = 20;
		System.out.println("Empezamos");
		int[] alturas = new int[5];

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Dime una altura en cm:");
			int altura = Integer.parseInt(sc.nextLine());
			alturas[i] = altura;

			if (alturas[i] > maxima) {
				maxima = alturas[i];
			}
			if (alturas[i] < minima) {
				minima = alturas[i];
			}
		} // for

		double media = total / 5;
		System.out.println("Media " + media);
		System.out.println("Maxima " + maxima);
		System.out.println("Minima " + minima);

		System.out.println("Gracias y adios");

		sc.close();
		/*
		 * //temper int[] temperaturas = new int[7]; double total = 0; int maxima =
		 * -110; int minima = 100;
		 * 
		 * temperaturas[0] = 12; temperaturas[1] = 35; temperaturas[2] = 15;
		 * temperaturas[3] = 2; temperaturas[4] = 14; temperaturas[5] = 19;
		 * temperaturas[6] = 41;
		 * 
		 * for (int i = 0; i < temperaturas.length; i++) {
		 * System.out.println(temperaturas[i]); total += temperaturas[i]; // comprobar
		 * si la temp if (temperaturas[i] > maxima) { maxima = temperaturas[i]; } if
		 * (temperaturas[i] < minima) { minima = temperaturas[i]; } }//for
		 * 
		 * double media = total / 7;
		 * 
		 * System.out.println("Media " + media); System.out.println("Maxima " + maxima);
		 * System.out.println("Maxima " + minima);
		 */
	}// main

}// class
