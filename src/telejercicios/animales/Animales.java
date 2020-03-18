package telejercicios.animales;

public class Animales {

	private String nombre;
	private String raza;

	public Animales() {
		super();
		this.nombre = "";
		this.raza = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", raza=" + raza + "]";
	}

}
