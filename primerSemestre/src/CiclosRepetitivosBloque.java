/*
 * Este programa esta creado para ilustrar las diferentes formas de repetir
 * un bloque de codigo
 */
public class CiclosRepeticionBloque {
	/*
	 * En programacion existen dos formas de repetir un bloque de codigo (conjunto
	 * de sentencias de codigo). Al igual que en seudocódigo (PseInt) tenemos las
	 * instrucciones Mientras, Repetir en Java tenemos las opciones For, Do-While //
	 * While Opcion mientras -> Recuerde que se ejecuta siemore y cuando la
	 * condicion es verdadera Para esta opcion en Java se tiene el uso de FOR y
	 * WHILE. Opcion Repetir -> Recuerde que esta opcion al MENOS se ejecuta una vez
	 * y de ahí continua ejecutando mientras la condicion sea verdadera. Para esta
	 * opcion en JAVAse tiene el uso del DO-While.
	 */
	public static void main(String[] args) {
		/*
		 * Uso del For: el for es una forma de control a rtaves de un contador. Es decir
		 * en su gran mayoria de veces, si el usuario le solicita repetir un cierto
		 * conjunto de acciones (bloque de codigo) a traves del uso de un numero seria
		 * recomendable que usted use el for for(desde donde incio; hasta donde quiero
		 * llegar; como incrementar)
		 */
		// Definicion de mi contador
		int contador; 
		// Impresion de mi nombre 10 veces
		// contador = contador +1 // contador ++ //lo mismo
		for (contador = 1; contador <= 10; contador++) {
			// Recuerde que todo lo que esta dentro del bloque se ejecutara
			// hasta que la condicion del contador se vuelva falsa
			// Y no se ejecute nada mas de la parte interna.
			/*
			 * contador = 1 // 1 <=10 Verdadero // contador = 2 contador = 2 // 2 <=10
			 * Verdadero // contador = 3 contador = 3 // 3 <=10 Verdadero // contador = 4
			 * ....... contador = 10 // 10 <=10 Verdadero // contador = 11 contador = 11 //
			 * 11 <=10 falso // contador = 11 No ingreso al bloque
			 */
			System.out.println(contador + ".- Mi name es Jonathan");
			if (contador < 5) {
				System.out.println("Su contador es menor que 5");
			}
		}
		System.out.println("El valor de su contador actual es " + contador);
		/*
		 * Imprimir mi nombre 10 veces inciado mi contador desde 0
		 */
		for(int contFor=0; contFor < 10; contFor++) {
			//La suma interna es independiente del calculo de la condicion
			//Recuerde que la siguiente linea de codigo es solo una operacion 
			System.out.println(contFor + " " + (contFor+1) + " " + ".- Mi nombre es Jonathan");
			/*
			 * Si usted desea afectar al contador, lo que necesira es realizar una asignacion
			 */
			/*
			 * El siguiente comentario es la unica forma de cambiar el valor de un contador
			 * es decir solo se lo puede cambiar a traves de la reasignacion
			 */
			//contFor = contFor + 1;
		}
		/*
		 * En un programa nuevo, se necesita hacer las siguientes operaciones,
		 * Sumar los 1000 primeros numeros= 1+2+3+4+5+....+1000 incluido el 1000
		 * Sumar los 100 primeros numero pares = 2+4+6+...+202
		 * Sumar en base de un numero ingresado por el usuario todos los posterioes hasta llegar a 100
		 * 10= 10+11+12+...+100 -> Ingresa a 105
		 * Sumar en base a un numero ingresado por el usuario todos los anteriores hasta llegar a 1
		 * 50= 50+49+48....+1
		 */
		/*
		 * contFor = contFor-1 = contFor--
		 * contFor = contFor+5
		 */
		int sumaAcumulativa = 0; 
		for(int contFor = 100; contFor>=0; contFor--) {
			//Suma acumulativa toma el valor previo y suma el contador
			//Suma acumulativa =100 + 0// Suma acumulativa =100// Val cont=99
			//Suma acumulativa =99 + 100// Suma acumulativa =99 // Val cont= 98
			sumaAcumulativa = contFor + sumaAcumulativa;
			System.out.println("El contador es " + contFor + "El valor de la suma es " + sumaAcumulativa);
		}

	}

}
