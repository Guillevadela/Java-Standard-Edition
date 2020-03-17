package telejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// generamos una lista dinamica de objetos de tipo empleado

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		Scanner entrada = new Scanner(System.in);

		// Para poder guardar datos en el
		System.out.println("Introducir el nombre");
		String nombre = entrada.nextLine();
		System.out.println("Introducir el apellido");
		String apellido = entrada.nextLine();
		System.out.println("Introduce el salario");
		int salario = entrada.nextInt();
		listaEmpleados.add(new Empleado(nombre, apellido, salario));

		// Para saber la cantida de elementos que tenemos dentro del ArrayList
		System.out.println("El nº total de empleados " + listaEmpleados.size());

		// Cambiar los datos de un empleado de posicion dentro de la lista
		listaEmpleados.set(1, new Empleado(nombre, apellido, salario));

		// Para acceder a un empleado concreto de lal lista y visualizarlo por ejemplo
		System.out.println(listaEmpleados.get(2).toString());

		entrada.close();

	}

}
