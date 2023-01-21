package utilitario;

import java.util.Scanner;

public class HandleInOutput {
    static Scanner sc = new Scanner(System.in);
    /**
     * limpia la consola
     */
    public final static void clear()
    {
        try
        {
            String operatingSystem = System.getProperty("os.name");     //Check the current operating system
              
            if(operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    /**
     * Captura un numero entero y que sea mayor a cero
     * @param etiqueta
     * @return numero entero positivo
     */
    public static int getNumeroPositivo(String etiqueta){
        int n =-1;
        String str;
        //Scanner sc = new Scanner(System.in);
        do{
            System.out.print(etiqueta);
            str =  sc.next();
            try {
                n = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println(" :( Valor no valido... !");
            }
        }while(n<0);
        //sc.close();
        return n;
    }
    
    public static String getCaracteres(String Etiqueta)
    {
        String str="";
        do {
            System.out.print(Etiqueta);
            str =  sc.next().trim();
            if (str.trim() == "")
                System.out.println(" :( Valor no valido... !");
        } while (str.length()<=0);
        //sc.close();
        return str;
    }

    public static void pressKey()
    {
        System.out.print("\n\nPress any key..");
        try{        
            System.in.read();
        }catch(Exception e){}
    }
}
