import java.util.Scanner;

//Jonathan Luzuriaga Gr9SW2
/*Se necesita desarrollar un sistema para una fabrica de muebles. En donde se fabrica sillas en $4.80, mesas $50, camas $100 y veladores $25. 
 * El usuario puede ingresar y acumular los productos dependiendo de la opción que escoja. 
 * Este proceso se repetirá hasta que el usuario indique que ya no desea ingresar mas productos. 
*/
public class Prueba2_if_for_while_switch {

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Asignamos y definimos las variables
		int muebleNum1, muebleNum2, muebleNum3, muebleNum4, precNum2, precNum3, precNum4, opcMueble;
		int cantMueble1, cantMueble2, cantMueble3, cantMueble4, valPrec2, valPrec3, valPrec4;
		double precNum1, valPrec1;
		String ingrePala;
		boolean banderaOpc;
		valPrec1 = 0;
		valPrec2 = 0;
		valPrec3 = 0;
		valPrec4 = 0;
		muebleNum1 = 0;
		muebleNum2 = 0;
		muebleNum3 = 0;
		muebleNum4 = 0;
		cantMueble1 = 0;
		cantMueble2 = 0;
		cantMueble3 = 0;
		cantMueble4 = 0;

		precNum1 = 4.80;
		precNum2 = 50;
		precNum3 = 100;
		precNum4 = 25;
		banderaOpc = true;
		/*
		 * Utilizaremos while para que se repita la accion Con el if pondremos la
		 * condicion para que se repita la accion
		 */
		System.out.println("Bienvenido al menu de muebles");
		while (banderaOpc == true) {
			System.out.println("Ingrese si, si desea continuar con la compra");
			ingrePala = ingresoDatos.nextLine().toLowerCase();
			if (ingrePala.equals("si")) {
				System.out.println("Digite los siguientes numero para ingrsar los productos");
				System.out.println("1. Sillas");
				System.out.println("2. Mesas");
				System.out.println("3. Camas");
				System.out.println("4. Veladoras");
				System.out.println("Ingrese un numero");
				opcMueble = Integer.parseInt(ingresoDatos.nextLine());
				// Usaremos switch para ingresar los datos
				// Se repetira hasta que le usuario diga algo diferente de si,
				// Usamos variables para almacenar los valores
				switch (opcMueble) {
				case 1:
					System.out.println("Usted a seleccionado la opcion 1: SILLAS");
					System.out.println("Ingrese la cantidad que desea ingresar");
					muebleNum1 = Integer.parseInt(ingresoDatos.nextLine());
					cantMueble1 = cantMueble1 + muebleNum1;
					break;

				case 2:
					System.out.println("Usted a seleccionado la opcion 2: MESAS");
					System.out.println("Ingrese la cantidad que desea ingresar");
					muebleNum2 = Integer.parseInt(ingresoDatos.nextLine());
					cantMueble2 = cantMueble2 + muebleNum2;
					break;
				case 3:
					System.out.println("Usted a seleccionado la opcion 1: CAMAS");
					System.out.println("Ingrese la cantidad que desea ingresar");
					muebleNum3 = Integer.parseInt(ingresoDatos.nextLine());
					cantMueble3 = cantMueble3 + muebleNum3;
					break;

				case 4:
					System.out.println("Usted a seleccionado la opcion 1: SILLAS");
					System.out.println("Ingrese la cantidad que desea ingresar");
					muebleNum4 = Integer.parseInt(ingresoDatos.nextLine());
					cantMueble4 = cantMueble4 + muebleNum4;
					break;
				default:
					System.out.println("Igrese una opcion correcta");
					break;
				}
			} else {
				System.out.println("Gracias por preferirnos :)");
				banderaOpc = false;
			}
		}
		// **** Es por que me confundo
		/*
		 * Una vez concluido la fase de ingreso se deseará realizar las siguientes
		 * operaciones. * • Si se tiene entre 0 y 20 sillas, se hará un descuento del 5%
		 * al total, y si son más de 20 sillas un 7.5% • Si se tiene entre 0 y 10 mesas,
		 * se hará un descuento del 5% al total, y si son más de 10 mesas un 7.5% • Si
		 * se tiene entre 0 y 5 camas, se hará un descuento del 5% al total, y si son
		 * más de 5 camas un 7.5% • Si se tiene entre 0 y 20 veladores, se hará un
		 * descuento del 5% al total, y si son más de 20 veladores un 7.5%
		 * 
		 * • Además, se tienen descuentos especiales: o Si se tienen mas de 10 sillas y
		 * mas de 5 camas un descuento del 8% del valor original. o Si se tienen mas de
		 * 10 veladores y mas de 10 mesas un descuento del 10% del valor original.
		 */
		System.out.println("*****************************");
		// Asignamos nuevas variables
		// Y realizamos las operaciones de los precios
		valPrec1 = cantMueble1 * precNum1;
		valPrec2 = cantMueble2 * precNum2;
		valPrec3 = cantMueble3 * precNum3;
		valPrec4 = cantMueble4 * precNum4;

		double desMueble1, desMueble2, desMueble3, desMueble4, desMueble5, desMueble6, desMueble7, desMueble8;
		desMueble1 = 0;
		desMueble2 = 0;
		desMueble3 = 0;
		desMueble4 = 0;
		desMueble5 = 0;
		desMueble6 = 0;
		desMueble7 = 0;
		desMueble8 = 0;
		// Uaremos If para los descuentos
		// Para producto 1

		if (cantMueble1 > 0 && cantMueble3 > 0) {
			// Las acciones se realizaran por separado
			// Para descuentos en sillas
			// Usamos if anidados
			if ((cantMueble1 > 0 && cantMueble1 <= 20)) {
				System.out.println("Su descuento es de 5% en sillas");
				desMueble1 = valPrec1 * 0.95;
			} else if (cantMueble1 > 20 && cantMueble3 > 5) {
				System.out.println("Usted tiene un descuento del 8%");
				desMueble5 = valPrec1 * 0.92;
			} else if (cantMueble1 > 20) {
				System.out.println("Usted tiene un descuento del 7.5%");
			}

			if (cantMueble3 > 0 && cantMueble3 <= 5) {
				System.out.println("Tiene un descuento del 5% en camas");
				desMueble3 = valPrec3 * 0.95;
			} else if (cantMueble3 > 5 && cantMueble1 > 20) {
				System.out.println("Usted tiene un descuento del 8% en camas");
				desMueble6 = valPrec3 * 0.92;
			} else if (cantMueble3 > 5) {
				System.out.println("Usted tiene un descuento del 7.5% en camas");
				desMueble3 = valPrec3 * 0.925;
			}

		}

		// Descuento veladoras y mesas
		// Realizamos lo anterios
		if (cantMueble2 > 0 && cantMueble4 > 0) {
			if ((cantMueble2 > 0 && cantMueble2 <= 10)) {
				System.out.println("Su descuento es de 5% en mesas");
				desMueble2 = valPrec2 * 0.95;
			} else if (cantMueble2 > 10 && cantMueble4 > 10) {
				System.out.println("Usted tiene un descuento del 8% en mesas");
				desMueble7 = valPrec2 * 0.92;
			} else if (cantMueble2 > 10) {
				System.out.println("Usted tiene un descuento del 7.5% en mesas");
			}

			if (cantMueble4 > 0 && cantMueble4 <= 10) {
				System.out.println("Tiene un descuento del 5% en veladoras");
				desMueble4 = valPrec4 * 0.95;
			} else if (cantMueble4 > 10 && cantMueble2 > 10) {
				System.out.println("Usted tiene un descuento del 8% en veladoras");
				desMueble8 = valPrec4 * 0.92;
			} else if (cantMueble4 > 10) {
				System.out.println("Usted tiene un descuento del 7.5% en veladoras");
				desMueble4 = valPrec4 * 0.925;
			}

		}

		/*
		 * • Finalmente, se debe indicar cuantos comedores y cuantos juegos de
		 * dormitorios completos se puede formar en base de las
		 * siguientesconsideraciones. o Por cada 4 sillas y una mesa se considera un
		 * comedor completo, es decir si en total después de ingresar todos los
		 * productos se tienen 10 sillas y 3 mesas se tendrán dos comedores completos. o
		 * Por cada 2 veladores y una cama se considera un juego de dormitorio completo,
		 * es decir si en total después de ingresar los productos se tienen 20 veladores
		 * y 5 camas se tiene 5 juegos de dormitorios completos. 
		 * 
		 * Una vez terminadas las
		 * operaciones anteriormente mencionadas se necesita imprimir la siguiente
		 * información. • Con la opción 1, todos las unidades y precios originales. •
		 * Con la opción 2, todas las unidades y los descuentos normales. • Con la
		 * opción 3, todas las unidades con los descuentos especiales. • Con la opción
		 * 4, cuantos juegos de dormitorio y comedores se puede tener.
		 */

		int comedor1, comedor2, opcMenu;
		String ingrePala2;
		boolean banderaMenu;
		banderaMenu = true;
		
		// Para dormacion de comedores
		

		//No pudeee :(((((
		
		// Mostar los valores que nos pida el usuario
		// Usaremmos switch, while
		System.out.println("Ingrese un numero para mostar lo siguiente");
		System.out.println("1. Para mostar todas las unidades y sus precios originales");
		System.out.println("2. Todas las unidades con su respectivo descuento");
		System.out.println("3. Todas las unidades con sus descuentos especiales");
		System.out.println("4. Cuantos dormitorios se pueden armar");
		System.out.println("Igrese un numero");
		opcMenu = Integer.parseInt(ingresoDatos.nextLine());
		while (banderaMenu == true) {
			System.out.println("Ingrese si, si desea continuar");
			ingrePala2 = ingresoDatos.nextLine().toLowerCase();
			if (ingrePala2.equals("si")) {
				switch (opcMenu) {
				case 1:
					System.out.println("Usted selecciono la opcion 1");
					System.out.println("Existen " + cantMueble1 + " de Sillas y su precio es " + valPrec1);
					System.out.println("Existen " + cantMueble2 + " de Mesas y su precio es " + valPrec2);
					System.out.println("Existen " + cantMueble3 + " de Camas y su precio es " + valPrec3);
					System.out.println("Existen " + cantMueble4 + " de veladoras y su precio es " + valPrec4);
					break;

				case 2:
					System.out.println("Usted selecciono la opcion 2");
					System.out.println(
							"El valor a pagar por las Sillas " + cantMueble1 + " con el descuento es " + desMueble1);
					System.out.println(
							"El valor a pagar por las Mesas " + cantMueble2 + " con el descuento es " + desMueble2);
					System.out.println(
							"El valor a pagar por las Camas " + cantMueble3 + " con el descuento es " + desMueble3);
					System.out.println(
							"El valor a pagar por las Veladoras " + cantMueble4 + " con el descuento es " + desMueble4);
					break;

				case 3:
					System.out.println("Usted selecciono la opcion 2");
					System.out.println(
							"El valor a pagar por " + cantMueble1 + " sillas con el descuento es " + desMueble5);
					System.out.println(
							"El valor a pagar por " + cantMueble2 + " mesas con el descuento es " + desMueble6);
					System.out.println("El valor a pagar por " + cantMueble3 + " camas el descuento es " + desMueble7);
					System.out.println(
							"El valor a pagar por " + cantMueble4 + " veladoras el descuento es " + desMueble8);
					break;

				case 4:
					break;

				default:
					System.out.println("Ingrese una ocion valida");
					break;
				}

			} else {
				System.out.println("Gracias por preferirnos");
				banderaMenu = false;
			}
		}

	}

}
