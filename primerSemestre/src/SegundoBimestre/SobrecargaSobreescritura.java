package SegundoBimestre;
//Llamada a la libreria.
import java.util.Arrays;
import java.util.Scanner;

/*
 * Esta clase me va a permitir visualizar dos conceptos. Sobrecarga y Sobreescritura
 */
public class SobrecargaSobreescritura {

	public static int sumaNumero(int numeroEntero) {
		/*
		 * Este metodo sumara un numero con un valor predeterminado dentro del metodo.
		 */
		int resultado = 0;
		resultado = numeroEntero + 10;
		return resultado;
	}

	public static int sumaNumero(int ent1, int ent2) {
		int resultado = 0;
		resultado = ent1 + ent2;
		return resultado;
	}

	public static void sumaNumero(int ent1, int ent2, int ent3) {
		System.out.println("El valor de la suma es: " + (ent1 + ent2 + ent3));
	}

	public static void sumaNumero() {
		System.out.println("Este metodo no suma nada ");

	}

	public static void main(String[] args) {
		/*
		 * Sobreescritura: Este concepto solo se puede aplicar a programacion orientada
		 * a objetos. La sobreescritura es cambiar el codigo de un metodo de una
		 * libreria predefinida en el lenguaje de programacion. Como por ejemplo se
		 * podra sobre escribir estos metodos. Librerias, ctrl+clic despues del "." para
		 * ver la libreria. Arrays.toString(a); Math.random();
		 */
		/*
		 * Sobrecarga: Este concepto se lo puede aplicar tanto a progreamacion
		 * estructurada como a programacion orientada a objetos. La sobrecarga en si es
		 * un concepto el cual me permite tener funciones o subprogramas con el mismo
		 * nombre, que retornes o no un parametro del mismo tipo, pero la diferencia
		 * estara en el numero de parametros que se ocupa para la llamada.
		 */
		Math.random();
		Scanner sc = new Scanner(System.in);
		/*
		 * Librerias dentro de un lenguaje de programacion: Son codigos pre dearrollados
		 * y definidos, precargados dentro de un lenguaje de programacion. El que le
		 * permite al usuario reutilizar codigo para ciertas funciones. Reutilizar
		 * codigo: Es utilizar el codigo de otra persona dentro de nuestro programa para
		 * ahorrarnos la creacion de ciertas funcionalidades que ya estan definidas
		 * dentro de los lenguajes de programacion. Funciones o Metodos: Son codigo el
		 * cual se puede reutilizar a lo largo del programa basado en los parametros y
		 * operaciones que se realizar dentro de las funciones Este codigo pre cargado
		 * se va a dividir o seccionar de acuerdo con el tipo de funcinoes que maneje.
		 * Definicion de las librerias dentro de los lenguajes de programacion: a la
		 * definicion de una libreria se lo conoce como la llamada. las llamadas a las
		 * librerias se las colocara al inicion del programa y fuera de las clase que
		 * contiene el codigo.
		 * 
		 * java util javadoc
		 */
		
		/*
		 * Para C y C++:
		 * iostream 		3**
		 * cmath			4**
		 * cstring			4**
		 * cstime			4***
		 * algorithm		4***
		 * cstidio			4***
		 * hdio				4****
		 * 
		 * Para JAVA
		 * util				4****
		 * awt				4****
		 * applet			4****
		 * text				4*****
		 * swing			4*****
		 * lang				4****
		 */
		
		/*
		 * DOMINGOOOOOO
		 * Axtividades individuales
		 * Es consultar el concepto de cada una de las librerias expuestas anteriormente
		 * 4 metodos que se encuentren en cada una de las librerias con sus respectivas
		 * definiciones
		 * Si tiene libros 4 de cada libro
		 * En este caso se debe presentar un documento en word con el contenido de su consulta
		 * si desea puede añadir codigo, añadir imagenes.
		 * 
		 */
		sumaNumero(); // Metodo sin parametros
		sumaNumero(1, 5, 9); // Muestra la suma de los 3 numeros
		int suma = sumaNumero(7); // Retorna la suma del numero +10
		int sumaSobrecarga = sumaNumero(7, 5); // Retorna la suma de los dos numeros

		System.out.println(suma);
		System.out.println(sumaSobrecarga);

	}

}
