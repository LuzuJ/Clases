package pkTinderPet;

public class Mascota {
    private String nombre;
    private char genero;
    private String raza;
    private int edad;
    private boolean estadoMatch;
    private String propietario;
    private String observacion;

    public Mascota(String nombre, char genero, String raza, int edad, String propietario, String observacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
        this.edad = edad;
        this.estadoMatch = true;
        this.propietario = propietario;
        this.observacion = observacion;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;  
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getEstadoMatch() {
        return estadoMatch;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getObservacion() {
        return observacion;
    }

    /**
     * Metodo para mostrar la informacion de una mascota
     */
    public void presentarse() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + genero);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
    }

    /**
     * Metodo para emparejar dos mascotas
       @return retorna el booleano false en las mascotas para indicar que ya han hecho match
     */
    public void hacerMatch(Mascota mascota1, Mascota mascota2) {
        mascota1.estadoMatch = false;
        mascota2.estadoMatch = false;
    }

}
