/*
 * INTEGRANTES:
 * Luzuriaga Jonathan 
 * Mendosa Miguel
 * Salvador Levi
 * Trocelier Michael
 */
/*
 * Se necesita crear una función que le permita al usuario imprimir su 
 * nombre basado en un numero que el usuario ingrese a través de consola.
 */

import java.util.Scanner;

public class EjerciciosFunciones1Grupo {
	// Esta función es encargada de recibir le numero digitado para saber cuantas
	// veces debe
	// Escribir el nombre que ya ha sido establecido dentro del programa

	public static void impresion(int numeroAsignado) {
		int contador = 0; // Varaible encargada de contar el numero de veces que se repite la estructura
							// WHILE
		// Estructira encargada de comparar el contador con el numero ingresaso para
		// detenerse al llegar a este
		while (contador < numeroAsignado) {
			System.out.println((contador + 1) + ".- Jonathan Luzuriaga"); // Impresion del nombre con n-repeticiones
			contador++;
		}

	}

	public static void main(String[] args) {

		Scanner ingresoDatos = new Scanner(System.in);
		// Asignacion de variables
		int numeroIngresado;
		// Inicializacion de la variable
		numeroIngresado = 0;

		System.out.println("Ingrese un numero");
		// Pedimos el numero de veces que queremos que imprima el nombre
		numeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
		// llamamos a la funcion para que repita las veces desardas
		impresion(numeroIngresado);

	}

}
