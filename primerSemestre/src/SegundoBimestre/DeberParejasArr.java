package SegundoBimestre;

import java.util.Arrays;

/*
 * Deber Semana 9
 * Crear un sistema para alamacenar productos perecivles y no perecibles
 * Se necesita una lista de 5 productos percibles y 7 no perecibles**
 * Con esta linea se necesitará llenar 2 arreglos de 100 elementos**
 * Manzana= 0.5
 * Atun =1
 * Un total con el valor de todos los productos perericles  **
 * Un total con el valor de todos los productos no perecibles**
 * Conocer cual es el producto no perecible que más se repite**
 *y el total por este producto
 *Conocer cual es el producto perecible que menos se repite y **
 *el total por este producto
 *Si el total de los productos perecibles es mayor al de los no perecibles se
 *otorgará un 10% de descuento al total general de los productos
 *perecibles y no perecibles
 *Si el total de los porductos perecibles es menor al de los no perecibles se 
 *otorgará un 8% de descuento al total general de los productos
 *perecibles y no perecibles´
 *Mostrar cada uno de los arreglos de la siguiente manera. **
 *{1.- Piña, 2.- Fresa, .... , 100.- Piña} **
 *{1.- atun, 2.- Lenteja, ... , 100.- Tallarin} **
 */
public class DeberParejasArr {

	/*
	 * Funcion definida en clases anteriores para llenar arreglos con los productos
	 * aleatoriamente
	 */
	public static String[] llenarArrString(int longitud) {
		String[] palabrasAUsar = { "Tomate", "Banana", "Queso", "Leche", "Pimienta" };
		String[] arregloResultado = new String[longitud];
		for (int i = 0; i < longitud; i++) {
			// Usaremos 5 en random ya que son 5 productos
			int posiAle = (int) (Math.random() * 5);
			arregloResultado[i] = palabrasAUsar[posiAle];
		}
		return arregloResultado;
	}

	/**
	 * Funcion para reemplazar los productos por sus valores
	 * 
	 * @param arreglo String
	 */
	public static void imprimirArrString(String[] productPerecibles) {
		System.out.print("Arreglo productos perecibles {");

		for (int i = 0; i < productPerecibles.length - 1; i++) {
			System.out.print(i + 1 + ".- " + productPerecibles[i] + ", ");
		}
		// Coloque el .length al final para poder colocar el ultimo numero
		System.out.println(productPerecibles.length + ".- " + productPerecibles[productPerecibles.length - 1] + " }");
	}

	/**
	 * Funcion para reemplazar valores
	 * 
	 * @param arreglo String
	 * @return arreglo Doble
	 */
	public static double[] llenarArrPer(String[] productPerecibles) {
		double[] resultados = new double[productPerecibles.length];
		for (int i = 0; i < productPerecibles.length; i++) {
			// Usaremos If para poder reemplazar los valores en los datos
			if (productPerecibles[i].equals("Tomate")) {
				resultados[i] = 0.15;
			}
			if (productPerecibles[i].equals("Banana")) {
				resultados[i] = 0.1;
			}
			if (productPerecibles[i].equals("Queso")) {
				resultados[i] = 2;
			}
			if (productPerecibles[i].equals("Leche")) {
				resultados[i] = 0.95;
			}
			if (productPerecibles[i].equals("Pimienta")) {
				resultados[i] = 0.5;
			}
		}
		return resultados;
	}

	/**
	 * Funcion para imprimir los valores dobles
	 * 
	 * @param arreglo doubles
	 */
	public static void imprimirArrEnt(double[] valoresDobles) {
		System.out.print("El arreglo de los valores es {");
		for (int i = 0; i < valoresDobles.length - 1; i++) {
			System.out.print(i + 1 + ".- " + valoresDobles[i] + ", ");
		}
		System.out.println(valoresDobles.length + ".-" + valoresDobles[valoresDobles.length - 1] + " }");

	}

	/*
	 * Usamos la misma funcion de arriba sin embargo con otros valores
	 */
	public static String[] llenarArrString2(int longitud) {
		String[] palabrasAUsar = { "Arroz", "Quinua", "Sal", "Arina", "Gelatina", "Frijoles", "Mantequilla" };
		String[] arregloResultado = new String[longitud];
		for (int i = 0; i < longitud; i++) {
			// Recuerde que al ser 7 productos cambia el numero
			int posiAle = (int) (Math.random() * 7);
			arregloResultado[i] = palabrasAUsar[posiAle];
		}
		return arregloResultado;
	}

	// Misma funcion pero reasignando los nombres
	public static void imprimirArrString2(String[] productNoPerecibl) {
		System.out.print("Arreglo productos no perecibles {");
		for (int i = 0; i < productNoPerecibl.length - 1; i++) {
			System.out.print(i + 1 + ".- " + productNoPerecibl[i] + ", ");
		}
		// Coloque el .length al final para poder colocar el ultimo numero
		System.out.println(productNoPerecibl.length + ".- " + productNoPerecibl[productNoPerecibl.length - 1] + " }");

	}

	// Usamos la misma funcion para reasignar valores
	public static double[] llenarArrNP(String[] productNoPerecibl) {
		double[] resultados = new double[productNoPerecibl.length];
		for (int i = 0; i < productNoPerecibl.length; i++) {
			if (productNoPerecibl[i].equals("Arroz")) {
				resultados[i] = 0.55;
			}
			if (productNoPerecibl[i].equals("Quinua")) {
				resultados[i] = 0.75;
			}
			if (productNoPerecibl[i].equals("Sal")) {
				resultados[i] = 0.45;
			}
			if (productNoPerecibl[i].equals("Arina")) {
				resultados[i] = 0.5;
			}
			if (productNoPerecibl[i].equals("Gelatina")) {
				resultados[i] = 1.5;
			}
			if (productNoPerecibl[i].equals("Frijoles")) {
				resultados[i] = 1.25;
			}
			if (productNoPerecibl[i].equals("Mantequilla")) {
				resultados[i] = 1.1;
			}
		}
		return resultados;
	}

	/**
	 * Funcion para suma acumulativa
	 * 
	 * @param Arreglo de double
	 * @return Valor double
	 */
	public static double sumaAcumul(double[] arregloASum) {
		double resultado = 0;

		for (int i = 0; i < arregloASum.length; i++) {
			resultado = resultado + arregloASum[i];
		}
		return resultado;
	}

	public static void repeticionValore(int[] arregloEnt) {
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		for (int i = 0; i < arregloEnt.length; i++) {
			if (arregloEnt[i] == 10) {
				cont1++;
			}
			if (arregloEnt[i] == 2) {
				cont2++;
			}
			if (arregloEnt[i] == 4) {
				cont3++;
			}
			if (arregloEnt[i] == 50) {
				cont4++;
			}
			if (arregloEnt[i] == 7) {
				cont5++;
			}
		}
		System.out.println("El numero 10 se repite " + cont1);
		System.out.println("El numero 2 se repite " + cont2);
		System.out.println("El numero 4 se repite " + cont3);
		System.out.println("El numero 50 se repite " + cont4);
		System.out.println("El numero 7 se repite " + cont5);

	}

	/*
	 * 
	 */
	public static double repeticionValPer(double[] valoresArreglo) {
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		double mayor = valoresArreglo[0];
		for (int i = 0; i < valoresArreglo.length; i++) {
			if (valoresArreglo[i] == 0.15) {
				cont1++;
			}
			if (valoresArreglo[i] == 0.1) {
				cont2++;
			}
			if (valoresArreglo[i] == 2) {
				cont3++;
			}
			if (valoresArreglo[i] == 0.95) {
				cont4++;
			}
			if (valoresArreglo[i] == 0.5) {
				cont5++;
			}
		}
		System.out.println("Tomate se repite " + cont1);
		System.out.println("Banana se repite " + cont2);
		System.out.println("Queso se repite " + cont3);
		System.out.println("Leche se repite " + cont4);
		System.out.println("Pimienta se repite " + cont5);

		for (int k = 0; k < valoresArreglo.length; k++) {
			if (mayor > valoresArreglo[k]) {
				mayor = valoresArreglo[k];
			}
		}
		System.out.println(mayor);
		
		String pro1 = " ";
		if(mayor==0.15) {
			pro1 = "Tomate";
		}if(mayor == 0.1){
			pro1 = "Banana";
		}if(mayor==2) {
			pro1 = "Queso";
		}if(mayor==0.95) {
			pro1 = "Leche";	
		}if(mayor==0.5) {
			pro1= "Pimienta";
		}
		System.out.println("El valor que más se repite es: " + pro1);
		return mayor;
	}

	public static void main(String[] args) {
		// Asignamos y definimos las variables
		String[] productPerecibles = new String[100];
		String[] productNoPerecibl = new String[100];
		double[] valoresPorPere = new double[100];
		double[] valoresPorNoPe = new double[100];

		/*
		 * Llamaremos Funciones para realizar en ambos casos: La primera funcion llena
		 * el arreglo String con valores randoms La siguiente funcion imprimirá los
		 * arreglos La funcion 3 nos permite intercambiar los valores del precio por los
		 * del producto que utilizaremos La ultima funcion imprimirá los valores re
		 * asignados
		 */
		productPerecibles = llenarArrString(productPerecibles.length);
		imprimirArrString(productPerecibles);
		valoresPorPere = llenarArrPer(productPerecibles);
		imprimirArrEnt(valoresPorPere);

		productNoPerecibl = llenarArrString2(productNoPerecibl.length);
		imprimirArrString2(productNoPerecibl);
		valoresPorNoPe = llenarArrNP(productNoPerecibl);
		imprimirArrEnt(valoresPorNoPe);

		double resultSum = sumaAcumul(valoresPorPere);
		double resultSum2 = sumaAcumul(valoresPorNoPe);
		System.out.println("La suma de todos los productos Perecibles es: " + resultSum);
		System.out.println("La suma de todos los productos No Perecibles es: " + resultSum2);

		// Llamamos funcion para saber cual es el que más se repite
		double perecibleMas = repeticionValPer(valoresPorPere);

	} 

}
