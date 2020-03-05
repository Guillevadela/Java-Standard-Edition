package punto.com.no.es.un.lenguaje;

public class Temperaturas {

	public static void main(String[] args) {

		int[] temperaturas = new int[7];
		double total = 0;
		int maxima = -110;
		int minima = 100;

		temperaturas[0] = 12;
		temperaturas[1] = 35;
		temperaturas[2] = 15;
		temperaturas[3] = 2;
		temperaturas[4] = 14;
		temperaturas[5] = 19;
		temperaturas[6] = 41;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
			total += temperaturas[i];
			// comprobar si la temp
			if (temperaturas[i] > maxima) {
				maxima = temperaturas[i];
			}
			if (temperaturas[i] < minima) {
				minima = temperaturas[i];
			}
		}

		double media = total / 7;

		System.out.println("Media " + media);
		System.out.println("Maxima " + maxima);
		System.out.println("Maxima " + minima);

	}

}
