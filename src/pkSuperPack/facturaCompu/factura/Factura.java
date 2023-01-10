package factura;

public class Factura {

    private int nroPedido;
    private int nroFactura;
    private String fecha;
    private int nroTalonario;
    private Cliente cliente;
    private Vendedor vendedor;
    private Computador computador;

    public Factura() {

        this.nroPedido = 0;
        this.nroFactura = 0;
        this.fecha = "hoy";
        this.nroTalonario = 0;
        this.cliente = new Cliente();
        this.vendedor = new Vendedor();
        this.computador = new Computador();
    }

    public Factura(int numPed, int numFac, String fecha, int numTal, Cliente clien, Vendedor vender, Computador compu) {

        this.nroPedido = numPed;
        this.nroFactura = numFac;
        this.fecha = fecha;
        this.nroTalonario = numTal;
        this.cliente = clien;
        this.vendedor = vender;
        this.computador = compu;

    }

    public Factura(Computador pc1) {

        this.nroPedido = 0;
        this.nroFactura = 0;
        this.fecha = "hoy";
        this.nroTalonario = 0;
        this.cliente = new Cliente();
        this.vendedor = new Vendedor();
        this.computador = pc1;
    }

    /* Constructor con parametros por cada objeto, necesita todos los parametros
    public Factura(int numPed, int numFac, String fecha, int numTal, String cedClie, String nomClie,
                   String telfClie, String emailClie) {

        this.nroPedido = numPed;
        this.nroFactura = numFac;
        this.fecha = fecha;
        this.nroTalonario = numTal;
        this.cliente = new Cliente(cedClie, nomClie, telfClie, emailClie);

    }*/

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNroTalonario() {
        return nroTalonario;
    }

    public void setNroTalonario(int nroTalonario) {
        this.nroTalonario = nroTalonario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {

        return this.vendedor;
    }

    public void setVendedor(Vendedor vender) {

        this.vendedor = vender;
    }

    public Computador getComputador() {

        return this.computador;
    }

    public void setComputador(Computador compu) {

        this.computador = compu;
    }

    public double calculoIVA() {

        return this.computador.getPrecio() * 0.12;
    }

    public double calculoDescuento() {

        double a = this.computador.getPrecio();
        if(a > 1500) {

            a = a * 0.9;
        }
        return a;
    }

    public double precioFinal() {

        return calculoDescuento() + calculoIVA();
    }

    public void imprimirFactura() {

        System.out.println("Factura numero: " + this.nroFactura);
        System.out.println("Datos del cliente: ");
        this.cliente.imprimirCliente();
        System.out.println();
        System.out.println("Vendedor" +  this.vendedor.getId());
        System.out.println();
        System.out.println("Datos de la compra");
        this.computador.imprimirComputador();
        System.out.println("Precio sin IVA y sin descuentos: " + this.computador.getPrecio());
        System.out.println("Precio con descuento: " + calculoDescuento());
        System.out.println("Impuestos: " + calculoIVA());
        System.out.println("Total final: " + precioFinal());
        System.out.println("Gracias, vuelva prontos");

    }
}
