package BusinessLogic.Entities;

public class Pet {
    String nombre;
    String raza;
    public Pet(String nombre, String raza){
        this.nombre =nombre;
        this.raza = raza;
    }
    public String getNombre() { return nombre; }
    public String getRaza() { return raza; }
}
