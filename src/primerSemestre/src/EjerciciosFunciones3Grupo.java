import java.util.Scanner;

/*
 * Se necesita crear una función que basada en un numero ingresado por el usuario y 
 * en un texto le permita imprimir 
 * cada uno de los caracteres del texto hasta el numero ingresado. 
 * Basado en esta misma función generar otra en donde se compare si el numero es menor a 
 * la longitud del texto, se tome la longitud total para imprimir todos los caracteres
 */

public class EjerciciosFunciones3Grupo {
	// Funcion encargada de recibir el texto y la opcion pedida
	public static void TextoImprimir(String textoIngreado, int numeroIngresado) {
		int contador = 0;
		// While para encargar cada caracter dependiendo el caso
		while (contador != numeroIngresado) {
			System.out.println(textoIngreado.charAt(contador));
			contador++;
		}
	}

	// Funcion encargada de recibir el texto y la opcion numerica de la accion
	public static void ComparacionLonguitudTexto(String textoIngresado, int numeroIngresado) {
		int longuitudTexto = textoIngresado.length();
		int contador = 0;
		// if encargada de la condicion
		if (numeroIngresado < longuitudTexto) {
			while (contador != numeroIngresado) {
				System.out.println(textoIngresado.charAt(contador));
				contador++;
			}
		} else {
			while (contador < longuitudTexto) {
				System.out.println(textoIngresado.charAt(contador));
				contador++;
			}
		}

	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);

		// Definicion de variables
		int numeroIngresado;
		String textoIngreado;

		// Ingreso de texto y longitud de esta
		System.out.println("Ingresar texto: ");
		textoIngreado = ingresoDatos.nextLine();

		System.out.println("Ingrese un numero de longitud");
		numeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
		// Llamado de las funciones para imprimir y comparar el texto
		TextoImprimir(textoIngreado, numeroIngresado);
		System.out.println("Segundo llamado");
		ComparacionLonguitudTexto(textoIngreado, numeroIngresado);

	}

}
