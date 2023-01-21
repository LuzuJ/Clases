package SegundoBimestre;

import java.util.Scanner;

/*
Switch
* 1)Numero que se repita más veces se a obtener la multiplicaion de las repeticiones
* por el numero 2*26=52
* 2)Numero que se repita menos veces se va a obtener la division del numero para 
* las repeticinoes
* 3)Si existen dos numeros con igual numero de repeticiones que se muetsra el mensaje
* que se tiene 2 numeros con las mismas repeticiones
*/
public class ActividadIndividualArr {
	/*
	 * Usaremos las funciones vistas en clases anteriores
	 */
	public static int[] llenarArrEntero(int longitud) {
		int[] arregloLleno = new int[longitud];
		int[] arrExis = { 5, 7, 10, 57, 21 };
		for (int i = 0; i < longitud; i++) {
			// Usaremos los numero randomicos para ubicar los valores de arreglo
			// De manera aleaotria.
			int posAle = (int) (Math.random() * 5);
			arregloLleno[i] = arrExis[posAle];
		}
		return arregloLleno;
	}
	/*
	 * Usaremos otra funcion para imprimir los valores
	 */
	public static void imprimirArrEnt(int[] arrEnt) {
		// Se debe siempre borrar Ln para que quede concatenado correctamente
		System.out.print("El arreglo es {");
		for (int i = 0; i < arrEnt.length - 1; i++) {
			System.out.print(arrEnt[i] + ", ");
		}
		System.out.println(arrEnt[arrEnt.length - 1] + " }");
	}
	

	
	public static int numeroMulti(int[] arregloEntero) {
		int mayor = arregloEntero[0];
		int posArreg =0;
		int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
		
		for(int i =0; i<arregloEntero.length;i++) {
			if(arregloEntero[i]==5) {
				cont1++;
			}
			if(arregloEntero[i]==7) {
				cont2++;
			}
			if(arregloEntero[i]==10) {
				cont3++;
			}
			if(arregloEntero[i]==57) {
				cont4++;
			}
			if(arregloEntero[i]==21) {
				cont5++;
			}
		}
		
		int[] arregloResultado = new int[5];
		arregloResultado[0] = cont1;
		arregloResultado[1] = cont2;
		arregloResultado[2] = cont3;
		arregloResultado[3] = cont4;
		arregloResultado[4] = cont5;
		
		for (int k = 0; k < arregloResultado.length; k++) {
			if (mayor <= arregloResultado[k]) {
				mayor = arregloResultado[k];
				posArreg =k;
			}
		}
		return mayor;
	}
	
	public static void main(String[] args) {
		// Creamos las variables y asignamos valores
		// Creamos un arreglo
		Scanner ingresoDatos = new Scanner(System.in);
		int n = 0, num = 0;
		//Este arreglo será opcupado por la canitad que se repite cada valor
		
		int numMul=0;
		
		System.out.println("El arreglo poseera numero entre el {5,7,10,57,21}");
		System.out.println("Ingrese la longitud que poseera el arreglo");
		n = Integer.parseInt(ingresoDatos.nextLine());
		int[] arrEnt = new int[n];

		// Llamamos una funcion para que llene arreglos entre 0 - 30
		arrEnt = llenarArrEntero(arrEnt.length);

		// Funcion para imprimir los valores
		imprimirArrEnt(arrEnt);

		// Creamos una fucion que para obtener los valores deseados
		System.out.println("Escoga una Opcion");
		System.out.println("1.- El que más se repite multiplicado con las veces que se repita");
		System.out.println("2.- Numero que menos se repita dividido para su repeticion");
		System.out.println("3.- Para conocer si existen numeros con iguales repeticiones");
		num = Integer.parseInt(ingresoDatos.nextLine());

		//Para contar el numero de veces que se repite un valor
		
		//Para encontrar el mayor usaremos otra funcion
		numMul = numeroMulti(arrEnt);
		System.out.println(numMul);
		

	}
	

}
