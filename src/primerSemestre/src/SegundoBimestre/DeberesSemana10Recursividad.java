package SegundoBimestre;

import java.util.Scanner;

/*
 * Actividades en pareja se van a presentar hasta el viernes media noche:
 * 1) Crear un metodo donde indique si una palabra es un palindromo.
 * Es una palabra que se lee igual de izq - der = der - izq
 * aba - aba
 * Anita lava la tina = anita lava la tinA
 * 2) Crear un metodo que indique si un numero ingresado es binario
 * es decir solo esta formado por ceros y unos.
 * 3) Crear un metodo que obtenga el numero binario de un numero
 * 4) Crar un metodo que realice la tabal de multiplicar de un numero, decimal
 * Eg. Si el numero es 5 
 * 5* 1
 * 5*2 hasta el 12
 */
public class DeberesSemana10Recursividad {

	/**
	 * Funcion para conocer si una palabra es un palindromo
	 * 
	 * @param Palabra ingresada por el usuario
	 * @return El valor de verdad si es palindromo o no
	 */
	public static boolean palindromo(String palabra) {
		// Use replaceAll para poder comparar correctamente la palabra sin los espacios
		// En otras palabras reemplaza el espacio otro caracter o dejarlo sin caracter
		palabra = palabra.replaceAll(" ", "");
		if (palabra.length() <= 1)
			return true;
		else if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
			// Compara las posiciones una por una
			return palindromo(palabra.substring(1, palabra.length() - 1));
		} else {
			return false;
		}
	}

	/**
	 * Fincion para converir un decimal a binario
	 * @param Numero decimal a convertir
	 * @return Numero en binario
	 */
	public static int decimalABinario(int numDeci) {
		//Usamos if para comparar los numeros que se dividen
		if(numDeci == 0) {
			//Colocamos que sea igual a 0, para que solo en ese unico caso regrese 
			//El valor de 0, el 1 lo devolvera la parte de abajo
			return numDeci;
		}else {
			/*
			 * Recordemos que para un numero binario necesitamos dividir el numero para 2,
			 * usaremos el residuo del numero más el ultimo numero que nos devuelva en la 
			 * division y se deben colocar desde el ultimo al primero
			 */
			decimalABinario(numDeci / 2);
			/*
			 * Como es entero, el programa no regresara con decimales, unicamente
			 * La parte entera del numero
			 * Hacemos el llamado de la funcion antes del modulo para que los 
			 * coloquen del ultimo al primero, por acumulacion.
			 */
			System.out.print(numDeci % 2);
			//El modulo regresara el 0 o 1 que le corresponda al numero 
			return numDeci;
			
		}
		
	}

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);

		// Programa para detectar si una palabra es un palindromo
		// Cambiamos el nombre usado para que en el syso muestre correctamente la
		// palabra
		System.out.println("Ingrese una palabra para saber si es palindromo");
		String frase = ingreso.nextLine().toLowerCase();
		if (palindromo(frase))
			System.out.println("La palabra: " + frase + ", es un palindormo");
		else
			System.out.println("La palabra: " + frase + ", no es un palindromo");

		System.out.println();

		// Metodo para obtener el numero binario de un numero decimal
		System.out.println("Ingrese un numero decimal positivo para saber su binario");
		int numDeci = ingreso.nextInt();
		boolean bandera = true;
		//Para que solo se puedan admitir numero enteros positivos mayores que el -1
		while (bandera == true) {
			if (numDeci >= 0) {
				bandera = false;
			} else {
				System.err.println("Ingrese un valor positivo mayor a 0");
				numDeci = ingreso.nextInt();
				bandera = true;
			}
		}
		decimalABinario(numDeci);
		
	}

}
