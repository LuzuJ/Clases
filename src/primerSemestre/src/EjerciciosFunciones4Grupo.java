import java.util.Scanner;

/*
 * Se necesita crear un programa que me permita generar un numero al azar entre 20 – 200, 
 * dependiendo del valor, si se encuentra en el rango de 20 – 50 se 
 * realice la impresión de una palabra que ingrese el usuario a través de consola. 
 * Si esta entre 51-100 se imprima la longitud de la palabra ingresada, 
 * si esta entre 101-150 se retorne la longitud de la palabra 
 * ingresada mas el 12% y si el numero esta entre 151-200 se imprima 10 veces la palabra.
 *  Todo esto debe estar creada en una misma función. 
 */
public class EjerciciosFunciones4Grupo {

	public static double funcionValor(double numero, String palabra) {
		// Funcion usada para recibir el dato randomico y la palabra ingresada por
		// teclado
		double longuitudP = 0;
		// If para poder ejecutar dependiedno el caso deseado
		if (numero >= 20 && numero <= 50) {
			System.out.println(palabra);
		}
		if (numero > 50 && numero <= 100) {
			System.out.println(palabra.length());
		}
		if (numero > 100 && numero <= 150) {
			System.out.println("Se retorna el valor ");
			longuitudP = palabra.length() + palabra.length() * 0.12;
		}
		if (numero > 150 && numero <= 200) {
			int contador = 10;
			while (contador < longuitudP) {
				System.out.println((contador + 1) + ".- " + palabra);
				contador++;
			}
		}
		// Retorno de valor 0 en caso de que no se ejecute el if con el valor
		// correspondiente
		return longuitudP;
	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Definimos las variables
		String palabra;
		// Generador del numero randomico
		double numero = (double) (Math.random() * 181) + 20;
		// Ingreso de la palabra por teclado
		System.out.println(numero);
		System.out.println("Ingrese una palabra");
		palabra = ingresoDatos.nextLine();
		// LLamamiento de la funcion con el parametro de numero randomico
		funcionValor(numero, palabra);
	}

}
