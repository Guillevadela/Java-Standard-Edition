package com.ipartek.formacion.clases;

public class Persona {

	// ATRIBUTOS
	// siempre son 'private' para que no se puedan manipular desde fuera de esta
	// clase, para poder manipular los atributos hay que crear metodos 'publicos'
	// denominados getters y setters. Ha esto se le llama 'encapsulacion'

	private String nombre;
	private int altura;
	private int edad;
	private String genero;
	private String raza;

	// CONSTRUCTORES
	// constructor porque se llama igual que la Clase
	public Persona() {
		super();
		this.nombre = "";
		this.altura = 0;
		this.edad = 0;
		this.genero = "";
		this.raza = "";

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// GETTERS y SETTERS

	// OTRAS FUNCIONES

}
