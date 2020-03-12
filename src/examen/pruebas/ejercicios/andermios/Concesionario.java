package examen.pruebas.ejercicios.andermios;

public class Concesionario {

	public static void main(String[] args) {

		// Creo un array de coches
		Coche[] coches = new Coche[3];

		// Declaro los elementos del array
		Coche coche1 = new Coche();
		coche1.setMatricula("TXD4138");
		coche1.setMarca("VW");
		coche1.setColor("Rojo");
		coche1.setCilindrada(2.0f);
		coche1.setPotencia(140);

		Coche coche2 = new Coche();
		coche2.setMatricula("ZVT46738");
		coche2.setMarca("Lotus");
		coche2.setColor("Dorado");
		coche2.setCilindrada(5.0f);
		coche2.setPotencia(800);

		Coche coche3 = new Coche();
		coche3.setMatricula("HYT5623");
		coche3.setMarca("Porsche");
		coche3.setColor("Negro");
		coche3.setCilindrada(3.0f);
		coche3.setPotencia(500);

		// Defino los atributos de los elementos del array

		// array
		coches[0] = coche1;
		coches[1] = coche2;
		coches[2] = coche3;

		System.out.println("El coche 1 " + coche1.getMarca() + " Tiene una potencia de: " + coche1.getPotencia() + "Con una cilindrada de: "
				+ coche1.getCilindrada());

		for (Coche c : coches) {
			System.out.println(c.getPotencia() + " Potencia: " + c.getCilindrada());
			// System.out.println(coche.toString());
		}

	}

}
