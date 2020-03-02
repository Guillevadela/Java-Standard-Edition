package ejercicio.basico.principiantes;

import java.util.Scanner;

/**
 * 
 * Pedir al usuario la temperatura de los dias de la semana, comenzando por el
 * lunes<br>
 * Mostrar por pantalla la media de la semana, y la temperatura mas alta y baja
 * 
 * 
 * 
 *
 */
public class MediaNumerosFor {

	public static void main(String[] args) {

		String[] diasSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		float temperaturaDia;
		float media = 0f;
		float minima = 50f;
		float maxima = -50f;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 6; i++) {

			String dia = diasSemana[i];
			System.out.println("Dime la tempeatura del " + dia);

			temperaturaDia = Float.parseFloat(sc.nextLine());
			media += temperaturaDia;

			if (minima > temperaturaDia) {
				minima = temperaturaDia;
			}

			if (maxima < temperaturaDia) {
				maxima = temperaturaDia;
			}

		} // for

		System.out.println("La media es " + (media / 7));
		System.out.println("minima " + minima + " ºC");
		System.out.println("maxima " + maxima + " ºC");

		sc.close();

	}

}
