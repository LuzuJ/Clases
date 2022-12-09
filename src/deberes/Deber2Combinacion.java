package deberes;

import java.util.Scanner;

/**
 * @author Jonathan Luzuriaga
 * @date 09/12/2022
 *       Combinacion de letras
 */
public class Deber2Combinacion {
    static int count = 0;

    public static void combinaciones(String primero, String letras) {

        if  (letras.length() == 2) {
            count = count + 2;
            System.out.println(primero + letras.charAt(1) + "" + letras.charAt(0));
            System.out.println(primero + letras.charAt(0) + "" + letras.charAt(1));
        } else {
            for (int i = 0; i < letras.length(); i++) {
                combinaciones(primero + letras.charAt(i), quitarLetra (letras, i));
            }
        }
    }

    public static String quitarLetra(String letras, int i) {
        if (i == 0) {
            return letras.substring(i + 1, letras.length());
        } else {
            if (i == letras.length()) {
                return letras.substring(0, letras.length() - 1);
            } else {
                return letras.substring(0, i) + letras.substring(i + 1, letras.length());
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que letras desea combinar");
        String letras = sc.nextLine();
        System.out.println("combinaciones de: " + letras);
        combinaciones(" ", letras);
        System.out.println("total: " + count);
        sc.close();
    }

}