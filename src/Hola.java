public class Hola {
    public static void main (String[] args) {
        System.out.println("Hello, Que hace?");
        int a = 0, b = 1, c = 0;
        for (int j = a; j < 5; j++) {
            c = a + b;
            a = b;
            b = c;
            for (int i = 0; i < c; i++) {
                System.out.print((c%2==0)?"-":"+");
            }
        }
        
    }
}
