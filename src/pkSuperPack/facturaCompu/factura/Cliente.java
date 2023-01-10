package factura;

public class Cliente {

    private String cedula;
    private String nombre;
    private String email;
    private String telefono;
    private String direccion;

    public Cliente() {

        this.cedula = "0000000000";
        this.nombre = "Pedro Perez";
        this.email = "pedro.perez@email.com";
        this.telefono = "000000000";
        this.direccion = "Floresta";
    }

    public Cliente(String cedula, String fnombre, String telefono, String email) {

        this.cedula = cedula;
        this.nombre = fnombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = "Alameda";
    }

    public String getCedula() {

        return this.cedula;
    }

    public void setCedula(String juanito) {

        this.cedula = juanito;
    }

    public void setNombre(String juanito) {

        this.nombre = juanito;
    }

    public void setEmail(String juanito) {

        this.email = juanito;
    }

    public void setDireccion(String juanito) {

        this.direccion = juanito;
    }

    public void setTelefono(String juanito) {

        this.telefono = juanito;
    }

    public void imprimirCliente() {

        System.out.println("Cliente: Cedula " + this.cedula + " y nombre: " + this.nombre + ". Email: " +
                this.email + ", telefono: " + this.telefono + " y direccion: " + this.direccion);
    }


}
