package pkHerencia;

public class Padre {
    //Propiedades
    private String nombre;
    private String ocupacion;
    private String sexo;
    private int edad;

    //Constructor
    public Padre() {
        nombre    = "Juanito"  ;
        ocupacion = "Programador";
        sexo      = "M";
        edad      = 19;
    }
    //contructor + sobrecarga
    public Padre(String nombre){
        //this para poder re asignar el nombre que coloquemos del parametroÑÑB
        this.nombre    = nombre  ;
        this.ocupacion = "Programador";
        this.sexo      = "M";
        this.edad      = 19;
    }
    public Padre(String nombre, String ocupacion, String sexo, int edad){
        //this para poder re asignar el nombre que coloquemos del parametro
        //Cortado matricial shit + alt y seleccionar el corte
        this.nombre    = nombre  ;
        this.ocupacion = ocupacion;
        this.sexo      = sexo;
        this.edad      = edad;
    }
    //metodos
    public void presentarse() 
    {
        System.out.println("----------------------");
        System.out.println("Yo me llamo: " + nombre);
        System.out.println("Soy: " + ocupacion);
        System.out.println("sexo: " + sexo);
        System.out.println("edad: " + edad);

    }

    
}
