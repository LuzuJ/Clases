import java.util.List;

import utilitario.HandleInOutput;

public class App {
    public static String User;
    public static final String Tema = "\t ------------------------------------------ \n\t\t  NETWORK DE EXAMEN \n\t ------------------------------------------ ";
    enum Menu { SALIR, AGREGAR, AGREGAR_SI, MOSTRAR_NETWORK };

    public static void main(String[] args) throws Exception {
     
        HandleInOutput.clear();
        System.out.println("\n\n\n"+ Tema);
        if( !login() )  
            System.exit(0); 
            
        Persona p = new Persona();
        do{
            switch (menu())
            {
                case SALIR : 	        System.out.println(" Regresa pronto "+ User );
                                        System.exit(0); 
                case AGREGAR: 	        p.addAmigo();
                                        break;
                case AGREGAR_SI: 	    p.addAmigoDe();
                                        break;
                case MOSTRAR_NETWORK: 	p.showAmigos(p,0);
                                        break;
            }
            HandleInOutput.pressKey();
        } while (true);
    }

    public static Menu menu()
    {
        int numero=-1; 
        HandleInOutput.clear();
        System.out.println("\n\n\n"+ Tema);
        System.out.println("\t  Usuario: "+ User +"\n\n\n");
        System.out.println(Menu.AGREGAR.ordinal()  	        + " AGREGAR AMIGO"               ); 	
        System.out.println(Menu.AGREGAR_SI.ordinal()  	    + " AGREGAR AMIGO DE AMIGO"      ); 	
        System.out.println(Menu.MOSTRAR_NETWORK.ordinal()   + " MOSTRAR NETWORK "	         ); 
        System.out.println(Menu.SALIR.ordinal()     		+ " SALIR "	                     );
        do
        {
            numero = HandleInOutput.getNumeroPositivo("<+> Ingresa Opc: ");
            if (numero>= 0 && numero <= 4 )
            {	
                HandleInOutput.clear();
                System.out.println("\n\n\n"+ Tema);
                System.out.println("\t  Usuario: "+ User +"\n\n\n");
                break;
            }
        } while (true);
        return Menu.values()[numero];
    }

    public static boolean login()
    {
        int intentos = 2;
        List<String> usuariosClaves = List.of("patmicpatmic","pat_micpat_mic","profe1234");
        do
        {
            System.out.println("\n\n \t\t ........................ ");
            String u = HandleInOutput.getCaracteres  ("\t\t +  usuario: ");
            String c = u + HandleInOutput.getCaracteres  ("\t\t +  clave  : ");
            System.out.println("\t\t ........................ ");
            for (String uc : usuariosClaves) 
                if( c.equals(uc))
                {
                    User = u.toUpperCase();
                    System.out.println("\n :: Bienvenido "+ User);
                    return true;
                }
            System.out.println("\t\t * Nro de intentos: "+ --intentos );
        } while (intentos > 0);
        System.out.println("\n\n \t :(  Lo sentimos tu usuario y clave son incorrectos..! " );
        return false;
    }

}
