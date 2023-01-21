import java.util.Scanner;

/*
 * Este programa va a ser utilizado para reforzar conceptos introdicioendo la idea
 * de un meu y ademas se explicara como se puede tener
 * más de un valor de retorno
 */
public class SubProgramasIntermedio {

	/*
	 * Un programa que realizara las 4 operaciones basicas a traves de un menu que
	 * retorne diferentes valores en base de condiciones dadas
	 */

	public static double menuOperaciones(int opcOpe, double numAOp1, double NumAOp2) {
		double resultadoFuncion;
		resultadoFuncion = 0;
		switch (opcOpe) {
		case 1:
			// Suma
			System.out.println("Usted a elegido una suma");
			resultadoFuncion = numAOp1 + NumAOp2;
			// Note que el return hace que la funcion se termine y se retorne al programa
			// principal
			// Es por esta razón que el break no es necesario dado que el return terminara
			// el caso
			// y se podra continuar
			// return resultadoFuncion; //se puede
			break;
		// Resta
		case 2:
			System.out.println("Usted a elegifo una resta");
			resultadoFuncion = numAOp1 - NumAOp2;
			// return resultadoFuncion;
			break;
		// Multiplicacion
		case 3:
			System.out.println("Usted a escogido una multiplicacion");
			resultadoFuncion = numAOp1 * NumAOp2;
			// return resultadoFuncion;
			break;
		// Divison
		case 4:
			System.out.println("Usted a elegido una division");
			resultadoFuncion = numAOp1 / NumAOp2;
			// return resultadoFuncion;
			break;
		// Caso por defecto
		default:
			System.out.println("Opcion Equivocada");
			// return resultadoFuncion;
			break;
		}
		System.out.println("Finalizacion de Switch");
		return resultadoFuncion;
	}

	//*****************************************
	
	public static String ifParaDevolver(int opcAct1, String nombreUsua, String apellidoUsua) {
		String resultadoName;
		resultadoName = "Jonathan";
		if (opcAct1 > 0 && opcAct1 <= 5) {
			resultadoName = nombreUsua;
			System.out.println("Mi nombre es " + resultadoName);
		} else if (opcAct1 > 5 && opcAct1 <= 10) {
			resultadoName = apellidoUsua;
			System.out.println("Mi nombre es " + resultadoName);
		} else {
			System.out.println("Ingreso un numero no valido :(");
		}

		return resultadoName;
	}
	
	
	//********************************
	/*
	 * Funcion para retornar un nombre o un apellido
	 * en base de un valor
	 */
	public static Object analisisNumero(int opcNumeroOp) {
		String resultado = " ";
		if(opcNumeroOp<=5) {
			resultado= "Jonathan";
			return resultado;
		}else {
			return "Luzuriaga";
		}

	}

	public static void main(String[] args) {
		// Definicion de varibales
		int opcOpe;
		double numOpe1, numOpe2, resultadoOpe;
		Scanner ingresoDatos = new Scanner(System.in);
		// asignacion de valores
		numOpe1 = 0;
		numOpe2 = 0;
		resultadoOpe = 0;

		System.out.println("Menu operaciones");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicacion");
		System.out.println("4.- Division");
		System.out.println("Escoja una opcion");
		opcOpe = Integer.parseInt(ingresoDatos.nextLine());
		System.out.println("Ingrese el primer numero");
		numOpe1 = Double.parseDouble(ingresoDatos.nextLine());
		System.out.println("Ingrese el segundo numero");
		numOpe2 = Double.parseDouble(ingresoDatos.nextLine());

		// Operaciones
		resultadoOpe = menuOperaciones(opcOpe, numOpe1, numOpe2);
		System.out.println("El resultado de la operacion es " + resultadoOpe);
		System.out.println("Continuo en el programa");

		/*
		 * Ingresar un numero del 1 al 10 1) En donde si el numero esta entre 1-5 Quiero
		 * que imprima su nombre, y en programa principal se imprima la inicial de su
		 * nombre En donde si el numero esta entre 6 - 10 Quiero que imprima su
		 * apellido, y en el programa principal se imprima la inicial de su apellido.
		 */
		/*
		 * While en donde se pre
		 */

		System.out.println("*************************************************");
		int opcAct1;
		String nombreUs, apellidoUs, resultaNom;
		opcAct1 = 0;
		nombreUs = "Jonathan";
		resultaNom = "nombre";
		apellidoUs = "Luzuriaga";
		System.out.println("Ingrese un numero entre el 0 y 10");
		System.out.println("Entre 0 y 5 para devolver su nombre");
		System.out.println("Entre 6 y 10 para devolver el apellido");
		System.out.println("Ingrese un valor");
		opcAct1 = Integer.parseInt(ingresoDatos.nextLine());
		resultaNom = ifParaDevolver(opcAct1, nombreUs, apellidoUs);

		char inicial = resultaNom.charAt(0);
		System.out.println("La inicial es " + inicial);

		int opcNumeroOp;
		String resulOpe;
		
		
		System.out.println("Digite un numero netre el 1 y 10");
		opcNumeroOp= Integer.parseInt(ingresoDatos.nextLine());
		resulOpe = (String) analisisNumero(opcNumeroOp);
		char initial;
		initial = resulOpe.charAt(0);
		System.out.println(resulOpe);
		System.out.println("Su inicial es " + initial);
	}

	

}
