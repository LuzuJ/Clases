package deberes;

import java.util.Arrays;
import java.util.Scanner;

public class Deber2Com {

    /**
     * @param letras
     * @return
     */


    //Creamos un objeto que nos permita contar
    static int contador = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion = 0;
        String abecedario = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] letrasAbc = abecedario.toCharArray();
        System.out.println(Arrays.toString(letrasAbc));
        System.out.println(" ");
        System.err.println("LE RECOMIENDO NO INGRESAR MAS DE 6 :V");
        System.out.println("Ingrese hasta que letras desea combinar: ");
        
        char letra = sc.nextLine().toLowerCase().charAt(0);
        for (char c : letrasAbc) {
            for (int i = 0; i < letrasAbc.length; i++) {
                if (letra == letrasAbc[i]) 
                    posicion = i;
            }
        }
        char[] letrasMin = new char[posicion+1];
        for (int i = 0; i <= posicion; i++) {
            letrasMin[i] = letrasAbc[i];
        }

        do {
            System.out.println(Arrays.toString(letrasMin));
        } while (combinar(letrasMin));

        System.out.println("Total: " + contador);
        
         
        


        sc.close();
    }
    public static boolean combinar(char[] letrasMin) {
        contador = contador + 1;
        int i = letrasMin.length-1;
        while (i>0 && letrasMin[i-1] >= letrasMin[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = letrasMin.length-1;
        while (letrasMin[j] <= letrasMin[i-1]) {
            j--;
        }
        char temp = letrasMin[i-1];
        letrasMin[i - 1] = letrasMin[j];
        letrasMin[j] = temp;

        j = letrasMin.length-1;
        while (i<j) {
            temp = letrasMin[i];
            letrasMin[i] = letrasMin[j];
            letrasMin[j] = temp;
            i++;
            j--;
        }
        return true;
    }
    
    
    
}
