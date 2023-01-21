package SegundoBimestre;

import java.util.Arrays;
import java.util.Scanner;

public class Taller4 {

	/**
	 * Funcion para poder agregar valores a los arreglos
	 * 
	 * @param producto que se desee agregar o restar el valor
	 * @param valor    para saber si se desea sumar o restar
	 * @param cantidad de productos a agregar
	 * @param arreglo  de productos
	 * @return arreglo nuevo con los nuevos valores
	 */
	public static int[] funcionesProducto(int proIngreso, int sumaOResta, int cantidadPorductos, int[] productos) {
		int[] productosNuevos = new int[productos.length];
		for (int i = 0; i < productos.length; i++) {
			productosNuevos[i] = productos[i];
		}

		if (sumaOResta == 1) {
			productosNuevos[proIngreso - 1] = productosNuevos[proIngreso - 1] + cantidadPorductos;
		} else {
			// Con los if podemos controlar que datos podemos ingresar y restarlos
			// coloco la primera restriccion por si no se puede realizar la resta
			if (cantidadPorductos > productosNuevos[proIngreso - 1]) {
				System.out.println("No se pueden ingresar mas valores de ese producto");
				return productosNuevos;
			} else {
				productosNuevos[proIngreso - 1] = productosNuevos[proIngreso - 1] - cantidadPorductos;
			}
		}

		return productosNuevos;
	}

	/**
	 * Funcion para obtener el mayor de un arreglo
	 * 
	 * @param arreglo de enteros
	 * @return valor mayor de los arreglos usamos ordenamiento y el ultimo valor es
	 *         el mayor de todo el arreglos
	 */
	public static int valorMayorArreglo(int[] arregloNuevo) {
		int valorMayor = 0;
		for (int i = 1; i < arregloNuevo.length; i++) {
			Integer aux = arregloNuevo[i];
			int j = i - 1;
			while (j >= 0 && arregloNuevo[j] > aux) {
				arregloNuevo[j + 1] = arregloNuevo[j];
				j--;
			}
			arregloNuevo[j + 1] = aux;
		}
		valorMayor = arregloNuevo[arregloNuevo.length - 1];

		return valorMayor;
	}

	/**
	 * Funcion para ordenar un arreglo descendente
	 * 
	 * @param arreglo de productos
	 * @return arreglo ordenado descendentemente
	 */
	public static int[] ordenarDesce(int[] arregloNuevo) {
		for (int i = 1; i < arregloNuevo.length; i++) {
			Integer aux = arregloNuevo[i];
			int j = i - 1;
			while (j >= 0 && arregloNuevo[j] < aux) {
				arregloNuevo[j + 1] = arregloNuevo[j];
				j--;
			}
			arregloNuevo[j + 1] = aux;
		}

		return arregloNuevo;
	}

	/**
	 * Funcion para sumar todos los valores del arreglo
	 * 
	 * @param arreglo ordenado de cualaquier froma
	 * @return la suma del arreglo
	 */
	public static int sumaValores(int[] arregloDesc) {
		int valorSuma = 0;

		for (int i = 0; i < arregloDesc.length; i++) {
			valorSuma = valorSuma + arregloDesc[i];

		}
		return valorSuma;
	}

	/**
	 * Funcion para saber la posicion de un numero en el arreglo
	 * 
	 * @param valor   a encontrar
	 * @param arreglo a buscar
	 * @return valor
	 */
	public static void posicinArreglo(int valorMayor, int[] arregloEntero) {
		int i = 0;
		boolean encontrado = false;
		while ((i < arregloEntero.length) && !encontrado) {

			if (arregloEntero[i++] == valorMayor) { // Incrementamos el índice después de la comparación
				System.out.println("La posicion del valor esta en: " + i);
				encontrado = true;
			}
		}
	}

	public static void main(String[] args) {
		// Definimos y asignamos los valores
		Scanner ingresoDatos = new Scanner(System.in);
		int producto01 = 100, producto02 = 15, producto03 = 55, producto04 = 288, producto05 = 319;
		int producto06 = 421, producto07 = 423, producto08 = 201, producto09 = 38, producto10 = 128;
		int num = 0, num2 = 0, val1 = 0, val3 = 0;
		boolean bandera = true;
		// creamos un arreglo con todos los valores que desee
		int[] productos = { producto01, producto02, producto03, producto04, producto05, producto06, producto07,
				producto08, producto09, producto10 };
		// creamos un nuevo arrelgo para que sea una variable global
		int valNuevo[] = new int[productos.length];
		System.out.println(Arrays.toString(productos));
		System.out.println("Bienvenido a la bodega :3");

		// Creamos un while para poder repetir hasta que el usuario lo desee
		while (bandera == true) {
			System.out.println("Ingrese si, si desea continuar");
			String pala = ingresoDatos.nextLine().toLowerCase();

			if (pala.equals("si")) {
				bandera = true;
				System.out.println("A que producto desea ingresar los valores");
				System.out.println("Recuerde que existen productos del 1 al 10");
				// restriccion para tener los numeros que queramos
				num = ingresoDatos.nextInt();
				while (num < 1 || num > 10) {
					System.out.println("Ingrese nuevamente");
					num = ingresoDatos.nextInt();
				}
				System.out.println("Desea agregar o restar valores?");
				System.out.println("Si desea agregar digite 1");
				System.out.println("Si desea restar digite 2");
				num2 = ingresoDatos.nextInt();
				while (num2 < 1 || num2 > 2) {
					System.out.println("Ingrese nuevamente");
					num2 = ingresoDatos.nextInt();
				}

				System.out.println("Cuanto productos desea ingresar");
				val1 = ingresoDatos.nextInt();
				while (val1 < 1) {
					System.out.println("Ingrese nuevamente");
					num = ingresoDatos.nextInt();
				}
				// llamamos a las funcinoes para poder realizar las acciones
				valNuevo = funcionesProducto(num, num2, val1, productos);

				System.out.println("Si desea imprimir todos los valores ingrese 1");
				System.out.println("Si desea cerrar el dia digite 2");
				val3 = ingresoDatos.nextInt();
				switch (val3) {
				case 1:
					System.out.println("Los valores hasta el momento son");
					System.out.println(Arrays.toString(valNuevo));
					break;
				case 2:
					System.out.println("Usted cerro la caja");
					System.out.println("El arreglo final es");
					System.out.println(Arrays.toString(valNuevo));
					bandera = false;

					break;
				default:
					System.out.println();
					break;
				}
			}

		}

		System.out.println("El producto mayor es");
		int valorMayor = valorMayorArreglo(valNuevo);

		System.out.println("El mayor es: " + valorMayor);
		posicinArreglo(valorMayor, valNuevo); // no me sale la posicion no entiendo lo malo :c

		// llamamos a funcionnes para que ordene y la suma de los productos
		int[] arregloDesc = ordenarDesce(valNuevo);
		System.out.println(Arrays.toString(arregloDesc));

		System.out.println("La suma de todos los productos es:");
		int sumVal = sumaValores(arregloDesc);
		System.out.println(sumVal);

		System.out.println("Gracias por preferirnos");
	}

}
