package com.ipartek.formacion.clases;

public class Profesor extends Persona {

	// atributos o parametros
	private double sueldo;
	private String materia;

	// CONSTRUCTORES INICIALIZADOS
	public Profesor(int i, String string) {
		super();
		this.sueldo = 0.0;
		this.materia = "";
	}

	// GETTERS y SETTERS

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

}// class
