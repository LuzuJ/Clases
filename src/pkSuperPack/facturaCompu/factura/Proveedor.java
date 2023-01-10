package factura;

public final class Proveedor {

    private final int idTienda;
    private final String ruc;
    private final String nombre;
    private final String producto;

    public Proveedor(int idTieda, String ruc, String nombre, String producto) {

        this.idTienda = idTieda;
        this.ruc = ruc;
        this.nombre = nombre;
        this.producto = producto;
    }

    /* Esta funcion no se puede implementar porque el atributo es final, por lo tanto inmodificable
    public void setNombre(String nombre) {


        this.nombre = nombre;
    }*/


}
