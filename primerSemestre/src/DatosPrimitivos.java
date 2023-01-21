
public class DatosPrimitivos {
	/*
	 * Datos Primitivos: Son todos aquellos tipos de datos que se encuentran pre cargados 
	 * en el lenguaje de programacion. Estos tipos de datos se los define a traves de 
	 * palabrasy como interactuan entre ellos.
	 * En java tenemos los siguientes tipos de datos primitivos:
	 * Float, Double, Byte, char, int, long, boolean.
	 */
	/*
	 * Error: Es un problema que se puede sucitar por sintaxis, tiempo de compilacion,
	 * tiempo de ejecucion. Con error normalmente no se ejecuta
	 * Advertencia: Esta asociada a una mala practica
	 * Normlamente si se puede ejecutar
	 */

	public static void main(String[] args) {
		// Definicion de datos
		// Definir nombreVariable como Tipo PSeInt
		// Tipo nombreVariable; Lenguaje de programacion
		byte datoTipoByte;
		short datoTipoShort;
		int datoTipoEntero;
		long datoTipoLargo;
		float datoTipoFloat;
		double datoTipoDouble;
		char datoTipoChar;
		boolean datoTipoBoolean; //Hasta aqui datos primitivos
		String datoTipoString;	//Dato generico
		
		//Asignacion de valores
		datoTipoByte = 100; //Si el valor supera su rango de memoria saldra error
		//Reasignacion del valor de una variable: Nos ayuda a cambiar el valor anterior
		//de una caribale, tome en cuenta el valor que persiste en el ultimo
		//valor asignado
		datoTipoByte = 105; //Si hay dos escribirá el ultimo valor,
		datoTipoShort = 5000; //Cuidado con como escribes mejor da ctrl espacio
		datoTipoEntero = 30000;
		datoTipoLargo = 1000;
		datoTipoFloat = 7 ; //Es resultado busca presicion, asigan como enteros a menos que yo diga cuantos decimales quiero
		//Dato Float se va a generar dependiendo la operacion, nosotros asignamos la presicion que queremos
		datoTipoDouble = 2.7; //Si divide enteros va a dar enteros, hay que poner decimal .0, casteo trasnformar datos
		datoTipoChar = 'd'; //Alt + 39, siempre para caracteres
		datoTipoBoolean = false; //Si no sabe algun apostrofe, tabla codigo hace
		datoTipoString = "Hola es mi primer texto";
		
		//Operaciones o uso de varibales. Imprime todo, hasta el espacio es un caracter
		//Concatenar: Unir los datos  a lo que uno necesite
		//Para hacer operacione primero la operacion y luego imprimir
		System.out.println("Este es el valor tipo byte " + datoTipoByte); //ctrl espacio literal
		System.out.println("Este es el valor tipo short " + datoTipoShort);
		System.out.println("Este es el valor tipo entero " + datoTipoEntero);
		System.out.println("Este es el valor tipo largo " + datoTipoLargo);
		System.out.println("Este es el valor tipo flotante " + datoTipoFloat); 
		System.out.println("Este es el valor tipo double " + datoTipoDouble);
		System.out.println("Este es el valor tipo caracter " + datoTipoChar);
		System.out.println("Este es el valor tipo boleano " + datoTipoBoolean);
		System.out.println("Este es el valor tipo texto " + datoTipoString);
		
		
		

	}

}
