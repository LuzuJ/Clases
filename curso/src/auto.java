package curso.src;

public class auto {
    // creamos un metodo de acceso, un comportamiento
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void velocidad(int vel_max) {
        System.out.println("La velocidad max es: " + vel_max + " Km/h");

    }

    // Constructor
    int modelo;
    String marca;

    public auto(int año, String nombre) {
        modelo = año;
        marca = nombre;
    }

    public static void main(String[] args) {
        // objeto toyota
        ////auto toyota = new auto();
        // llamamos por su nombre
       //// toyota.acelerar();
        ////toyota.velocidad(250);

        auto mi_auto = new auto(2013, "Toyota");
        // con el constructor podemos llamar como los metodos usando los puntos
        System.out.println("datos de mi auto: " + mi_auto.modelo + " " + mi_auto.marca);
    }
}
