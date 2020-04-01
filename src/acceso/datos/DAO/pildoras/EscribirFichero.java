package acceso.datos.DAO.pildoras;

import java.io.*;

public class EscribirFichero {

	public static void main(String[] args) {
		Escribiendo accede_es = new Escribiendo();
		accede_es.escribir();

	}

}

class Escribiendo {
	public void escribir() {
		String frase = "Esto es una prueba de escritura en un archivo de texto nuevo localizado en la ruta del worspace indicado dentro del FileWriter ()";
		try {
			FileWriter escritura = new FileWriter("C:/Eclipse2020/eclipse/workspace/texto prueba writer.txt");
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
