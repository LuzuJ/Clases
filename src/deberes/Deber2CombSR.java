package deberes;

/**
 * @author Jonathan Luzuriaga
 * @date 9/dic/2022
 * Encontrar las combinatorias de n numero de letras
 */
import java.util.Arrays;
import java.util.Scanner;

public class Deber2CombSR {
    // Creamos un Objeto para todo el programa
    static int contador = 0;

    /**
     * Funcion para combinarCR todas las letras posibles dentro de un array.
     * 
     * @param letrasAbc array a combinarCR
     * @param j2
     * @return 
     */
    public static void combinarCR(char[] letrasAbc, int grupos, int[] fijador, char letra, int j, int k) {
        contador = contador + 1;
        if (fijador == null) {
            fijador = new int[grupos];
            
        }

        if (j < grupos) {
            for (int i = k; i < letrasAbc.length; i++) {
                fijador[j] = i;
                combinarCR(letrasAbc, grupos, fijador, letra, j + 1, k + 1);
               
            }

        } else {
            System.out.println("");
            for (int l = 0; l < letrasAbc.length; l++) {
                System.out.print(letrasAbc[fijador[l]]);
               
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grupos = 0;
        String abecedario = "abcdefghijklmnop";
        char[] letrasAbc = abecedario.toCharArray();
        System.out.println(" ");
        System.out.println(Arrays.toString(letrasAbc));
        System.out.println(" ");
        System.out.println("Ingrese que tan grande sera el arreglo: ");
        char letra = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("En grupos de cuantos desea juntar? ");
        grupos = sc.nextInt();

        int[] fijador = null;
        int j = 0, k = 0;

        combinarCR(letrasAbc, grupos, fijador, letra, j, k);

        System.out.println(" ");
        System.out.println("Las repeticiones son: " + contador);

        int posicion = 0;
        for (int posIncial = 0; posIncial < letrasAbc.length; posIncial++) {
            if (letra == letrasAbc[posIncial])
                posicion = posIncial;
        }

        char[] letrasCorte = new char[posicion + 1];
        for (int posIncial = 0; posIncial <= posicion; posIncial++) {
            letrasCorte[posIncial] = letrasAbc[posIncial];
        }
        
        combinarCR(letrasAbc, grupos, fijador, letra, j, k);
        System.out.println(contador);
        sc.close();
    }

}
