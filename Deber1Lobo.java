/**
 * @author : Jonathan Luzuriaga
 * @date : 6/dic/2022
 * Usando arrays, pasamos lobo, caperucita, uvas al otro lado de un rio, con un observador
 */
import java.util.Arrays;
import java.util.Scanner;
public class Deber1Lobo {
    /**
     * Funcion para poder cambiar de posiciones entre arrays.
     * @param nombre Jonatha Luzuriaga
     * @param fecha 5/12/2022
     * @param elec Que posicion va a cambiar
     * @param aRio array de salida
     * @param dRio array de llegada
     */
    public static void combinarArrays(char elec, char[] aRio, char[] dRio) {
        int posicion =0;
        char temp1;
        //Se puede arreglar lo de abajo? :V
      // posicion = (elec=='o'? cambioPosicion(aRio, dRio): elec=='l'? posicion = 1: elec=='c'? posicion=2: elec=='u'? posicion=3: posicion = 0); 
        if (elec == 'o') {
            cambioPosicion(aRio,dRio);
        }else if(elec == 'l') {
            posicion = 1;
        } else if (elec == 'c') {
            posicion = 2;
        } else if (elec == 'u') {
            posicion = 3;
        } else 
            System.out.println("No es valido");
        
        //Cambio  de pisiciones dependiendo del cuerpo
        temp1 = aRio[posicion];
        aRio[posicion] = dRio[posicion];
        dRio[posicion] = temp1;
        cambioPosicion(aRio,dRio);
    }
    /**
     * Cambio de posicion para el 0
     * @param aRio arrays de salida
     * @param dRio arrays de llegada
     */
    public static void cambioPosicion(char[] aRio, char[] dRio) {
        char temp2;
        temp2 = aRio[0];
        aRio[0] = dRio[0];
        dRio[0] = temp2;
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
        } else if ((aRio[0] == ' ' && aRio[1]=='L' && aRio[2]=='C' && aRio[3]=='U') || ( dRio[0] == ' ' && dRio[1]=='L' && dRio[2]=='C' && dRio[3]=='U' ))  {
            System.out.println("GAME OVER, SE COMIERON ENTRE TODOS");
            band = false;
        } else if ((aRio[0] == ' ' && aRio[1]=='L' && aRio[2]=='C')|| (dRio[0] == ' ' && dRio[1]=='L' && dRio[2]=='C')) {
            System.out.println("PERDISTE MANO, EL LOBO SE COMIO A LA CAPERUSITA");
            band = false;
        } else if ((aRio[0] == ' ' && aRio[2]=='C' && aRio[3]=='U')|| (dRio[0] == ' ' && dRio[1]=='C' && dRio[2]=='U')) {
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
        System.out.println("Alfrente del rio tiene al observador, lobo, caperusita y uvas,no se pueden quedar lobo ni caperusita, caperusita o uvas");
        System.out.println("Mientras el observador se encuentre no se comerán entre si. Como lo hace?");
        while (bandera == true) {
          bandera = true;
           bandera2 = condiciones(aRio, dRio);
           if (bandera2 == false) {
            System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
            break;
           }
            System.out.println(Arrays.toString(aRio) + "  RIO  " + Arrays.toString(dRio));
            System.out.println("A quien desea llevar al otro lado?");
            String elec = sc.nextLine().toLowerCase();
            combinarArrays(elec.charAt(0), aRio, dRio);
        }
        sc.close();
    }
} 