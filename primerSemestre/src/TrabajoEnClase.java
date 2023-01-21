/*
* Definir las siguientes variables:
* Tres datos tipo entero int , doble, flotante, texto
* Imprimir la suma de e1 + e3
* Imprimir la suma del e2 + e1
* Imprimir la multiplicacion de d1 * d3
* Imprimir la suma del d2 + d1
* Imprimir la suma de t1 + t3
* Imprimir la suma del t2 + t1
*
*/
public class TrabajoEnClase {

	public static void main(String[] args) {
		//int datEnt=5, datEnt2; se puede :0
		int num1, num2, num3, sum1, sum2;
		double otroNum1, otroNum2, otroNum3, mult1, sum3;
		float flot1, flot2, flot3;
		String text1, text2, text3;
		
		//Asignar valores
		num1 = 53;
		num2 = 50;
		num3 = 10;
		otroNum1 = 5.3;
		otroNum2 = 1.5;
		otroNum3 = 8.9;
		flot1 = 10;
		flot2 = 5;
		flot3 = 9;
		text1 = " Este texto es de prueba ";
		text2 = " Mucho Texto ";
		text3 = " Menos texto ";
		//Resultados
		sum1= (num1+num3);
		sum2= (num2+num3);
		mult1 = (otroNum1 * otroNum3);
		sum3 = (otroNum2 + otroNum1);
		System.out.println("La suma de e1 +e3 es: " + sum1); //Para unir el + :(
		System.out.println("Suma de e2 + e3 es: " + sum2);
		System.out.println("La multiplicacion de d1 y d3 es: " + mult1);
		System.out.println("La suma de d2 y d1 es: " + sum3);
		System.out.println("La suma de un texto 1 y 3: " + (text1 + text3)); //Los parentecis :(
		System.out.println("La suma de un texto 2 y  1: "+(text2 + text1));
		
		
		
	}

}
