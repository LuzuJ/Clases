import java.util.Scanner;

/**
 * @author : Jonathan Luzuriaga
 * @date : 6.12.2022
 * Determinar el area de un triangulo
 */
public class AreaTriangulo {
    /**
     * Programa principal
     * @param args, no requiere
     * @throws Exception.
     */

    public static void calcularAreaRect() {
        //Declaracion de las variables el inicializadas
        int longiud=0, ancho=0, areaRec=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud: ");
        longiud = sc.nextInt();

        System.out.print("Ingrese el ancho: ");
        ancho = sc.nextInt();
        
        areaRec = ancho*longiud;

        System.out.println("El area es: " + areaRec);
        sc.close();
    }
    public static void drawC() {
      Scanner sc = new Scanner(System.in);
       int nroTerminos = 0;
           System.out.print("Ingrese nro. terminos: ");
           nroTerminos = sc.nextInt();

           for (int i = 0; i < nroTerminos; i++) { 
            //Ternario
             System.out.print((i%2==0)?"+ ":"- ");
           }
           System.out.println(" ");
           for (int i = 0; i < nroTerminos; i++) { 
             System.out.println((i%2==0)?"+ ":"- ");
           }
           for (int i = 0; i < nroTerminos; i++) { 
  
             System.out.print((i%2==0)?"+ ":"- ");
           }

           System.out.println(" ");
           sc.close();
    }
    public static void showSignosAlternos() {
      int nroterminos = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el nro. de terminos: ");
       nroterminos = sc.nextInt();
       for (int i = 0; i < nroterminos; i++) {
        //Operador ternario
        System.out.println((i % 2 == 0)? " + ": " - ");
       }
       sc.close();
    }
    public static void showPares() {
      int nroPares = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el numero de pares: ");
       nroPares = sc.nextInt();
       for (int i = 0; i < nroPares*2; i++) {
        if (i % 2 == 0) {
          System.out.println(i);
        }
       }
       sc.close();
    }
    public static int suma(int a, int b) {
      return (a + b);
    }
    public static float suma(int a, float f) {
      return (a + f);
    }
    public static float suma(float a, float f) {
      return (a + f);
    }
    public static void cuadradoHueco() {
      System.out.print("Ingrese nro. terminos: ");
       int nroTerminos = 0;
       Scanner sc = new Scanner(System.in);
           nroTerminos = sc.nextInt();

           for (int i = 0; i < nroTerminos; i++) { 
            //Parte de arriba
             System.out.print((i%2==0)?"+ ":"- ");
           }
           System.out.println(" ");
           //Parte del medio
           for (int i = 0; i < nroTerminos; i++) { 
            // System.out.println((i%2==0)?"+ ": "- ");
             if (i%2==0) {
              System.out.print("+ ");
             } else if (nroTerminos%i == 0) {
              System.out.print("- ");
             }
              System.out.println(" ");
           }
           //Parte de abajo

           for (int i = 0; i < nroTerminos; i++) { 
  
             System.out.print((i%2==0)?"+ ":"- ");
           }

           System.out.println(" ");
           sc.close();
    }
    public static void showEscaleras() {
      int nroEscaleras = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese numero de escaleras: ");
       nroEscaleras = sc.nextInt();
       for(int i = 0; i<nroEscaleras; i++){

        for(int j = 0;j<i+1;j++){
            
            System.out.print("|");
                System.out.print("__");
        } 
        System.out.println(" ");
    }
    sc.close();
    }
    public static void main (String[] args) {
       //calcularAreaRect();
       //showSignosAlternos();
       //drawC();
       //showPares();

       //declaracion de variables
       //int a = 2, b = 2, c = 0;
       //float f = 1, d = 0;
       //c = suma(a,b);
       //d = suma(a, f);
       //d = suma(f, f);
       //d = suma(f, a);

       //cuadradoHueco();
       showEscaleras();
    }
    
    
    
    
    

    
}
