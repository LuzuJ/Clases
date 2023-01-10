import java.util.Scanner;

//Usar sub Programas
//Menu Para venta de tickets 
public class PruebaPrimerBimestre {

	public static void ifParaDecuentos(double eNi�os) {
		// Adignamos las variables que necesitamos
		double descUsu = 0;
		// Usaremos if anidados
		if (eNi�os < 3) {
			descUsu = eNi�os * 3.50;
			System.out.println("El valor a pagar por " + eNi�os + " ni�os es de " + descUsu);
		}
		if (eNi�os >= 3 && eNi�os <= 7) {
			descUsu = eNi�os * 3.50 * 0.95;
			System.out.println("El valor a pagar por " + eNi�os + " ni�os es de " + descUsu);
		}
		if (eNi�os > 7 && eNi�os <= 12) {
			descUsu = eNi�os * 3.50 * 0.925;
			System.out.println("El valor a pagar por " + eNi�os + " ni�os es de " + descUsu);
		}
		if (eNi�os > 12) {
			descUsu = eNi�os * 3.50 * 0.90;
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
	public static double juegoUsuario(double descuentoUsua, double descuentoUsuaA, int opcEsg, int ni�os, int adultos) {
		// Asignaremos nuevas variables
		double juegoEsco = 0, juegoEsco2 = 0, juegoTotal1 = 0, juegoTotal2=0, juegoTotal3=0, juegoTotal4=0, total=0;
		total = juegoTotal1+ juegoTotal2+juegoTotal3+juegoTotal4;
		switch (opcEsg) {
		case 1:
			// Solo se cobrar� a los adultos
			System.out.println("Escogio el juego Tipo 1");
			System.out.println("Se cobrar� $2.5 por cada adulto que desee ingresar");
			// Dividimos para el primero valor para solo cobrar el valor del ejercico
			juegoEsco = descuentoUsuaA * 2.25 / 5.25;
			juegoTotal1 = juegoEsco + descuentoUsua;
			System.out.println("Usted a comprado " + ni�os + " entradas para ni�os " + " y " + adultos 
					+ " entradas para adultos, su valor a pagar es " + Math.round(juegoTotal1));
			break;

		case 2:
			System.out.println("Usted escogio el juego Tipo 2");
			System.out.println("El valor es de $3.50 por persona");
			// Usaremos If para el caso de si hay m�s adultos que ni�os
			if (adultos > ni�os) {
				System.out.println("Se cobrar� $3 por persona");
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
			if (ni�os == adultos) {
				System.out.println("Debe pagar $3.75 por pesona");
				juegoEsco = descuentoUsua * 3.75 / 3.50;
				juegoEsco2 = descuentoUsuaA * 3.75 / 5.25;
				juegoTotal3 = juegoEsco + juegoEsco2;
				System.out.println("El valor a pagar es de $" + Math.round(juegoTotal3));
			}
			if (ni�os > adultos) {
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
			if (ni�os > adultos) {
				System.out.println("Debe pagar $4.25 por pesona");
				juegoEsco = descuentoUsua * 4.25 / 3.25;
				juegoEsco2 = descuentoUsuaA * 4.25 / 5.25;
				juegoTotal4 = juegoEsco + juegoEsco2;
				System.out.println("Usted debe pagar $" + Math.round(juegoTotal4));
			}
			if (adultos > ni�os) {
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
		int opcEsg = 0, eNi�os = 0, eAdultos = 0, ni�osJu = 0, adulJu = 0, n=0;
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
			eNi�os = 0;
			eAdultos = 0;
			// Usaremos un if y equals para repetir la accione mientras el usuario quiera
			System.out.println("Ingrese si, si desea continuar");
			usuari = ingresoDatos.nextLine();
			if (usuari.toLowerCase().equals("si")) {

				System.out.println("Entrada ni�os $3.50, entrada adultos $5.25");
				System.out.println("Ingrese cuantos ni�os desean adquirir las entradas");
				eNi�os = Integer.parseInt(ingresoDatos.nextLine());
				System.out.println("Ingrese cuantos adultos desean ingresar");
				eAdultos = Integer.parseInt(ingresoDatos.nextLine());

				// Llamamos una funcion
				ifParaDecuentos(eNi�os);
				ifParaDescuetos2(eAdultos);

				System.out.println("Elija que a que juego desea ingresar");
				System.out.println("1.- Para el primer tipo 1 ");
				System.out.println("2.- Para el juego tipo 2");
				System.out.println("3.- Para el juego tipo 3");
				System.out.println("4.- Para el juego tipo 4");
				System.out.println("Ingrese el numero de juegos");
				opcEsg = Integer.parseInt(ingresoDatos.nextLine());

				// No usamos el subprograma por valor problema con ingrear datos
				System.out.println("Cuantos ni�os desean ingresar a jugar");
				while (numCor == true) {
					ni�osJu = Integer.parseInt(ingresoDatos.nextLine());
					if (ni�osJu <= eNi�os) {
						numCor = false;
					} else {
						System.out.println("Ingrese un valor correcto de ni�os");
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
					double valApagar = juegoUsuario(descuentoUsua, descuentoUsuaA, opcEsg, ni�osJu, adulJu);
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
