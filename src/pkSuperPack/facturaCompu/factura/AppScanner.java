package factura;

import java.util.Locale;
import java.util.Scanner;
/*
invocacion generica de la bliblioteca completa, no usar de manera generica por seguridad.
import java.util.*;
 */

public class AppScanner {

    //NUNCA escribir las importaciones de bibliotecas luego de la declaracion de la clase

    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;
        double peso;
        String nombre;
        int precio1, precio2, precio3;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        /*
        System.out.println("Ingrese su dia de nacimiento");
        dia = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mes = sc.nextInt();
        System.out.println("Ingrese su anio de nacimiento");
        anio = sc.nextInt();
        */

        System.out.println("Ingrese la fecha de nacimiento con espacios");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();
        // nombre = sc.next(); lee el ultimo \n de la sentencia previa, y congela el prompt

        System.out.println("Ingrese un nombre y un precio");
        nombre = sc.next();
        peso = sc.nextDouble();
        sc.nextLine(); //leer todo lo que esta en el buffer, y eliminar el ultimo \n para limpiar el buffer
        sc.close(); //cierra la utilizacion del buffer en esta ejecucion y permanece cerrado.

        System.out.println("Naciste un " + dia + " de " + mes + " del " + anio);
        System.out.println("Te llamas " + nombre + " y el valor es " + peso);

        Scanner sc1 = new Scanner(System.in);


        System.out.println("Ingrese la temperatura");
        double temp = sc1.nextDouble();
        System.out.println("Hace " + temp + " grados");
        sc1.nextLine();

    }


}
