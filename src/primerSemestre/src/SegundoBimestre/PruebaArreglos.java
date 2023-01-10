package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Prueba 3 
 * Perecibles: pina ($0.80), papaya ($0.750), duraznos ($0.90), aceitunas ($2.80), cebolla ($0.35)
 * 	No perecibles: atún ($1.20), fideos ($2.40), lentejas ($3.20), frejol ($1.70), maicena ($0.80).
 * De limpieza: acetona ($0.80), jabón ($1.80), pasta dental ($2.20), desodorante ($4.80), perfume ($5.80).  

 */
public class PruebaArreglos {

	/**
	 * Funcion para llenar los arreglos de manera aleatoria
	 * 
	 * @param arregloString
	 * @param longitud
	 * @return arreglo con valores aleatorios
	 */
	public static String[] llenarArrString(String[] arregloString, int longitud) {
		String[] arregloResultado = new String[longitud];
		for (int i = 0; i < longitud; i++) {
			int posiAle = (int) (Math.random() * arregloString.length);
			arregloResultado[i] = arregloString[posiAle];
		}
		return arregloResultado;
	}

	/**
	 * Funcion para imprimir los arreglos String
	 * 
	 * @param arreglString
	 */
	public static void imprimirArreglo(String[] arreglString) {
		System.out.print(" {");

		for (int i = 0; i < arreglString.length - 1; i++) {
			System.out.print((i + 1) + ".- " + arreglString[i] + ", ");
		}
		// Coloque el .length al final para poder colocar el ultimo numero
		System.out.println(arreglString.length + ".- " + arreglString[arreglString.length - 1] + " }");
	}

	/*
	 * Utilice más funciones por ser especificas
	 */
	/**
	 * Funcion para intercambiar algun valor del arreglo
	 * 
	 * @param arreglo  String
	 * @param posicion -1
	 * @param que      desea cambiar
	 * @return arreglo nuevo
	 */
	public static String[] llenarArrString(String[] arregloAtrin, int valoIn, String product) {
		String[] resultado = arregloAtrin;
		if (valoIn <= 35) {
			if (product.equals("piña")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("papaya")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("durazno")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("aceitunas")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("cebolla")) {
				arregloAtrin[valoIn - 1] = product;
			}

		} else {
			System.out.println("No es una posicion valida");
		}
		return resultado;
	}

	/**
	 * Funcion para intercambiar algun valor del arreglo
	 * 
	 * @param arreglo  String
	 * @param posicion -1
	 * @param que      desea cambiar
	 * @return arreglo nuevo
	 */
	public static String[] llenarArrString2(String[] arregloAtrin, int valoIn, String product) {
		String[] resultado = arregloAtrin;
		if (valoIn <= 35) {
			if (product.equals("atun")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("fideos")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("lentejas")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("frejol")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("maicena")) {
				arregloAtrin[valoIn - 1] = product;
			}

		} else {
			System.out.println("No es una posicion valida");
		}
		return resultado;
	}

	/**
	 * Funcion para intercambiar algun valor del arreglo
	 * 
	 * @param arreglo  String
	 * @param posicion -1
	 * @param que      desea cambiar
	 * @return arreglo nuevo
	 */
	public static String[] llenarArrString3(String[] arregloAtrin, int valoIn, String product) {
		String[] resultado = arregloAtrin;
		if (valoIn <= 35) {
			if (product.equals("acetona")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("jabon")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("pasta dental")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("desodorante")) {
				arregloAtrin[valoIn - 1] = product;
			}
			if (product.equals("perfume")) {
				arregloAtrin[valoIn - 1] = product;
			}

		} else {
			System.out.println("No es una posicion valida");
		}
		return resultado;
	}

	/**
	 * Funcion para llenar con precions
	 * 
	 * @param arreglo String
	 * @return arreglo double
	 */
	public static double[] llenarArrVal1(String[] productPerecibles) {
		double[] resultados = new double[productPerecibles.length];
		for (int i = 0; i < productPerecibles.length; i++) {
			// Usaremos If para poder reemplazar los valores en los datos
			if (productPerecibles[i].equals("piña")) {
				resultados[i] = 0.80;
			}
			if (productPerecibles[i].equals("papaya")) {
				resultados[i] = 0.750;
			}
			if (productPerecibles[i].equals("duraznos")) {
				resultados[i] = 0.90;
			}
			if (productPerecibles[i].equals("aceituna")) {
				resultados[i] = 2.80;
			}
			if (productPerecibles[i].equals("cebolla")) {
				resultados[i] = 0.35;
			}
		}
		return resultados;
	}

	/**
	 * Funcion para llenar con precions
	 * 
	 * @param arreglo String
	 * @return arreglo double
	 */
	public static double[] llenarArrPVal2(String[] productNoPerecibles) {
		double[] resultados = new double[productNoPerecibles.length];
		for (int i = 0; i < productNoPerecibles.length; i++) {
			// Usaremos If para poder reemplazar los valores en los datos
			if (productNoPerecibles[i].equals("atun")) {
				resultados[i] = 1.20;
			}
			if (productNoPerecibles[i].equals("fideos")) {
				resultados[i] = 2.40;
			}
			if (productNoPerecibles[i].equals("lentejas")) {
				resultados[i] = 3.20;
			}
			if (productNoPerecibles[i].equals("frejol")) {
				resultados[i] = 1.70;
			}
			if (productNoPerecibles[i].equals("maicena")) {
				resultados[i] = 0.80;
			}
		}
		return resultados;
	}

	/**
	 * Funcion para llenar con precions
	 * 
	 * @param arreglo String
	 * @return arreglo double
	 */
	public static double[] llenarArrVal3(String[] productdeLimpieza) {
		double[] resultados = new double[productdeLimpieza.length];
		for (int i = 0; i < productdeLimpieza.length; i++) {
			// Usaremos If para poder reemplazar los valores en los datos
			if (productdeLimpieza[i].equals("acetona")) {
				resultados[i] = 0.80;
			}
			if (productdeLimpieza[i].equals("jabon")) {
				resultados[i] = 1.80;
			}
			if (productdeLimpieza[i].equals("pasta dental")) {
				resultados[i] = 2.20;
			}
			if (productdeLimpieza[i].equals("desodorante")) {
				resultados[i] = 4.80;
			}
			if (productdeLimpieza[i].equals("perfume")) {
				resultados[i] = 5.80;
			}
		}
		return resultados;
	}

	/**
	 * Funcion para imprimir lso precios
	 * 
	 * @param valoresDobles
	 */
	public static void imprimirArrPrec(double[] valoresDobles) {
		System.out.print("El arreglo de los valores es {");
		for (int i = 0; i < valoresDobles.length - 1; i++) {
			System.out.print(i + 1 + ".- " + valoresDobles[i] + ", ");
		}
		System.out.println(valoresDobles.length + ".-" + valoresDobles[valoresDobles.length - 1] + " }");

	}

	public static double sumaAcumul(double[] arregloASum) {
		double resultado = 0;
		for (int i = 0; i < arregloASum.length; i++) {
			resultado = resultado + arregloASum[i];
		}
		return resultado;
	}

	/**
	 * Funcion para conocer al que más se repite
	 * 
	 * @param Arreglo double
	 * @param length
	 * @return numero mayor
	 */
	public static double repeticionValPer(double[] valoresPere, int length) {
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		int[] numeroRepeticiones = new int[length];
		double resultado = 0;
		for (int i = 0; i < valoresPere.length; i++) {
			if (valoresPere[i] == 0.80) {
				cont1++;
				numeroRepeticiones[0] = cont1;
			}
			if (valoresPere[i] == 0.750) {
				cont2++;
				numeroRepeticiones[1] = cont2;
			}
			if (valoresPere[i] == 0.90) {
				cont3++;
				numeroRepeticiones[2] = cont3;
			}
			if (valoresPere[i] == 2.80) {
				cont4++;
				numeroRepeticiones[3] = cont4;
			}
			if (valoresPere[i] == 0.35) {
				cont5++;
				numeroRepeticiones[4] = cont5;
			}
		}
		System.out.println("piña se repite " + cont1);
		System.out.println("papaya se repite " + cont2);
		System.out.println("duraznos se repite " + cont3);
		System.out.println("aceitunas se repite " + cont4);
		System.out.println("cebollas se repite " + cont5);

		// Esto sirve para encontrar el producto que menos se repite
		double mayor = numeroRepeticiones[0];
		for (int k = 0; k < numeroRepeticiones.length; k++) {
			if (mayor <= numeroRepeticiones[k]) {
				mayor = numeroRepeticiones[k];
			}
		}
		String pro2 = "";
		if (mayor == cont1) {
			pro2 = "piña";
		}
		if (mayor == cont2) {
			pro2 = "papaya";
		}
		if (mayor == cont3) {
			pro2 = "duraznos";
		}
		if (mayor == cont4) {
			pro2 = "aceitunas";
		}
		if (mayor == cont5) {
			pro2 = "cebolla";
		}
		System.out.println("El producto perecible que menos se repite es: " + pro2);

		// Esto es para operar el total de repeticiones minimas con el costo del
		// producto
		if (mayor == cont1) {
			resultado = mayor * 0.80;
		} else if (mayor == cont2) {
			resultado = mayor * 0.750;
		} else if (mayor == cont3) {
			resultado = mayor * 0.90;
		} else if (mayor == cont4) {
			resultado = mayor * 2.80;
		} else if (mayor == cont5) {
			resultado = mayor * 0.35;
		}
		return resultado;

	}

	/**
	 * Funcion para conocer al que más se repite
	 * 
	 * @param Arreglo double
	 * @param length
	 * @return numero mayor
	 */
	public static double repeticionValPer2(double[] valoresnoPere, int length) {

		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		int[] numeroRepeticiones = new int[length];
		double resultado = 0;
		for (int i = 0; i < valoresnoPere.length; i++) {
			if (valoresnoPere[i] == 1.20) {
				cont1++;
				numeroRepeticiones[0] = cont1;
			}
			if (valoresnoPere[i] == 2.40) {
				cont2++;
				numeroRepeticiones[1] = cont2;
			}
			if (valoresnoPere[i] == 3.20) {
				cont3++;
				numeroRepeticiones[2] = cont3;
			}
			if (valoresnoPere[i] == 1.70) {
				cont4++;
				numeroRepeticiones[3] = cont4;
			}
			if (valoresnoPere[i] == 0.80) {
				cont5++;
				numeroRepeticiones[4] = cont5;
			}
		}
		System.out.println("atun se repite " + cont1);
		System.out.println("fideos se repite " + cont2);
		System.out.println("lentejas se repite " + cont3);
		System.out.println("frejol se repite " + cont4);
		System.out.println("maicena se repite " + cont5);

		// Esto sirve para encontrar el producto que menos se repite
		double mayor = numeroRepeticiones[0];
		for (int k = 0; k < numeroRepeticiones.length; k++) {
			if (mayor <= numeroRepeticiones[k]) {
				mayor = numeroRepeticiones[k];
			}
		}
		String pro2 = "";
		if (mayor == cont1) {
			pro2 = "atun";
		}
		if (mayor == cont2) {
			pro2 = "fideos";
		}
		if (mayor == cont3) {
			pro2 = "lentejas";
		}
		if (mayor == cont4) {
			pro2 = "frejol";
		}
		if (mayor == cont5) {
			pro2 = "maicena";
		}
		System.out.println("El producto perecible que menos se repite es: " + pro2);

		// Esto es para operar el total de repeticiones minimas con el costo del
		// producto
		if (mayor == cont1) {
			resultado = mayor * 1.20;
		} else if (mayor == cont2) {
			resultado = mayor * 2.40;
		} else if (mayor == cont3) {
			resultado = mayor * 3.20;
		} else if (mayor == cont4) {
			resultado = mayor * 1.70;
		} else if (mayor == cont5) {
			resultado = mayor * 0.;
		}
		return resultado;

	}

	/**
	 * Funcion para conocer al que más se repite
	 * 
	 * @param Arreglo double
	 * @param length
	 * @return numero mayor
	 */
	public static double repeticionValPer3(double[] valDeLimpi, int length) {

		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		int[] numeroRepeticiones = new int[length];
		double resultado = 0;
		for (int i = 0; i < valDeLimpi.length; i++) {
			if (valDeLimpi[i] == 0.80) {
				cont1++;
				numeroRepeticiones[0] = cont1;
			}
			if (valDeLimpi[i] == 1.80) {
				cont2++;
				numeroRepeticiones[1] = cont2;
			}
			if (valDeLimpi[i] == 2.20) {
				cont3++;
				numeroRepeticiones[2] = cont3;
			}
			if (valDeLimpi[i] == 4.80) {
				cont4++;
				numeroRepeticiones[3] = cont4;
			}
			if (valDeLimpi[i] == 5.80) {
				cont5++;
				numeroRepeticiones[4] = cont5;
			}
		}
		System.out.println("acetona se repite " + cont1);
		System.out.println("jabon se repite " + cont2);
		System.out.println("pasta dental se repite " + cont3);
		System.out.println("desodorante se repite " + cont4);
		System.out.println("perfume se repite " + cont5);

		// Esto sirve para encontrar el producto que menos se repite
		double mayor = numeroRepeticiones[0];
		for (int k = 0; k < numeroRepeticiones.length; k++) {
			if (mayor <= numeroRepeticiones[k]) {
				mayor = numeroRepeticiones[k];
			}
		}
		String pro2 = "";
		if (mayor == cont1) {
			pro2 = "acetona";
		}
		if (mayor == cont2) {
			pro2 = "jabon";
		}
		if (mayor == cont3) {
			pro2 = "pasta dental";
		}
		if (mayor == cont4) {
			pro2 = "desodorante";
		}
		if (mayor == cont5) {
			pro2 = "perfume";
		}
		System.out.println("El producto perecible que menos se repite es: " + pro2);

		// Esto es para operar el total de repeticiones minimas con el costo del
		// producto
		if (mayor == cont1) {
			resultado = mayor * 0.80;
		} else if (mayor == cont2) {
			resultado = mayor * 1.80;
		} else if (mayor == cont3) {
			resultado = mayor * 2.20;
		} else if (mayor == cont4) {
			resultado = mayor * 4.80;
		} else if (mayor == cont5) {
			resultado = mayor * 5.80;
		}
		return resultado;

	}

	/**
	 * Funcion para generar una matriz
	 * 
	 * @param arreglo perecibles
	 * @param arreglo no perecibles
	 * @param arreglo de limpieza
	 * @return matriz
	 */
	public static double[][] impirmirMate(double[] valoresPere, double[] valNoPerec, double[] valDeLimpi) {
		double[][] nuevaMatr = { valoresPere, valNoPerec, valDeLimpi };
		for (double[] matNue : nuevaMatr) {
			for (double i : matNue) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
		return nuevaMatr;
	}

	/**
	 * Funcion para irprimir arreglos doubles
	 * 
	 * @param nueva matriz
	 */
	public static void imprimirMatNue(double[][] nuevaMat) {
		for (double[] elemeChar : nuevaMat) {
			System.out.println(Arrays.toString(elemeChar));
		}

	}

	/**
	 * Funcion para suamr
	 * 
	 * @param nuevaMat
	 * @return
	 */
	public static double sumaAcumul4(double[][] nuevaMat) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Scanner ingresoDat = new Scanner(System.in);
		boolean bandera = true;
		String ing = " ";
		String[] perecibles = { "piña", "papaya", "duraznos", "aceitunas", "cebolla" };
		String[] noPerecibles = { "atun", "fideos", "lentejas", "frejol", "maicena" };
		String[] deLimpieza = { "acetona", "jabon", "pasta dental", "desodorante" };
		String[] pereCargad = new String[35];
		String[] noPereCard = new String[35];
		String[] deLimpCard = new String[35];
		String[] pereCargad2 = new String[35];
		String[] noPereCard2 = new String[35];
		String[] deLimpCard2 = new String[35];
		double[] valoresPere = new double[35];
		double[] valNoPerec = new double[35];
		double[] valDeLimpi = new double[35];

		// Creamos funciones de llenado para poder usarlos más adelante
		pereCargad = llenarArrString(perecibles, pereCargad.length);
		noPereCard = llenarArrString(noPerecibles, noPereCard.length);
		deLimpCard = llenarArrString(deLimpieza, deLimpCard.length);

		/*
		 * While if y switch para poder repetir el menu y que siga funcionando hasta que
		 * el usuario haci lo desee
		 */
		System.out.println("ES NECESARIO QUE INGRESE EL OBLIGATORIAMENTE");
		while (bandera == true) {
			System.out.println("Ingrese si si desea continuar");
			ing = ingresoDat.nextLine().toLowerCase();
			if (ing.equals("si")) {
				System.out.println("Ingrese que opeacion desea hacer");
				System.out.println("1. Para ingresar 6 productos restantes");
				System.out.println("2. Para calcular el valor total");
				System.out.println("3. Cual producto es el que más se repite de cada agrupacion");
				System.out.println("4. El producto que más se repite de toda la agrupacion");
				System.out.println("5. El valor total de la agrupacion");
				System.out.println("6. Desea cambiar algun producto?");
				int opcMe = Integer.parseInt(ingresoDat.nextLine());
				switch (opcMe) {
				case 1:
					System.out.println("Ingrese los dos ultimos valores de el grupo que desea");
					System.out.println("A que grupo desea agregar los productos?");
					String ciudad = ingresoDat.nextLine().toLowerCase();
					if (ciudad.equals("perecibles")) {
						System.out.println("Ingrese 34 o 35 para cambiar el producto por:");
						int valoIn = Integer.parseInt(ingresoDat.nextLine());
						System.out.println("piña, papaya, durazno, aceitunas, cebollas");
						System.out.println("Que producto desea que este");
						String product = ingresoDat.nextLine();
						pereCargad2 = llenarArrString(pereCargad, valoIn, product);
						imprimirArreglo(pereCargad2);

					}

					if (ciudad.equals("no perecibles")) {
						System.out.println("Ingrese 34 o 35 para cambiar el producto por:");
						int valoIn = Integer.parseInt(ingresoDat.nextLine());
						System.out.println("atun, fideos, lentejas, frejol, maicena");
						System.out.println("Que producto desea que este");
						String product = ingresoDat.nextLine();
						noPereCard2 = llenarArrString2(noPereCard, valoIn, product);
						imprimirArreglo(noPereCard2);
					}

					if (ciudad.equals("de limpieza")) {
						System.out.println("Ingrese 34 o 35 para cambiar el producto por:");
						int valoIn = Integer.parseInt(ingresoDat.nextLine());
						System.out.println("acetona, jabon, pasta dental, desodorante, perfume");
						System.out.println("Que producto desea que este");
						String product = ingresoDat.nextLine();
						deLimpCard2 = llenarArrString3(deLimpCard, valoIn, product);
						imprimirArreglo(deLimpCard2);
					}

					break;
				case 2:

					valoresPere = llenarArrVal1(pereCargad2);
					imprimirArrPrec(valoresPere);
					valNoPerec = llenarArrPVal2(noPereCard2);
					imprimirArrPrec(valNoPerec);
					valDeLimpi = llenarArrVal3(deLimpCard2);
					imprimirArrPrec(valDeLimpi);

					// Funcion para conocer el total de los productos
					double resultSum = sumaAcumul(valoresPere);
					System.out.println("El total del arreglo es: " + resultSum);
					double resultSumA = sumaAcumul(valNoPerec);
					System.out.println("El total del arreglo es: " + resultSumA);
					double resultSumB = sumaAcumul(valDeLimpi);
					System.out.println("El total del arreglo es: " + resultSumB);

					break;

				case 3:
					// funcino para el que más se repite
					System.out.println("Perecibles");
					double perecibleMas = repeticionValPer(valoresPere, perecibles.length);
					System.out.println("El costo total del producto que mas se repite es: " + perecibleMas + " $");

					System.out.println("No perecibles");
					double noPerecibleMas = repeticionValPer2(valNoPerec, noPerecibles.length);
					System.out.println("El costo total del producto que mas se repite es: " + noPerecibleMas + " $");

					System.out.println("De limpieza");
					double deLimpiezaMas = repeticionValPer3(valDeLimpi, valDeLimpi.length);
					System.out.println("El costo total del producto que mas se repite es: " + deLimpiezaMas + " $");
					break;

				case 4:
					double[][] nuevaMat = impirmirMate(valoresPere, valNoPerec, valDeLimpi);
					imprimirMatNue(nuevaMat);

					break;
				case 5:
					double resultSumM = sumaAcumul4(nuevaMat);
					break;
				case 6:

					break;
				default:
					System.out.println("Ingrese un valor correcto");
					break;
				}

			} else {
				System.out.println("Gracias por preferirnos");
				bandera = false;
			}
		}

	}

}
