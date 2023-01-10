package factura;

public class Vendedor {

    private static int sum = 0;
    private int id;
    private String cedula;
    private String nombre;
    private double salario;
    private String horario;
    private int numVentas;

    //Este es un comentario sencillo, de una sola linea.
    /*
    * Este es un comentario en bloque, puede tener
    * todas las lineas necesarias mientras se mantenga
    * dentro de la estructura*/

    /*Constructor: permite la creacion de un objeto a partir de las caracteristicas de la clase
    *
    * Existen dos clases de constructor: por defecto y por parametros*/

    public Vendedor() {

        this.id = sum++;
        this.cedula = "0000000000";
        this.nombre = "Juan Perez";
        this.salario = 0.0;
        this.horario = "De 9 a 5";
        this.numVentas = 0;

    }

    public Vendedor(String cedula, String nombre, double salario, String horario, int numVentas) {

        this.id = sum++;
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.horario = horario;
        this.numVentas = numVentas;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }

    public int getId() {

        return id;
    }

    public void setId(int nId) {

        id = nId;
    }

    public void imprimirVendedor(double ventas) {

        System.out.println("Vendedor numero: " + id + " de nombre " + this.nombre + " y cedula " + this.cedula
         + " gana " + this.salarioFinal(ventas));
    }

    public double salarioFinal(double precioVenta) {

        return salario + precioVenta*0.05;
    }

    public static void destVendedor(Vendedor vend1) {

        vend1 = null;
        sum = sum -1;
    }

    public static int getSum() {

        return sum;
    }

}
