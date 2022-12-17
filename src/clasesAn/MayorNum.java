package clasesAn;
public class MayorNum {
    public static void main(String[] args) {
        int a = 40, b = 10;
        int c = 5, d = 10;
      //  int e = 10, f = 5;
        // Es mas estricto mas tiempo
        if (a == b) {
            System.out.println(a + " es igual a " + b); 
            //break ;
        }
        if(a > b){
            System.out.println(a + " es el mayor");
           // break;
        }
        if(b > a) {
             System.out.println(b + " es el mayor");
           // break ;
        }
        // Menor tiempo muchas lineas
        if (c == d) {
            System.out.println(c + " es igual a " + d);
        } else {
            if (c > d)
                System.out.println("El mayor es: " + c);
            else 
                System.out.println("El mayor es: " + d);
        }
        
         
    }
}

