package curso.src;

public class persona {
    private int edad;
    private String nombre;

    // constructor
    // para que no salga 0 o null, podemos colocar o this u otros nombres

    ////public persona(int mi_edad, String mi_nombre) {
    ////    edad = mi_edad;
    ////    nombre = mi_nombre;
    ////} O

    //this es una palabra reservada
    public persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    // metodo
    public void datos() {
        System.out.println("edad: " + edad + " nombre: " + nombre);
    }
}