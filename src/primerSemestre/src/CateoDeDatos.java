/*
 * Esta clase esta determinada para entender el concepto de casteo de datos.
 */
public class CateoDeDatos {
	/*
	 * Conceptos; Castear: Es convertir (Ampliar o reducir) el espacio de memoria
	 * para una varibale determinada en un punto determinado del programa. La idea
	 * detras de un casteo, es optimizar el uso de recursos, para la presentación de
	 * resultados de mejor manera. Enteros-> 32 bits //Solo almacena la parte entera
	 * Flotantes -> 32 bits //Un calculo para parte entera y parte decimal Doubles
	 * -> 64 bits // Representación de un decimal
	 * 
	 * Identacion: Son los espacios desde el origen de la linea de codigo hasta la
	 * primera letra, esto es importante para poder reconocer bloques de codigo que
	 * se ejecutan en conjunto. En eclipse la identacion se la crea con ctrl+shift+F
	 * // ctrl A selecciona todo
	 */
	public static void main(String[] args) {
		// Definicion de variables
		int ent1;
		int ent2;
		int resultadoEntero;
		double dob1;
		double dob2;
		double resultadoDoble;
		float flo1;
		float flo2;
		float resultadoFlotante;

		// Asigancion de variables
		ent1 = 10;
		ent2 = 3;
		flo1 = 7;
		flo2 = 9;
		dob1 = 3.25;
		dob2 = 4.25;

		// Operaciones.
		// Operaciones de enteros
		resultadoEntero = ent1 + ent2;
		System.out.println("El resultado de la suma es " + resultadoEntero); // 13
		// Reasignando el valor de resultadoEntero
		resultadoEntero = ent1 - ent2;
		System.out.println("El resutlado de la resta es: " + resultadoEntero); // 7
		resultadoEntero = ent1 * ent2;
		System.out.println("El resultado de la multiplicacion es: " + resultadoEntero);// 30
		resultadoEntero = ent1 / ent2;
		System.out.println("El resultado de la division es: " + resultadoEntero);// 3 //Esta en entero sin decimales el
																					// resultado
		// Uso de resultado double y resultado flotante
		// Double 64 bits = 32bit Enteros / 32bits Enteros -> Entero 32 bits X
		/*
		 * Al realizar una division de enteros, no se tiene espacio de memoaria (Bits)
		 * para almacenar los decimales. Es por ello que a peasr de tener una variable
		 * tipo double, solo representa el valor entero de la operacion.
		 */
		resultadoDoble = ent1 / ent2;
		System.out.println("El resultado doble de la divison es: " + resultadoDoble);// 3.0
		/*
		 * Para poder obtener la parte decimal de esta division, se va a realizar un
		 * casteo de valores Doble 64 bit = 64 bits (Entera y decimal) ent1 / 64 bits
		 * (Entera y decimal) ent2
		 */
		System.out.println(ent1);
		resultadoDoble = (double) ent1 / (double) ent2; // Representa que solo en esta linea pasaran a cambiar
		System.out.println(ent1); // El entero solo afecto a la linea de arriba no a este
		System.out.println((double) ent1);// Si se castea si cambiará
		System.out.println("El resultado doble del casteo es: " + resultadoDoble); // 3.3333333333333333335
		/*
		 * Los casteos al igual que cualquier otra operacion dentro de JAVA y todos los
		 * lenguajes solo se puede realizar en la parte derecha de la igualdad
		 * (double)resultadoEntero = (double)ent1 / (double)ent2; //No se puede son
		 * muchos bits, tampoco castear
		 */
		/*
		 * Recuerda que usted debe almacenar un entero dentro de un doble Pero no se
		 * puede almacenar un doble dentro de un entero.
		 */
		// flotante 32 bits = Flotante entero 32 bits (Entera y decimal) / Flotante
		// entero 32 bits (Entera y decimal) ->
		resultadoFlotante = (float) ent1 / (float) ent2;
		System.out.println("El resultado flotante de la division es: " + resultadoFlotante); // 3.333333
		// Los decimales que se muetran dependen de los bits que puedan almacenar
		/*
		 * Recuerde qie a pesar de tener el mismo espacio de memoria, la distribucio de
		 * la parte entera y decimal es diferente. Por lo tanto, no se puede construir
		 * el resultado en base de esta configuaración. resultadoEntero = (float)ent1 /
		 * (float)ent2; //No se puede tienen 32 bits para cada parte
		 */
		System.out.println("*************************************");
		resultadoDoble = dob1 + dob2;
		System.out.println("El resultado de la suma " + resultadoDoble);// 7.5
		resultadoDoble = dob1 - dob2;
		System.out.println("El resultado de la resta es " + resultadoDoble); // -1.0
		resultadoDoble = dob1 * dob2;
		System.out.println("El resultado de la multiplicacion es " + resultadoDoble);// 13.8125
		resultadoDoble = dob1 / dob2;
		System.out.println("El resultado de la division es " + resultadoDoble); // 0.7647058823529411

		// 32 bitsEntera = (Entera) decimal / (Enterea) decimal
		resultadoEntero = (int) dob1 / (int) dob2;
		System.out.println("El resultado entero de la division es " + resultadoEntero); // 0

		resultadoFlotante = (float) dob1 / (float) dob2;
		System.out.println("El resultado flotante de la division es " + resultadoFlotante);// 0

		// Decimal = 64 Entero Decimal bit/ 32 Entero bits // almacenar entero y decimal
		resultadoDoble = (double) ent1 / ent2;
		System.out.println("El resultado de la division es " + resultadoDoble);// 3.33333333333333335

		// Cateando la operacion ()s
		resultadoDoble = (double) (ent1 / ent2);
		System.out.println("El resultado de la division es " + resultadoDoble);// 3.0
	}

}
