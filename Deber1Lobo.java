import java.util.Arrays;
import java.util.Scanner;
public class Deber1Lobo {
    /*
     * Lobo, caperusita y uvas, cruzar rio y usar arrays, no se comen entre si mientras el observador ve,
     * solo se puede llevar al observador y a una persona, tambien regresar, puede regresar el observador solo
     * no puede ir caperursa sola.
     * Lobo come caperus, caperusa come uvas.
     */
    public static void combinarArrays(String elec, char[] aRio, char[] dRio) {
        if (elec.equals("l")) {
            char temp1 = aRio[1];
            aRio[1] = dRio[1];
            dRio[1] = temp1;

            char temp2 = aRio[0];
            aRio[0] = dRio[0];
            dRio[0] = temp2;
        } else if (elec.equals("c")) {
            char temp1 = aRio[2];
            aRio[2] = dRio[2];
            dRio[2] = temp1;

            char temp2 = aRio[0];
            aRio[0] = dRio[0];
            dRio[0] = temp2;
        } else if (elec.equals("u")) {
            char temp1 = aRio[3];
            aRio[3] = dRio[3];
            dRio[3] = temp1;

            char temp2 = aRio[0];
            aRio[0] = dRio[0];
            dRio[0] = temp2;
        } else if (elec.equals("o")) {
            char temp2 = aRio[0];
            aRio[0] = dRio[0];
            dRio[0] = temp2;
        }else {
            System.out.println("No valido");
        } 
    }
    public static void main (String[] args) {
        Scanner sc =new Scanner (System.in);
        char aRio[] = {'O', 'L', 'C', 'U'};
        char dRio[] = {' ', ' ', ' ', ' '};
        int mov1=0, mov2=0, direcc=0;
        String jueg = " ";
        boolean bandera = true;
        System.out.println(" ");
        System.out.println("Alfrente del rio tiene al observador, lobo, caperusita y uvas,");
        System.out.println("no se pueden quedar lobo ni caperusita, caperusita o uvas");
        System.out.println("Mientras el observador se encuentre no se comerán entre si.");
        System.out.println("El observador debe llevar a todos al otro lado del rio, ¿Cómo lo hace?");
        System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
        while (bandera == true) {
            System.out.println("Ingrese si, si desea jugar");
            jueg = sc.nextLine().toLowerCase();
            if (jueg.equals("si")) {

                System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
                System.out.println("A quien desea pasar al otro lado?");

                String elec = sc.nextLine().toLowerCase();
                combinarArrays(elec, aRio, dRio);

                System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
                System.out.println("A quien desea regresar?");
                elec = sc.nextLine().toLowerCase();
                
                combinarArrays(elec, aRio, dRio);
                System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
                
            }else {
                System.out.println("Bueno :)");
                    bandera = false;
            }

        }

    }

   
}
