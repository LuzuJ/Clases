package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Esta clase esta diseñada para proponer más ejercicios de recursividad
 * 
 */
public class EjerciciosRecursividad {

	/**
	 * Este metodo suma todos los valores positivos desde 1 hasta un tope.
	 * 
	 * @param Valor tope hasta donde se quiere sumar
	 * @return La suma acumulada de todos los valores hasta el tope.
	 */
	public static int sumaRecursiva(int topeSuma) {

		int resultadoSuma; // Si la inicializa recuerde que en este caso se vuelve a inicializar
		/*
		 * La idea para una suma recursica hasta un tope es que se sumen todos los
		 * numeros anteriores. tS=5 rS = 1+2+3+4+5 rS = tS + sumaRecursiva(tS-1)
		 */

		if (topeSuma == 1) {
			return 1;
		} else {
			resultadoSuma = topeSuma + sumaRecursiva(topeSuma - 1);
			// Rs = 2+1
		}
		/*
		 * Recuerde que es importante en recursividad tener una condicion que rompa la
		 * misma para generar un ciclo finito, esto quiere decir, que siempre en cada
		 * metodo que utilice recurisivdad debe existir una condicion que al cumplirse
		 * no llame nuevamente al metodo y se pueda salir del mismo. Adicionalmente tome
		 * en cuenta que se tiene que tener una variacion dentro de los valores a operar
		 * en la recursividad para poder ir realizando la operacion requerida.
		 */
		return resultadoSuma;
	}

	/**
	 * Este es el metodo para imprimir los elementos de un arreglo de forma
	 * recursiva
	 * 
	 * @param Un  arreglo de tipo entero
	 * @param Una posicion inicial de impesion.
	 */
	public static void mostrarElementosArreglo(int[] arregloEntero, int posArr) {
		if (posArr == arregloEntero.length - 1) {
			System.out.println(arregloEntero[posArr]);
		} else {
			System.out.println(arregloEntero[posArr]);
			mostrarElementosArreglo(arregloEntero, posArr + 1);
		}

	}

	/**
	 * Esre es el metodo para invertir el orden de una palabra
	 * @param La palabra a invertir
	 * @param La posicion del caracter desde donde se quiere invertir la palabra
	 * @return La palabra invertida
	 */
	public static String invertirOrden(String palabraOriginal, int posCaracter) {
		if(posCaracter == 0) {
			return palabraOriginal.charAt(posCaracter) + "";
		}else{
			return palabraOriginal.charAt(posCaracter) + (invertirOrden(palabraOriginal, posCaracter-1));
		}
		//No hace falta el return final
	}

	/**
	 * Funcion para calcular el factorial de un numero
	 * @param Numero a calcular
	 * @return Valor factorial
	 */
	public static int calculoFactorial(int num1) {
		if(num1 == 0) {
			return 1;
		}else {
			return num1 * calculoFactorial(num1-1);
		}
	}
	
	/**
	 * Funcion para sumar los digitos de un numero
	 * @param numero entero
	 * @return La suma de los digitos de un numero
	 */
	public static int sumaDigitos(int numeroEntero) {
		if(numeroEntero==0) {
			return 0;
		}else {
			/*
			 * Al tener un numero con algunos digitos, sacamos el residuo que ese lo sumaremos
			 * con la division del anterior numero que tendra menos digitos y así hasta solo tener
			 * la suma de los digitos
			 */
			return sumaDigitos(numeroEntero/10) + numeroEntero%10;
		}
	}
	
	/**
	 * Funcion para llenar arreglos enteros
	 * @param longitud del arreglo
	 * @return Arreglo entero de numeros randomicos
	 */
	public static int[] llenarArreglo(int longitud) {
		int[] arregloLleno = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			arregloLleno[i] = (int) ((Math.random() * 80)+20);
		}
		return arregloLleno;
	}
	
	/**
	 * 
	 * @param Funcion para imprimir el maxor de un arreglo
	 * @param Posicion
	 * @param Valor a comparar
	 * @return El mayor del arreglo
	 */
	public static int mayorArreglo(int[] arregloEnte, int posicion, int valorComp) {
		if (posicion == 0 ) {
			return valorComp;
		}else {
			if(arregloEnte[posicion]>valorComp) {
				valorComp = arregloEnte[posicion];
				
			}
		}
		return mayorArreglo(arregloEnte, posicion-1, valorComp);
	}
	

	
	public static void main(String[] args) {
		Scanner ingre = new Scanner(System.in);
		
		// Suma acumulativa para valores hasta un tope
		int topeSuma = 10;
		int resultadoSuma = sumaRecursiva(topeSuma);
		System.out.println(resultadoSuma);

		System.out.println();

		// Imprimir los elementos de un arreglo de forma
		int[] arregloEntero = { 10, 20, 30, 40, 50 };
		mostrarElementosArreglo(arregloEntero, 0);

		System.out.println();

		// Invertir el orden de una palabra, utilizando la posicion de los caracteres.
		// hola-> aloh
		String palabraOriginal = "Programacion Estructurada";
		//Se puede cambiar el numero pero solo tomara las posiciones que coloce, 5 Progra -> argorP
		String palabraAlreves = invertirOrden(palabraOriginal, palabraOriginal.length() - 1);
		System.out.println(palabraAlreves);
		
		/*
		 * Trabajo en parejas para los programas
		 * Informe individual
		 * Actividades dia Lunes para presentar el lunes hasta la media noche:
		 * Caratula.
		 * Indice.
		 * Introduccion: 3 - 5 Parrafos del significado de recursividad. Pueden usar ejemplos, 
		 * imagenes, diagramas. Por nosotros mismos
		 * Ejemplos: 2 Ejemplos de recursividad no necesariamente ejemplos de programacion
		 * 
		 * Programas parejas:
		 * 1) Ingresado un numero por consola calcular el factorial del mismo
		 * Ya pueden utilizar restricciones, es decir si el usuario ingresa un numero negativ
		 * les muestre un error. **
		 * 2) Ingresado un numero por consola calcular la suma de los digitos
		 * 578 Resultado 5+7+8 = 20***
		 * 3) Calcular el máximo de un arreglo utilizando recursividad.
		 * Crear un arreglo de 10 elementos de forma aleatoria entre 20 y 100, **
		 */
		
		/*
		 * Factorial de un numero
		 * Para poder ingresar un numero positivo
		 */
		System.out.println("ingrese hasta donde desea el factorial");
		int num1 = Integer.parseInt(ingre.nextLine());
		while(num1<=0) {
			System.err.println("Ingrese un numero positivo");
			num1 = Integer.parseInt(ingre.nextLine());
		}
		int numF = calculoFactorial(num1);
		System.out.println("El factorial de " + num1 + "! es " + numF);
		
		
		/*
		 * Usamos restriccion para que no sean numero con menos de dos
		 * pueden ser negativos y positivos
		 */
		System.out.println("Ingrese un numero mayor de más de 2 cifras para poder sumarlos");
		int num2 = Integer.parseInt(ingre.nextLine());
		while(num2<10 && num2> 10) {
			System.err.println("Ingrese un numero de más digitos");
			num2 = Integer.parseInt(ingre.nextLine());
		}
		int numSu = sumaDigitos(num2);
		System.out.println("La suma de los digitos es " + numSu);
		
	
		/*
		 * El maximo de un arreglo usando recursividad 
		 */
		 int [] arregloEnte = new int[10];
		 arregloEnte = llenarArreglo(arregloEnte.length);
		 System.out.println(Arrays.toString(arregloEnte));
		//Llamamos funcion para calcular el mayor de un arreglo
		 int numMax = mayorArreglo(arregloEnte, arregloEnte.length-1, arregloEnte[0]);
		 System.out.println("El mayor del arreglo es: " + numMax);
		
	}

	

	

	

	

	
}
