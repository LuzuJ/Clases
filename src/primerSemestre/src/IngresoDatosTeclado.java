import java.util.Scanner;
/* 
 * Esta clase es para ingreso de diferentes datos a traves de teclado 
 * mediante la consola.
 * Consola: El cuadro de abajo que muestra resultados
 */
public class IngresoDatosTeclado {

	public static void main(String[] args) {
		//Definicion de variables
		// Scanner Nombre de la varibale = que lea todo lo que yo voy a poner
		Scanner ingresoDatos = new Scanner (System.in);//Objeto el error es por que no sierra 
		//String texto1;
		String texto2;
		String salarioTexto;
		String textoHijos;
		String textoPropiedades;
		
		String nombrePadres;
		String valorCasaTexto;
		String numeroAutoTexto;
		int numeroAutoValor;
		double valorCasaValor;
		double precioCasa;
		int numeroAutos;
		
		double salarioValor;
		int numeroHijosValor;
		float numeroPropiedadesValor; //Normalmente no se ingresan se generan, no permite ingresar valor
		
		
		//Asignacion de valores
		//texto1 = "Este es un ejemplo de texto";
		//System.out.println(texto1);
		
		System.out.println("Ingrese un texto: ");
		texto2 = ingresoDatos.nextLine(); //Cualquier dato que ingrese se almacena en la variable
		System.out.println(texto2);// :0
		
		//System.out.println("Ingrese su apellido: ");
		//texto2 = ingresoDatos.nextLine();
		//System.out.println(texto2);
		
		//System.out.println("Ingrese su número de teléfono: ");
		//texto2 = ingresoDatos.nextLine();
		//System.out.println(texto2);
		
		/*
		 * Ingreso de diferentes tipos de datos.
		 * Un scanner al ser una herramienta que me permita ingresar diferentes
		 * tipos de DATOS, posee los metodos o elementos necesarios para ingresar 
		 * el tipo datos que el usuario o el programador desee.
		 * Sin embargo para programacion estructurada (Pogramación 1), el uso de
		 * la herramienta scanner va a estar limitada al uso de un solo metodo
		 * para el ingreso de datos. Todo dato ingresado a traves de la herramineta 
		 * scanner va a ser considerado como un texto y para la utilizacion de tipo
		 * de datos deseado por el programa se utilizara una herramienta adicional 
		 * conocida como Parse
		 * Parse: La herramineta parse permite al programador obtener el valor deseado sobre
		 * un texto determinado. Eg. Texto: 1000 Int: 1000   Texto: 2.2 Double: 2.2
		 * Texto 2,3 Double: Error  Texto: Salario = 1200.5 Double= Error
		 * Considere y tome en cuenta que la herramienta Parse toma TEXTUALMENTE y 
		 * ESPECIFICAMENTE lo que le usuario escribe en la consola.
		 * Parce Entero, Doble, Float
		 * 
		 * Para renombrar clic derecho refactor, rename y cambia en todas
		 */
		
		//Proceso para cambiar un texto a un doble 
		System.out.println("Digite su sueldo");
		salarioTexto = ingresoDatos.nextLine();//El cuadro que sale es para que sirve 
		salarioValor = Double.parseDouble(salarioTexto);//Parce y transformará, la libreria es para todo
			
			// double diferente Double= Se asocia a la libreria 
			//salario = ingresoDatos.nextLine(); //No se puede por que es tipo texto, si sale error al darle clic te puede ayudar con lo más conveniente
			//ingresoDatos. se abrira la libreria, indice, de java .util. de arriba
		
		//Proceso para cambiar un texto a entero
		System.out.println("Digite el número de hijos");
		textoHijos = ingresoDatos.nextLine();
		numeroHijosValor = Integer.parseInt(textoHijos);
		
		//Proceso para cambiar texto a flotante
		System.out.println("Ingrese el numero de propiedades");
		textoPropiedades= ingresoDatos.nextLine(); //Ingresara con . por que transforma, asignacion manual no sale, de scanner si
		numeroPropiedadesValor = Float.parseFloat(textoPropiedades);  
		
		//Operaciones numericas con los valores obtenidos
		double valorIESS= salarioValor * 1.5; //No leera las ","
		System.out.println("El valor del IESS es " + valorIESS);
		double bonoHijos = (100 * numeroHijosValor) + salarioValor;
		
		
		//Impresion de resultados
		System.out.println("El bono por el numero de hijos es " + bonoHijos);
		System.out.println("El numero de hijos es " + textoHijos);
		System.out.println("El numero de propiedades es "+ textoPropiedades);
		System.out.println("El numero de propiedades es " + numeroPropiedadesValor);
		
		
		
		//texto2 = ingresoDatos.nextLine();
			//double calculoValorIESS = salario * .12;
			//ingresoDatos.nextLine();
			//ingresoDatos.close();//Para que termine de ingresar datos
		
		/*
		 * Ingresar por consola numero de autos -int, Nombre de los padres, 
		 * precio de la casa- double.
		 */
		
		//Proceso una linea cambio a texto double
		System.out.println("Ingrese el precio de la casa");
		precioCasa = Double.parseDouble(ingresoDatos.nextLine()); //Se ahorran lineas se puede :3
		
		System.out.println("Ingrese numero de carros");
		numeroAutos = Integer.parseInt(ingresoDatos.nextLine());//in ctrl espacio y sale integer
				
		System.out.println("Ingresar numero de autos");
		numeroAutoTexto= ingresoDatos.nextLine();
		numeroAutoValor = Integer.parseInt(numeroAutoTexto);
		
		System.out.println("Ingrese nombre de padre: ");
		nombrePadres = ingresoDatos.nextLine();
		System.out.println(nombrePadres);
		
		System.out.println("Ingrese nombre de madre: ");
		nombrePadres= ingresoDatos.nextLine();
		System.out.println(nombrePadres);
		
		System.out.println("Ingrese valor de la casa: ");
		valorCasaTexto = ingresoDatos.nextLine();
		valorCasaValor = Double.parseDouble(valorCasaTexto);
		
		System.out.println("Numero de autos " + numeroAutoValor);
		System.out.println("Valor de casa " + valorCasaValor);
		System.out.println("El precio de la casa es " + precioCasa);
		System.out.println("El numero de autos es " + numeroAutos);
		
		
		
	}

}
