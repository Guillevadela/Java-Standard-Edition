package examen.pruebas.ejercicios.andermios;

public class Coche {

	// La clase coche tendrá los siguientes atributos: matricula, marca, modelo, color, potencia, cilindrada
	private String matricula;
	private String marca; // cm
	private String modelo;
	private String color;
	private int potencia;
	private float cilindrada;

	// Constructor
	public Coche() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.potencia = 0;
		this.cilindrada = 0;

	}

	public String getMatricula() {
		return matricula;
	}

	// GETTERS & SETTERS

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	// TO String suele usarse para sacar datos por consola pero no se usa en aplicaciones reales donde el usuario no nevecista ver los datos
	// de esa manera
	@Override
	public String toString() {
		return "UF2404EjercicioPractico2Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
				+ ", potencia=" + potencia + ", cilindrada=" + cilindrada + "]";
	}
}// CLASE
