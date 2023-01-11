package jonathan_luzuriaga;
//profe no se guardo casi nada en el git y tuve que repetir :'(
import java.util.Scanner;

public class MainApp {
    
    public static void encabezado() {
        System.out.println("-------------------------------------------");
        System.out.println("NETWORK DE <jonathan.luzuriaga@epn.edu.ec>");
        System.out.println("-------------------------------------------");
    }

    public static boolean jlLoginJonathan(String jjUsuario, String jjClave, String jjCodigoUnico, String jjNombre,
            int jjEdad, String jjSexo) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        boolean bandera = true;

        System.out.println("--------------------------------");
        System.out.print("Usuario: ");
        jjUsuario = sc.nextLine();

        while (bandera == true) {
            if (jjUsuario.equals("profe") || jjUsuario.equals("jonathan.luzuriaga@epn.edu.ec")) {
                bandera = false;
            } else {
                intentos = intentos - 1;
                System.out.println("Tiene: " + intentos + " intentos");
                if (intentos == 0) {
                    System.out.println("Tu Usuario o contraseña no son corrrectas");
                    return false;
                    bandera = false;
                } else {
                    bandera = true;
                }

            }
        }
        intentos = 3;
        bandera = true;

        System.out.print("Clave: ");
        jjClave = sc.nextLine();

        while (bandera == true) {

            if (jjClave.equals("1234") || jjClave.equals("1753716867")) {
                bandera = false;
            } else {
                intentos = intentos - 1;
                System.out.println("Tiene: " + intentos + " intentos");
                if (intentos == 0) {
                    System.out.println("Tu Usuario o contraseña no son corrrectas");
                    return false;
                    bandera = false;
                } else {
                    bandera = true;
                }
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Bienvenido " + jjUsuario);
        System.out.print("Codigo Unico: ");
        jjCodigoUnico = sc.nextLine();
        System.out.print("Nombre: ");
        jjNombre = sc.nextLine();
        System.out.print("Edad: ");
        bandera = true;
        while (bandera == true) {
            jjEdad = sc.nextInt();
            if (jjEdad > 0 && jjEdad < 90)
                bandera = false;
            else
                bandera = true;
        }
        bandera = true;
        System.out.print("Sexo: ");
        while (bandera == true) {
            jjSexo = sc.nextLine().toLowerCase();
            if (jjSexo.charAt(0) == 'f' || jjSexo.charAt(0) == 'm')
                bandera = false;
            else
                bandera = true;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String jjCedulaC = "1753716867";
        String jjNombreCompleto = "Jonathan Jaime Luzuriaga Velez";
        String jjEmail_Usuario = "jonathan.luzuriaga@epn.edu.ec";
        String jjProfUs = "Profe";
        String jjClavPro = "1234";

        String jjUsuario = "", jjClave = "";
        String jjCodigoUnico = " ", jjNombre = " ";
        String jjSexo = " ";
        boolean global = true;
        int jjEdad = 0;
        encabezado();
        while (global == true) {
            global = jlLoginJonathan(jjUsuario, jjClave, jjCodigoUnico, jjNombre, jjEdad, jjSexo);
        }

    }

}
