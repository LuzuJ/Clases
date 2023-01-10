package examen;

public class AppBool {
    public static void main(String[] args) {

        String uno = "uno";
        String dos = uno;
        String otroUno = "uno";

        System.out.println(uno == dos); // true
        System.out.println(otroUno == dos); //false no es, true
        System.out.println(uno.equals(otroUno)); //true
        System.out.println(otroUno.equals(dos)); //true

        String tres = "tres";
        String cuatro = new String("tres");
        System.out.println(tres == cuatro); //true (?)
        System.out.println(tres.equals(cuatro)); //true
        System.out.println(uno.equals(tres)); //false
        System.out.println(tres == cuatro.intern()); //true

        boolean a = true;
        boolean b = 5!=6;

        System.out.printf("%b,%b",a,b);



    }
}