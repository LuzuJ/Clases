import java.util.Arrays;
import java.util.Scanner;
public class Deber1Lobo {
    /*
     * Lobo, caperusita y uvas, cruzar rio y usar arrays, no se comen entre si mientras el observador ve,
     * solo se puede llevar al observador y a una persona, tambien regresar, puede regresar el observador solo
     * no puede ir caperursa sola.
     * Lobo come caperus, caperusa come uvas.
     */
    /**
     * Funcion para poder cambiar de posiciones entre arrays.
     * 
     * @param elec Que valor desea cambiar
     * @param aRio array de salida
     * @param dRio array de llegada
     */
    public static void combinarArrays(String elec, char[] aRio, char[] dRio) {
        if (elec.equals("l")||elec.equals("o")||elec.equals("c")||elec.equals("u")) {
            switch (elec) {
                case "l":
                char temp1 = aRio[1];
                aRio[1] = dRio[1];
                dRio[1] = temp1;
    
                char temp2 = aRio[0];
                aRio[0] = dRio[0];
                dRio[0] = temp2;
                break;

                case "c":
                temp1 = aRio[2];
                aRio[2] = dRio[2];
                dRio[2] = temp1;
    
                temp2 = aRio[0];
                aRio[0] = dRio[0];
                dRio[0] = temp2;
                break;

                case "u":
                temp1 = aRio[3];
                aRio[3] = dRio[3];
                dRio[3] = temp1;
    
                temp2 = aRio[0];
                aRio[0] = dRio[0];
                dRio[0] = temp2;
                break;

                case "o":
                temp2 = aRio[0];
                aRio[0] = dRio[0];
                dRio[0] = temp2;
                break;
            
                default:
                System.out.println("No es valido");
                break;
            }
        }
    }

    /**
     * Arrays para comprobar si el jugador gano
     * @param aRio arrays de salida
     * @param dRio arrays de llegada
     * @return valor a retornar
     */
    public static boolean condiciones(char[] aRio, char[] dRio) {
        boolean band = true;
        if ((dRio[0]=='O')&&(dRio[1]=='L')&&(dRio[2]=='C')&&(dRio[3]=='U')) {
            System.out.println("GANATES :3");
            band = false;
        }
        if ((aRio[0] == ' ' && aRio[1]=='L' && aRio[2]=='C')|| (dRio[0] == ' ' && dRio[1]=='L' && dRio[2]=='C')) {
            System.out.println("PERDISTE MANO, EL LOBO SE COMIO A LA CAPERUSITA");
            band = false;
        }
        if ((aRio[0] == ' ' && aRio[2]=='C' && aRio[3]=='U')|| (dRio[0] == ' ' && dRio[1]=='C' && dRio[2]=='U')) {
            System.out.println("PERDISTE MANO, LA CAPERUSITA SE COMIO LAS UVAS");
            band = false;
        }
        return band;
    }

    public static void main (String[] args) {
        Scanner sc =new Scanner (System.in);
        char aRio[] = {'O', 'L', 'C', 'U'};
        char dRio[] = {' ', ' ', ' ', ' '};
        boolean bandera = true, bandera2 = true;
        System.out.println(" ");
        System.out.println("Alfrente del rio tiene al observador, lobo, caperusita y uvas,");
        System.out.println("no se pueden quedar lobo ni caperusita, caperusita o uvas");
        System.out.println("Mientras el observador se encuentre no se comerán entre si.");
        System.out.println("El observador debe llevar a todos al otro lado del rio, ¿Cómo lo hace?");

        // Repetir hasta que el jugador gane
        while (bandera == true) {
          bandera = true;
            //Condiciones para ganar
           bandera2 = condiciones(aRio, dRio);
           if (bandera2 == false) {
            System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
            break;
           }
    
           //Eleccion pa jugar
            System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
            System.out.println("A quien desea pasar al otro lado?");

            //Mostrar proceso
            String elec = sc.nextLine().toLowerCase();
            combinarArrays(elec, aRio, dRio);

            //Condiciones para ganar
            bandera2 = condiciones(aRio, dRio); 
            if (bandera2 == false) {
                System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
                break;
               }

            //Elecciones 
            System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
            System.out.println("A quien desea regresar?");
            elec = sc.nextLine().toLowerCase();
                
           combinarArrays(elec, aRio, dRio);
           System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
        }
        sc.close();
    }

}
