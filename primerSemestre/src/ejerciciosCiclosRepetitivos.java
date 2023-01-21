import java.util.Scanner;

public class ejerciciosCiclosRepetitivos {

	public static void main(String[] args) {
		// Asignar los valores
		int contador = 0, contSumPares = 0, entero = 0, numeroUsu2 = 0;
		int numeroUsuario = 0;
		Scanner ingresoDatos = new Scanner(System.in);

		// Operaciones
		// Sumar los 1000 primeros numeros= 1+2+3+4+5+....+1000 incluido el 1000
		// Con el for ponemos la condicion para que vaya hasta donde queramos
		for (contador = 1; contador <= 1000; contador++) {
			entero = entero + (contador); // Asignamos entero para que acumule la suma
		}
		System.out.println("La suma de los primeros 1000 numero es: " + entero);

		// Sumar los 100 primeros numero pares = 2+4+6+...+202
		// Definimos cuanto numeros queremos que cuante y mediante opraciones obtenemos
		// la suma
		for (contador = 2; contador <= 100; contador++) {
			if (contador % 2 == 0) {
				contSumPares = contador * (contador + 1); // Al tener una condicion es necesario asgnaro otro valor
			}
		}

		System.out.println("La suma de los primeros 100 numeros impares es " + contSumPares);
		contador = 0;
		// Sumar en base de un numero ingresado por el usuario todos los posterioes
		// hasta llegar a 100
		// * 10= 10+11+12+...+100 -> Ingresa a 105

		// Usaremos el If para poder generar una condicion y que el usuario ingrese lo
		// que le pedimos.
		System.out.println("Ingresar un numero para proceder a sumarlo hasta 100: ");
		numeroUsuario = Integer.parseInt(ingresoDatos.nextLine());
		if (numeroUsuario <= 100) {
			// Sumamos +1 al numero pues se suma a si mismo, con ello evitaremos que sume de
			// más
			for (contador = (numeroUsuario + 1); contador < 101; contador++) {
				numeroUsuario = numeroUsuario + contador;
			}
		} else {
			// En caso de que el usuario ingrese un numero mayor a 100, el contador hará una
			// suma hasta el numero 100
			for (contador = (numeroUsuario - 1); contador >= 100; contador--) {
				numeroUsuario = contador + numeroUsuario;
			}
		}

		// Sumar en base a un numero ingresado por el usuario todos los anteriores hasta
		// llegar a 1
		// * 50= 50+49+48....+1
		// Limpiamos datos para reutilizar variables
		contador = 0;
		System.out.println("Ingrese un numero para poder sumarlo hasta 1 ");
		numeroUsu2 = Integer.parseInt(ingresoDatos.nextLine());
		// Al igual que en el caso anterior restamos 1 para para que no se sume el mismo
		// numero 2 veces
		for (contador = (numeroUsu2 - 1); contador >= 0; contador--) {
			numeroUsu2 = contador + numeroUsu2;
		}

		System.out.println("La suma de su numero ingresado hasta 100 es: " + numeroUsuario);
		System.out.println("La suma de su numero hasta 1 es de: " + numeroUsu2);

	}

}
