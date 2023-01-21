import java.util.Scanner;

/*
 * Crear una clase nueva para lo siguiente
 * Ingresar el nombre y dos numeros para realizar las siguientes operaciones.
 * 1)Imprimir su nombre.
 * 2)Para las cuatro operaciones basicas
 * 3)Para las cuatro operaciones basicas y que se pueden utilizar los valores en el programa principal.
 * 4)Que me devuelva solo la incial de su nombre.
 */
public class SubprogramaActividad {

	// Funcion imprimir nombre
	// No olvidar borrar la funcion que se crea abajo
	private static void ingresoNombre(String nombreIngreso) {
		System.out.println("Su nombre es " + nombreIngreso);
	}

	// Funciones para imprimprimir los resultados de las operaciones basicas
	private static double operacionesCalcular(int opcOp, double num1, double num2) {
		double resultOpr = 0;
		// Usamos una opeacion switch para elegir una opcion
		switch (opcOp) {
		case 1:
			System.out.println("Usted escogio la opcion sumar");
			resultOpr = num1 + num2;
			break;

		case 2:
			System.out.println("Usted ecogio la opcion restar");
			resultOpr = num1 - num2;
			break;
		case 3:
			System.out.println("Usted escogio la opcion multiplicar");
			resultOpr = num1 * num2;
			break;
		case 4:
			System.out.println("Usted escogio la opcion dividir");
			resultOpr = num1 / num2;

			break;
		default:
			System.out.println("Ingrese una opcion correcta");
			break;
		}

		return resultOpr;
	}

	// Para la inicial del nombre
	// Usamos la operacion charAt para obtener la priemra letra
	private static char inicialNombre(String nombrIngr) {
		char caract = ' ';
		caract = nombrIngr.charAt(0);
		return caract;
	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Asignamos Y definimos valores
		String ingrNom;
		int opcOp;
		char caracter;
		double num1 = 0, num2 = 0, resultOpe = 0;

		System.out.println("Ingrese su nombre");
		ingrNom = ingresoDatos.nextLine();
		ingresoNombre(ingrNom);
		System.out.println("*************************************************");

		System.out.println("Que accion desea realizar");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("Escoja una opcion:");
		opcOp = Integer.parseInt(ingresoDatos.nextLine());

		System.out.println("Ingrese los numeros a utilizar");
		System.out.println("Ingrese el primer numero: ");
		num1 = Double.parseDouble(ingresoDatos.nextLine());

		System.out.println("Ingrese el segundo numero: ");
		num2 = Double.parseDouble(ingresoDatos.nextLine());

		// Llamamos a las funciones
		// En caso de no querer el resultado se borra resultOpe y en la funcion se borra
		// return
		resultOpe = operacionesCalcular(opcOp, num1, num2);
		System.out.println("El resultado de la operacion elegida es: " + resultOpe);

		System.out.println("**************************************************");
		caracter = inicialNombre(ingrNom);
		System.out.println("La primera letra de su nombre es: " + caracter);
	}

}
