package validarIntStr;

public class Main {
    public static void main(String[] args) {
        Validar in = new Validar();

        String nombre = in.getString("Hola");

        System.out.println("Hola " + nombre);
    }
}
