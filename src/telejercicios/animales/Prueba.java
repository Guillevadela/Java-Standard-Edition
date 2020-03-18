package telejercicios.animales;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {

		// creamos una lista casteada a <Animales> asi podemos añadir cualquier objeto que extienda de esta clase
		ArrayList<Animales> arcaDeNoe = new ArrayList<Animales>();

		Pez pez = new Pez();
		pez.setRaza(" Bakalao");

		Perro perro = new Perro();
		perro.setNombre(" Lazy");
		perro.setRaza(" Golden Retriever");

		Gato gato = new Gato();
		gato.setNombre(" Garfield");
		gato.setRaza(" casero");

		Canario canario = new Canario();
		canario.setNombre(" pitiklis");

		Ave ave = new Ave();
		ave.setRaza(" Buitre");
		ave.setNombre(" cometodo");

		// guardamos los animales en el ArrayList
		arcaDeNoe.add(pez);
		arcaDeNoe.add(perro);
		arcaDeNoe.add(gato);
		arcaDeNoe.add(canario);
		arcaDeNoe.add(ave);

		// podemos recorrer todos los animales de la lista con un for each
		// usando la palabra "instanceof" podemos saber si la instancia o el objeto pertenece a una clase

		for (Animales animales : arcaDeNoe) {

			// Ahora mismo todos los objetos son de la clase Animal
			// no podemos acceder a los metodos de las clases hijas
			// System.out.println(animales);

			// usar instanceof para saber si el objeto pertenece a una clase concreta
			if (animales instanceof Canario) {
				// casteamos el objeto a un objeto de la clase canario
				Canario c = (Canario) animales;
				// ya podemos usar su metodos y atributos
				c.cantar();

			}

			if (animales instanceof Pez) {
				Pez c = (Pez) animales;
				c.nadar();
			}

			if (animales instanceof Perro) {
				Perro c = (Perro) animales;
				c.ladrar();
			}

			if (animales instanceof Gato) {
				Gato c = (Gato) animales;
				c.maullar();
			}
		}

	}

}
