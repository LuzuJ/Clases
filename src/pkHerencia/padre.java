package pkHerencia;

public class Padre {
    // Porpiedades
    private String nombre;
    private String ocupacion;
    private String sexo;
    private int edad;

    // Constructor, inicializa la variable
    public (String nombre) {
        nombre = "Jonathan";
        ocupacion = "Programador";
        sexo = "M";
        edad = 19;
    }

    // constructos + sombrecarga
    public Padre(String nombre, String ocupacion, String sexo, int edad) {
        this.nombre = nombre;
        this.ocupacion = "Programador";
        this.sexo = "M";
        this.edad = 19;
    }

    public Padre() {
	}

	// metodos
    public void presentarse() {
        System.out.println("-----------------------");
        System.out.println("Yo me llamo : " + nombre);
        System.out.println("Soy un: " + ocupacion);
        System.out.println("Sexo: " + sexo);
        System.out.println("Tengo: " + edad);

    }

}
