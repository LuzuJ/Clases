import java.util.Scanner;

//Usar sub Programas
//Menu Para venta de tickets 
public class PruebaPrimerBimestre {

	public static void ifParaDecuentos(double eNiños) {
		// Adignamos las variables que necesitamos
		double descUsu = 0;
		// Usaremos if anidados
		if (eNiños < 3) {
			descUsu = eNiños * 3.50;
			System.out.println("El valor a pagar por " + eNiños + " niños es de " + descUsu);
		}
		if (eNiños >= 3 && eNiños <= 7) {
			descUsu = eNiños * 3.50 * 0.95;
			System.out.println("El valor a pagar por " + eNiños + " niños es de " + descUsu);
		}
		if (eNiños > 7 && eNiños <= 12) {
			descUsu = eNiños * 3.50 * 0.925;
			System.out.println("El valor a pagar por " + eNiños + " niños es de " + descUsu);
		}
		if (eNiños > 12) {
			descUsu = eNiños * 3.50 * 0.90;
		}
		
	}

	public static double ifParaDescuetos2(int eAdultos) {
		double descAdul = 0;
		if (eAdultos < 3) {
			descAdul = eAdultos * 5.25;
			System.out.println("El valor a pagar por " + eAdultos + " adultos es de " + descAdul);
		}
		if (eAdultos >= 3 && eAdultos <= 7) {
			descAdul = eAdultos * 5.25 * 0.95;
			System.out.println("El valor a pagar por " + eAdultos + " adultos es de " + descAdul);
		}
		if (eAdultos > 7 && eAdultos <= 12) {
			descAdul = eAdultos * 5.25 * 0.925;
			System.out.println("El valor a pagar por " + eAdultos + " adultos es de " + descAdul);
		}
		if (eAdultos > 12) {
			descAdul = eAdultos * 5.25 * 0.90;
		}
		return descAdul;
	}

	// Aplicaremos un menu para el caso de esoger los juegos
	public static double juegoUsuario(double descuentoUsua, double descuentoUsuaA, int opcEsg, int niños, int adultos) {
		// Asignaremos nuevas variables
		double juegoEsco = 0, juegoEsco2 = 0, juegoTotal1 = 0, juegoTotal2=0, juegoTotal3=0, juegoTotal4=0, total=0;
		total = juegoTotal1+ juegoTotal2+juegoTotal3+juegoTotal4;
		switch (opcEsg) {
		case 1:
			// Solo se cobrará a los adultos
			System.out.println("Escogio el juego Tipo 1");
			System.out.println("Se cobrará $2.5 por cada adulto que desee ingresar");
			// Dividimos para el primero valor para solo cobrar el valor del ejercico
			juegoEsco = descuentoUsuaA * 2.25 / 5.25;
			juegoTotal1 = juegoEsco + descuentoUsua;
			System.out.println("Usted a comprado " + niños + " entradas para niños " + " y " + adultos 
					+ " entradas para adultos, su valor a pagar es " + Math.round(juegoTotal1));
			break;

		case 2:
			System.out.println("Usted escogio el juego Tipo 2");
			System.out.println("El valor es de $3.50 por persona");
			// Usaremos If para el caso de si hay más adultos que niños
			if (adultos > niños) {
				System.out.println("Se cobrará $3 por persona");
				juegoEsco = descuentoUsua * 3 / 3.50;
				juegoEsco2 = descuentoUsuaA * 3 / 5.25;
				juegoTotal2 = juegoEsco + juegoEsco2;
				System.out.println("El valor a pagar es $" + Math.round(juegoTotal2));
			} else {
				System.out.println("Debe pagar $ 3.50 por persona");
				juegoEsco = descuentoUsua * 3.50 / 3.50;
				juegoEsco2 = descuentoUsuaA * 3.50 / 5.25;
				juegoTotal2 = juegoEsco + juegoEsco2;
				System.out.println("El valor a pagar es $" + Math.round(juegoTotal2));
			}

			break;
		case 3:
			System.out.println("Usted escogio juego Tipo 3");
			// Usaremos if para este caso
			if (niños == adultos) {
				System.out.println("Debe pagar $3.75 por pesona");
				juegoEsco = descuentoUsua * 3.75 / 3.50;
				juegoEsco2 = descuentoUsuaA * 3.75 / 5.25;
				juegoTotal3 = juegoEsco + juegoEsco2;
				System.out.println("El valor a pagar es de $" + Math.round(juegoTotal3));
			}
			if (niños > adultos) {
				System.out.println("Debe pagar $3.50 por pesona");
				juegoEsco = descuentoUsua * 3.50 / 3.50;
				juegoEsco2 = descuentoUsuaA * 3.50 / 5.25;
				juegoTotal3 = juegoEsco + juegoEsco2;
				System.out.println("El valor a pagar es de $ " + Math.round(juegoTotal3));
			} else {
				System.out.println("Usted debe pagar $4.25 por persona");
				juegoEsco = descuentoUsua * 4.25 / 3.25;
				juegoEsco2 = descuentoUsuaA * 4.25 / 5.25;
				juegoTotal3 = juegoEsco + juegoEsco2;
				System.out.println("El valor a pagar es de $" + Math.round(juegoTotal3));
			}

			break;
		case 4:
			System.out.println("Usted ecogio el juego tipo 4");
			if (niños > adultos) {
				System.out.println("Debe pagar $4.25 por pesona");
				juegoEsco = descuentoUsua * 4.25 / 3.25;
				juegoEsco2 = descuentoUsuaA * 4.25 / 5.25;
				juegoTotal4 = juegoEsco + juegoEsco2;
				System.out.println("Usted debe pagar $" + Math.round(juegoTotal4));
			}
			if (adultos > niños) {
				System.out.println("El valor a pagar es de $40");
				juegoTotal4 = 40;
			}

			break;
		default:
			System.out.println("Elija un valor valido");
			break;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner(System.in);
		// Definimos y asignamos las variables
		int opcEsg = 0, eNiños = 0, eAdultos = 0, niñosJu = 0, adulJu = 0, n=0;
		String usuari = " ", usuari2 = " ";
		double descuentoUsua = 0, descuentoUsuaA = 0;
		boolean grupos = true, numCor = true;

		System.out.println("Bienvenidos al menu parque de atracciones");
		// Usaremos un while para realiar las operaciones
		while (grupos == true) {
			n=n+1;
			System.out.println("********************************************************************************");
			System.out.println("* 		Bienvenido al Parque de Diversiones de la EPN                  *");
			System.out.println("*	        Usted es el Grupo Numero " +n+"	                               *");
			System.out.println("********************************************************************************");
			
			// Si ingresan nuevos grupos reasignaremos los valores
			eNiños = 0;
			eAdultos = 0;
			// Usaremos un if y equals para repetir la accione mientras el usuario quiera
			System.out.println("Ingrese si, si desea continuar");
			usuari = ingresoDatos.nextLine();
			if (usuari.toLowerCase().equals("si")) {

				System.out.println("Entrada niños $3.50, entrada adultos $5.25");
				System.out.println("Ingrese cuantos niños desean adquirir las entradas");
				eNiños = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Ingrese cuantos adultos desean ingresar");
				eAdultos = Integer.parseInt(ingresoDatos.nextLine());

				// Llamamos una funcion
				ifParaDecuentos(eNiños);
				ifParaDescuetos2(eAdultos);

				System.out.println("Elija que a que juego desea ingresar");
				System.out.println("1.- Para el primer tipo 1 ");
				System.out.println("2.- Para el juego tipo 2");
				System.out.println("3.- Para el juego tipo 3");
				System.out.println("4.- Para el juego tipo 4");
				System.out.println("Ingrese el numero de juegos");
				opcEsg = Integer.parseInt(ingresoDatos.nextLine());

				// No usamos el subprograma por valor problema con ingrear datos
				System.out.println("Cuantos niños desean ingresar a jugar");
				while (numCor == true) {
					niñosJu = Integer.parseInt(ingresoDatos.nextLine());
					if (niñosJu <= eNiños) {
						numCor = false;
					} else {
						System.out.println("Ingrese un valor correcto de niños");
						numCor = true;
					}
				}
				// Reciclamos variables
				numCor = true;
				System.out.println("Cuantos adultos desea ingresar");
				while (numCor == true) {
					adulJu = Integer.parseInt(ingresoDatos.nextLine());
					if (adulJu <= eAdultos) {
						numCor = false;
					} else {
						System.out.println("Ingrese un valor correcto de Adultos");
						numCor = true;
					}
				}
				//Reutilizamos variables
				numCor=true;
				//Volvemos a usar While para repetir hasta que el usuario desee
				while (numCor ==true) {
					System.out.println("Ingrese si si desea seguir jugando");
					usuari2 = ingresoDatos.nextLine();
					if (usuari2.toLowerCase().equals("si")) {
					double valApagar = juegoUsuario(descuentoUsua, descuentoUsuaA, opcEsg, niñosJu, adulJu);
					//No entiendo no me devuelve le valor :((((
					System.out.println("El valor a pagar es de " + valApagar);
					}else {
						numCor =false;
					}
				}
				

			} else {
				System.out.println("Gracias por preferirnos");
				grupos = false;

			}
			
		}

	}

}
