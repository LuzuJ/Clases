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

    public static void CalcularAreaRect() {
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
    public static void showSignosAlternos() {
        Scanner sc = new Scanner(System.in);
           
           int nroTerminos = 0;
           System.out.print("Ingrese nro. terminos: ");
           nroTerminos = sc.nextInt();

           for (int i = 0; i < nroTerminos; i++) { 
            //Ternario
             System.out.print((i%2==0)?"+ ":"- ");

           }

           System.out.println(" ");
           sc.close();
    }
    public static void main (String[] args) {
       //CalcularAreaRect();
       //showSignosAlternos();
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
    

    
}
