public class pruebaEjercicio1 {

	public static void main(String[] args) {
		//Definimos las variables
		int enteroA;
		int enteroB;
		double double1;
		char caracter1;
		String unTexto;
		char caracter2;
		int enteroC;
		boolean boleano1;
		int enteroD;
		double double2;
		
		int sumaEnteros; 
		int sumaEnteroChar;
		char sumaCaracteres;
		int sumaEnteroBoleano;
		double sumaEnteroDoble;
		int sumaEnteros2; 
		String sumaTextEntero;
		
		
		//Asiganmos las variables
		enteroA = 10024;//a
		enteroB = 27; //b
		double1 = 17.78;//c
		caracter1 = 'A';//d
		unTexto = "Texto";//e
		caracter2 = ':'; //f
		enteroC = 72541;//g
		boleano1 = true;//h
		enteroD = 125104;//i
		double2 = 12.52;//j
		
		//Opercaiones y casteo
		
		sumaEnteros = enteroA + enteroB;
		System.out.println("La suma de dos enteros es: " + sumaEnteros);
		
		sumaEnteroChar = (int)(enteroA + caracter2);
		System.out.println("La suma de un entero y un caracter es: " + sumaEnteroChar);
		
		sumaCaracteres = (char)(caracter2 + caracter1);
		System.out.println("La suma de dos caracteres es: " + sumaCaracteres);
		
		//sumaEnteroBoleano = (int)(enteroC + boleano1); //No me sale :,((
		//System.out.println("La suma de un entero y un boleano es: " + sumaEnteroBoleano);
		
		sumaEnteroDoble = (double)(enteroA + double2);
		System.out.println("La suma de un entero y doble es: " + sumaEnteroDoble);
		
		sumaEnteros2 = enteroD + enteroB ;
		System.out.println("La suma de dos enteros es: " + sumaEnteros2);
		
		sumaTextEntero = (String)(enteroA + unTexto);
		System.out.println("La suma de un texto y entero es: " + sumaTextEntero);
	}

}
