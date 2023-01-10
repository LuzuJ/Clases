package factura;

import java.util.Scanner;
import java.util.Locale;

public class AppScanner2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        String a = "Nuevo";
        String b = "nuevo";
        String c = "Nuevo";
        String d = "Usado";

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(b==a);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println();
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(b.equals(a));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));

        Computador comp1 = new Computador();

        comp1.imprimirComputador();
        if(comp1.isUsado()) {

            System.out.println("Hoy es viernes");
        } else {

            System.out.println("Que bueno");
        }

        System.out.println(comp1.getId() + 5);

    }
}
