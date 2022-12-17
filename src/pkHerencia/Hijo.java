package pkHerencia;
//Extends, hereda del padre, en c son :
public class Hijo extends Padre {
   // String Nombre;
    //constructor
    public Hijo(String nombreHijo)
    {
        super(nombreHijo);
    }

    //Super para llevar al padre, desde esta clase a la clase padre.
    public Hijo(String nombre, String ocupacion, String sexo, int edad) {
        super(nombre, ocupacion, sexo, edad);
    }

    
}
