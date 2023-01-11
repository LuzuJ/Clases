package pkAprender.paquete1;

public class Clase1 {
    //encapsulamiento
    private int edad;
    private String nombre;

    //Metodo setter; Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Metodo Getter: Mostramos la edad
    public int getEdad(){
        return edad;
    }

    public String setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getNombre(){
        return nombre;
    }
}
