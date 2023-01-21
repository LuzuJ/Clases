import java.net.MulticastSocket;
import java.util.Scanner;

/*
 * Esta clase esta creada para indicar o generar un menú a traves de una opcion.
 * Se utilizara diferetes formas de utilizar las opciones.
 */
public class ClaseMenuOpciones {
	public static void main(String[] args) {
		/*
		 * En este caso se utilizara la estrucuta Switch: La estructura Switch es un elemento
		 * el cual se compone de dos elementos basicos
		 * 1) Es una clave o un dato mediante el cual se diferetncian las opciones que se pueden
		 * utilizar
		 * 2) Casos y opciones a operar
		 * 2.1) Casos a los cuales se acced a traves del valor de la clave
		 * 2.2) Es el caso por defevti que considera todos los valores que no esten
		 * asignados dentro de la clave, a este caso se le conoce
		 * como el caso por defecto.
		 */
		
		int opcionValor;
		int num1, num2, resultado, sumaAcumulativa, numeroIngresado;
		double resultadoDivision;
		boolean banderaWhile;
		String opcionTextoValor, textoIngresado;
		Scanner ingresoDatos = new Scanner(System.in);
		
		sumaAcumulativa = 0;
		banderaWhile = true;
		//Menu basico de operaciones.
		System.out.println("Eliga una operacion");
		System.out.println("Digite 1 si desea sumar dos numeros");
		System.out.println("Digite 2 si desea restar dos numeros");
		System.out.println("Digite 3 si desea multiplicar dos numeros");
		System.out.println("Digite 4 si desea dividir dos numeros");
		//ALmacen de tipo entero
		System.out.println("Ingrese un numero :3");
		opcionValor = Integer.parseInt(ingresoDatos.nextLine());
		
		/*
		 *Recuerde que dos casos diferentes no pueden tener la misma clave. 
		 */
		switch (opcionValor) {
		case 1:
			System.out.println("Usted a escogido sumar dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultado= num1 + num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case 2:
			System.out.println("Usted a escogido restar dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultado= num1 - num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case 3:
			System.out.println("Usted a escogido multiplicar dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultado= num1 * num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case 4:
			/*
			 * Recuerde que para el caso 4, al ser una division usted debe
			 * considerar que le resultado va a tener decimales, por lo tanto
			 * es necesario crear una variable acorde a este resultado.
			 * Adicionalmente, se necesita modificar la naturaleza de los operandos
			 * para poder almacenar los resultados de los operandos.
			 */
			System.out.println("Usted a escogido dividir dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultadoDivision= (double) (num1 / num2);
			System.out.println("El resultado de la suma es: " + resultadoDivision);
			break;
			/*
			 * Todas las estructuras switch case van a tener un caso por defecto.
			 * Este caso por defecto almacenan todas la sposibles opciones fuera de 
			 * los casos definifos anteriormente.
			 */
			
		default:
			System.out.println("Usted a elegido una opcion equivocada");
			System.out.println("Recuerde que las opciones van de 1 - 4");
			break;
		}

		System.out.println("**************************************");
		System.out.println("Segundo menú");
		System.out.println("Escoja una opcion");
		System.out.println("Digite sumar para sumar dos numeros");
		System.out.println("Digite restar para restar dos numeros");
		System.out.println("Digite para multiplicar para multiplicar dos numeros");
		System.out.println("Digite dividir para dividir dos numeros");
		//Hacer munusculas
		opcionTextoValor=ingresoDatos.nextLine().toLowerCase();
		
		//Switch - case en base de un texto
		//Multiplicar diferente de multiplicar
		//Sumar, SUMar, sumAR
		
		switch (opcionTextoValor) {
		case "sumar":
			System.out.println("Usted a escogido sumar dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultado= num1 + num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case "restar":
			System.out.println("Usted a escogido restar dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultado= num1 - num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case "multiplicar":
			System.out.println("Usted a escogido multiplicar dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultado= num1 * num2;
			System.out.println("El resultado de la suma es: " + resultado);
			break;
			
		case "dividir":
			System.out.println("Usted a escogido dividir dos numeros");
			System.out.println("Digite el primer numero");
			num1 = Integer.parseInt(ingresoDatos.nextLine());
			System.out.println("Digite el segundo numero");
			num2 = Integer.parseInt(ingresoDatos.nextLine());
			resultadoDivision= (double) (num1 / num2);
			System.out.println("El resultado de la suma es: " + resultadoDivision);
			break;
		default:
			System.out.println("Usted a escogido la opcion incorrecta");
			System.out.println("Recuerde que solo existen las opciones");
			System.out.println("Sumar, restar, multiplicar y dividir");
			break;
		}
		
		System.out.println("********************************************");
		//Menu para hacer operaciones acumulativas
		System.out.println("Elija una opcion:");
		System.out.println("Digite 1 para hacer una suma acumulativa con for");
		System.out.println("Digite 2 para hacer opeacion con while");
		System.out.println("Digite 3 para hacer una opeacion con IF");
		opcionValor = Integer.parseInt(ingresoDatos.nextLine());
		switch (opcionValor) {
		case 1:
			System.out.println("Usted ha escogido una suma acumulatica con for");
			System.out.println("Ingrese el numero para sumar");
			numeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			for (int i = 0; i <= numeroIngresado ; i++) {
				sumaAcumulativa = sumaAcumulativa + i;
			}
			System.out.println("El valor de la suma acmumulativa es " + sumaAcumulativa);
			break;
			
		case 2:
			System.out.println("Usted a escogido la opeacion con while");
			while(banderaWhile == true) {
				System.out.println("Digite si, si desea repetir la opeacion");
				textoIngresado = ingresoDatos.nextLine();
				if(textoIngresado.equals("si")) {
					System.out.println("Usted desea repetir esta operacion");
				}else {
					System.out.println("Usted desea terminar la operacion");
					banderaWhile = false;
				}
			}
			break;
		case 3:
			System.out.println("Digite 1 para sumar, caso contrario se restara");
			numeroIngresado = Integer.parseInt(ingresoDatos.nextLine());
			if (numeroIngresado == 1) {
				System.out.println("Digite el primer numero");
				num1 = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Digite el segundo numero");
				num2 = Integer.parseInt(ingresoDatos.nextLine());
				resultado=num1+num2;
				System.out.println("El resultado de la suma es " + resultado);
			}else {
				if (numeroIngresado > 1 ) {
					System.out.println("Digite el primer numero");
					num1 = Integer.parseInt(ingresoDatos.nextLine());
					System.out.println("Digite el segundo numero");
					num2 = Integer.parseInt(ingresoDatos.nextLine());
					resultado=num1-num2;
					System.out.println("El resultado de la suma es " + resultado);
				}
					
			}
			break;
			
		default:
			System.out.println("Ingrese una opcion correcta");
			break;
		}
	}

}
