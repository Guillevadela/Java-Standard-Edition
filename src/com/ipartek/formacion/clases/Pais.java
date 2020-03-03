package com.ipartek.formacion.clases;

public class Pais {

	// atributos
	// cuando se construye un pais su nombre es "" y numero de casos 0
	// crear getters y setters
	// crear toString

	private String nombre;
	private int numeroInfectados;

	// CONSTRUCTORES
	public Pais() {
		super();
		this.nombre = "Anonimo";
		this.numeroInfectados = 20;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroInfectados() {
		return numeroInfectados;
	}

	public void setNumeroInfectados(int numeroInfectados) {
		this.numeroInfectados = numeroInfectados;
	}

	// otras funciones
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", numeroInfectados=" + numeroInfectados + "]";
	}

}
