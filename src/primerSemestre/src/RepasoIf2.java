import java.util.Scanner;

/*
 * Este programa esta creado para realizar un repaso de la estructura condicional IF
 */
public class RepasoIf2 {

	public static void main(String[] args) {
		/*
		 * Definicion de varibales e ingreso de datos.
		 */
		String nombreRepaso;
		String definicionEdadRepaso;
		int edadRepaso;
		double numeroHijosRepaso;
		double salarioRepaso;
		char operacionRepaso;
		Scanner ingresoDatos = new Scanner(System.in); // Al escribir esto y en el errror ingreso la libreria

		/*
		 * Asigancion e ingreso de datos a traves de consola
		 */
		System.out.println("Ingrese su nombre");
		nombreRepaso = ingresoDatos.nextLine();
		System.out.println("Ingrese su edad");
		edadRepaso = Integer.parseInt(ingresoDatos.nextLine()); // Ingreso datos tipo texto y se hace entero
		System.out.println("Ingrese su numero de hijos");
		numeroHijosRepaso = Integer.parseInt(ingresoDatos.nextLine());
		System.out.println("Ingrese su salario");
		salarioRepaso = Double.parseDouble(ingresoDatos.nextLine());
		System.out.println("Ingrese una opcion, c para calcular, de para imprimir, f para imprimir lo calculado");
		operacionRepaso = ingresoDatos.nextLine().toLowerCase().charAt(0);
		/*
		 * Operaciones con valores receptados por consola.
		 */

		if (nombreRepaso.equals("Juan")) {
			System.out.println("Sun nombre es Juan");
		} else {
			System.out.println("Su nombre es diferente de Juan");
		}
		/*
		 * 1-18 Imprima que es "niño" excluido el 18 18-35 Imprima que es un "adulto"
		 * incluido 18 excluido 35 30-60 Imprima un adulto "mayor" incluido 35 excluido
		 * 60 60 Imprima que es un adulto muy mayor incluido el 60 en adelante.
		 */
		/*
		if ((edadRepaso > 0) && (edadRepaso < 18)) {
			System.out.println("Imprima usted es un niño");
		}

		if ((edadRepaso >= 18) && (edadRepaso < 35)) {
			System.out.println("Imprima usted es un adulto");
		}
		*/
		/*
		 * Este caso particular es una buena idea tener un if anidado, dado que
		 * si una condición es verdadera, el resto de codigo no se ejecutará lo
		 * que no sucede cuando se tiene condiciones individuales como las expuestas
		 * en los comentarios anteriores
		 */
		if ((edadRepaso > 0)&& (edadRepaso < 18)) {
			definicionEdadRepaso = "Usted es un niño";
		}else {
			if ((edadRepaso >= 18)&& edadRepaso < 35) {
				definicionEdadRepaso = "Usted es un adulto";
			}else {
				if ((edadRepaso >= 35)&&(edadRepaso< 60)) {
					definicionEdadRepaso = "Ustes es un adulto mayor";
				}else {
					definicionEdadRepaso= "Usted es un adulto muy mayor";
				}
			}
		}
	/*
	 * Numero de Hijos, para el calculo de un bono sobre su salario
	 * Si tiene entre 0 - 2 hijos 5% de aumento sobre su salario
	 * Si tiene entre 3 - 4 Hijos 5.5% de aumento sobre su salario
	 * Si tiene más de 5 hijos 5.8% de aumento sobre su salario.
	 */
	if ((numeroHijosRepaso >= 0)&&(numeroHijosRepaso <= 2)) {
		//(salario*0.05)+ salario
		//salario = 100 // 100*1.05 = 105
		salarioRepaso = salarioRepaso*1.05;
	}else {
		if(numeroHijosRepaso >= 3 && numeroHijosRepaso<=4) {
			salarioRepaso = salarioRepaso * 1.055;
		}else {
			salarioRepaso = salarioRepaso * 1.058;
		}
		/*
		 * Opcion repaso: c para calcular //99,i de imprimir todos los valores,//102
		 * 				  f para imprimir lo calculado//105
		 */
		if (operacionRepaso == 99) {
			System.out.println("Su salario es " + salarioRepaso + " en baso a su numero de hijos " 
					+ numeroHijosRepaso );
		}
		if(operacionRepaso ==  105) {
			System.out.println("Su nombre es " + nombreRepaso);
			System.out.println("Su numero de hijos es " + numeroHijosRepaso);
			System.out.println("Su sueldo es " + salarioRepaso);
		}
		if (operacionRepaso == 102)
			System.out.println("Su salario es " + salarioRepaso);
			System.out.println("su defincion es " + definicionEdadRepaso);
		}
	}
	
}