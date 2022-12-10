import java.util.Arrays;
import java.util.Scanner;

public class CombinacionSR {

	public static int calcularfactorial(int numIngresado) {
		int i = 0, f = 1;

		for (i = 1; i <= numIngresado; i++)
			f = f * i;
		return f;
	}

	public static int calcularNroCombinaciones(int n, int r) {
		int c;
		c = calcularfactorial(n) / (calcularfactorial(r) * calcularfactorial(n - r));
		return c;
	}

	public static void showCombinaciones(char[] conjunto, int n, int k, int y, int i, int[] index) {
		if (index == null) {
			index = new int[k];
		}
		if (i < k) {
			for (int x = y; x < n; x++) {
				index[i] = x;
				showCombinaciones(conjunto, n, k, x + 1, i + 1, index);
			}
		} else {
			// Imprimir la lista
			System.out.println("");
			for (int w = 0; w < k; w++) {
				System.out.print(conjunto[index[w]]);

			}
		}

	}

	public static void main(String[] args) {
		//Definicion de variables
		int n = 0, k = 0, combina = 0;
		Scanner sc = new Scanner(System.in);
		int y = 0;
		int i = 0;
		int[] index = null;

		//Ejercicio
		System.out.println("*****************");
		char[] conjunto = { 'a', 'b', 'c', 'd', 'e', 'f' };
		n = conjunto.length;
		System.out.println("Su conjunto es" + Arrays.toString(conjunto));
		System.out.println("Introduzca la cantidad de elementos que conformaran un grupo:");
		k = sc.nextInt();
		combina = calcularNroCombinaciones(n, k);
		System.out.println("Su numero de combinaciones: " + combina);
		showCombinaciones(conjunto, n, k, y, i, index);
        sc.close();

	}
}