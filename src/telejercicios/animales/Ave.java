package telejercicios.animales;

public class Ave extends Animales {

	private boolean vuela;// algunas aves no vuelan, ej: ping�ino

	public Ave() {
		super();
		this.vuela = true;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

}
