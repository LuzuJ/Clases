import java.util.Scanner;

/*
 * Esta es una vlase implementada para una farmacia, en donde se podran ingresar
 * medicamentos, se podra acumular o restar el stock, se podran
 * calcular precios y descuentos, ademas de mostar cada uno de los mismos
 * con su respetivas unidades.
 * Se va a tener un menu el cual permirta verificar la existencia
 * de un medicamento particular
 */
public class ClaseRepasoConceptos {

	public static void main(String[] args) {
		// Definicion de variables
		String nomMedica1, nomMedica2, nomMedica3, nomMedica4, ingresoMedicamentos, opcMedica, opcMenu, nomBedBus;
		int cantMedi1, cantMedi2, cantMedi3, cantMedi4, stoMedi1, stoMedi2, stoMedi3, stoMedi4, claMenu;
		double preMed1, preMed2, preMed3, preMed4, totalBodega;
		boolean banderaMedi, banderaMenu;
		Scanner ingresoDatos = new Scanner(System.in);

		// Asignacion de variables
		cantMedi1 = 0;
		cantMedi2 = 0;
		cantMedi3 = 0;
		cantMedi4 = 0;
		stoMedi1 = 0;
		stoMedi2 = 0;
		stoMedi3 = 0;
		stoMedi4 = 0;
		preMed1 = 3.2;
		preMed2 = 1.8;
		preMed3 = 0.75;
		preMed4 = 4.25;
		totalBodega = 0;
		nomMedica1 = "Paracetamol";
		nomMedica2 = "Voltaren";
		nomMedica3 = "Losartan";
		nomMedica4 = "Pharmaton";
		banderaMedi= true;
		banderaMenu= true;

		// Operaciones
		/*
		 * El siguiente while lo que permite es ingresar todas las cantidades para cada
		 * uno de los medicamneto sy modificar su stock respectiv tome en cuenta que le
		 * ciclo while se repetira hasar que el usuario decida lo contrario
		 */
		while (banderaMedi == true) {
			System.out.println("Bienvenido a su farmacia");
			System.out.println("Digite si, si desea ingresar un medicamento");
			ingresoMedicamentos = ingresoDatos.nextLine().toLowerCase();
			if (ingresoMedicamentos.equals("si")) {
				System.out.println("Que medicamento desea ingrear");
				System.out.println("Digite m1 para pedicamneto 1, m2"
						+ "para medicamento 2, m3 para medicamento3, m4 para medicamento" + "4 ");
				opcMedica = ingresoDatos.nextLine();
				if (opcMedica.equals("m1")) {
					System.out.println("Usted a elegido ingresar el medicamento 1");
					System.out.println("Digite cuantas unidades desea ingresar");
					cantMedi1 = Integer.parseInt(ingresoDatos.nextLine());
					stoMedi1 = stoMedi1 + cantMedi1;
				}

				if (opcMedica.equals("m2")) {
					System.out.println("Usted a elegido ingresar el medicamento 2");
					System.out.println("Digite cuantas unidades desea ingresar");
					cantMedi2 = Integer.parseInt(ingresoDatos.nextLine());
					stoMedi2 = stoMedi2 + cantMedi2;
				}

				if (opcMedica.equals("m3")) {
					System.out.println("Usted a elegido ingresar el medicamento 3");
					System.out.println("Digite cuantas unidades desea ingresar");
					cantMedi3 = Integer.parseInt(ingresoDatos.nextLine());
					stoMedi3 = stoMedi3 + cantMedi3;
				}

				if (opcMedica.equals("m4")) {
					System.out.println("Usted a elegido ingresar el medicamento 4");
					System.out.println("Digite cuantas unidades desea ingresar");
					cantMedi4 = Integer.parseInt(ingresoDatos.nextLine());
					stoMedi4 = stoMedi4 + cantMedi4;

				}

			} else {
				System.out.println("Gracias por usar nuestro sistema");
				banderaMedi = false;
			}
		}
		/*
		 * Menu de la farmacia: 1. Mostrar los nombres Medicamentis con su precio y
		 * stock 2. Mostra el total precio en bodega de todos los medicamentos 3.
		 * Diferentes descuentos sobre las unidades en existencia 4. Buscar un
		 * medicamento en particular.
		 */

		while (banderaMenu == true) {
			System.out.println("Digite si para ingresar el menu");
			opcMenu = ingresoDatos.nextLine().toLowerCase();
			if (opcMenu.equals("si")) {
				System.out.println("Digite una opcion para el menu");
				System.out.println("Digite 1 para mostrar los medicamentos, precios, stock");
				System.out.println("Digite 2 para mostrar el total en bodega");
				System.out.println("Digite 3 para mostrar los descuentos");
				System.out.println("Digite 4 para buscar un medicamento particular");
				claMenu = Integer.parseInt(ingresoDatos.nextLine());
				switch (claMenu) {
				case 1:
					System.out.println("Usted a ingreasdo la opcion mostar productos");
					System.out.println(
							"El medicamento " + nomMedica1 + " tiene " + stoMedi1 + "Y su precio es de " + preMed1);
					System.out.println(
							"El medicamento " + nomMedica2 + " tiene " + stoMedi2 + "Y su precio es de " + preMed2);
					System.out.println(
							"El medicamento " + nomMedica3 + " tiene " + stoMedi3 + "Y su precio es de " + preMed3);
					System.out.println(
							"El medicamento " + nomMedica4 + " tiene " + stoMedi4 + "Y su precio es de " + preMed4);
					break;

				case 2:
					System.out.println("Usted a ingreasdo a la opcion de mostarr total");
					totalBodega = (preMed1 * stoMedi1) + (preMed2 * stoMedi2) + (preMed3 + stoMedi3)
							+ (preMed4 + stoMedi4);
					System.out.println("El total en bodega es de " + totalBodega);
					break;

				case 3:
					/*
					 * Si las unidades estan entre 0-40 med1 y med2 un 2.2% de descuento Si las
					 * unidades estan entre 0-10 med3 o med4 un 3.2% de descuento Si las unidades
					 * estan entre 0-10 (med1 y med2) o med3 3.8% de descuento
					 */
					// Descuento 1
					if ((stoMedi1 > 0 && stoMedi1 < 10) && (stoMedi2 > 0 && stoMedi2 < 10)) {
						double desCod1 = 0;
						desCod1 = (stoMedi1 * preMed1) + (stoMedi2 * preMed2);
						desCod1 = desCod1 * 0.978;
						System.out.println("Su descuento sobre el med1 y med2 es de " + desCod1);
					}
					// Descuento 2
					if ((stoMedi3 > 0 && stoMedi3 < 10) || (stoMedi4 > 0 && stoMedi4 < 10)) {
						double desCod2 = 0;
						desCod2 = (stoMedi3 * preMed3) + (stoMedi4 * preMed4);
						desCod2 = desCod2* 0.968;
						System.out.println("Su descuento sobre el med3 y med4 es de " + desCod2);
					}
					// Descuento 3
					if(((stoMedi1>0 && stoMedi1<10)&&(stoMedi2>0 && stoMedi2<10)||
							(stoMedi3>0&&stoMedi3<10))){
						double desCod3 =0;
						desCod3=(stoMedi1*preMed1)+(stoMedi2*preMed2)+(stoMedi3*stoMedi3);
						/*
						 * desCod3 = precio total
						 * 3.8=100-3.8=96.2/100
						 * precio total = 9.62
						 */
						desCod3 = desCod3*0.962;
						System.out.println("Su descuento sobre el med3 y med4 es de " + desCod3);
					}
					break;
					
					//Buscar un medicamento
				case 4:
					System.out.println("Usted a ingresado a buscar un medicamento");
					System.out.println("Por favor digite el nonmbre del medicamento");
					nomBedBus = ingresoDatos.nextLine().toLowerCase();
					if(nomBedBus.equals("paracetamol")) {
						System.out.println("Usted tiene este medicamento");
					}else if (nomBedBus.equals("voltaren")) {
						System.out.println("Usted tiene este medicamento");
					}else if (nomBedBus.equals("pharmaton")) {
						System.out.println("Usted tiene este medicamento");
					}else {
						System.out.println("Medicamento no encontrado");
					}

					break;

				default:
					break;
				}

			} else {
				System.out.println("Gracias por usar nuestro sistema");
				banderaMenu = false;
			}

		}

	}

}
