package punto.com.no.es.un.lenguaje;

public class EjerciciosAnderBasicos {

	public static void main(String[] args) {

		String Nombre = "Guillermo Vazquez de Lara Padilla";

		System.out.println("Hola " + Nombre);

		String[] alumnos = { "Ariel", "JR", "JL", "Guillermo" };
		double[] notas = { 5.5, 7.2, 2.9, 8.8 };
		String[] asignaturas = { "fisica", "Matematicas", "Cocina", "Quimica" };

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(
					"posicion " + i + " alumno " + alumnos[i] + " nota " + notas[i] + " Asignatura: " + asignaturas[i]);
		} // for nombre

	}// main

}// clase
