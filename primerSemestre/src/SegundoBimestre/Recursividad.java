package SegundoBimestre;

import java.util.Random;
import java.util.Scanner;

/*
 * Recursividad: La recursividad es la propiedad de los metodos tienen para poder
 * llamarse o invocarse a si mismos. La idea detras de la recursividad es que el
 * programados pueda utilizar un mismo metrodo hasta completar o alcanzar un numero
 * de veces determinado para resolver un problema.
 * Hay que tomar en cuenta que la recursividad siemore va a ser FINITA, normalmente 
 * esta va a estar basada en una condicion, sea para los parametros que usa el metodo
 * o condiciones que se necuentres dentro del bloque de codigo de la funcion.
 * 
 * La diferencia entre la recursividad y los civlos repetitivos como el FOR, WHILE, DO-While
 * es que la recursividad se aplica sobre un metodo, mientras los ciclos repetitivos se 
 * aplican sobre variables.
 */

/*
 * Buffer: 0,1,2,3,4,5,6,...
 * 3 tipos: RAM, ROM. FISICA
 */

/*
 * Esta es una clasw para aplicar y entender el concepto de recursividad
 */
public class Recursividad {
	/*
	 * Esta es una clase para aplicar y entender el concepto de recursividad
	 */
	
	public static void encabezado() {
		
		System.out.println("*************************************");
		System.out.println("   	 EL ING. JONATHAN     ");
		System.out.println("	  Programacion 1 ");
		System.out.println();
		System.out.println("************************************");

	}
		
	public static void imprimirValoresTope(int valorInicial, int valorTope) { 
		// vI = 1, vT =5 //vI=2, vT=5 //vI=3, vT=5  //vI=4, vT=5 //vI=5, vT=5 //vI=6,vF=5 F
		if(valorInicial <= valorTope) {
			System.out.print(valorInicial + " ");
			valorInicial++;
			//vI=2, vT=5 //vI=3, vT=5 //vI=4, vT=5 //vI=5,vT=5
			System.out.println();
			System.out.println(valorInicial+" " + valorTope);
			imprimirValoresTope(valorInicial, valorTope);
			//valorInicial++; //Las mismas veces, esta abajo del llamado de la funcion
			/*
			 * Recuerde que cuando se invoca o se llama a la funcion, TODAS las lineas
			 * de codigo se vuelven a ejecutar, esto quiere decir que se vuelven
			 * a crear variables, asignar valores. No se mantiene un registro de los
			 * valores creados anteriormente.
			 */
		}else {
			System.out.println();
			System.out.println("Finalizacion de la Recurividad");
		}
		/*
		 * 
		 */
		System.out.println(valorInicial + " " + valorTope);
		System.out.println("Finalizacion");//Queda pendiente hasta que se cumple al If
		//Cuando finaliza, imprimirá todas las pendientes, en este caso 5+1
		//Compara pero imprime al reves todas las pendientes
	}
	
	public static void imprimirValoresTope(int valorTope) {
		if(valorTope>=1) {
		System.out.print(valorTope + " ");
		valorTope--;
		imprimirValoresTope(valorTope);
		//Por acumulacion de datos
		//System.out.print((valorTope+1) + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner ingresDat= new Scanner(System.in);
		encabezado();
		if(((int)(Math.random()*6)+1)==4) {
			System.out.println("F");
		}else {
			System.out.println(":0");
		}
		//Arrays.sort(null); Ordenar
		/*
		int [] ejemplo = ArreglosUnidimensionales.llenarArrEntero(6);
		System.out.println(Arrays.toString(ejemplo));  //Alvvvvvvv, debe estar en publico la clase
		 */
		System.out.println("Digite el numero hasta donde desea imprimir");
		int valorTope = Integer.parseInt(ingresDat.nextLine());
		//Quitar ln para que imprima en la mismca linea
		for(int i = 1; i<=valorTope; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Metodo Recursivo");
		imprimirValoresTope(1, valorTope); 
		System.out.println("Recursividad con 1 valor");
		imprimirValoresTope(valorTope);
		System.out.println();
		
		
		
	}

	

}
