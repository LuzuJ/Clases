import java.security.DrbgParameters.NextBytes;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/*
 * Este programa es para repetir el do- while
 */
public class CiclosRepeticionDoWhile {

	public static void main(String[] args) {
		/*
		 * La opcion del do - while esta asociada con el repetir del PseInt Es decir que
		 * el codigo se ejecutara al menos una vez incluso si la condicion incial es
		 * falsa Sintaxis: do{bloque de codigo a ejecutar} while(condicion a analizar
		 */

		int valorDo = 0;
		do { // Siempre se ejecuta una vez
			System.out.println("Primera linea");
			System.out.println(valorDo);
			valorDo++;
		} while (valorDo < 10);

		/*
		 * Recuerde que usted siempre va a poder ejecutar el bloque do al MENOS UNA VEZ
		 * luego de esto se analiza la condicion y si esta es falsa, el do-while
		 * termina, caso contrario se seguira ejecutando hasta que la condicion sea
		 * falsa.
		 */

		
		
		// Actividades Usando el While y do-while de manera adecuada realice las
		// siguientes operaciones.
		Scanner ingresoDatos = new Scanner(System.in);
		boolean varBolean = true;
		String salario;
		int salarioNum = 0;
		String texto1 = "Jonathan";

		// En base de su nombre imprimir un texto hasta que el usuario escriba su
		// nombre. **
		while (varBolean == true) {
			System.out.println("Ingrese mi nombre");
			texto1 = ingresoDatos.nextLine().toLowerCase();
			if (texto1.equals("jonathan")) {
				varBolean = false;
			} else {
				varBolean = true;
			}
		}

		// Realice una repeticion hasta que el usuario ingrese un salario menor a $
		// 3000. **
		boolean varSalario = true;
		while (varSalario == true) {
			System.out.println("Ingrese su salario");
			salario = ingresoDatos.nextLine();
			salarioNum = Integer.parseInt(salario);
			if (salarioNum <= 3000) {
				varSalario = false;
			} else {
				varSalario = true;
			}
		}

		// Realice una suma acumulativa desde un numero que ingrese el usuario hasta 500
		// 5//5+6+7...+500
		int numero1 = 0, sumaAcumula = 0;
		String numeroText;

		System.out.println("Ingrese un numero");
		numeroText = ingresoDatos.nextLine();
		numero1 = Integer.parseInt(numeroText);

		while (numero1 <= 500) {
			if (numero1 <= 500) {
				sumaAcumula = sumaAcumula + numero1;
				numero1++;
			} else {
				System.out.println("Ingresa un numero valido");
				numero1 = ingresoDatos.nextInt();
			}
		}

		// Realice una suma acumulativa desde un numero que ingrese el usuario hasta
		// 450.
		// Si es que el usuario digita un numero mayor, debe imprimir al menos ese
		// numero como suma
		// acumulativa/ 2//2+3+4+...+450 500//500

		int numero2 = 0, sumaAcumu2 = 0;
		String texNum2;
		System.out.println("Ingrese un numero desde hasta 450: ");
		texNum2 = ingresoDatos.nextLine();
		numero2 = Integer.parseInt(texNum2);
		do {
			if (numero2 <= 450) {
				sumaAcumu2 = sumaAcumu2 + numero2;
				numero2++;
			} else {
				System.out.println("El numero es " + numero2);
			}
		} while (numero2 <= 450);

		System.out.println("Mi nombre es " + texto1);
		System.out.println("Su salario es " + salarioNum);
		System.out.println("La suma acumulativa entre 0 y 500 es " + sumaAcumula);
		System.out.println("La segunda suma acumulativa entre 0 y 450 es " + sumaAcumu2);

	}

}
