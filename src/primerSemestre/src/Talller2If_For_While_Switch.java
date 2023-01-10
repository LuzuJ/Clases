import java.util.Scanner;
//Jonathan Luzuriaga Gr9SW2
/*
 * Este programa simulara un menu 
 */
public class Talller2If_For_While_Switch {

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Asignamos variables
		String nomInsum1, nomInsum2, nomInsum3, nomInsum4, nomInsum5, ingresoInsum, opcInsu, ingresoMenu;
		double preInsum1, preInsum2, preInsum3, preInsum4, preINsum5;
		int cantIns1, cantIns2, cantInsu3, cantInsu4, cantInsu5, stoIns1, stoIns2, stoIns3, stoIns4, stoIns5;
		int opcMenu;
		boolean banderaInsum = true;
		boolean banderaMenu = true;

		preInsum1 = 3.5;
		preInsum2 = 0.25;
		preInsum3 = 4.5;
		preInsum4 = 1.25;
		preINsum5 = 2.30;
		nomInsum1 = "telas";
		nomInsum2 = "velas";
		nomInsum3 = "lamparas";
		nomInsum4 = "focos";
		nomInsum5 = "espejos";
		cantIns1 = 0;
		cantIns2 = 0;
		cantInsu3 = 0;
		cantInsu4 = 0;
		cantInsu5 = 0;
		stoIns1 = 0;
		stoIns2 = 0;
		stoIns3 = 0;
		stoIns4 = 0;
		stoIns4 = 0;
		stoIns5 = 0;

		// Operaciones
		// Realizaremos un While para realizar el ciclo
		// Usando el If el usuario ingreara el producto e ingresara la cantidad la cual
		// se ira acumulando
		// Usamnos bandera para repetir el ciclo
		System.out.println("Bienvenido al mini mercado");
		while (banderaInsum == true) {
			System.out.println("Digite si, si desea continuar");
			ingresoInsum = ingresoDatos.nextLine().toLowerCase();
			if (ingresoInsum.equals("si")) {
				System.out.println("Ingrese que Insumo desea junto a su cantidad");
				System.out.println("Que insumo desea ingresar");
				System.out.println("Ingrese el nombre del producto y una cantidad ");
				System.out.println("los productos son: telas, velas, lamparas, focos, espejos");
				opcInsu = ingresoDatos.nextLine().toLowerCase();
				if (opcInsu.equals("telas")) {
					System.out.println("Usted a ingresado telas");
					System.out.println("Ingrese una cantidad");
					cantIns1 = Integer.parseInt(ingresoDatos.nextLine());
					stoIns1 = stoIns1 + cantIns1;
				}

				if (opcInsu.equals("velas")) {
					System.out.println("Usted a ingresado velas");
					System.out.println("Ingrese una cantidad");
					cantIns2 = Integer.parseInt(ingresoDatos.nextLine());
					stoIns2 = stoIns2 + cantIns2;
				}
				if (opcInsu.equals("lamparas")) {
					System.out.println("Usted a ingresado lamparas");
					System.out.println("Ingrese una cantidad");
					cantInsu3 = Integer.parseInt(ingresoDatos.nextLine());
					stoIns3 = stoIns3 + cantInsu3;
				}

				if (opcInsu.equals("focos")) {
					System.out.println("Usted a ingresado focos");
					System.out.println("Ingrese una cantidad");
					cantInsu4 = Integer.parseInt(ingresoDatos.nextLine());
					stoIns4 = stoIns4 + cantInsu4;
				}

				if (opcInsu.equals("espejos")) {
					System.out.println("Usted a ingresado espejos");
					System.out.println("Ingrese una cantidad");
					cantInsu5 = Integer.parseInt(ingresoDatos.nextLine());
					stoIns5 = stoIns5 + cantInsu5;
				}

			} else {
				System.out.println("Prociga con el pago ");
				banderaInsum = false;
			}
		}
		System.out.println("**************************************");
		// Usaremos While para permanecer en el menu
		// Crearemos variables para almacenar el valor total de cada producto
		// Esto debido a que los datos fueron ingresados arriba
		double valTot1, valTot2, valTot3, valTot4, valTot5;
		double desIns1, desIns2, desIns3, desIns4, desIns5, totaPagar;
		valTot1 = 0;
		valTot2 = 0;
		valTot3 = 0;
		valTot4 = 0;
		valTot5 = 0;
		desIns1 = 0;
		desIns2 = 0;
		desIns3 = 0;
		desIns4 = 0;
		desIns5 = 0;
		valTot1 = stoIns1 * preInsum1;
		valTot2 = stoIns2 * preInsum2;
		valTot3 = stoIns3 * preInsum3;
		valTot4 = stoIns4 * preInsum4;
		valTot5 = stoIns5 * preINsum5;

		while (banderaMenu == true) {
			System.out.println("Digite nuevamente si, si desea continuar");
			ingresoMenu = ingresoDatos.nextLine().toLowerCase();
			if (ingresoMenu.equals("si")) {
				// Usaremos Switch para el siguiente menu
				System.out.println("Ingrese una de las siguientes opciones para realizar una accion");
				System.out.println("1. Para imprimir todos los productos con el total de sus unidades");
				System.out.println("2. Para obtener el valor total de todas los productos");
				System.out.println("3. Para descuentos");
				System.out.println("4. Los valores de los productos si se le aplica el descuento");
				System.out.println("5. Total generado de todos los productos");
				opcMenu = Integer.parseInt(ingresoDatos.nextLine());
				switch (opcMenu) {
				case 1:
					System.out.println("Usted a esogido la opcion 1");
					System.out.println("Las unidades por productos son: ");
					System.out.println(
							"Del producto " + nomInsum1 + " existen " + stoIns1 + " y su precio es de " + preInsum1);
					System.out.println(
							"Del producto " + nomInsum2 + " existen " + stoIns2 + " y su precio es de " + preInsum2);
					System.out.println(
							"Del producto " + nomInsum3 + " existen " + stoIns3 + " y su precio es de " + preInsum3);
					System.out.println(
							"Del producto " + nomInsum4 + " existen " + stoIns4 + " y su precio es de " + preInsum4);
					System.out.println(
							"Del producto " + nomInsum5 + " existen " + stoIns5 + " y su precio es de " + preINsum5);
					break;
				case 2:
					System.out.println("Usted a escogido la opcion 2");
					System.out.println("El valor total por unidad es de ");
					System.out.println(nomInsum1 + " = $ " + valTot1);
					System.out.println(nomInsum2 + " = $ " + valTot2);
					System.out.println(nomInsum3 + " = $ " + valTot3);
					System.out.println(nomInsum4 + " = $ " + valTot4);
					System.out.println(nomInsum5 + " = $ " + valTot5);
					break;
				case 3:
					System.out.println("Usted a esogido la opcion 3");
					System.out.println("Se le aplicara un descuento en los siguientes productos");
					// entre 0 y 40
					// 0.95//0.925//0.9 Valores del descuento
					if (stoIns1 > 0 && stoIns1 < 40) {
						System.out.println("Tiene un descuento de 5% en " + nomInsum1);// 0.95//0.925//0.9
						desIns1 = stoIns1 * 0.95;
					}
					if (stoIns2 > 0 && stoIns2 < 40) {
						System.out.println("Tiene un descuento de 5% en " + nomInsum2);
						desIns2 = stoIns2 * 0.95;

					}
					if (stoIns3 > 0 && stoIns3 < 40) {
						System.out.println("Tiene un descuento de 5% en " + nomInsum3);
						desIns3 = stoIns3 * 0.95;

					}
					if (stoIns4 > 0 && stoIns4 < 40) {
						System.out.println("Tiene un descuento de 5% en " + nomInsum4);
						desIns4 = stoIns4 * 0.95;
					}
					if (stoIns5 > 0 && stoIns5 < 40) {
						System.out.println("Tiene un descuento de 5% en " + nomInsum5);
						desIns5 = stoIns5 * 0.95;
					}
					// Entre 40 - 80
					if (stoIns1 >= 40 && stoIns1 <= 80) {
						System.out.println("Usted tiene un descuento de 7.5% en " + nomInsum1);
						desIns1 = stoIns1 * 0.925;
					}
					if (stoIns2 >= 40 && stoIns2 <= 80) {
						System.out.println("Usted tiene un descuento de 7.5% en " + nomInsum2);
						desIns2 = stoIns2 * 0.925;
					}
					if (stoIns3 >= 40 && stoIns3 <= 80) {
						System.out.println("Usted tiene un descuento de 7.5% en " + nomInsum3);
						desIns3 = stoIns3 * 0.925;
					}
					if (stoIns4 >= 40 && stoIns4 <= 80) {
						System.out.println("Usted tiene un descuento de 7.5% en " + nomInsum4);
						desIns4 = stoIns4 * 0.925;
					}
					if (stoIns5 >= 40 && stoIns5 <= 80) {
						System.out.println("Usted tiene un descuento de 7.5% en " + nomInsum5);
						desIns1 = stoIns1 * 0.925;
					}
					// Para mayores de 80
					if (stoIns1 > 80) {
						System.out.println("Usted tiene un descuento de 10% en " + nomInsum1);
						desIns1 = stoIns1 * 0.9;
					}
					if (stoIns2 > 80) {
						System.out.println("Usted tiene un descuento de 10% en " + nomInsum2);
						desIns2 = stoIns2 * 0.9;
					}
					if (stoIns3 > 80) {
						System.out.println("Usted tiene un descuento de 10% en " + nomInsum3);
						desIns3 = stoIns3 * 0.9;
					}
					if (stoIns4 > 80) {
						System.out.println("Usted tiene un descuento de 10% en " + nomInsum4);
						desIns4 = stoIns4 * 0.9;
					}
					if (stoIns5 > 80) {
						System.out.println("Usted tiene un descuento de 10% en " + nomInsum5);
						desIns5 = stoIns5 * 0.9;
					}
					break;
				case 4:
					System.out.println("Usted a escogido la opcion 4");
					System.out.println("El valor a pagar de " + nomInsum1 + " es de $ " + desIns1);
					System.out.println("EL valor a pagar de " + nomInsum2 + " es de $" + desIns2);
					System.out.println("El valor a pagar de " + nomInsum3 + " es de $" + desIns3);
					System.out.println("El valor a pagar de " + nomInsum4 + " es de $" + desIns4);
					System.out.println("El valor a pagar de " + nomInsum5 + " es de $ " + desIns5);
					break;
				case 5:
					System.out.println("Usted a esogido la opcion 5");
					System.out.println("Su valor a pagar es de ");
					totaPagar = desIns1 + desIns2 + desIns3 + desIns4 + desIns5;
					System.out.println("$ " + totaPagar);
					break;

				default:
					System.out.println("Ingrese una opcion valida");
					break;
				}

			} else {
				System.out.println("Gracias por elegirnos :)");
				banderaMenu = false;
			}
		}
		//Que asi sea la prueba por fa :c
	}

}
