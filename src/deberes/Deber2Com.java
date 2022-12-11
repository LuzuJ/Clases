package deberes;

/**
 * @author Jonathan Luzuriaga
 * @date 10/dic/2022 
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
    public static void ectraerLetras(int posicion, char[] letrasAbc, char letra) {

        for (int i = 0; i < letrasAbc.length; i++) {
            if (letra == letrasAbc[i])
                posicion = i;
        }

        char[] letrasCorte = new char[posicion + 1];
        for (int i = 0; i <= posicion; i++) {
            letrasCorte[i] = letrasAbc[i];
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
        int i = letrasCorte.length - 1;
        while (i > 0 && letrasCorte[i - 1] >= letrasCorte[i]) {
            i--;
        }
        if (i <= 0)
            return false;

        int j = letrasCorte.length - 1;
        while (letrasCorte[j] <= letrasCorte[i - 1]) {
            j--;
        }
        char temp = letrasCorte[i - 1];
        letrasCorte[i - 1] = letrasCorte[j];
        letrasCorte[j] = temp;

        j = letrasCorte.length - 1;
        while (i < j) {
            temp = letrasCorte[i];
            letrasCorte[i] = letrasCorte[j];
            letrasCorte[j] = temp;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        String abecedario = "abcdefghijkl";
        char[] letrasAbc = abecedario.toCharArray();
        System.out.println(" ");
        System.out.println(Arrays.toString(letrasAbc));
        System.out.println(" ");
        System.err.println("LE RECOMIENDO NO INGRESAR MAS DE G");
        System.out.println("Ingrese hasta que letras desea combinar: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("En grupos de cuantos desea juntar? ");

        ectraerLetras(posicion, letrasAbc, letra);

        sc.close();
    }

}
