package SegundoBimestre;

public class BusquedaSecuencial {
	/*
	 * Es buscar un valor dentro de un conjunto de datos del MISMO tipo.
	 * Encontrar un dato el cual cumpla con una condicion determinada. 
	 * 
	 * Tipos de Busqueda:
	 * Busqueda secuencial: Un busqueda secuencial o tambien denominada busqueda lineal, 
	 * es aquella busqueda en la cual se compara cada uno de los valores del conjunto de datos
	 * contra la condicion de busqueda. 
	 * 
	 * Arreglo / Conjunto de datos = {1,2,4,5,6,3,8} // Condicion = 6
	 * 1 == 6 F
	 * 2 == 6 F
	 * 4 == 6 F
	 * 5 == 6 F
	 * 6 == 6 V -> El programa para e indica que el numero ha sido encontrado. 
	 * 
	 * 	Arreglo / Conjunto de datos = {1,2,4,5,6,3,8} // Condicion = 8
	 * 1 == 8 F
	 * 2 == 8 F
	 * 4 == 8 F
	 * 5 == 8 F
	 * 6 == 8 F
	 * 3 == 8 F
	 * 8 == 8 V -> El programa para e indica que el numero ha sido encontrado. 
	 * 
	 * Arreglo / Conjunto de datos = {1,2,4,5,6,3,8} // Condicion = 1
	 * 1 == 1 V -> El programa para e indica que el numero ha sido encontrado. 
	 * 
	 * En terminos de eficiencia, es el algoritmo que tiene menor eficiencia 
	 * dado que debe reiniciar la busqueda cada vez que se tiene una nueva condicion, 
	 * y debe comparar contra todos los valores del conjunto de datos. 
	 * 
	 * Arreglo / Conjunto de datos = {1,2,4,5,6,3,8} // Condicion = 9
	 * 1 == 9 F
	 * 2 == 9 F
	 * 4 == 9 F
	 * 5 == 9 F
	 * 6 == 9 F
	 * 3 == 9 F
	 * 8 == 9 F -> Que una vez comparada con todos los valores del conjunto de datos, 
	 * si el dato no es encontrado, indicaria que el dato no se encuentra en ese conjunto. 
	 * 
	 * Arreglo / Conjunto de datos = {1,2,4,5,6,3,6} // Condicion = 6  // Posicion 
	 * 1 == 6 F
	 * 2 == 6 F
	 * 4 == 6 F
	 * 5 == 6 F
	 * 6 == 6 V -> El programa para e indica que el numero ha sido encontrado. Sin embargo, 
	 * esta busqueda no es eficiente para encontrar TODOS lo datos que cumplan con esta condicion
	 * 
	 *  
	 */
	public static void main(String[] args) {
		// Declaracion de variables.
				int[] lista = new int[100];	// Lista de números enteros que supondremos llena.
				boolean encontrado = false;	// Declaramos e inicializamos una bandera.
				int i = 0;			// Declaramos e inicializamos un índice.
				//lista[50] = 13;
				
				// Llenado de valores. 
				for(int j = 0 ; j<lista.length ; j++) {
					lista[j]= (int)(Math.random()*50);
				}
				
				// Busqueda secuencial. 
				while ( (i < lista.length) && !encontrado ) {
					System.out.println(lista[i]);
					if (lista[i++] == 20)	{	// Incrementamos el índice después de la comparación
						System.out.println("La posicion del valor esta en: " + i );
						encontrado = true;
					}
				}	
				
				
					// Al finalizar el programa, la bandera nos indica si hemos encontrado el valor
				if (encontrado)
					System.out.println("Sí hay algún valor 20 en la lista.");
				else
					System.out.println("No hay ningún valor 20 en la lista.");

	}

}
