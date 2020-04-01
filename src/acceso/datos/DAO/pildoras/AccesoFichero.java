package acceso.datos.DAO.pildoras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {

		LeerFichero accediendo = new LeerFichero();
		accediendo.lee();

	}

}

class LeerFichero {
	public void lee() {
		try {
			entrada = new FileReader("C:/Eclipse2020/eclipse/workspace/Pruebas DAO1.txt");
			BufferedReader mibuffer = new BufferedReader(entrada);

			String linea = "";
			while (linea != null) {
				linea = mibuffer.readLine();
				if (linea != null)
					System.out.println(linea);
			}

		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		} finally {
			try {
				entrada.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	FileReader entrada;
}
