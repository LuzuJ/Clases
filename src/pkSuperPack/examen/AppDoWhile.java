package examen;

import java.util.Scanner;

public class AppDoWhile {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.printf("Impresion antes: %d%n",a); //5
        System.out.printf("Impresion durante: %d%n",a++); //6
        System.out.printf("Impresion despues: %d%n",a); //6

        System.out.println();

        System.out.printf("Impresion antes: %d%n",b); //5
        System.out.printf("Impresion durante: %d%n",++b);//6
        System.out.printf("Impresion despues: %d%n",b);//6

        /*int i = 0;
        do {
            i++;
            System.out.println(i + ". Hola Mundo");

        }while(i<10);*/

        int fact = 1;
        int i = 1;
        int j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int num = sc.nextInt();

        do {

            j++;
            fact = fact*i;
            i++;

        }while(i<=num);

        System.out.printf("El factorial de %d es %d en %d bucles%n",num,fact,j);

        num = 0;
        i = 1;
        j = 0;
        fact = 1;

        num = sc.nextInt();
        int nume = num;

        do {

            j++;
            fact = num*fact;
            num--;
        }while(num>0);

        System.out.printf("El factorial de %d es %d en %d bucles%n",nume,fact,j);

        int h = 6;
        double g = (double)h/4;

        System.out.println(h);
        System.out.println(g);

    }



}