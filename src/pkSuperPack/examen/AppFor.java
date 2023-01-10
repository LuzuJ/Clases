package examen;
import java.util.Scanner;
import java.math.*;

public class AppFor {
    public static void main(String[] args) {

        for(int i = 0;i<10;i++){

            System.out.println(i + " Holita");
        }

        Scanner sc = new Scanner(System.in);

        /*Suponga que es necesario validar si un numero es par. (while)*/
        /*System.out.println("Ingrese el valor");
        int eval = 0;
        int valor = sc.nextInt();

        while(true) {

            eval = valor%2;
            if(eval == 0) {

                System.out.println("Es par");
                break;
            }else{

                System.out.println("Es impar");
            }
        }

         */

        /*Muestra de numeros aleatorios hasta que salga el 45 ()do-while*/
        /*int numero;
        do {

           numero = (int)(100*Math.random());
           System.out.println("El numero es: " + numero);
        }while(numero != 45);

         */

        /*Funcion para calcular la potencia de dos numeros (for)*/
        int base = sc.nextInt();
        int exponente = sc.nextInt();
        int potencia = 1;

        for(int i = 0; i < exponente;i++) {

            potencia = potencia*base;
        }
        System.out.printf("El resultado de %d a la %d es %d", base,exponente,potencia);

    }
}