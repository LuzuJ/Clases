package Extra;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public int MAX = 100;
public class AutomataFinitoDeterminista {

    
    public static void main(String[] args) {
        ArrayList<Integer> estados = new ArrayList<>();
        ArrayList<Character> simbolos = new ArrayList<>();
        int[][] transiciones = new int[MAX][MAX];
        int q0;
        ArrayList<Integer> qf = new ArrayList<>();
        ArrayList<Integer> w = new ArrayList<>();
        boolean automataIngresado = false;
    
        Scanner scanner = new Scanner(System.in);
        int op, temp, tam;
    
        do {
            menu();
            op = scanner.nextInt();
    
            switch (op) {
    
                case 1:
                    estados.clear();
                    simbolos.clear();
                    qf.clear();
    
                    ingresaAutomata(estados, simbolos, transiciones);
                    mostrarEstados(estados);
    
                    System.out.print("\n Ingrese estado inicial: ");
                    q0 = scanner.nextInt();
    
                    System.out.print("\n Cuantos de estados finales hay?: ");
                    tam = scanner.nextInt();
    
                    System.out.println();
                    for (int i = 0; i < tam; i++) {
                        System.out.print("\t Numero de estado final: ");
                        temp = scanner.nextInt();
                        qf.add(temp);
                    }
    
                    automataIngresado = true;
                    break;
    
                case 2:
    
                    if (automataIngresado) {
                        String palabra;
                        w.clear();
                        boolean estadoVerificacion = false;
                        System.out.print("\n Ingrese palabra: ");
                        palabra = scanner.next();
    
                        convertirPalabra(palabra, simbolos, w);
    
                        estadoVerificacion = verificarPalabra(w, transiciones, q0, qf);
    
                        if (estadoVerificacion) {
                            System.out.println("\n\t Palabra aceptada \n\n");
                        } else {
                            System.out.println("\n\t Palabra no aceptada \n\n");
                        }
                    } else {
                        System.out.println("\n Automata no ingresado..! \n");
                    }
    
                    break;
    
                case 3:
                    System.exit(0);
    
                default:
                    System.out.println("\n\tOpcion incorrecta..!\n");
            }
    
        } while (op != 3);
    }
    
    public static void mostrarEstados(ArrayList<Integer> v) {
        System.out.println("\n\n ESTADOS DEL AUTOMATA \n\n");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(" " + i + "  -->  q" + v.get(i));
        }
    }
    
    public static void ingresaAutomata(ArrayList<Integer> E, ArrayList<Character> S, int[][] T) {
    
        int numE;  // Numero de estados
        int numS;  // Numero de simbolos
        char c;
    
        // Generando estados
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Cantidad de Estados: ");
        numE = scanner.nextInt();
        for (int i = 0; i < numE; i++) {
            E.add(i);
        }
    
        // Ingresando simbolos
        System.out.print("\n Cantidad de Simbolos: ");
        numS = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < numS; i++) {
            System.out.print("\t Simbolo " + (i + 1) + " : ");
            c = scanner.next().charAt(0);
            S.add(c);
        }
        Collections.sort(S);  // Ordenando simbolos
    
        // Ingresando tabla de transiciones
        System.out.println("\n INGRE
    

}
    }