import java.util.*;

import pkTinderPet.*;

public class App {

    public static void main(String[] args) throws Exception {
        List <Mascota> lstMascotas = new ArrayList<>();
        Mascota p = null;
        agregarMascotasPrueba(lstMascotas);
        while(true){
            //clearScreen();
            System.out.println("-------------------------------------");
            System.out.println("        TINDER PET LOVER             ");
            System.out.println("-------------------------------------");
            if(p!=null){
                System.out.println("Mascota actual: "+p.getNombre());
            }
            switch(menu()){
                
                case 1: 
                    p = registrar(lstMascotas); 
                    break;
                case 2: 
                    listar(lstMascotas);    
                    break;
                case 3: 
                    if(p == null){
                        System.out.println("No hay ninguna mascota registrada!");
                        break; 
                    }
                    escoger(p, lstMascotas); 
                    break;
                case 4: 
                    System.out.println("Gracias por usarnos!"); System.exit(1);
            }
        }
    }

    /**
     * Metodo que registra los datos de la mascota dentro de una lista
     * @param lstMascotas lista con los datos de las mascotas ya registradas
     */
    private static Mascota registrar(List <Mascota> lstMascotas){
        Scanner sc = new Scanner(System.in);
        String s;
        Mascota p = new Mascota(getNombre(),getGenero(),getRaza(),getEdad(),getPropietario(),getObservacion());
        lstMascotas.add(p);
        return p;
    }
    
    /**
     * Metodo que muestra la informacion de todas las mascotas que pertenecen a la lista
     * @param lstMascotas lista con informacion de las mascotas registradas
     */
    private static void listar(List <Mascota> lstMascotas) {
        for (Mascota m : lstMascotas) {
            if(m.getEstadoMatch()){
                m.presentarse();
                System.out.println("----------------");
            }
        }
    }

    /**
     * Metodo que da a escoger una opcion de la lista de mascotas
     * @param lstMascotas lista con informacion de las mascotas registradas
     */
    private static void escoger(Mascota p, List <Mascota> lstMascotas) {
        Scanner sc = new Scanner(System.in);
        String s;
        for (Mascota m : lstMascotas) {
            if(m.getEstadoMatch()&&(p.getNombre().equalsIgnoreCase(m.getNombre()))){
                m.presentarse();
                System.out.println("----------------");
            }
        }
        System.out.println("Porfavor ingrese el nombre de la mascota que desea hacer match: ");
        s=sc.nextLine();
        for (Mascota m : lstMascotas) {
            if(s.equalsIgnoreCase(m.getNombre())){
                m.hacerMatch(m, p);
            }
        }
    }
    
    /**
     * Metodo que crea el menu y obtiene informacion de la opcion seleccionada
     * @return retorna el entero con la opcion seleccionada
     */
    private static int menu() {
        Scanner sc = new Scanner(System.in);
        String s;
        int i = 0;

        do{
            System.out.println("1. Registrar mascota.\n"
                            +"2. Listar mascotas.\n"
                            +"3. Escoger mascotas para hacer match.\n"
                            +"4. Salir del sistema.\n");
            System.out.print("Ingrese la opcion seleccionada: ");
            s = sc.nextLine();
            if(isNumeric(s))
                i = Integer.parseInt(s);
            else
                System.out.println("Opcion invalida!");
        }while((!isNumeric(s)) || !(i < 5 && i > 0));  
        return i;
    }

    /**
     * Verificacion si dato es numerico
     * @param cadena string que captura una cadena de texto
     * @return devuelve verdadero si la cadena de texto es de datos numericos
     */
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }

    /**
     * Metodo para obtener los nombres de la mascota
     * @return devuelve cadena de texto con el nombre de las mascotas
     */
    private static String getNombre() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese los nombres de su mascota: ");
        return in.nextLine();
    }

    /**
     * Metodo para obtener el genero de la mascota
     * @return devuelve el caracter con el genero de la mascota
     */
    private static char getGenero() {
        Scanner in = new Scanner(System.in);
        String inputLine;
        char input[];
        do {

            System.out.print("Ingrese el genero 'M' o 'H' de la mascota: ");
            inputLine = in.nextLine();
            input = inputLine.toUpperCase().toCharArray();

            if(!inputLine.isEmpty() && (input[0] == 'M' || input[0] == 'H'))
                return input[0];
        } while (true);
    }

    /**
     * Metodo para obtener la raza de la mascota
     * @return devuelve cadena de texto con la raza de la mascota
     */
    private static String getRaza() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la raza de la mascota: ");
        return in.nextLine();
    }

    /**
     * Metodo para obtener la edad de la mascota
     * @return devuelve un integer con la edad de la mascota
     */
    private static int getEdad() {
        Scanner in = new Scanner(System.in);
        String input;
        do {
            System.out.print("Ingrese la edad de la mascota: ");
            input = in.nextLine();
            
            if(isNumeric(input))
                return Integer.parseInt(input);
        } while(true);
    }

    /**
     * Metodo para obtener el nombre del propietario de cada mascota
     * @return devuelve el nombre del propietario de la mascota
     */
    private static String getPropietario() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el propietario de la mascota: ");
        return in.nextLine();
    }

    /**
     * Metodo para obtener alguna observacion de la mascota
     * @return devuelve cadena de texto con observaciones de la mascota
     */
    private static String getObservacion() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese alguna observacion de la mascota: ");
        return in.nextLine();
    }

    /**
     * Metodo para agregar mascotas de prueba
      @param lstMascotas
     */
    private static void agregarMascotasPrueba(List <Mascota> lstMascotas) {
        lstMascotas.add(new Mascota("bruno", 'M', "pastor aleman", 2, "Marco", "perro entrenado"));
        lstMascotas.add(new Mascota("sofia", 'H', "pastor ingles", 4, "Andrea", "perra amable y juguetona"));
    }

    /**
     * Metodo para limpiar la pantalla
     * No sirve en gitbash
     */
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();   
    } 
}
