/*
 * Este programa es la introduccion a las condicionales, conocidos como "Si" en
 * el seudocodigo.
 */
public class Condicionales {

	public static void main(String[] args) {
		/*
		 * Para realizar un condicional se utiliará la palabra restrictiva IF cuando
		 * tenemos solo una ejecucucion, o podemos utilizar su complemento a traves de
		 * un IF - ELSE
		 */

		// Definicion de variables
		int numCom1, numCom2, numCom3, resultadoGlobal;
		String textCom1, textCom2, textCom3;
		char chatCom1, chatCom2, chatCom3;

		// Asignacion de varibales
		numCom1 = 10;
		numCom2 = 7;
		numCom3 = 10;
		resultadoGlobal = 0;
		textCom1 = "Hola";
		textCom2 = "Adios";
		textCom3 = "Programación";
		chatCom1 = 'a';
		chatCom2 = '"';
		chatCom3 = '@';

		/*
		 * Para crear se ouede crear a traves de condiciones simples o complejas
		 * Adicional, se pueden tratar cada una de estas como una sola condicion a
		 * realizar.
		 */
		/*
		 * Esto es una condicion individual la cual evalua una condicion logica y si
		 * esta es verdadera se ejecuta el bloque de codigo interno de la misma.
		 */
		/*
		 * Sentencia de codigo: Es una linea de cogido, la cual esta creada para
		 * ejecutar una y solo una accion. Esta va a estar limitada siempre por un ";"
		 * al final de la misma. Bloque de codigo: Es una agrupacion de una a varias
		 * sentencias de codigos. Es decir que en un bloque de codigo se puede realizar
		 * una o varias operaciones. Los bloques de codigo estan delimitados a traves de
		 * las llaves "{}", es decir, todo loq ue encierre las llaves sera considerado
		 * como un bloque. Variables Globles:Es una variable que se crea en el bloque de
		 * codigo principal estas variables se pueden utilizar a lo largo de todo el
		 * programa
		 * 
		 * Variables Locales: Es una variable creada dentro de un bloque de codigo. Esta
		 * variable solo puede ser utilizada dentro del mismo. Es decir, fuera de ese
		 * bloque o variable no es reconocida y no se puede operar con ella.
		 */
		if (numCom1 > numCom2) {
			// La asignacion será solo para este bloque
			resultadoGlobal = numCom1 + numCom2;
			System.out.println("El numero " + numCom1 + " es mayor que " + numCom2);
			System.out.println("Esta es una linea adicional de impresion");
			System.out.println(resultadoGlobal);
		}
		/*
		 * Recuerda: En diferentes bloques de codigos se puede tener una variable local
		 * con el mismo nombre. Estas varaibles solo se pueden utilizar dentro del
		 * bloque de codigo donde fueron creadas.
		 */
		if (numCom2 < numCom3) {
			int resultadoLocal = numCom1 + numCom2;
		}
		/*
		 * Asignacion: dar un valor a una variable, se utiliza el simbolo "="
		 * Comparacion: Es la evaluacion de una condicion lógica. Para comparar si dos
		 * valores son iguales se utilizará la condicion de simbolos "=="
		 */

		if (numCom1 == numCom3) {
			System.out.println("El numero " + numCom1 + " es igual " + numCom3);
		}

		/*
		 * Comparaciones Individuales como comparaciones compuestas. "Y" lógico: Es
		 * necesario que ambas condiciones sean verdad para que el resutado sea
		 * verdadero. En los lenguajes de programacion para denotar el condicional "Y"
		 * se utilizará el "&&" shift+6 "O" logico: Con que una de las condiciones sea
		 * verdadera, el resultado va a ser verdadero. En los lenguajes de programacion
		 * para denotar el condicional "o" se utiliza el simbolo "||" Alt+1
		 */
		// Condicion compleja usando "Y" logico
		if ((numCom1 > numCom2) && (numCom2 < numCom3)) {
			System.out.println("Mi primer condicion compuesta");
		}
		// Condicion compleja usando"O logico"
		if ((numCom1 < numCom2) || (numCom2 < numCom3)) {
			System.out.println("Mi segunda condicion compuesta");
		}
		// Condicion compleja usando "Y" logico
		if ((numCom1 == numCom1) && (numCom2 == numCom2)) {
			System.out.println("Mi tercera condicion compuesta");
		}
		// Condicon compleja usando "O" logico
		if ((numCom1 == numCom1) || (numCom2 == numCom2)) {
			System.out.println("Mi cuarta condicion compuesta");
		}

		/*
		 * Condiciones si entonces - sino: En estas condiciones se utilizaran dos
		 * bloques de codigo Un bloque para el si-entonces, y otro para el si no Si
		 * entonces -> if si no -> else
		 */
		// If anidados conticiones simples
		// "Y" logico
		if ((numCom1 > numCom2) && (numCom2 > numCom3)) {
			System.out.println("Valor condicion verdadera");
		} else {
			System.out.println("Valor condicion falsa");
		}
		// "O" logico
		if ((numCom1 > numCom2) || (numCom2 > numCom3)) { // Aqui verdad por que es o
			System.out.println("Valor condicion verdadera");
		} else {
			System.out.println("Valor condicion falsa");
		}
		/*
		 * IF anidados: Son condiciones que se encuentran dentro de otras condiciones.
		 * Estos elementos nos sirven para realizar comparaciones basadas en resultados
		 * precios, es decir que se debe obtener un valor verdadero previamente para
		 * poder ejecutar otra condicion.
		 */
		// If anidados condiciones compuestas
		if (numCom1 > numCom2) {
			System.out.println("previo a mi primer if anidado");
			if (numCom2 > numCom3) {
				System.out.println("Previo a mi segundo if anidado");
				resultadoGlobal = numCom1 + numCom2;
				System.out.println(resultadoGlobal);
				if (numCom1 < numCom3) {
					resultadoGlobal = numCom2 + numCom3;
					System.out.println(resultadoGlobal + " resultado interno");
				} else {
					System.out.println("else parte interna final");
				}
			} else {
				System.out.println("else parte interna");
				if (numCom1 == numCom3) {
					System.out.println("if dentro de else");
				}
			}
		} else {
			System.out.println("Primer if");
		}
		/*
		 * Comparaciones de texto Recomendacion siempre comparar textos en mayusculas o
		 * minusculas.
		 */
		// Hola, Adios, Programacion
		textCom1 = "hOla";
		textCom2 = "HoLa"; // Se puede comparar con y logico
		if (textCom1.toLowerCase().equals(textCom2.toLowerCase()) && (numCom1 == numCom3)) { // Comparacion de texto
			System.out.println("Textos iguales");// Misma palabra
		} else {// Tream Split si te quieres adelantar
			System.out.println("Textos diferentes");
		}

		/*
		 * Comparacion de caracteres: Recuerde que cada caracter esta representado a
		 * traves del codigo ASCII y este codigo es un codigo numérico.
		 */
		// a, ", @

		if (chatCom3 > chatCom1) {
			System.out.println("Comparacion verdadera caracteres");
		} else {
			System.out.println("Comparacion falsa caracteres");
		}

		if (chatCom3 == 64) {
			System.out.println("Comparacion veradera Caracteres con numeros");
		} else {
			System.out.println("Comparacion falsa caracteres");
		}
		
		/*
		 * Se solicita al usuario que ingrese tres palabras por teclado. Y se necesaita imprimirlas
		 * en orden alfabetico, si las palabras incian por la misma letra se tomará la segunda letra 
		 * para el orden.Por ejemplo
		 * tasa, casa, raton = casa, raton, tasa
		 * raton, casa, cielo, = casa, cielo, raton
		 * En este caso no se consideran tildes ni caracteres especiales. Tome
		 * en cuenta que las mayusculas y minusculas son diferentes, para lo cual
		 * tome las consideraciones necesarias.
		 */

		System.out.println("Fuera del If");
		System.out.println(resultadoGlobal);

	}

}
