package SegundoBimestre;
import java.util.Scanner;
/*
 * INTEGRANTES:
 * Jonathan Luzuriaga
 * Miguel Mendosa
 */
/*
 * Actividades:
 * 1)Crear un metodo donde indique si una palabra es un palindromo.
 * 2)Crear un metodo que indique si un numero ingresado es un binario
 *   es decir solo esta formado por ceros y unos.
 * 3)Crear un metodo que obtenga el numero binario de un numero.
 * 4)Crear un metodo que realice la tabla de multiplicacion de un numero
 */
public class Actividades2_Recursividad {
	/**
	 * Funcion para conocer si una palabra es un palindromo
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
	 * Esta funcion sirve para conocer si un numero es binario
	 * @param numeroString / Necesitamos el numero tipo String
	 * @param posicion / La posicion incial
	 * @return verdadero si el numero es binario, caso contrario falso.
	 */
	public static boolean conocerNumeroBinario(String numeroString, int posicion) {
		if(posicion < numeroString.length()) {
			if((numeroString.charAt(posicion)-'0') == 0 || (numeroString.charAt(posicion)-'0') == 1 ) {
				return conocerNumeroBinario(numeroString, posicion+1);
			}else {
				return false;
			}
		}else {
			return true;
		}
	}
	/**
	 * Funcion para converir un decimal a binario
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
	/**
	 * Funcion para conocer la tabla de multiplicacion de un numero entero hasta el 12.
	 * @param numIngresado / Numero entero
	 * @param numMultiplicador / El numero con quien se multiplica
	 * No retorna nada
	 */
	public static void tablaDeMultiplicar(int numIngresado, int numMultiplicador) {
		if(numMultiplicador <= 12) {
			System.out.println(numIngresado+" * "+numMultiplicador+" = "+numIngresado * numMultiplicador);
			tablaDeMultiplicar(numIngresado, numMultiplicador+1);
		}
	}
	public static void main(String[] args) {
		//Llamar al scanner
				Scanner ingresoDatos = new Scanner(System.in);
				//Definir y Asignar variables
				String palabraIngresada, numeroString;
				int numIngresado = 0;
				
				//Ingresar los datos
				System.out.println("ACTIVIDAD 1----------------------------------------------------------------------------------");
				System.out.println("Ingrese la palabra para conocer si es un palindromo");
				palabraIngresada = ingresoDatos.nextLine().toLowerCase();
				//Llamar la funcion que indique si una palabra es un palindromo.
				if (palindromo(palabraIngresada))
					System.out.println("La palabra: " + palabraIngresada + ", es un palindromo");
				else
					System.out.println("La palabra: " + palabraIngresada + ", no es un palindromo");

				System.out.println();
				//Ingreso de datos
				System.out.println("ACTIVIDAD 2----------------------------------------------------------------------------------");
				System.out.println("Ingrese el numero que desea comprobar si es binario");
				numIngresado = Integer.parseInt(ingresoDatos.nextLine());
				while (numIngresado <= 0) {//Restriccion para que inserten numeros positivos
					System.out.println("Ingrese un numero positivo");
					numIngresado = Integer.parseInt(ingresoDatos.nextLine());
				}
				//Numero Entero cambiar a String
				numeroString = Integer.toString(numIngresado);
				//Llamar la funcion que indique si un numero es binario.
				if(conocerNumeroBinario(numeroString, 0))
					System.out.println("El numero es binario");
				else 
					System.out.println("El numero es No binario");
				// Metodo para obtener el numero binario de un numero decimal
				System.out.println("ACTIVIDAD 3----------------------------------------------------------------------------------");
				System.out.println("Ingrese un numero decimal positivo para saber su binario");
				numIngresado = Integer.parseInt(ingresoDatos.nextLine());
				boolean bandera = true;
				//Para que solo se puedan admitir numero enteros positivos mayores que el -1
				while (bandera == true) {
					if (numIngresado >= 0) {
						bandera = false;
					} else {
						System.err.println("Ingrese un valor positivo mayor a 0");
						numIngresado = Integer.parseInt(ingresoDatos.nextLine());
						bandera = true;
					}
				}
				decimalABinario(numIngresado);
				System.out.println();
				//Ingresar el numero 
				System.out.println("ACTIVIDAD 4----------------------------------------------------------------------------------");
				System.out.println("Ingrese el numero correspondiente a la tabla de multiplicacion");
				numIngresado = Integer.parseInt(ingresoDatos.nextLine());
				while (numIngresado <= 0) {//Restriccion para que inserten numeros positivos
					System.out.println("Ingrese un numero positivo");
					numIngresado = Integer.parseInt(ingresoDatos.nextLine());
				}
				//Funcion de multiplicacion
				System.out.println("Esta es la tabla del "+numIngresado);
				tablaDeMultiplicar(numIngresado, 1);

	}

}
