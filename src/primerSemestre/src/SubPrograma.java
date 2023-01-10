//PROXIMO LUNES EXAMEEEEEEEEEEEEEEN :(((( ACUMULATIVO DE TO
/*
 * Esta es la clase para la creacion de subprogramas o rutinas, las cuales
 * permiten dividir un problema en problemas más pequeños
 * Esto hace reacion al principio fundamental de la programacion el cual menciona:
 * "Divide y Venceras"
 */
public class SubPrograma {

	/*
	 * Subprograma, subrutina o funcion: Es una funcion u operacion que esta descrita dentro
	 * de un programa. La caracteristica principal de un subprograma es que esta
	 * diseñado unica y exclusivamente para resolver un problema en especifico.
	 * Partes de un subprograma:
	 * 1. Nombre: Este nombre debe indicar que opracino va a realizar el subprograma
	 * sumaDosEnteros
	 * 2. Resutado: Significa si la funcion devuelve o no un valor luego de haber realizado
	 * la operacion. 
	 * void: No retorna nungun valor, es decir que cualquier resultado obtenido
	 * dentro de la funcion no se podra relizar en el programa principal
	 * tipo de variable: Significa que retornara una variable de ese tipo.
	 * 3. Parametros: Variables necesarias para la realizacion de la operacion
	 * int ent1, int ent2
	 */

	/*
	 * Public, Private, Protected: Tipo de visualizacion, Publico, Privado y protegido
	 * Static: Pertenencia, es decir facilita la llamada.
	 */
	//Siempre cambiar private a public para evitar confuciones :-)
	public static void sumaDosEnteros(int entASum1, int entAsum2) {
		//El metodo de sub programa siempre arriba del metodo mein
		//sumaDosEnteros(ent1, ent2);
		//entASum = ent1// entASum2= ent2
		//entASum = ent2 //entASum2 = ent3
		System.out.println("El resultado de la suma es " + (entASum1 + entAsum2));
		
		
	}
	//Se cambia private a public
	public static int sumaDosEnterosRetorena(int entASum1R, int entASum2R) {
		int resultadoFuncion;
		resultadoFuncion= entASum1R+entASum2R;
		System.out.println("El resultado de la suma es " + resultadoFuncion);
		return resultadoFuncion;
	}
	
	/*
	 * En los espacios entre funiones lo unico que se puede hacer es definir variables
	 * pero no realizar operaciones.
	 */
	public static void main(String[] args) {

		// Definicion de variables
		int ent1, ent2, ent3, resultado;

		// Obtener y mostar los resultados de las siguientes sumas.
		// Asigancion de valores
		ent1 = 5; ent2 = 7; ent3 = 2; resultado = 0;
		// ent1 + ent2
		resultado = ent1 + ent2;
		System.out.println("El resultado de la suma es " + resultado);
		// ent2 + ent3
		resultado = ent2 + ent3;
		System.out.println("El resultado de la suma es " + resultado);
		// ent1 + ent3
		resultado = ent1 + ent3;
		System.out.println("El resultado de la suma es " + resultado);
		
		/*
		 * Si usted observa las lineas de las operaciones, esta tomando
		 * dos valores enteros, realizando la suma y presente si resultado
		 */

		//Resultado no se toma por que es para una impresion
		//Le das clic al error de la izquierda y en crear metodo
		
		System.out.println("**********************************************");
		//Llamada al subPrograma
		sumaDosEnteros(ent1, ent2);
		sumaDosEnteros(ent2, ent3);
		sumaDosEnteros(ent1, ent3);
		System.out.println("Luego de las llamadas");
		
		System.out.println("**********************************************");
		//Se da en crear nuevo metodo
		//Asignacion de la suma de dos numeros
		resultado = sumaDosEnterosRetorena(ent1, ent2)+20;//Se pueden castear datos
		resultado= resultado+5;
		System.out.println("El resultado de la suma es " + resultado);
		System.out.println(sumaDosEnterosRetorena(ent2, ent3) + 5); //Se puede ya que retorna
		System.out.println(sumaDosEnterosRetorena(ent1, ent3) + 8);
	}
	

	

}
