package com.ipartek.formacion.clases;

public class ConfiguradorVehiculos {

	public static void main(String[] args) {

		// preguntar por consola como quiere el Vehiculo
		// preguntar color
		// preguntar matricula
		// preguntar puertas y resto de atributos
		// mostrar uno a uno todos los atriibutos por consola

		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("negro", "4444 GPS");
		Vehiculo v3 = new Vehiculo("blanco", "1111 XRS", 5);

		// vamos a pintar el coche v1
		v1.setColor("rojo");

		// vamos a matricularlo v1
		v1.setMatricula("1234 FGT");

		System.out.println("En que color quiere su Vehiculo ? ");
		System.out.println("matricula: " + v1.getMatricula());
		System.out.println("color: " + v1.getColor());
		System.out.println("matricula: " + v3.getMatricula());
		System.out.println("matricula: " + v2.getMatricula());

	}

}
