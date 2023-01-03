package pkPatmicAnimal;

public class Arreglo {
    String[] arr = new String[4];
    int[] edad = {45, 23, 11, 9}; 
    int m[][] = new int[4][4];

    boolean[] finger = {true,false};   
    public void ArrayString(){
        String[] listado = new String[4];

        listado[0]="hola0";
        listado[1]="hola1";
        listado[2]="hola2";
        listado[3]="hola3";

        for (String s : listado) {
            System.out.println(s);
        }

        String cad = "hola mundo";
        String d = String.format("Resultado: %.3s", cad);
        System.out.println(d);

        int matriz[][]= {    {0, 1, 3}
                            ,{0, 1, 3, 4}
                            ,{0, 1, 3, 4}
                            ,{0, 1, 3}
                        };
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println (matriz[x][y]);
            }
        }
    }
}


