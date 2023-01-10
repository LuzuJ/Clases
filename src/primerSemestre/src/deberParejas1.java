import java.util.Scanner;
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

public class deberParejas1 {

	public static void main(String[] args) {
		// Importamos una libreria
		Scanner ingresoDatos = new Scanner(System.in);

		// Asignamos valores
		String palabra1, palabra2, palabra3;

		// Pedimos al usuario que ingrese las palabras
		System.out.println("Ingrese una palabra");
		palabra1 = ingresoDatos.nextLine();
		System.out.println("Ingrese una segunda palabra");
		palabra2 = ingresoDatos.nextLine();
		System.out.println("Ingrese una ultima palabra");
		palabra3 = ingresoDatos.nextLine();

		// Reasignamos para que sean minusculas.
		String palab1 = palabra1.toLowerCase();
		String palab2 = palabra2.toLowerCase();
		String palab3 = palabra3.toLowerCase();

		// Sacamos las minusculas de la primera
		char palabraChin = palab1.charAt(0);
		char palabraChin2 = palab2.charAt(0);
	
		y	char palabraChin3 = palab3.charAt(0);

		char pala1 = palab1.charAt(1);
		char pala2 = palab2.charAt(1);
		char pala3 = palab3.charAt(1);

		// Tomamos el If para poder corganizar en ambas ocaciones
		// Para primera palabra
		// Usamos condicionales como en PSeInt
		if ((palabraChin == palabraChin2)) {
			if(pala1<pala2) {
				System.out.println(palabra1);
				
			}else {
				
			}

		} else {
			if (((palabraChin) < (palabraChin2) && (palabraChin) < (palabraChin3))) {
				System.out.println(palabra1);
			} else {
				if (palabraChin2 < palabraChin3) {
					System.out.println(palabra2);
				} else {
					if (palabraChin2 > palabraChin3) {
						System.out.println(palabra3);
					}
				}
			}

			if ((((palabraChin > palabraChin2) && (palabraChin < palabraChin3))
					|| ((palabraChin < palabraChin2) && (palabraChin > palabraChin3)))) {
				System.out.println(palabra1);
			} else {
				if (((palabraChin2 > palabraChin) && (palabraChin2 < palabraChin3))
						|| (palabraChin2 < palabraChin) && (palabraChin2 > palabraChin3)) {
					System.out.println(palabra2);
				} else {
					System.out.println(palabra3);
				}
			}

			// Para ultima palabra
			if ((palabraChin > palabraChin2) && (palabraChin > palabraChin3)) {
				System.out.println(palabra1);
			} else {
				if (palabraChin2 > palabraChin3) {
					System.out.println(palabra2);
				} else {
					System.out.println(palabra3);
				}
			}
		}
	}

}