package examen;

import java.util.Scanner;

public class AppWhile {
    public static void main(String[] args) {

        int i = 3;

        while(i<=5) {

            System.out.println(i);
            i++;
        } //existir mientras el valor evaluado es verdadero. Siempre si es verdadero

        boolean x = false;

        while(x) {

            System.out.println("hola");
        }

        /*int a = 0;

        while(a == 0);
        Lazo infinito básico
         */

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int contador = 1;

        //La primera estructura esta basada en la comparación de eventos consecutivos

        /*while(contador <= 10) {

            int numero = sc.nextInt();
            sc.nextLine();
            total = total + numero;
            contador = contador + 1;
        }

        int prom = total/contador;

        System.out.printf("%d total de ingresos y promedio %d en %d muestras", total,prom,contador);

         */

        /* while donde la condicion esta definida por la interaccion de la variable de control
        while(contador <= 10) {

            int cont = 0;
            int numero = sc.nextInt();
            sc.nextLine();
            total = total + numero;
            contador = contador + cont;
            cont++;

        }

        int prom = total/contador;


        System.out.printf("%d total de ingresos y promedio %d en %d muestras", total,prom,contador);

         */

        /*int cont = 0;
        while(cont != -1) {

            cont = sc.nextInt();
            sc.nextLine();
            total = total + cont;
            contador = contador + 1;
        }

        int prom = total/contador;

        System.out.printf("%d total de ingresos y promedio %d en %d muestras", total,prom,contador);

         */

        /* lazo while que existe en todo momento y lugar*/

        int a = 1;
        int b = 1;
        int aux = 0;
        int cont = 1;

        System.out.println(cont + ". " + a + " ");

        while(true) {

            cont++;
            System.out.println(cont + ". " + b + " ");
            aux = a +b;
            a = b;
            b = aux;

            if(aux >= 100) {

                break;
            }
        }
        System.out.println("el promedio de cuentas es " + aux/cont);

        int pasados = 0;
        int reprobados = 0;
        contador = 1;

        System.out.println("Numero de estudiantes: ");
        int control = sc.nextInt();
        while(contador <= control) {

            System.out.printf("Calificacion de estudiante %d (0 para reprobado, 1 para aprobado: %n",contador);
            int resultado = sc.nextInt();

            if(resultado == 0) {

                reprobados++;
            }else if(resultado == 1) {

                pasados++;
            }

            contador++;
        }

        System.out.printf("El numero de aprobados fue de %d y el de reprobados fue de %d%n", pasados,reprobados);

        if(reprobados > control*0.4) {

            System.out.println("Profesor debe mejorar");
        }else if(pasados >= control*0.75) {

            System.out.println("Clase funcional");
        }

    }
}