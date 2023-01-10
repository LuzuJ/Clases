import java.util.Scanner;

/*
 * Esta clase esta diseñada para aprender a utilizar la sentencia While y la sentencia
 * Do-While
 */
public class CicloRepeticionBloqueWhile {

	public static void main(String[] args) {
		/*
		 * contFor = contFor-1 = contFor-- contFor = contFor+5
		 */
		/*
		 * int contador; int sumaAcumulativa = 0; for (int contFor = 100; contFor >= 0;
		 * contFor--) { // Suma acumulativa toma el valor previo y suma el contador //
		 * Suma acumulativa =100 + 0// Suma acumulativa =100// Val cont=99 // Suma
		 * acumulativa =99 + 100// Suma acumulativa =99 // Val cont= 98 sumaAcumulativa
		 * = contador + sumaAcumulativa; System.out.println("El contador es " + contFor
		 * + " El valor de la suma es " + sumaAcumulativa); }
		 */
		/*
		 * ´ La sentencia While como se menciono en la clase anterior me servira para
		 * realizar una repeticion de bloques mienstras una condicion sea verdadera El
		 * While se puede utilizar a traves de condiciones logicas (<,>,==) o a traves
		 * del uso de variables tipo booleano.
		 */

		// Definimos variables
		int contadorWhile = 0;
		int contWhile2 = 50;
		String valorComp = "verdadero";
		boolean varBoleana= true;
		Scanner ingresoDatos = new Scanner(System.in);
		/*
		 * Uso de while a traves de una condicion logia Sintaxis: while (condicion
		 * logica){ }
		 */
		while (contadorWhile < 100) {// Hasta que la condicion sea verdadera
			System.out.println("El valor del contador es " + contadorWhile);
			contadorWhile = contadorWhile + 1;
			System.out.println("El valor del contador es " + contadorWhile);
		}
		// Hasta este punto mi contadorWhile = 100
		contadorWhile = 0;
		System.out.println(contadorWhile + " " + contWhile2);
		// contadorWhile = 0 y el contWhile2 =50
		while (contadorWhile < 100 && contWhile2 >= 0) {
			contadorWhile++;
			contWhile2--;
			System.out.println("numero de repeticiones incremento " + contadorWhile + " numero repeticiones decremento "
					+ contWhile2);
		}
		System.out.println("**********************************************");
		
		// contadorWhile = 50 y contWhile2 = -1
		contadorWhile = 0;//Limpiar contadores
		contWhile2 = 50;
		
		while (contadorWhile < 100 || contWhile2 >= 0) {
			contadorWhile++;
			contWhile2--;
			System.out.println("numero de repeticiones incremento " + contadorWhile + " numero repeticiones decremento "
					+ contWhile2);
			
		}
		
		while(valorComp.equals("verdadero")) { //Esto se ejecuta hasta que la condicion sea verdadera
			System.out.println("Ingrese una palabra diferente de verdadero para salir");
			valorComp = ingresoDatos.nextLine();	
		}
		System.out.println(valorComp);
		/*
		 * Comparacion de tecto a traves de una condicion numerica
		 */
		valorComp = "verdadero";
		int valorCompWhile = 0;
		while(valorComp.equals("verdadero")) {
			if (valorCompWhile< 50) {
				valorCompWhile++;
				System.out.println("imprimir el cont " + valorCompWhile);
			}else {
				valorComp= "falso";
			}
		}
		/*
		 * Las variables de tipo booleano tambien son representados como 0 o 1
		 * Por tal motivo se debe utilizar el "==" para realizar su comparacion 
		 * dado que se sobre entiende que estamos comparando dons numeros.
		 */
		while (varBoleana== true) {
			System.out.println("Digite true si quiere continuar");
			String opcion = ingresoDatos.nextLine();
			if(opcion.equals("true")){
				varBoleana = true;
				System.out.println("valor igual true");
			}else {
				varBoleana = false;
			}
		}
		/*
		 * Hasta el momento se ha utilizado la igualdad a traves del "==" .equals
		 * Sin embargo en programacion existe el operador diferente
		 * Operador diferente: esta definido a traves del simbolo "!="
		 */
		/*
		 * Uso del While con diferente
		 */
		//varBolean= false
		System.out.println(varBoleana);
		int contBoleana = 0;
		//false!= true
		while(varBoleana != true) {
			if(contBoleana < 50) {
				contBoleana++;
				System.out.println(contBoleana);
			}else {
				varBoleana = true;
			}
		}
		
	}
}
