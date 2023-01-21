import java.util.Scanner;

/*
 * Se necesita crear un programa que me permita realizar las cuatro operaciones 
 *basicas con fraccionarios
 */
public class EjerciciosFunciones5Grupo {

	//Fucnioes encargadas de sumar fracciones
	public static void sumaFracciones(int num1, int den1, int num2, int den2) {
		// Definimos e inicializamos las variables
		int numR=0, denR=0, contador=0;
		//Porceso encargado de definir el numero y denominador resultante
		numR= den2*num1+num2*den1;
		denR = den1*den2;
		//Estructura If encargada de determinar el proceso a realizar 
		if(numR==0) {//En caso de que el numerador sea 0
			System.out.println("La suma de " +num1 +"/"+ den1 + " + " + num2 + "/"+ den2 + " es igual a 0.");
		} if(denR==0) {//En este caso el denominador es 0
			System.out.println("La suma de " +num1 +"/"+ den1 + " + " + num2 + "/"+ den2 + " es infinito.");
		} if(numR==0 && denR==0) {//En caso de que numerador y denominador sea 0
			System.out.println("La suma de " +num1 +"/"+ den1 + " + " + num2 + "/"+ den2 + " es indeterminado");
		} if(numR!=0 && denR !=0) {//Se puede proceder con la operacion
			//Esctructura de if encargada de definir le contador con los valores más altos de numerador y denominador
			if(numR>denR) {
				contador=Math.abs(numR);
			}else {
				contador=Math.abs(denR);
			}
			//Estructura While encargada de simplificar la rspuesta obtenida
			while(contador>1) {
				if (numR%contador==0 && denR%contador==0) {
					numR = numR/contador;
					denR = denR/contador;
				}
				contador--;
			}
			System.out.println("La suma de " +num1 +"/"+ den1 + " + " + num2 + "/"+ den2 + " es igual a " + numR +"/"+denR);
		}
		
	}
	//Funcion encargada de restar Fracciones
	public static void restaFracciones(int num1, int den1, int num2, int den2) {
		int numR=0, denR=0, contador=0;
		//Porceso encargado de definir el numero y denominador resultante
		numR= den2*num1-num2*den1;
		denR = den1*den2;
		//Usamos las mismas restricciones del anterior caso
		if(numR==0) {
			System.out.println("La resta de " +num1 +"/"+ den1 + " - " + num2 + "/"+ den2 + " es igual a 0.");
		} if(denR==0) {
			System.out.println("La resta de " +num1 +"/"+ den1 + " - " + num2 + "/"+ den2 + " es infinito.");
		} if(numR==0 && denR==0) {
			System.out.println("La resta de " +num1 +"/"+ den1 + " - " + num2 + "/"+ den2 + " es indeterminado");
		} if(numR!=0 && denR !=0) {
			if(numR>denR) {
				contador=Math.abs(numR);
			}else {
				contador=Math.abs(denR);
			}
			while(contador>1) {
				if (numR%contador==0 && denR%contador==0) {
					numR = numR/contador;
					denR = denR/contador;
				}
				contador--;
			}
			System.out.println("La resta de " +num1 +"/"+ den1 + " - " + num2 + "/"+ den2 + " es igual a " + numR +"/"+denR);
		}
	}
	
	public static void multiplicacionFracciones(int num1, int den1, int num2, int den2) {
		int numR=0, denR=0, contador=0;
		//Procedo del numerador y denominador resultante 
		numR = num1*num2;
		denR = den1*den2;
		//Usamos las restricciones de los ejercicios anteriores
		if(numR==0) {
			System.out.println("La multiplicacion de " +num1 +"/"+ den1 + " * " + num2 + "/"+ den2 + " es igual a 0.");
		} if(denR==0) {
			System.out.println("La multiplicacion de " +num1 +"/"+ den1 + " * " + num2 + "/"+ den2 + " es infinito.");
		} if(numR==0 && denR==0) {
			System.out.println("La multiplicacion de " +num1 +"/"+ den1 + " * " + num2 + "/"+ den2 + " es indeterminado");
		} if(numR!=0 && denR !=0) {
			if(numR>denR) {
				contador=Math.abs(numR);
			}else {
				contador=Math.abs(denR);
			}
			while(contador>1) {
				if (numR%contador==0 && denR%contador==0) {
					numR = numR/contador;
					denR = denR/contador;
				}
				contador--;
			}
			System.out.println("La multiplicacion de " +num1 +"/"+ den1 + " * " + num2 + "/"+ den2 + " es igual a " + numR +"/"+denR);
		}
	}
	
	//Funcion encargada de dividir fracciones
	public static void divicionFracciones(int num1, int den1, int num2, int den2) {
		int numR=0, denR=0, contador=0;
		//Procedo del numerador y denominador resultante 
		numR = num1*den2;
		denR = den1*num2;
		//Usamos las restricciones de los ejercicios anteriores
		if(numR==0) {
			System.out.println("La division de " +num1 +"/"+ den1 + " : " + num2 + "/"+ den2 + " es igual a 0.");
		} if(denR==0) {
			System.out.println("La division de " +num1 +"/"+ den1 + " : " + num2 + "/"+ den2 + " es infinito.");
		} if(numR==0 && denR==0) {
			System.out.println("La division de " +num1 +"/"+ den1 + " : " + num2 + "/"+ den2 + " es indeterminado");
		} if(numR!=0 && denR !=0) {
			if(numR>denR) {
				contador=Math.abs(numR);
			}else {
				contador=Math.abs(denR);
			}
			while(contador>1) {
				if (numR%contador==0 && denR%contador==0) {
					numR = numR/contador;
					denR = denR/contador;
				}
				contador--;
			}
			System.out.println("La division de " +num1 +"/"+ den1 + " : " + num2 + "/"+ den2 + " es igual a " + numR +"/"+denR);
		}
		
	}
	
	public static void main(String[] args) {
		//Definimos e inicializamos las variables
		Scanner ingresoDatos=new Scanner(System.in);
		int num1=0, den1=0, num2=0, den2=0;
		
		//Ingreso de numeradores y denominadores por teclado
		System.out.println("Ingrese el numerador 1: ");
		num1 = Integer.parseInt(ingresoDatos.nextLine());
		System.out.println("Ingrese el denominador 1: ");
		den1= Integer.parseInt(ingresoDatos.nextLine());
		
		System.out.println("Ingrese el numerador 2: ");
		num2= Integer.parseInt(ingresoDatos.nextLine());
		System.out.println("Ingrese le numerador 2:");
		den2= Integer.parseInt(ingresoDatos.nextLine());
		
		//Llamado de las fuciones con las cuatro operaciones basicas con fracciones
		sumaFracciones(num1, den1 ,num2 ,den2 );
		restaFracciones(num1, den1, num2, den2);
		multiplicacionFracciones(num1, den1, num2, den2);
		divicionFracciones(num1, den1, num2, den2);
	}
	
	


	

	

}
