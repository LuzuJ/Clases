package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Examen2 {

	public static void funcionMenuCarta(double[] precios, String[] platillos) {
		System.out.println("**A CONTINUACION LA CARTA");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(platillos[i] + " $.-" + precios[i]);
		}
	}

	/**
	 * Funcion para ingresar los platillos que se desean
	 * 
	 * @param usuarios
	 * @param platillos
	 * @param plato
	 * @param precios
	 * @param usuarioActual
	 * @return arreglo con los precios nuevos
	 */
	public static double[] funcionFacturado(String[] usuarios, String[] platillos, int plato, double[] precios,
			String usuarioActual) {
		double[] facturaPersonas = new double[usuarios.length];
		for (int i = 0; i < usuarios.length; i++) {
			if (usuarios[i] != usuarioActual) {
				facturaPersonas[i] = 0;
			}
			for (double aux : precios) {
				aux = precios[plato];
				for (int j = 0; j < platillos.length; j++) {
					if (plato == platillos[j].charAt(5)) {
						facturaPersonas[i] = aux + facturaPersonas[j];
					}
				}
			}
		}

		return facturaPersonas;
	}

	/**
	 * Funcino para el precio total de los productos
	 * 
	 * @param facturado
	 * @param usuarios
	 * @return precios finales
	 */
	public static double[] funcionPrecioTotal(double[] facturado, String[] usuarios) {
		for (int i = 0; i < facturado.length; i++) {
			if (facturado[i] == 0) {
				facturado[i] = 0;
			}
			facturado[i] = facturado[i] * 0.95;
		}
		return facturado;
	}

	/**
	 * Funcion que ordena y busca a un empleado para calcular su sueldi
	 * 
	 * @param empleados
	 * @param nombreEpe
	 * @return bandera que nos indica si el empleado existe
	 */
	public static boolean bucarEmpleado(String[] empleados, String nombreEpe) {
		boolean bandera = true;
		// Creamos una funcin que ordene y busque al empleado en cuestion
		String[] ordenN = new String[empleados.length];
		for (int i = 1; i < empleados.length; i++) {
			String aux = empleados[i];
			int j = i - 1;
			while (j >= 0 && empleados[j].charAt(j) > aux.charAt(j)) {
				empleados[j + 1] = empleados[j];
				j--;
			}
			empleados[j + 1] = aux;
		}
		for (int i = 0; i < empleados.length; i++) {
			ordenN[i] = empleados[i];
		}

		int i = 0;

		while ((i < ordenN.length) && !bandera) {
			if (ordenN[i++] == nombreEpe) {
				System.out.println("La posicion del valor esta en: " + i);
				bandera = true;
			}

		}
		// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
		if (bandera) {
			System.out.println("Sí hay algún valor " + nombreEpe + " en la lista.");
		} else {
			System.out.println("No hay ningún valor " + nombreEpe + " en el arreglo.");
			bandera = false;
		}

		return bandera;
	}

	/**
	 * Funcion para ordenar de mayor a menor
	 * 
	 * @param facturado
	 */
	public static void ordenPlatos(double[] facturado) {
		for (int i = 0; i < facturado.length; i++) {
			for (int j = i; j < facturado.length; j++) {
				// Como en el caso anterior solo comparamos el primer caracter
				if (facturado[i] > facturado[j]) {
					// Usamos el string temporal para re colocar los valores
					double aux = facturado[j];
					facturado[j] = facturado[i];
					facturado[i] = aux;
				}
			}
		}

		System.out.println(Arrays.toString(facturado));
	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Creamos y definimos las variables que vamos a usar
		int i = 0;
		boolean bandera = true;
		boolean bandera3 = true;
		boolean bandera4 = true;
		String nombre = " ";
		boolean bandera2 = true;
		double pl1 = 4.35, pl2 = 5.50, pl3 = 7.00, pl4 = 1.25, pl5 = 3.00;
		double pl6 = 2.25, pl7 = 2.90, pl8 = 8.50, pl9 = 6.30, pl10 = 9.56;
		double[] precios = { pl1, pl2, pl3, pl4, pl5, pl6, pl7, pl8, pl9, pl10 };
		String[] platillos = { "Plato1", "Plato2", "Plato3", "Plato4", "Plato5", "Plato6", "Plato7", "Plato8", "Plato9",
				"Plato10" };
		String[] usuarios = { "N-Pedro", "F-Juan", "F-Maria", "N-Jenny", "F-Ana", "F-Marcos", "N-Raul", "F-Samuel",
				"N-Evelyn", "F-Mateo", "F-Carlos", "F-Valeria", "N-Max", "N-Genesis", "N-Senna", "N-Ruben", "F-Vicente",
				"N-Hamilton", "F-Melanie", "F-Checo" };
		String[] dueños = { "Vettel", "Alonso", "Shumacher", "Fangio", "Farina" };
		String[] empleados = { "Toto", "Correa", "Sam", "Axel", "Michael", "Corey", "Slash", "Dean", "Jon", "Khal",
				"Rock", "Harry", "Dracarys", "Saul", "Titi" };
		String[] proveedores = { "Viking", "Dark", "Supernatural", "Breaking Bad", "Final Space", "Stranger Things",
				"Karmaland", "Juan Nutriales", "Juego de Tronos", "Sandman" };
		double[] facturado = new double[usuarios.length];
		System.out.println("**BIENVENIDO A NUESTRO RESTAURANTE**");
		// Creamos las funciones necesarias en este caso crearemos una para poder juntar
		// precios y nombres
		while (bandera == true) {
			System.out.println("Que opcion desea ejecutar:");
			System.out.println("1.- Imprimir el menu");
			System.out.println("2.- Facturar los platillos");
			System.out.println("3.- Sueldo de los empleados");
			System.out.println("4.- Cantidad a los proveedores");
			System.out.println("5.- Finalizar el programa");
			int num1 = ingresoDatos.nextInt();
			// Se crea aqui por el uso del escaner
			switch (num1) {
			case 1:
				funcionMenuCarta(precios, platillos);
				break;
			case 2:
				while (bandera2 == true) {
					// bandera2= true;
					// bandera3= true;
					while (bandera3 == true) {
						// bandera3 = true;
						for (int j = 0; j < usuarios.length; j++) {
							System.out.println("El usuario  " + usuarios[j] + " desea ingresar un platillo?");
							System.out.println("Ingrese 0, si desea finalizar la facturacion");
							System.out.println("Ingrese 11 si ya no desea ingresar mas platillos");
							int platillo = ingresoDatos.nextInt();
							if (platillo == 0) {
								bandera2 = false;
								bandera3 = false;
							} else {
								if (platillo >= 11) {
									bandera3 = false;
								} else {
									facturado = funcionFacturado(usuarios, platillos, platillo, precios, usuarios[j]);
									bandera3 = true;
									bandera2 = true;
								}

							}

						}

					}
					System.out.println(Arrays.toString(facturado));
					System.out.println("La factura es:");
					facturado = funcionPrecioTotal(facturado, usuarios);
				}
				break;

			case 3:
				while (bandera4 == true) {
					System.out.println("Ingrese su nombre y sus horas trabajadas ");
					String nombreEpe = ingresoDatos.nextLine();
					bandera4 = bucarEmpleado(empleados, nombreEpe);

				}
				break;
			case 4:

				break;
			case 5:
				System.out.println("El proceso se concluye");
				bandera = false;
				break;
			default:
				System.out.println("Fin del proceso");
				bandera = false;
				break;
			}

		}
		System.out.println("Orden de los platillos de mayor a menor");
		ordenPlatos(facturado);

	}

}
