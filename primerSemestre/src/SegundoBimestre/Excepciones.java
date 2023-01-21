package SegundoBimestre;

import java.util.Scanner;

/*
 * Este es un programa diseñado para explicar lo que es una excepcion
 * Una excepcion basicamente es la expresion de un error en programacion
 * 
 * Excepciones en tiempo de ejecucion: Son aquellas excepciones las cuales no tienen
 * que ver con la copilacion del cogido, es decir tanto la sintarxis como la semantica
 * del programa se encuentran correctas, es decir, que al momento de escribir las sentencias´
 * de codigo el IDE de programacion no ha encontrado errores de escritura, y
 * se ha utilizado las pragramas restringidas correctas.
 * Por ejemplo estas se pueden ver:
 * Tratar de encontrar un elemento fuera de un arreglo basasdo en su posicion.
 * Las divisiones para 0
 * Busqueda fuera de un arreglo
 *  
 *  
 * Excepciones en entrada y salida de datos (Compilar): Normalmente las excepciones
 * de I/O son errores los cuales no tienen que ver con el progremador, normalmente
 * estas se dan dentro del ID al tratae de cumplir una peticion sobre un funcion.
 * 
 * 
 */
public class Excepciones {

	/*
	 * Este programa esta diseñado para explicar la forma basica de control de una
	 * exceocion a traves de un bloque de codigo
	 */
	public static void main(String[] args) {
		/*
		 * Para el control de una excepcion, se necesitara al menos dos bloques de codigo
		 * TRY CATCH y una forma mas completa es a traves de la utilizacion 
		 * adicional del bloque FINALLY
		 * 
		 * 1) Bloque TRY: en este bloque se realizara es la operaciones deseada  
		 * En este bloque se INTENTARA cumplir con todas las lineas de codigo dentro de bloque
		 * De no se posible se pasara al bloque catch
		 * 
		 * 2) Bloque catch: En este bloque se controlara la excepcion, evitara que
		 * el programa finalice y NORMALMENTE se asignaran valores por defecto para 
		 * las operaciones deseadas
		 * 
		 * 3) Bloque Finally: Este es un bloque de control que se ejecutara
		 * siempre independiente de si se cumple el try o el catch
		 */
		// Def y asignacion de variables. 
				Scanner sc = new Scanner(System.in); 
				int val1, val2, val3 = 0 ; 
				val1 = 10; 
				val2 = 5; 
				//System.out.println("El resultado es "  + (10/0));
				
				while (val3 <=0) {
					try {
						System.out.println("Digite un numero");
						val3 = Integer.parseInt(sc.nextLine()); 
					} catch (Exception e) {//Controlar las excepciones, e es un objeto
						val3 = -1; // bandera 
					}finally {
						if(val3 >0) {
							System.out.println("Se ejecuto el try");
						}else {
							System.out.println("Se ejecuto el catch");
						}
					}		
				}
				try {
					//double resultado = (double)val1 / val2; 
					//System.out.println("El resultado es " + resultado);
					System.out.println("Hola esta es mi primera excepcion");
					try {
						System.out.println("El resultado es "  + (10/0));
					} catch (ArithmeticException e) {
						System.out.println("Se esta diviendo para cero");
					}
					try {
						System.out.println("Digite un numero");
						val3 = Integer.parseInt(sc.nextLine());
					}catch (NumberFormatException e) {
						System.out.println("Error al digitar el valor, se asignara uno por defecto");
						val3 = -1;  // bandera; 
					}
					System.out.println("Despues del error");
				} catch (Exception e) {
					System.out.println("El valor de la division es incorrecto");	
					// Division por defecto
					System.out.println("El resultado por defecto es " + (val1 / val2));
				}
				System.out.println("Fuera del bloque try y catch");
				System.out.println(val3);
	}

}
