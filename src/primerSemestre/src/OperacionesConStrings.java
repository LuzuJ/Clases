import java.nio.file.spi.FileTypeDetector;

public class OperacionesConStrings {
	/*
	 * Este programa esta diseñado para el uso y entendimineto de diferentes
	 * operacaiones que se puedan realizar a traves de los textos ingresados
	 * o más conocidos como variables tipo String
	 */
	public static void main(String[] args) {
		
		/*
		 *Mostrarlo un numero de veces
		 *Juntarlo con otro texto
		 *Cambiarlo a todo mayusculas o a todo minusculas.
		 *Extraer un fragmento específico de un texto
		 *Buscar palabras dentro de un texto.
		 * Definir la cantidad de caracteres
		 * Comparar un texto con otro.
		 * Contar una determinada letra
		 * Buscar caracteristicas especiales.
		 */
		/*
		 * String: La definicion de un string en JAVA es la de un dato generico.
		 * Esto quiere decir que esta asociada a una libreria independiente, la cual
		 * proporciona operaciones (metodos) con los cuales el programador puede utilizarla
		 * a su conveniencia para resolver problemas asociado al uso de datos tipo texto
		 * Recuerde**: Los strings o textos no son considerados como datos primitivos dado que 
		 * estan basados en los caracteres(provienen de la Tabla del codigo ASCII - simbolos del teclado)
		 * Adicionalmente dentro de JAVA y POO (Programacion orientada a Objertos) a los strings
		 * se los considera como objetos, los cuales son independientes y se generan a traves
		 * de un modelo.
		 */
		
		// Definicion de variables
		String textoEjemplo1;
		String textoEjemplo2;
		String textoEjemplo3;
		String textoResultado;
		int valorContatenacion;
		
		
		//Asignacion de valores
		//Tener en cuenta los espacios
		textoEjemplo1 = "Este es mi primer ejemplo de texto";
		textoEjemplo2 = "ESTE EJEMPLO TIENE TODAS MAYUSCULAS ";
		textoEjemplo3 = "En este caso uso un forma Normal de escritura";
		valorContatenacion = 7;
		
		//Operaciones 
		//textoEjemplo1 = textoEjemplo1.toUpperCase(); // Todo va a cambiar a mayusculas en texto1
		
		/*
		 * Concatenacion: Esta basada en el precepto de unir, es decir juntar los valores
		 * de forma que se encuentren de forma independiente en un solo
		 * Dentro de programacion para la concatenacion de texto, hay que recordar que 
		 * si se concatena un texto con cualquier otro tipo de varible SIEMPRE será un texto
		 * El simbolopara representar la concatenacion de textos es "+" tome en cuenta que 
		 * esto solo afecta a los strings.
		 */
		//Se puede poner entre comillas un espacio para separar las oraciones
		//Comillas dobles para una cadena de caracteres, simples para uno solo
		textoResultado = textoEjemplo1 + ' ' +textoEjemplo2;
		System.out.println(textoResultado);
		textoResultado = textoEjemplo3 + ' ' + valorContatenacion;
		System.out.println(textoResultado);
		
		/*
		 * Longitud de un texto: Es tener la cantidad de caracteres dentro de un texto.
		 * Tome en cuenta que para obtener la longitud de un texto se tomará en cuneta 
		 * TODOS los caracteres del mismo.
		 * La operacion para representar la longitud de un texto es lenght.
		 */
		
		textoEjemplo1.length(); // Aplicando + como paso a ser un entero se suman
		System.out.println(textoEjemplo1.length()); // numero = 34 texto a entero
		System.out.println(textoEjemplo1.length() + valorContatenacion);// hace el texto enteros y los cuenta
		System.out.println(" " + textoEjemplo1.length() + valorContatenacion); // ahora se unen
		System.out.println(" " + (textoEjemplo1.length()+ valorContatenacion)); // Por prioridad
		
		int longitudTexto1 = textoEjemplo1.length(); //Es el resultado de la operacion .length
		System.out.println(longitudTexto1); // Se puede almacenar en una misma variable y sale
		System.out.println(longitudTexto1 + valorContatenacion);
		System.out.println(" " + longitudTexto1 + valorContatenacion); 
		System.out.println(" " + (longitudTexto1+ valorContatenacion));
		
		/*
		 * Mayusculas y Minusculas: Es cambiar los valores del texto en una linea determinada
		 * Mayusculas se utilizara la operacion UpperCase
		 * Minusculas se utilizara la operacion LowerCase
		 * Antes poner .toUpperCase
		 */
		System.out.println(textoEjemplo1); // Normal
		System.out.println(textoEjemplo1.toUpperCase()); //Mayusculas, solo afecta esta 
		System.out.println(textoEjemplo1); //Normal
		
		/*
		 * Recuerde que se puede crear una varaible o reasignar el valor
		 * PERMANENTEMENTE de un texto.
		 * textoEjemplo1= textoEjemplo1.toUpperCase(); // Se va a quedar en mayusculas, se reasigno
		System.out.println(textoEjemplo1); // Normal
		System.out.println(textoEjemplo1.toUpperCase()); //Mayusculas, solo afecta esta 
		System.out.println(textoEjemplo1); //Normal
		String textoEjemplo1Mayusculas = textoEjemplo1.toUpperCase(); //Almacenar en una variable
		System.out.println(textoEjemplo1Mayusculas);
		*/
		/*
		 * Minusculas
		 */
		System.out.println(textoEjemplo2);
		System.out.println(textoEjemplo2.toLowerCase()); // Solo para esta linea
		System.out.println(textoEjemplo2);
		
		/*
		 * Comparar un texto con otro: Esta basado en el concepto de comparación de cada uno
		 * de los caracteres en base de su codigo ASCII y la posicion que ocupan dentro
		 * del texto. EG
		 * "suma" diferente "Suma", "suma" diferente "suma ","suma" diferente "sUma"
		 * "suma" igual a "suma"
		 * 	textoEjemplo1.compareTo();  Utilizado para POO
		 *  textoEjemplo1.equals();  Utilizado para PE, representa boolean, el ignores más adelante
		 */
		System.out.println(textoEjemplo1.equalsIgnoreCase(textoEjemplo2));
		System.out.println(textoEjemplo1.equals("Texto"));
		System.out.println("texto".equals(textoEjemplo1));
		System.out.println(textoEjemplo1.equals(textoEjemplo1));
		System.out.println(textoEjemplo1.equals("Este es mi primer ejemplo de texto"));
		System.out.println(textoEjemplo1.equals("este es mi primer ejemplo de texto "));
		
		//System.out.println(textoEjemplo1.compareTo(textoEjemplo2));//Aun no se usa
		
		/*
		 * Encontrar un caracter en especifico: Esta opecion busca un caracter en especifico
		 * a lo largo de un texto. Tome en cuenta que la posicion sera un numero entero
		 * numero entero .indexOf -> representa la posicion del caracter.
		 * Tamaño: Cuena todos los elementos de un texto desde el 1
		 * Posicion: Me indica el lugar donde se encuentra un caracter y SIEMPRE inicia desde el 0
		 * con al opeacion indexOf solo se buscara hasta encontrar el primer caracter
		 */
		String textoEjemploPosicion = "Palabra";// 'a' -> 2,4,7 //'z' -> -1 
		int posicionCaracterA = textoEjemploPosicion.indexOf('a');
		System.out.println(textoEjemploPosicion.length());
		System.out.println(textoEjemploPosicion.indexOf('a'));// Se detiene a la primera que lo encuentra
		System.out.println(textoEjemploPosicion.indexOf('z'));
		System.out.println(posicionCaracterA);
		
		/*
		 * 	El caracter en una posicion dada: Es decir dada una posicion refrese el caracter
		 * que se encuentra en dicha posicion
		 * "Palabra"// carater 3 -> a// posicion 10 -> ERROR PE
		 * Para encontrar la posicion de un caracter dado se utilizará
		 * charAt
		 */
		char caracterPosicionDada = textoEjemploPosicion.charAt(5);
		System.out.println(textoEjemploPosicion.charAt(5));
		System.out.println(caracterPosicionDada);
		//System.out.println(textoEjemploPosicion.charAt(50));//Error nada más se ejecuta
		
		
		/*
		 * Extraccion de un texto:Esta definida como la operacion mediante la cual,
		 * el programa puede obtener una parte de un texto definido. Para esta 
		 * operacion se utilizará el metodo substring.
		 * Para la utilizacion del substring se lo puede utilizar de dos maneras.
		 * 1) Indicanco el inicio desde donde se queire obtener el texto.
		 * 2) Indicando un grupo determinado de caracters que se desean obtener.
		 */
		
		String textoCompleto = "Hola, este es el texto completo";
		//1) va a estar basada en la posicion del caracter a utilizar
		//Esto indica que se tomara el texto desde la posicion en adelante hasta el final
		//En este caso se incluye el caracter desde la posicion indicada.
		System.out.println(textoCompleto.substring(5));
		//Si se busca una posicion fuera del rango nos producirá un error.
		//System.out.println(textoCompleto.substring(100));
		String textoParcialInicio = textoCompleto.substring(30);
		System.out.println(textoParcialInicio.length());//Cuenta las letras desde el numero de arriba
		//2) Va a estar basado en una posicion inicial y final dentro de un String
		//En este caso se inclye la posicion inicial pero se excluye la posicion final
		System.out.println(textoCompleto.substring(2, 5));//cuenta desde 2 hasta n sin contarlo;
		String textoParcialPosiciones = textoCompleto.substring(2, 5);
		System.out.println(textoParcialPosiciones);
		System.out.println(textoCompleto);
		
		//Combinacion de operaciones. 
		boolean bandera = textoCompleto.substring(2).toLowerCase().equals("ejemplo");//Reasignar, leer de izquierda a derecha
		System.out.println(bandera);
		
	}
}
