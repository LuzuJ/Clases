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

public class deberParejas2 {

	public static void main(String[] args) {
		// Importamos una libreria
		Scanner ingresoDatos = new Scanner(System.in);

		// Definicion de variables
		String palabra1, palabra2, palabra3;
		char caracter1, caracter2, caracter3, caracterC1, caracterC2, caracterC3;
		int contador1, ifsalida;
		String primeraPalabra = null, segundaPalabra, terceraPalabra;

		// Pedimos al usuario que ingrese las palabras
		System.out.println("Ingrese una palabra");
		palabra1 = ingresoDatos.nextLine().toLowerCase();
		System.out.println("Ingrese una segunda palabra");
		palabra2 = ingresoDatos.nextLine().toLowerCase();
		System.out.println("Ingrese una ultima palabra");
		palabra3 = ingresoDatos.nextLine().toLowerCase();


		// Sacamos las minusculas de la primera
		caracter1 = palabra1.charAt(0);
		caracter2 = palabra2.charAt(0);
		caracter3 = palabra3.charAt(0);
		contador1 = 0;
		ifsalida = 0;

	
		if (caracter1!= caracter2 && caracter1 != caracter3 && caracter2 != caracter3) {
			// Para ubicarla en la primera palabra
			if (((caracter1) < (caracter2) && (caracter1) < (caracter3))) {
				primeraPalabra=palabra1;
			} else {
				if (caracter2 < caracter3) {
					primeraPalabra=palabra2;
				} else {
					if (caracter2 > caracter3) {
						primeraPalabra=palabra3;
					}
				}
			}
			// Para ubicarla en la segunda palabra
			if ((((caracter1 > caracter2) && (caracter1 < caracter3)) || ((caracter1 < caracter2) && (caracter1 > caracter3)))) {
					segundaPalabra=palabra1;
			} else {
				if (((caracter2 > caracter1) && (caracter2 < caracter3)) || (caracter2 < caracter1) && (caracter2 > caracter3)) {
					segundaPalabra=palabra2;
				} else {
					segundaPalabra=palabra3;
				}
			}

			// Para ubicarla en la ultima palabra
			if ((caracter1 > caracter2) && (caracter1 > caracter3)) {
					terceraPalabra=palabra1;
			} else {
				if (caracter2 > caracter3) {
					terceraPalabra=palabra2;
				} else {
					terceraPalabra=palabra3;
				}
			}
			System.out.println("El orden es " + primeraPalabra + "-" + segundaPalabra + "-" + terceraPalabra);
		}
		
		if (caracter1 == caracter2 && caracter1 != caracter3 && caracter2 != caracter3) { // 1 y 2
			while (ifsalida == 0) {

				caracterC1 = palabra1.charAt(contador1);
				caracterC2 = palabra2.charAt(contador1);

				contador1 = contador1 + 1;
				if (caracterC1 != caracterC2) {
					ifsalida = 1;
				}
				if (caracterC1 > caracterC2 && caracter3 > caracter1) {
					System.out.println(
							"el orden es " + palabra2 + " " + palabra1 + " " + palabra3);
				} else {
					if (caracterC1 > caracterC2 && caracter1 > caracter3) {
						System.out.println(
								"el orden es " + palabra3 + " " + palabra2 + " " + palabra1);
					}
				}
				if (caracterC1 < caracterC2 && caracter3 > caracter1) {
					System.out.println(
							"el orden es " + palabra1 + " " + palabra2 + " " + palabra3);
				} else {
					if (caracterC1 < caracterC2 && caracter1 > caracter3) {
						System.out.println(
								"el orden es " + palabra3 + " " + palabra1 + " " + palabra2);
					}
				}
			}
		}
		if (caracter1 != caracter2 && caracter1 == caracter3 && caracter2 != caracter3) {// 1 y 3
			while (ifsalida == 0) {
				caracterC1 = palabra1.charAt(contador1);
				caracterC3 = palabra3.charAt(contador1);

				contador1 = contador1 + 1;
				if (caracterC1 != caracterC3) {
					ifsalida = 1;
				}
				if (caracterC1 > caracterC3 && caracter1 > caracter2) { // 1 y 3
					System.out.println(
							"El orden es " + palabra2 + "-" + palabra3 + "-" + palabra1);
				} else {
					if (caracterC1 > caracterC3 && caracter1 < caracter2) {
						System.out.println(
								"El orden es " + palabra2 + "-" + palabra1 + "-" + palabra2);
					}
				}
				if (caracterC1 < caracterC3 && caracter1 > caracter2) { // 1 y 3
					System.out.println(
							"El orden es " + palabra2 + "-" + palabra1 + "-" + palabra3);
				} else {
					if (caracterC1 < caracterC3 && caracter1 < caracter2) {
						System.out.println(
								"El orden es " + palabra1 + "-" + palabra3 + "-" + palabra2);
					}
				}
			}
		}
		if (caracter1 != caracter2 && caracter1 != caracter3 && caracter2 == caracter3) {// 2 y 3
			while (ifsalida == 0) {
				caracterC2 = palabra2.charAt(contador1);
				caracterC3 = palabra3.charAt(contador1);

				contador1 = contador1 + 1;
				if (caracterC2 != caracterC3) {
					ifsalida = 1;
				}
				if (caracterC2 > caracterC3 && caracter2 > caracter1) { // 2 y 3
					System.out.println(
							"El orden es " + palabra1 + "-" + palabra3 + "-" + palabra2);
				} else {
					if (caracterC2 > caracterC3 && caracter1 > caracter2) {
						System.out.println(
								"El orden es " + palabra3 + "-" + palabra2 + "-" + palabra1);
					}
				}
				if (caracterC2 < caracterC3 && caracter1 > caracter2) { // 2 y 3
					System.out.println(
							"El orden es " + palabra2 + "-" + palabra3 + "-" + palabra1);
				} else {
					if (caracterC2 < caracterC3 && caracter1 < caracter2) {
						System.out.println(
								"El orden es " + palabra1 + "-" + palabra2 + "-" + palabra3);
					}
				}
			}
		}

	}
		
}
