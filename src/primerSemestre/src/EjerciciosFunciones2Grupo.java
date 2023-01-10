import java.util.Scanner;

/*
 * Se necesita crear una función que permita retornar el 10% de un numero ingresado si este numero 
 * se encuentra en el rango de 0-20, un 12% si el numero esta en el rango de 21-30 y un 15% si es mayor que 30. 
 * Tome en cuenta que se debe realizar un control para que no se permita ingresar números negativos. 
 * De ser el caso se le debe solicitar al usuario que ingrese nuevamente el número. 
 */
public class EjerciciosFunciones2Grupo {
	// Funcion encargada de recibir le numero ingresado
	public static double calculoPorcentaje(double numeroIngresado) {
		double resultadoPorcentaje = 0;
		// Usamos IF anidados
		if (numeroIngresado <= 20) {
			resultadoPorcentaje = numeroIngresado * 0.1;
		}
		if (numeroIngresado > 20 && numeroIngresado <= 30) {
			resultadoPorcentaje = numeroIngresado - (numeroIngresado * 0.12);
		}
		if (numeroIngresado > 30) {
			resultadoPorcentaje = numeroIngresado * 0.15;
		}
		return resultadoPorcentaje;
	}

	public static void main(String[] args) {
		Scanner ingresoDatos= new Scanner(System.in);
		//Definimos e inicializamos las variables
		double numeroIngresado =0;
		boolean bandera = true;
		
		System.out.println("Ingrese un numero");
		//While para poder repetir hasta que cumpla la condicion
		//Usamos banderas para cumplir la condicion
		numeroIngresado = Double.parseDouble(ingresoDatos.nextLine());
		while (bandera== true) {
			
			if (numeroIngresado < 0) {
				System.out.println("No se trabaja con numeros negativos");
				System.out.println("Ingrese un numero positivo);
			}else {
				//Llammamos a la funcion si se cumple la condicion
				calculoPorcentaje(numeroIngresado);
				bandera=false;
				
			}
		}
		System.out.println("El resultado " + calculoPorcentaje(numeroIngresado) );
		

	}

}
