import java.util.Scanner;

/*
 * Crear un menu en base de repeticiones
 */
public class OpcionesMenuRepeticiones {

	public static void main(String[] args) {
		/*
		 * Se utilizara la opcion While, para poder realizar una repeticion
		 * indeterminada.
		 */
		// Deficion de Varaibles
		boolean banderaRepeticion;
		String respuestaRepeticion;
		int opcionMenu, num1, num2, num3;
		double promedioNumero;
		Scanner ingresoDatos = new Scanner(System.in);

		// Asignacion de valores
		banderaRepeticion = true;
		//A pesar que el valor cambia a falso, se deberia completar
		//Todo una vez mas si se digita lago diferente
		while (banderaRepeticion == true) {
			System.out.println("Digite si para repetir la operacion");
			respuestaRepeticion = ingresoDatos.nextLine();
			if (!respuestaRepeticion.equals("si")) {
				banderaRepeticion = false;
				//Se puede romper con un 
				//Break;
				
				//Tambien se puede terminar con un else.

			}
			System.out.println("Bienvenido al menu operaciones matematicas");
			System.out.println("Digite 1 para sacar el promedio");
			System.out.println("Digite 2 para obtener el maximo de dos numeros");
			System.out.println("Digite 3 para obtener el minimo de dos numeros");
			opcionMenu = Integer.parseInt(ingresoDatos.nextLine());

			switch (opcionMenu) {
			// Caso 1 promedia 3 numeros
			case 1:
				System.out.println("Digite el primer numero");
				num1 = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Ingrese el segundo numero");
				num2 = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Ingrese el tercer numero");
				num3 = Integer.parseInt(ingresoDatos.nextLine());
				promedioNumero = ((double) num1 + num2 + num3 / 3);
				System.out.println("El promedio es " + promedioNumero);
				break;

			// Caso 2 obtiene el mayor de dos numeros
			case 2:
				System.out.println("Digite el primer numero");
				num1 = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Digite el segundo numero");
				num2 = Integer.parseInt(ingresoDatos.nextLine());
				if (num1 > num2) {
					System.out.println("El numero mayor es " + num1);
				} else {
					System.out.println("El numero mayor es " + num2);
				}
				break;
			// Caso 3 el menor de dos numeros
			case 3:
				System.out.println("Digite el primer numero");
				num1 = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Digite el segundo numero");
				num2 = Integer.parseInt(ingresoDatos.nextLine());
				if (num1 < num2) {
					System.out.println("El numero menor es " + num1);
				} else {
					System.out.println("El numero menor es " + num2);
				}
				break;
			// Caso por defecto
			default:
				System.out.println("No ha escogido una opcion valida");
				System.out.println(" :) ");
				break;
			}
		}
		
		/*
		 * Sobre le menu creado se modificara las operaciones
		 * Caso 1: Al usuario cuantos numeros desea promediar
		 * Caso 2: Al usuario se le va a pedir cuantos numeros desea ingresar para 
		 * conocer el mayor.
		 * Caso 3: Al usuarion se le va a pedir cuantos desea ingresar para concoer menor
		 * 
		 */

	}

}
