package punto.com.no.es.un.lenguaje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BailarinesHungaros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int array_hungaro[], nElementos, aux;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));

		array_hungaro = new int[nElementos]; // Le asignamos el numero de elementos al array

		for (int i = 0; i < nElementos; i++) {
			System.out.println((i + 1) + ". Dime un número: ");
			array_hungaro[i] = entrada.nextInt();
		}

		// Metodo burbuja ordenar el array que acaba de rellenar el usuario con los datos que escribió
		for (int i = 0; i < (nElementos - 1); i++) {
			for (int j = 0; j < (nElementos - 1); j++) {
				if (array_hungaro[j] > array_hungaro[j + 1]) {// si numeroActual > numeroSiguiente
					aux = array_hungaro[j];
					array_hungaro[j] = array_hungaro[j + 1];
					array_hungaro[j + 1] = aux;
				}
			}
		}
		// mostrando el array ordenado en forma creciente
		System.out.print("\n Array ordenado en forma creciente: ");
		for (int i = 0; i < nElementos; i++) {
			System.out.print(array_hungaro[i] + " - ");
		}
		System.out.print("\n Array ordenado en forma decreciente: ");
		for (int i = (nElementos - 1); i >= 0; i--) {
			System.out.print(array_hungaro[i] + " - ");
		}
		System.out.println("");

		entrada.close();

	}

}
