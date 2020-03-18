package telejercicios.animales;

public class Pez extends Animales {

	private int numeroAletas;

	public Pez() {
		super();
		this.numeroAletas = 1;
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}

	public void nadar() {
		System.out.println("Soy un pez y estoy nadando");
	}

}
