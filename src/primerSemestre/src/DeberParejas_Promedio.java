import java.util.Scanner;
/*
		 * Sobre le menu creado se modificara las operaciones*
		 * Caso 1: Al usuario cuantos numeros desea promediar*
		 * Caso 2: Al usuario se le va a pedir cuantos numeros desea ingresar para 
		 * conocer el mayor.
		 * Caso 3: Al usuarion se le va a pedir cuantos desea ingresar para concoer menor
		 * 
		 */

public class DeberParejas_Promedio {

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Definimos y asignamos las variables
		double num1, num2, proNum;
		int i, numPro, opc1, numMax, num3, num4, k, num5, num6, p, numMin;
		String opcUn;
		boolean banderaPri;
		num1 = 0;
		num2 = 0;
		numPro = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0;
		num6 = 100000000;
		k = 0;
		banderaPri = true;

		// Usamos while para tener un ciclo repetitivo
		// Ingresamos los datos
		// Con la bandera podemos repetir el ciclo hasta que se cumpla o no la condicion
		while (banderaPri == true) {
			System.out.println("Digite si para abrir el menu");
			opcUn = ingresoDatos.nextLine().toLowerCase();

			// Utilizamos un if para poder ingresar al menu
			if (opcUn.equals("si")) {
				// Usaremos Switch para realizar el menu
				System.out.println("Ingrese un numero para realizar una accion");
				System.out.println("1.- Para promediar X numeros ingresados");
				System.out.println("2.- Para conocer el mayor de X numeros");
				System.out.println("3.- Para conocer el menor de X numeros");
				opc1 = Integer.parseInt(ingresoDatos.nextLine());

				// Usamos switch para usar el menu
				switch (opc1) {
				case 1:
					System.out.println("Usted escogio la opcion 1");
					System.out.println("Ingrese el numero de veces que desea ingresar los datos");
					System.out.println("Ingrese datos enteros");
					numPro = Integer.parseInt(ingresoDatos.nextLine());

					/*
					 * El for nos ayuda a realizar los datos hasta que quiera le usuario Con el if
					 * pedimos que solo se ingresen maximo 20 datos para evitar colocar numeros en
					 * exceso
					 */

					if (numPro < 21) {
						for (i = 1; i <= numPro; i++) {
							System.out.println("Ingrese los elementos a promediar");
							num1 = Integer.parseInt(ingresoDatos.nextLine());
							num2 = num2 + num1;
						}
						proNum = num2 / numPro;
						System.out.println("El promedio de los numeros es " + num2);
					} else {
						System.out.println("Ingrese un numero menor a 20 ");
					}
					break;

				case 2:

					System.out.println("Usted escogio la opcion 2");
					System.out.println("Ingrese una cantidad de numeros para conocer al mayor");
					numMax = Integer.parseInt(ingresoDatos.nextLine());
					if (numMax < 21) {
						for (k = 1; k <= numMax; k++) {
							System.out.println("Inserte un numero a ser comparado");
							num3 = Integer.parseInt(ingresoDatos.nextLine());
							if (num3 > num4) {
								num4 = num3;
								System.out.println("El numero mayor es " + num4);
							}
						}
					} else {
						System.out.println("Ingrese un numero menor a 20 :)");
					}
					break;

				case 3:
					// Para poder realizar bien el ejercicio es necesario asignar un numero muy
					// grande en
					// la variable a sacar el menor, de otra manera no funciona
					System.out.println("Usted escogio la opcion 3");
					System.out.println("Ingrese una cantidad de numeros para conocer al menor");
					System.out.println("Los numeros a comparar deben ser menores a 100000000");
					numMin = Integer.parseInt(ingresoDatos.nextLine());
					if (numMin < 21) {
						for (p = 1; p <= numMin; p++) {
							System.out.println("Inserte un numero a ser comparado");
							num5 = Integer.parseInt(ingresoDatos.nextLine());
							if (num5 < num6) {
								num6 = num5;
							}
						}
						System.out.println("El valor minimo es " + num6);
					} else {
						System.out.println("Ingrese un numero menor a 20");
					}
					break;

				default:
					System.out.println("Ingrese una opcion valida");
					break;
				}

			} else {
				System.out.println("Ingrese un valor valido");
				banderaPri = false;

			}
		}

	}

}
