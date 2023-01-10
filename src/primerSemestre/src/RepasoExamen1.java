/*
 * Repaso de la libreria Math: Esta es un conjunnto de metodos los cuales se pueden
 * utilizar a lo largo de un programa y que contiene operaciones matematicas que pueden 
 * devolcer diferentes resultados
 */
public class RepasoExamen1 {
	/* Aun no peeero es librerias para crear metodos, anda practicando :v
	/**
	 * @author Jonathan
	 * Descripcion: Obtiene el valor absoluto de un umero, es decir sin signo
	 * @param Esta libreria necesita un numero doble como parametro para
	 * poder ser ejecutada
	 * @return Se retorna un doble sin signo.
	 * @throws No se tiene ninguna escepcion.
	 **/
	
	public static double valAbs(double d) {
		double valorRetorn;
		valorRetorn=0;
		valorRetorn=d;
		//Numeros positivos
		if (valorRetorn>=0) {
			return valorRetorn;
		}else {
			//Numeros negativos
			return valorRetorn*-1;
		}
	}
	
	//Las funciones solo retornaran un objeto
	//Esta fucion va a decir si es positivo o negativo
	/*
	 * Funcion signo numero solo me indica si el signo es positivo o negatico
	 * Solo indica el signo no realizan una operacion
	 */
	
	public static double sigNum(double d) {
		//Siempre tomar en cuenta asignar las variables
		double ejemplo;
		ejemplo=0;
		ejemplo=d;
		if (d >=0) {
			System.out.println("El numero es positivo");
			valAbs (d);
		}else {
			System.out.println("El numero negativo");
		}
		return ejemplo;
	}
	/*
	 * Generalidades:
	 * Recuerde que la mayoria de funciones usa parametros y estos parametros
	 * se vuelven datos dentro de la funcion
	 * No cree un Scanner dentro de una funcion
	 * Los switch y case normalmente van en el prgrama principal
	 * Si se necesita usar condicionales trate de analizar los posibles casos 
	 * de retorn.
	 * Dentro de los for siempre se inicia con el contador en cero,
	 * pero recuerde que la longitud empieza en 1 y la posicion es 0;
	 */

	public static void main(String[] args) {
		//Libreria Math
		//se puede regrear por que regresa el valor
		System.out.println(Math.abs(3.6));
		System.out.println(Math.abs(-2.4));
		
		//Libreria abs propia
		System.out.println("Con funciones");
		System.out.println(sigNum(3.4));
		System.out.println(sigNum(-2.4));
		
		//El numero que va a comparar es el valor absoluto, por ende siempre será positivo
		System.out.println(sigNum(valAbs(-2.3)));
		
		//Devolvera el valor absoluto pero dira si es negativo o psoitivo
		System.out.println(valAbs(sigNum(3.4)));
		System.out.println(valAbs(sigNum(-5.4)));
		
		//El ln es salto de linea, sale más boneto
		System.out.print("Mi nombre es: ");
		//.err. Es para que imprima en rojito, pero imprime un error
		System.err.println("Jonathan");
		System.out.println();
		System.out.print("Su apellido es: ");
		System.err.println("Luzuriaga");
	}
}
