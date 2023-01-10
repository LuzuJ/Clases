package SegundoBimestre;
/*
 * Integrante:  Jonathan Luzuriaga
 * 				Miguel Mendosa
 */
/*
 * Deber Semana 9
 * Crear un sistema para alamacenar productos perecibles y no perecibles
 * Se necesita una lista de 5 productos percibles y 7 no perecibles**
 * Con esta linea se necesitará llenar 2 arreglos de 100 elementos**
 * Manzana= 0.5
 * Atun =1
 * Un total con el valor de todos los productos perericles  **
 * Un total con el valor de todos los productos no perecibles**
 * Conocer cual es el producto no perecible que más se repite
 *y el total por este producto
 *Conocer cual es el producto perecible que menos se repite y 
 *el total por este producto
 *Si el total de los productos perecibles es mayor al de los no perecibles se
 *otorgará un 10% de descuento al total general de los productos
 *perecibles y no perecibles
 *Si el total de los porductos perecibles es menor al de los no perecibles se 
 *otorgará un 8% de descuento al total general de los productos
 *perecibles y no perecibles´
 *Mostrar cada uno de los arreglos de la siguiente manera. **
 */
public class DeberArreglosEnPares {

	/**
	 * Funcion para llenar arreglo tipo String
	 * @param longitud / longitud del arreglo
	 * @param listaPerecibles 
	 * @return Se retorna arreglo lleno tipo String
	 */
	public static String[] llenarArrString(int longitud, String[] listaPerecibles) {
		String[] arregloResultado = new String[longitud];
		for (int i = 0; i < longitud; i++) {
			
			int posiAle = (int) (Math.random() * listaPerecibles.length);
			arregloResultado[i] = listaPerecibles[posiAle];
		}
		return arregloResultado;
	}
	/**
	 * Funcion sirve para imprimir arreglos de tipo String
	 * @param arreglo String/ Se necesita un arreglo lleno
	 * No retorna nada
	 */
	public static void imprimirArrString(String[] productPerecibles) {
		System.out.print(" {");

		for (int i = 0; i < productPerecibles.length - 1; i++) {
			System.out.print((i+1) + ".- " + productPerecibles[i] + ", ");
		}
		// Coloque el .length al final para poder colocar el ultimo numero
		System.out.println(productPerecibles.length + ".- " + productPerecibles[productPerecibles.length - 1] + " }");
	}
	/**
	 * Funcion para reemplazar el costo del producto en el espacion del arreglo.
	 * @param arreglo String / Se necita un arreglo lleno de productos
	 * @return arreglo Doble / Retorna arreglo con el costo de cada producto
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
	 * Funcion para imprimir los valores de un arreglo tipo doble
	 * @param arreglo doubles / Un arreglo lleno
	 * No retorna nada
	 */
	public static void imprimirArrEnt(double[] valoresDobles) {
		System.out.print("El arreglo de los valores es {");
		for (int i = 0; i < valoresDobles.length - 1; i++) {
			System.out.print(i + 1 + ".- " + valoresDobles[i] + ", ");
		}
		System.out.println(valoresDobles.length + ".-" + valoresDobles[valoresDobles.length - 1] + " }");

	}
	/**
	 * Funcion para reemplazar el costo del producto en el espacion del arreglo.
	 * @param arreglo String / Se necita un arreglo lleno de productos
	 * @return arreglo Doble / Retorna arreglo con el costo de cada producto
	 */
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
			if (productNoPerecibl[i].equals("Harina")) {
				resultados[i] = 0.5;
			}
			if (productNoPerecibl[i].equals("Gelatina")) {
				resultados[i] = 1.5;
			}
			if (productNoPerecibl[i].equals("Atun")) {
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
	 * @param Se necesita un arreglo double
	 * @return Valor double
	 */
	public static double sumaAcumul(double[] arregloASum) {
		double resultado = 0;
		for (int i = 0; i < arregloASum.length; i++) {
			resultado = resultado + arregloASum[i];
		}
		return resultado;
	}
	/**
	 * Funcion para encontrar el valor menor de los perecibles y operar las minima repeticion con el costo del producto.
	 * @param valoresArreglo / Se necesita los costos de los productos
	 * @param length / La longitud del arreglo
	 * @return El resultado de la operacion.
	 */
	public static double repeticionValPer(double[] valoresArreglo, int length) {
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		int[] numeroRepeticiones = new int [length];
		double resultado = 0;
		for (int i = 0; i < valoresArreglo.length; i++) {
			if (valoresArreglo[i] == 0.15) {
				cont1++;
				numeroRepeticiones[0] = cont1;
			}
			if (valoresArreglo[i] == 0.1) {
				cont2++;
				numeroRepeticiones[1] = cont2;
			}
			if (valoresArreglo[i] == 2) {
				cont3++;
				numeroRepeticiones[2] = cont3;
			}
			if (valoresArreglo[i] == 0.95) {
				cont4++;
				numeroRepeticiones[3] = cont4;
			}
			if (valoresArreglo[i] == 0.5) {
				cont5++;
				numeroRepeticiones[4] = cont5;
			}
		}
		System.out.println("Tomate se repite " + cont1);
		System.out.println("Banana se repite " + cont2);
		System.out.println("Queso se repite " + cont3);
		System.out.println("Leche se repite " + cont4);
		System.out.println("Pimienta se repite " + cont5);
	
		//Esto sirve para encontrar el producto que menos se repite
		double menor = numeroRepeticiones[0];
		for (int k = 0; k < numeroRepeticiones.length; k++) {
			if (menor >= numeroRepeticiones[k]) {
				menor = numeroRepeticiones[k];
			}
		}
		String pro2 = "";
		if(menor==cont1) {
			pro2 = "Tomate";
		}if(menor == cont2){
			pro2 = "Banana";
		}if(menor==cont3) {
			pro2 = "Queso";
		}if(menor==cont4) {
			pro2 = "Leche";	
		}if(menor==cont5) {
			pro2= "Pimienta";
		}
		System.out.println("El producto perecible que menos se repite es: " + pro2);
		
		//Esto es para operar el total de repeticiones minimas con el costo del producto
		if(menor == cont1) {
			resultado = menor * 0.15;
		}else if(menor == cont2) {
			resultado = menor * 0.1;
		}else if(menor == cont3) {
			resultado = menor * 2;
		}else if (menor == cont4) {
			resultado = menor * 0.95;
		}else if (menor == cont5) {
			resultado = menor * 0.5;
		}
		return resultado;
	}
	/**
	 * Funcion para encontrar el valor mayor de los No perecibles y operar las maxima repeticion con el costo del producto.
	 * @param valoresArreglo / Se necesita los costos de los productos
	 * @param length / La longitud del arreglo
	 * @return El resultado de la operacion.
	 */
	public static double repeticionValNoPer(double[] valoresArreglo, int length) {
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 =0, cont6=0, cont7=0;
		int[] numeroRepeticiones = new int [length];
		double resultado = 0;
		for (int i = 0; i < valoresArreglo.length; i++) {
			if (valoresArreglo[i] == 0.55) {
				cont1++;
				numeroRepeticiones[0] = cont1;
			}
			if (valoresArreglo[i] == 0.75) {
				cont2++;
				numeroRepeticiones[1] = cont2;
			}
			if (valoresArreglo[i] == 0.45) {
				cont3++;
				numeroRepeticiones[2] = cont3;
			}
			if (valoresArreglo[i] == 0.5) {
				cont4++;
				numeroRepeticiones[3] = cont4;
			}
			if (valoresArreglo[i] == 1.5) {
				cont5++;
				numeroRepeticiones[4] = cont5;
			}
			if (valoresArreglo[i] == 1.25) {
				cont6++;
				numeroRepeticiones[5] = cont6;
			}
			if (valoresArreglo[i] == 1.1) {
				cont7++;
				numeroRepeticiones[6] = cont7;
			}
		}
		System.out.println("Arroz se repite " + cont1);
		System.out.println("Quinua se repite " + cont2);
		System.out.println("Sal se repite " + cont3);
		System.out.println("Harina se repite " + cont4);
		System.out.println("Gelatina se repite " + cont5);
		System.out.println("Atun se repite " + cont6);
		System.out.println("Mantequilla se repite " + cont7);
	
		//Esto sirve para encontrar el producto que mas se repite
		double mayor = numeroRepeticiones[0];
		for (int k = 0; k < numeroRepeticiones.length; k++) {
			if (mayor <= numeroRepeticiones[k]) {
				mayor = numeroRepeticiones[k];
			}
		}
		String pro2 = "";
		if(mayor==cont1) {
			pro2 = "Arroz";
		}if(mayor == cont2){
			pro2 = "Quinua";
		}if(mayor==cont3) {
			pro2 = "Sal";
		}if(mayor==cont4) {
			pro2 = "Harina";	
		}if(mayor==cont5) {
			pro2= "Gelatina";
		}if(mayor==cont6) {
			pro2= "Atun";
		}if(mayor==cont7) {
			pro2= "Mantequilla";
		}
		System.out.println("El producto perecible que mas se repite es: " + pro2);
		
		//Esto es para operar el total de repeticiones maximas con el costo del producto
		if(mayor == cont1) {
			resultado = mayor * 0.55;
		}else if(mayor == cont2) {
			resultado = mayor * 0.75;
		}else if(mayor == cont3) {
			resultado = mayor * 0.45;
		}else if (mayor == cont4) {
			resultado = mayor * 0.5;
		}else if (mayor == cont5) {
			resultado = mayor * 1.5;
		}else if (mayor == cont6) {
			resultado = mayor * 1.25;
		}else if (mayor == cont7) {
			resultado = mayor * 1.1;
		}
		return resultado;
	}
	/**
	 * Funcion para encontrar el valor total mayor entre productos perecibles y no perecible y aplicarle 
	 * al total general un 10% de descuento.
	 * @param resultSum / Costo total perecibles
	 * @param resultSum2 / Costo total no perecibles
	 * No retorna nada
	 */
	public static void totalProPerMayorDescuento(double resultPerecibles, double resultNoPerecibles) {
		double resultado;
		if(resultPerecibles > resultNoPerecibles) {
			resultado = (resultPerecibles + resultNoPerecibles)*0.9;
			System.out.println("Perecible mayor a No perecibles");
			System.out.println("El valor total general a pagar es de "+resultado+" $");
		}
		
	}
	/**
	 * Funcion para encontrar el valor total menor entre productos perecibles y no perecible y aplicarle 
	 * al total general un 10% de descuento.
	 * @param resultSum / Costo total perecibles
	 * @param resultSum2 / Costo total no perecibles
	 * No retorna nada
	 */
	public static void totalProPerMenorDescuento(double resultPerecibles, double resultNoPerecibles) {
		double resultado;
		if(resultPerecibles < resultNoPerecibles) {
			resultado = (resultPerecibles + resultNoPerecibles)*0.92;
			System.out.println("Perecible menor a No perecibles");
			System.out.println("El valor total general a pagar es de "+resultado+" $");
		}
	}
	public static void main(String[] args) {
		// Asignamos y definimos las variables
		String[] listaNoPerecibles = {"Arroz", "Quinua", "Sal", "Harina", "Gelatina", "Atun", "Mantequilla"};
		String[] listaPerecibles = {"Tomate", "Banana", "Queso", "Leche", "Pimienta"};
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
		productPerecibles = llenarArrString(productPerecibles.length, listaPerecibles);
		System.out.print("Arreglo productos Perecibles");
		imprimirArrString(productPerecibles);
		valoresPorPere = llenarArrPer(productPerecibles);
		imprimirArrEnt(valoresPorPere);

		productNoPerecibl = llenarArrString(productNoPerecibl.length, listaNoPerecibles);
		System.out.print("Arreglo productos No Perecibles");
		imprimirArrString(productNoPerecibl);
		valoresPorNoPe = llenarArrNP(productNoPerecibl);
		imprimirArrEnt(valoresPorNoPe);

		double resultSum = sumaAcumul(valoresPorPere);
		double resultSum2 = sumaAcumul(valoresPorNoPe);
		System.out.println("La suma de todos los productos Perecibles es: " + resultSum +" $");
		System.out.println("La suma de todos los productos No Perecibles es: " + resultSum2+" $");

		// Llamamos funcion para saber cual es el que más se repite
		System.out.println("------------------------------------------------------------------------");
		double perecibleMenos = repeticionValPer(valoresPorPere, listaPerecibles.length);
		System.out.println("El costo total del producto que menos se repite es: "+perecibleMenos+" $");
		System.out.println("------------------------------------------------------------------------");
		double perecibleMas = repeticionValNoPer(valoresPorNoPe, listaNoPerecibles.length);
		System.out.println("El costo total del producto que mas se repite es: "+perecibleMas+" $");
		System.out.println("------------------------------------------------------------------------ ");
		//Llamar funcion para encontrar el valor total mayor entre productos perecibles y no perecible y aplicarle
		//al total general un 10% de descuento.
		totalProPerMayorDescuento(resultSum, resultSum2);
		totalProPerMenorDescuento(resultSum, resultSum2);	
	}
}
