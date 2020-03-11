package com.ipartek.formacion.clases;

public class Alumno extends Persona {

	// atributos o parametros

	private String email;
	private String github;
	private int nota;

	// constructores inicializados

	public Alumno() {
		super();
		this.email = "";
		this.github = "";
		this.nota = 0;
	}

	// getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	// to string
	@Override
	public String toString() {
		return "Alumno [email=" + email + ", github=" + github + ", nota=" + nota + "]";
	}

}// class
