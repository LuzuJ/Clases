package pkArreglo;

import java.util.List;
import java.util.ArrayList;

public class Cadena {
    public void showArrayListx() {
        // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento
        // u Objeto (float, Boolean, Object, ...)
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añade el elemento al ArrayList
        nombreArrayList.add("Elemento 1");
        nombreArrayList.add("Elemento 2");
        // Añade el elemento al ArrayList en la posición 'n'
        // nombreArrayList.add(1, null);
        nombreArrayList.add(1, "Elemento 1.1");
        // Devuelve el numero de elementos del ArrayList
        nombreArrayList.size();

        // Devuelve el elemento que esta en la posición '2' del ArrayList
        nombreArrayList.get(2);

        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
        nombreArrayList.contains("Elemento");
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList
        nombreArrayList.indexOf("Elemento");
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
        nombreArrayList.lastIndexOf("Elemento");
        // Borra el elemento de la posición '5' del ArrayList
        nombreArrayList.remove(5);
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.
        nombreArrayList.remove("Elemento");
        // Borra todos los elementos de ArrayList
        nombreArrayList.clear();
        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False
        nombreArrayList.isEmpty();

        // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añadimos 10 Elementos en el ArrayList
        for (int i = 1; i <= 10; i++) {
            nombreArrayList.add("Elemento " + i);
        }

        // Añadimos un nuevo elemento al ArrayList en la posición 2
        nombreArrayList.add(2, "Elemento 3");
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            String elemento = nombreIterator.next();
            System.out.print(elemento + " / ");

        }
    }

    public void showListString() {
        List<String> listado = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        listado.add("Pepe");
        listado.add("Ana");
        listado.add("Lucho");

        numeros.add(1);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);

        for (String nombre : listado) {
            System.out.println(nombre);
        }

        for (Integer num : numeros) {
            System.out.println(num);
        }

        String nombre = "Pancracio";
        System.out.println(String.format("%.6s", nombre));

    }

    public void showMatrizCharLogo() {
        char logo[][] = new char[5][5];

        System.out.println("cleaning...");
        for (int f = 0; f < logo.length; f++) {
            for (int c = 0; c < logo[f].length; c++)
                if (c == f || ((c + f + 1) == logo.length))
                    logo[f][c] = 'X';
                else
                    logo[f][c] = ' ';
        }

        System.out.println("draw char...");
        for (int f = 0; f < logo.length; f++) {
            for (int c = 0; c < logo[f].length; c++)
                System.out.print("  " + logo[f][c]);
            System.out.println(" ");
        }
    }

    public void showMatrizIntAnormal() {
        int pares[][] = {
                { 0, 1, 2 }, { 1, 2, 3, 4 }, { 2, 3, 4, 5, 7 }, { 3, 4, 5, 6 }, { 4, 5, 6 }
        };

        for (int f = 0; f < pares.length; f++) {
            for (int c = 0; c < pares[f].length; c++)
                System.out.print("  " + pares[f][c]);
            System.out.println(" ");
        }

    }

    public void showMatrizInt() {
        int pares[][] = new int[5][3];

        System.out.println("Loading...");
        for (int f = 0; f < pares.length; f++)
            for (int c = 0; c < pares[f].length; c++)
                pares[f][c] = f + c;

        for (int f = 0; f < pares.length; f++) {
            for (int c = 0; c < pares[f].length; c++)
                System.out.print("  " + pares[f][c]);
            System.out.println(" ");
        }
    }

    public void showArrayString() {
        String frutas[] = { "sandias", "pera", "mandarina", "uva" };

        for (String f : frutas) {
            // Para separar algo dentro de un arreglo en char
            if (f.equals("mandarina"))
                for (char c : f.toCharArray()) {
                    System.err.print("  " + c);
                }
            else
                System.out.print(f);
            System.out.println(" ");
        }
    }

    public void showArrayChar() {
        char cadena[] = { 'L', 'u', 'z', 'u', 'J' };

        System.out.println("Loading...");

        System.out.println("Show - foreach");
        for (char c : cadena) {
            System.out.println(c);
        }

    }

    public void showArrayInt() {
        int pares[] = new int[5];
        // pares[0]=2;
        // pares[1]=4;
        // pares[2]=6;
        // pares[3]=8;
        // pares[4]=10;

        System.out.println("Loading...");
        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2 + 2;
        }
        System.out.println("show - for");
        for (int i = 0; i < pares.length; i++) {
            if (i != 2)
                System.out.println(pares[i]);
        }

        System.out.println("Show - foreach");
        for (int i : pares) {
            if (i != 6)
                System.out.println(i);
        }

    }
}
