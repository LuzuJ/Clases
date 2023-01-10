package examen;

public class AppBucle {
    public static void main(String[] args) {

        /*
        for clasico
        for(int i = 0; i <=10; i++) {

            System.out.println(i);
        }
        //System.out.println(i);
        */


        /*
        Esta estructura de for es equivalente a while(true) sin ruptura interna = lazo infinito
        for(;;) {

            System.out.println('a');
        }

         */

        /*
        For con variable de control externa
        int i = 0;
        for(;i<10;i++) {

            System.out.println(i);
        }
        System.out.println(i);

         */

        /*
        lazo for con iteracion de la variable de control, pero sin limitacion
        int i = 0;
        for(;;i++) {

            System.out.println(i);
        }

         */

        /*
        Equiparación especifica de while(true) con un for y una variable de control
        int i = 0;
        for(;i<10;) {

            System.out.println(i);
        }
        */

        /*
        Lazo donde la variable no ingresa al lazo en ningun momento, no hace nada
        int i = 0;
        for(;i>10;i++) {

            System.out.println(i);
        }

         */

        /*
        Otra expresion de while(true) dentro de for.
        int i = 0;
        for(;i<10;i--) {

            System.out.println(i);
        }
         */

        /*
        Representaciones de boolean a partir de strings (deprecado)
        boolean a = true;

        Boolean b = new Boolean("a");

        Boolean c = new Boolean("true");

        System.out.println(a);
        System.out.println(b);
        System.out.println(!b);
        System.out.println(c);
        System.out.println(!c);

         */

        hola1: for(int i = 0; i <10;i++){

            if(i == 8) {

                System.out.println("hola");
                break hola1;
            }
            System.out.println(i);
        }

        hola2: for(int i = 0; i <10;i++){

            if(i == 8) {

                System.out.println("hola");
                continue hola2;
            }
            System.out.println(i);
        }

        for(int i = 0; i <10;i++){

            hola3:if(i == 8) {

                System.out.println("hola");
                break hola3;
            }
            System.out.println(i);
        }

        char letra;
        int vocal = 0;
        int cont = 0;
        int esp = 0;
        String frase = "Esta es la hora de clase de programacion";

        for(int i = 0; i < frase.length(); i++){

            frase.toLowerCase();
            //System.out.println(frase);
            letra = frase.toLowerCase().charAt(i);

            if(letra == 'a'||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u') {

                vocal++;
            }else if(letra == ' ') {

                esp++;
            }else{

                cont++;
            }
        }

        System.out.printf("En total hay %d vocales, %d consonantes, %d espacios en toda la frase",vocal,cont,esp);

        vocal = 0;
        cont = 0;
        esp = 0;

        for(int i = 0; i < frase.length(); i++){

            letra = frase.toLowerCase().charAt(i);

            switch(letra) {

                case('a'): case('e'): case('i'): case('o'): case('u'):

                    vocal++;
                    break;
                case(' '):

                    esp++;
                    break;
                default:
                    cont++;
                    break;

            }
        }

        System.out.printf("En total hay %d vocales, %d consonantes, %d espacios en toda la frase",vocal,cont,esp);

        uno: for(int i = 0; i<= 5; i++) {

            dos: for(int j = 0; j <= 5; j++) {

                if(i==3){

                    System.out.println("i es " + i);
                    continue dos;
                } else if(j == 2) {

                    System.out.println("j es " + j);
                    break dos;
                }
                System.out.printf("%d.%d%n",i,j);
            }
        }

        int jota = 0;
        etuno: for(int i = 0; i<=10;i++){

            jota = i-1;

            etdos: if(jota > 0) {

                switch(jota){

                    case(1):
                        System.out.println("Hola");
                        break etdos;
                    case(2):
                        System.out.println("Chao");
                        continue;
                    default:
                        jota++;
                        break etuno;
                }
            }
        }

        System.out.println(jota);

        int d = 0;

        ettres: if(d >=0){

            etcuatro:for(int i = 0; i<=10;i++) {

                if(i-d > 2){

                    System.out.println("hola");
                    break etcuatro;
                }else {

                    continue;
                }
            }
        }

        char a = 'd';
        char b = 'e';

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        //tres formas de declarar un char
        char c = 'c'; //por el caracter especifico
        char e = 56; //por el valor entero correspondiente al ASCII (decimal)
        char f = 0x0041; //por el valor definido de ASCII (hexadecimal)

        System.out.println(c);
        System.out.println(e);
        System.out.println(f);

        String x = "Hola";
        String y = "Chao";

        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
        System.out.println(x+f);

        char h = 0x0041;

        for(String g = "A";!g.equals("ABC");g=g+h) {

            System.out.println(g);
            h++;
        }

        char B;
        char F = 'f';

        for(B = 'b';B<F;B++) {

            System.out.println('d');
        }







    }
}