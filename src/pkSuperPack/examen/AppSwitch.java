package examen;

import java.util.Scanner;

public class AppSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Primera definicion de switch, limitacion de casos en funcion de la estructura
        int a = sc.nextInt();
        boolean x = a > 16 ? true : false;
        int y = x?0:1;

        switch (y) {

            case(0):
                System.out.println("Todo lo que ocurre es verdadero");
                break;
            case(1):
                System.out.println("Todo lo que ocurre es falso");
                break;
            default:
                System.out.println("Todo lo que ocurre es invalido");

        }*/

        System.out.println("Ingrese la calificacion sobre 10, sin decimales");
        int calif = sc.nextInt();
        sc.nextLine();

        /*
        Estructura switch con casos repetidos

        switch(calif){

            case(0):
                System.out.println("Reprobado");
                break;
            case(1):
                System.out.println("Reprobado");
                break;
            case(2):
                System.out.println("Reprobado");
                break;
            case(3):
                System.out.println("Reprobado");
                break;
            case(4):
                System.out.println("Reprobado");
                break;
            case(5):
                System.out.println("Suspendido");
                break;
            case(6):
                System.out.println("Suspendido");
                break;
            case(7):
                System.out.println("Aprobado");
                break;
            case(8):
                System.out.println("Aprobado");
                break;
            case(9):
                System.out.println("Meritorio");
                break;
            case(10):
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Dato invalido");
        }
         */
        switch(calif){

            case(0):case(1):case(2):case(3):case(4):
                System.out.println("Reprobado");
                break;
            case(5):case(6):
                System.out.println("Suspendido");
                break;
            case(7):case(8):
                System.out.println("Aprobado");
                break;
            case(9):
                System.out.println("Meritorio");
                break;
            case(10):
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Dato invalido");
        }

        /*System.out.println("Ingrese un nombre");
        String nom = sc.nextLine();
        String x = "Est".concat("eban");
        System.out.println(x);
        switch(nom) {

            case("Pedro"):
                System.out.println("pedro");
                break;
            case("Al"+"berto"):
                System.out.println("alberto");
                break;
            case("Lucas"):
                System.out.println("lucas");
                break;
            default:
                System.out.println("orate");

        }

        int t = 3;
        switch(t) {

            case(5-2):
                System.out.println('l');
                break;
            default:
                System.out.println('f');
        }

         */

        /*
        Ejemplos del manejo de casos de switch en funcion de las variables declaradas
        int hola = sc.nextInt();
        switch(hola) {

            case(5+1): case(8): case(10):
                System.out.println("uno");
                break;
            case(11): case(25): case(15*2):
                System.out.println("dos");
                break;
            default:
                System.out.println("tres");
        }

        switch(++hola) {

            case(15): case(17): case(24/2):
                System.out.println("cuatro");
                break;
            default:
                System.out.println("Cinco");
        }

        switch(hola++) {

            default:
                System.out.println("siete");
                break;
            case('l'):
                System.out.println("seis");

        }

        switch(hola) {

            case(11):
                int cuatro=0;
                System.out.println("cuatro");
                break;
            case(12):
                cuatro = 5;
                System.out.println("caso 5" + cuatro);
                break;
            case(13):
                cuatro=8;
                System.out.println("caso 6" + cuatro);
                cuatro++;
                System.out.println("caso 7" + cuatro);
                break;
            default:
                cuatro = 9;
                System.out.println(cuatro);
                System.out.println("me canse");

        }*/

        double a = 34.6;
        int b = (int) a;

        System.out.println(a);
        System.out.println(b);

        Double c = 78.5;
        int d = c.intValue();

        System.out.println(c);
        System.out.println(d);

       Double cal = sc.nextDouble();
       int cal1 = cal.intValue();
       char gr = 'F';

       switch(cal1) {

           case(10):
               gr = 'A';
               break;
           case(9): case(8):
               gr = 'B';
               break;
           case(7):
               gr = 'C';
               break;
           case(6):
               gr = 'D';
               break;
           case(5):
               gr = 'E';
               break;
           default:
               gr = 'F';
       }

        System.out.println(gr);

       int total = 0;
       int contador = 0;
       int acont = 0;
       int bcont = 0;
       int ccont = 0;
       int dcont = 0;
       int econt = 0;
       int fcont = 0;

        System.out.printf("%s%n%s%n","Ingrese la calificacion sin decimales de 1 a 10","Para salir, " +
                "utilice el escape");

        while(sc.hasNext()) {

            int nota = sc.nextInt();
            total = total + nota;
            contador++;

            switch(nota) {

                case(10):
                    acont++;
                    break;
                case(9): case(8):
                   bcont++;
                    break;
                case(7):
                    ccont++;
                    break;
                case(6):
                    dcont++;
                    break;
                case(5):
                    econt++;
                    break;
                default:
                    fcont++;
            }
        }
        System.out.println("Reporte de Notas");
        if(contador != 0) {

            double promedio = (double) total/contador;

            System.out.printf("La suma de calificaciones es %d de un total de %d ingresos, " +
                    "donde el promedio es %.2f%n",total,contador,promedio);
            System.out.println("Clasificacion de calificaciones");
            System.out.printf("%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n","A",acont,
                    "B",bcont,"C",ccont,"D",dcont,"E",econt,"F",fcont);
        } else {

            System.out.println("No hay calificaciones ingresadas, no hay calculos");
        }
    }
}