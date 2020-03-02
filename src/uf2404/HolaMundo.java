package uf2404;

public class HolaMundo {

	public static void main(String[] args) {
		/*
		 * esto es un cmomentario de varias lineas se escribe todo lo que uno quiera
		 * todo el codigo tiene que estar dentro del main Las Clases empiezan con
		 * Mayuscula y CamelCase las variables empiezan con minuscula y PascalCase
		 */

		/**
		 * JavaDoc es para documentar el codigo fuenteo src
		 * 
		 * @author Curso
		 */
		// String: es el tipo de la variable
		// persona: nombre de la variable
		// "Ander": es el valor que asignamos a la variable
		// usamos el operador + para concatenar String o Cadenas de texto
		String persona = "Ander";
		int edad = 39;
		float altura = 1.70f; // Hay que poner una f al final o (float) por delante
		float otraAltura = (float) 1.70;
		boolean isGoodDay = true;

		System.out.println("Hello " + persona);
		System.out.println("Mi edad es " + edad);
		System.out.println("Mi altura es " + altura + " cm");

		if (isGoodDay) {
			System.out.println("Hoy tengo un dia bueno");
		} else {
			System.out.println("hoy es un dia malo");
		}

	} // final metodo main

} // final de la clase
