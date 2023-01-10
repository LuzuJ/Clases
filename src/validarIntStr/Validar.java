package validarIntStr;

import java.util.Scanner;

public class Validar {
    
    Scanner sc = new Scanner();

    public Teclado(){
       sc = new Scanner(System.in);
    }

    
    public String getString (String titulo){
        String s1 = "";

        while(s1.equals("")){
        System.out.println(titulo);
        s1 = sc.nextLine();
        if (!s1.matches("^[A-Za-z ]*$")) {
            s1 = "";
        }
        }
        return s1;
    }
}
