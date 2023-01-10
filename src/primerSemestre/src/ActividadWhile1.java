import java.util.Scanner;

public class ActividadWhile1 {

	public static void main(String[] args) {
		// Actividades Usando el While y do-while de manera adecuada realice las
		// siguientes operaciones.
		Scanner ingresoDatos = new Scanner(System.in);
		// Asignamos las variables
		String salario, numeroText, texNum2;
		boolean varBolean = true, varSalario = true;
		int salarioNum = 0;
		int numero1 = 0, sumaAcumula = 0;
		int numero2 = 0, sumaAcumu2 = 0;
		String texto1 = "Jonathan";

		// En base de su nombre imprimir un texto hasta que el usuario escriba su
		// nombre. **
		// Usando un while, haremos que se repita hasta que el usuaario haga lo que
		// desamos
		// Usamos banderas para salir del while
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
		// Como en la anterior usamos un while y una bandera para repetir hasta que
		// se cumpla la condicion

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
		System.out.println("Ingrese un numero");
		numeroText = ingresoDatos.nextLine();
		numero1 = Integer.parseInt(numeroText);
		// Con la ayuda de if colocamos la condicon para que el usuario haga caso a
		// nuesta condicion
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
