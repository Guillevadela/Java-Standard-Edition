package ejercicios.excepciones;

import java.util.Scanner;

public class ExcepcionesEjercicio1 {

	// Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego calcule “a/b”. Pruebe a introducir b=0 y
	// ver que hace el programa con la división por cero.
	// Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. Añada excepciones para recoger estas
	// excepciones y avisar
	// del problema al usuario

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			// vigilamos el codigo por si hay alguna Exception
			System.out.println("Dime un numero a");
			String linea = sc.nextLine();
			int a = Integer.parseInt(linea);
			System.out.println("Dime un numero b");
			String linea2 = sc.nextLine();
			int b = Integer.parseInt(linea2);
			System.out.println("El resultado de la division de a entre b es: " + (a / b));

		} catch (ArithmeticException e) {// dividir entre 0
			System.out.println("division por cero no permitido");
			e.printStackTrace();// te saca por pantalla el tipo de error de no tenerlo solo saca lo que este en el syso
								// del catch
		} catch (NumberFormatException e) {// escribir letras
			System.out.println("Lo sentimos pero solo numeros");
			e.printStackTrace();
		} catch (Exception e) {
			// Este codigo se ejecuta si hay Exception que no sea de ninguno de los 2 tipos anteriores
			System.out.println("Lo sentimos pero tenemos un problema");
			e.printStackTrace();

		}

		sc.close();

		// Lo mismo del ejercicio de arriba pero planteado por ANDER
		/*
		 * Scanner sc = new Scanner(System.in); int a = 0; int b = 0; int resultado = 0; String linea = "";
		 * 
		 * try {
		 * 
		 * System.out.println("1º numero:"); linea = sc.nextLine(); a = Integer.parseInt(linea);
		 * 
		 * System.out.println("2º numero:"); linea = sc.nextLine(); b = Integer.parseInt(linea);
		 * 
		 * resultado = a / b; System.out.println(" el resultad de a/b=" + resultado);
		 * 
		 * } catch (ArithmeticException e) { System.out.println("division por cero no permitido");
		 * 
		 * } catch (NumberFormatException e) { System.out.println("Lo sentimos pero solo numeros");
		 * 
		 * } catch (Exception e) { System.out.println("Excepcion no controlada");
		 * 
		 * } finally { sc.close(); }
		 */

	}

}
