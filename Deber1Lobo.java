import java.util.Arrays;
import java.util.Scanner;
public class Deber1Lobo {
    /*
     * Lobo, caperusita y uvas, cruzar rio y usar arrays, no se comen entre si mientras el observador ve,
     * solo se puede llevar al observador y a una persona, tambien regresar, puede regresar el observador solo
     * no puede ir caperursa sola.
     * Lobo come caperus, caperusa come uvas.
     */
    public static void main (String[] args) {
        Scanner sc =new Scanner (System.in);
        char aRio[] = {'O', 'L', 'C', 'U'};
        char dRio[] = {' ', ' ', ' ', ' '};
        System.out.println("Alfrente del rio tiene al observador, lobo, caperusita y uvas,");
        System.out.println("no se pueden quedar lobo ni caperusita, caperusita o uvas");
        System.out.println("Mientras el observador se encuentre no se comerán entre si.");
        System.out.println("El observador debe llevar a todos al otro lado del rio, ¿Cómo lo hace?");
        System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));



        sc.close();
    }
}
