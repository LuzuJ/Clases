package Extra;
import java.util.*;

public class AFDab {
    


public static final int TKErr = -1;
public static final int TKOK = -10;
public static final String ALFA = "ab \t";

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

public static int getIndexAlfabeto(char c) {
    int index = ALFA.indexOf(c);
    if (index < ALFA.length()) {
        return index;
    }
    return TKErr;
}

public static void main(String[] args) {
    int[][] mt = null;
    int Q = 3, L = 3;
    mt = newMatriz(Q, L);

    /*
     * Automata finito determinista 
     *  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
     * Q | { a b ' ' } 
     *  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
     * 0 | 1 2 er 
     * 1 | 1 2 er 
     * 2 | er er ok 
     *  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
     */

    // matriz de transicion [Q][L]
    mt[0][0] = 1;
    mt[0][1] = 2;
    mt[0][2] = TKErr;
    mt[1][0] = 1;
    mt[1][1] = 2;
    mt[1][2] = TKErr;
    mt[2][0] = TKErr;
    mt[2][1] = TKErr;
    mt[2][2] = TKOK;

    // w1 = a --> error // w = palabra
    // w2 = ac --> error
    // w3 = aab --> ok
    // w4 = bd --> error
    // w5 = b --> ok
    // w6 = aaaab --> ok
    // w7 = aaaa --> error

    String w = "aaaa ";
    int q = 0, l = 0;
    System.out.println("palabra w = " + w);
    for (char c : w.toCharArray()) {
        l = getIndexAlfabeto(c);
        q = mt[q][l];
        // System.out.println(c + " " + q + "," + l);
        if (q == TKErr || q > Q)
            System.out.print("\t -> Error  ");
        if (q == TKOK)
            System.out.print("\t -> OK  ");
    }
    System.out.println();

    // for (int i = 0; i < Q; i++)
    // for (int j = 0; j < L; j++)
    // mt[i][j] = 'a'; //rand() % 10; // genera randomicos hasta 10

    // showMatriz(mt,Q,L);
}

}
