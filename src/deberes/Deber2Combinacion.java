package deberes;

import java.util.Scanner;

/**
 * @author Jonathan Luzuriaga
 * @date 09/12/2022
 *       Combinacion de paComb
 */
public class Deber2Combinacion {
    //Crear un objeto
    static int contador = 0;
    /**
     * 
     * @param primero
     * @param paComb
     */
    public static void combinaciones(String primero, String paComb) {

        if  (paComb.length() == 2) {
            contador = contador + 2;
            System.out.println(primero + paComb.charAt(1) + "" + paComb.charAt(0));
            System.out.println(primero + paComb.charAt(0) + "" + paComb.charAt(1));
        } else {
            for (int i = 0; i < paComb.length(); i++) {
                combinaciones(primero + paComb.charAt(i), quitarLetra (paComb, i));
            }
        }
    }

    public static String quitarLetra(String paComb, int i) {
        if (i == 0) {
            return paComb.substring(i + 1, paComb.length());
        } else {
            if (i == paComb.length()) {
                return paComb.substring(0, paComb.length() - 1);
            } else {
                return paComb.substring(0, i) + paComb.substring(i + 1, paComb.length());
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que letras o numeros desea combinar");
        String paComb = sc.nextLine();
        System.out.println("combinaciones de: " + paComb);
        combinaciones("", paComb);
        System.out.println("total: " + contador);
        sc.close();
    }

}