package examen.pruebas.ejercicios.andermios;

public class JugandoConString {

	public static void main(String[] args) {
		// ¿ Que valor tiene por defecto un String si no lo inicializamos ?
		String sinInicializar;

		String nombre = " AaAnN 5 ";

		// longitud
		System.out.println("Longitud del nombre " + nombre.length());

		// numero vocales
		int numeroVocales = 0;
		int numeroMayusculas = 0;
		int numeroMinusculas = 0;
		int numeroConsonantes = 0;
		int numeroNumeros = 0;
		int numeroEspaciosB = 0;

		// TODO contar numeros y espacios en blanco

		char caracter;
		for (int i = 0; i < nombre.length(); i++) {

			caracter = nombre.charAt(i);
			System.out.println("En la posicion " + i + " tenemos caracter " + caracter);

			// contar mayusculas y minusculas
			if (Character.isLowerCase(caracter)) {
				numeroMinusculas++;
			}
			if (Character.isUpperCase(caracter)) {
				numeroMayusculas++;
			}

			if (Character.isDigit(caracter)) {
				numeroNumeros++;
			}

			if (Character.isWhitespace(caracter)) {
				numeroEspaciosB++;
			}

			// Contar (Vocales o S) Si => es Letra

			if (Character.isLetter(caracter)) {

				caracter = Character.toLowerCase(caracter);
				switch (caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					numeroVocales++;
					break;

				default:
					numeroConsonantes++;
					break;
				}// switch

			} // if is Letter

		} // for

		System.out.println("Numero Mayusculas " + numeroMayusculas);
		System.out.println("Numero Minusculas " + numeroMinusculas);
		System.out.println("Numero Vocales " + numeroVocales);
		System.out.println("Numero Consonantes " + numeroConsonantes);
		System.out.println("Numero de Numeros " + numeroNumeros);
		System.out.println("Numero de espacios Blancos " + numeroEspaciosB);

		// numero de palabras

		String palabras = "hola mi nombre es Guillermo";
		String[] arrayPalabras = palabras.split(" ");

		System.out.println("Tenemos " + arrayPalabras.length + " palabras en la frase");

		
		// TODO mostrar nombre y apellido, la edad y el sueldo anual
		// nombre apellido edad y sueldo
		String lineaCVS = "jose;froilan;16;35.000";
		String[] arrayCampos = lineaCVS.split(";");

		System.out.println("Nombre: " + arrayCampos[0] + " " + arrayCampos[1]);
		System.out.println("Edad: " + arrayCampos[2]);
		System.out.println("Sueldo: " + arrayCampos[3] + " €/mes");

		// buscar posicion de una letra concreta
		// TODO buscar primera 'd'
		// TODO buscar posicion ultima 'a'
		String buscarLetra = "Abracadrabra";
		System.out.println("La primera b esta en la poscion " + buscarLetra.indexOf('b'));
		System.out.println("La primera a esta en la poscion " + buscarLetra.indexOf('a'));
		System.out.println("La primera d esta en la poscion " + buscarLetra.indexOf('d'));
		System.out.println("La ultima a esta en la poscion " + buscarLetra.charAt(11));
		System.out.println("La ultima a esta en la poscion " + buscarLetra.lastIndexOf('a'));
		System.out.println("¿Que pasa si no la encuentra? " + buscarLetra.indexOf('z'));
		

		// limpiar espacios en blanco
		String datosIntroducidosUsuario = "    minombre       es Manolo    ";
		String limpiarEspacios = datosIntroducidosUsuario.trim();
		limpiarEspacios = limpiarEspacios.replace("  ", "");
		System.out.println(limpiarEspacios);

		// TODO cambiar numeros por letras y ademas pasar todo a MAYSUCULAS
		
		String textoCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";
		String desCodificado = " h0l4 m1 n0mb3 3s m4n0l0 ";

		desCodificado = desCodificado.replace('0', 'o');
		desCodificado = desCodificado.replace('4', 'a');
		desCodificado = desCodificado.replace('3', 'e');
		desCodificado = desCodificado.replace('1', 'i');

		System.out.println(textoCodificado);
		System.out.println(desCodificado);

		// TODO sumar todos los numeros de este String "ejercicio DNI"
		// TODO buscar por interenet como se calcula la letra
		final char LETRA_DNI[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		String dniTexto = "12345678";
		int numeroDni = Integer.parseInt(dniTexto);

		int restoDivision = numeroDni % 23;

		System.out.println("La letra es " + LETRA_DNI[restoDivision]);

		

	}

}
