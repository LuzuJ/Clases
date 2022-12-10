package deberes;

/**
 * @author Jonathan Luzuriaga
 * @date 9/dic/2022
 * Encontrar las combinatorias de n numero de letras
 */
import java.util.Arrays;
import java.util.Scanner;

public class Deber2Com {
    // Creamos un Objeto para todo el programa
    static int contador = 0;

    /**
     * Funcion para cortar arrays a n numero de posicion
     * 
     * @param posicion  posicion reasignada de la letra
     * @param letrasAbc arrays con todas las letras
     * @param letra     letra donde se cortará el array
     */
    public static void ectraerLetras(int posicion, char[] letrasAbc, char letra, int grupos) {

        for (int posIncial = 0; posIncial < letrasAbc.length; posIncial++) {
            if (letra == letrasAbc[posIncial])
                posicion = posIncial;
        }

        char[] letrasCorte = new char[posicion + 1];
        for (int posIncial = 0; posIncial <= posicion; posIncial++) {
            letrasCorte[posIncial] = letrasAbc[posIncial];
        }

        do {
            System.out.println(Arrays.toString(letrasCorte));
        } while (combinarCR(letrasCorte));

        System.out.println("Total: " + contador);
    }

    /**
     * Funcion para combinarCR todas las letras posibles dentro de un array.
     * 
     * @param letrasCorte array a combinarCR
     * @return arrays combinados
     */
    public static boolean combinarCR(char[] letrasCorte) {
        contador = contador + 1;
        int posIncial = letrasCorte.length - 1;
        while (posIncial > 0 && letrasCorte[posIncial - 1] >= letrasCorte[posIncial]) {
            posIncial--;
        }
        if (posIncial <= 0)
            return false;

        int posFin = letrasCorte.length - 1;
        while (letrasCorte[posFin] <= letrasCorte[posIncial - 1]) {
            posFin--;
        }
        char temp = letrasCorte[posIncial - 1];
        letrasCorte[posIncial - 1] = letrasCorte[posFin];
        letrasCorte[posFin] = temp;

        posFin = letrasCorte.length - 1;
        while (posIncial < posFin) {
            temp = letrasCorte[posIncial];
            letrasCorte[posIncial] = letrasCorte[posFin];
            letrasCorte[posFin] = temp;
            posIncial++;
            posFin--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0, grupos = 0;
        String abecedario = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] letrasAbc = abecedario.toCharArray();
        System.out.println(" ");
        System.out.println(Arrays.toString(letrasAbc));
        System.out.println(" ");
        System.err.println("LE RECOMIENDO NO INGRESAR MAS DE G :V");
        System.out.println("Ingrese hasta que letras desea combinar: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("En grupos de cuantos desea juntar? ");
        grupos = sc.nextInt();

        ectraerLetras(posicion, letrasAbc, letra, grupos);

        sc.close();
    }

}
