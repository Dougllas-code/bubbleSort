import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		int[] v = geradorDeArray(20);
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}

	public static int[] geradorDeArray(int n) {
		int[] v = new int[n];
		Random gerador = new Random();
		for (int i = 0; i < n; i++) {
			v[i] = gerador.nextInt(100);
		}
		return v;
	}

	private static void bubbleSort(int[] v) {
		int n = v.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (v[j] > v[j + 1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}
}


