package Extra;

import java.util.Arrays;
import java.util.Scanner;

public class AFDMaqVenta {

    static final int TKErr = -1; // Token de Error
    static final int TKFin = -2; // Token de Fin
    static final String[] ALFA = {"5", "10", "25", "50", "s", "\\t" };

    public static int[][] newMatriz(int f, int c) {
        int[][] m = new int[f][c];
        return m;
    }

    public static void showMatriz(int[][] pd, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(pd[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int getIndexAlfabeto(String str) {
        for (int i = 0; i < ALFA.length; i++) {
            if (ALFA[i].equals(str)) {
                return i;
            }
        }
        return TKErr;
    }

    public static void main(String[] args) {
        /*
         * Automata finito determinista : Cobra un dolar $1
         * 
         * _ _ _ _ 10 _ __ __
         * | |
         * [q0]- $5-> [q1]- $5-> [q2]- $5-> [q3]- $5->[q4]- $5->[q5]- $5 --->[q6]- $5->[q7]- $5->[q8]- $5->[q9]- $5->[q10]- $5->[q11]- $5->[q12]- $5->[q13]- $5->[q14]- $5->[q15]- $5->[q16]- $5->[q17]- $5->[q18]- $5->[q19]- $5->[[q20]]
         * | | |
         * | _ _ _ _ _ __ _ __ _ _ __ _ _ _ _ _ $50 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ _ __ _ _ _ _ __ _ _ _  | _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ $50 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|
         * _ _ _ _ _ __ _ __ _ _ __ _ _ _ _ _ $25 _ _ _ _ _ _ _ __
         * 
         * _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
         * Q | { 25 50 ' ' }
         * _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
         * 0 | 1 2 er
         * 1 | 2 3 er
         * 2 | 3 4 er
         * 3 | 4 er er
         * 4 | er er ok
         * 5 | er er ok
         * 6 | er er ok
         * 7 | er er ok
         * 8 | er er ok
         * 9 | er er ok
         * 10 | er er ok
         * 11 | er er ok
         * 12 | er er ok
         * 13 | er er ok
         * 14 | er er ok
         * 15 | er er ok
         * 16 | er er ok
         * 17 | er er ok
         * 18 | er er ok
         * 19 | er er ok
         * 20 | er er ok
         * _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
         */

        int[][] mt = null; // mt = matriz de transicion
        int Q = 5, L = 3;
        mt = newMatriz(Q, L);

        // matriz de transicion [Q][L]
        mt[0][0] = 1;       mt[0][1] = 2;
        mt[0][2] = TKErr;   mt[1][0] = 2;
        mt[1][1] = 3;       mt[1][2] = TKErr;
        mt[2][0] = 3;       mt[2][1] = 4;
        mt[2][2] = TKErr;   mt[3][0] = 4;
        mt[3][1] = TKErr;   mt[3][2] = TKErr;
        mt[4][0] = TKErr;   mt[4][1] = TKErr;
        mt[4][2] = TKFin;
        // showMatriz(mt,Q,L);
        // string palabra[] = {"25","25","25","25","s"};
        int q = 0, l = 0;
        String moneda;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un $1 en monedas de 25 y 50 centavos");
        do {
            System.out.print("(s para salir) >> Ingresa una moneda: ");
            moneda = scanner.nextLine();
            l = getIndexAlfabeto(moneda);
            q = mt[q][l];

            // System.out.println("\t" + moneda + q + "," + l);
            if (q == TKErr || q > Q) {
                System.out.println(">> Error, devolviendo tu dinero");
                System.exit(0);
            }
            if (q == TKFin) {
                System.out.println(">> OK, recibe tu gaseosa");
                System.exit(0);
            }
        } while (true);
    }
}

