package factura;

public class AppFactura {

    public static void main(String[] args) {

        Vendedor vend1 = new Vendedor();

        vend1.imprimirVendedor(1600);

        String uno = "1519181916";

        vend1.setCedula(uno);

        vend1.imprimirVendedor(1600);

        System.out.println(vend1.getCedula() + "holita");

        Cliente clien1 = new Cliente();
        clien1.imprimirCliente();

        Computador comp1 = new Computador(35,"HP",1600.0,12,false,"Verde",
                156.5,"Laptop",256);

        Computador comp2 = new Computador(40,"HP",850.0,12,false,"Verde",
                58.25,"Laptop",256);

        Factura fact1 = new Factura(1,1,"hoy",16,clien1,vend1,comp1);

        Factura fact2 = new Factura(2,2,"hoy",16,clien1,vend1,comp2);

        fact1.getCliente().setCedula("1011121314");

        clien1.imprimirCliente();
        fact1.getCliente().imprimirCliente();

        System.out.println(clien1.toString());
        System.out.println(fact1.getCliente().toString());

        fact1.imprimirFactura();
        fact2.imprimirFactura();

        Factura fact3 = new Factura(comp1);
        Factura fact4 = new Factura(comp2);

        Vendedor ved1 = new Vendedor();
        Vendedor ved2 = new Vendedor();

        System.out.println(ved1.getId());
        System.out.println(ved2.getId());


        System.out.println(fact3.getVendedor().getId());
        System.out.println(fact4.getVendedor().getId());

        Vendedor.destVendedor(ved2);
        System.out.println(Vendedor.getSum());

        Vendedor ved3 = new Vendedor();
        System.out.println(ved3.getId());
        System.out.println(Vendedor.getSum());

        String h = "HOLA";
        System.out.println(h);
        h.concat(" COMO ESTAS");
        System.out.println(h.concat(" COMO ESTAS"));
        System.out.println(h);
        h = h.concat(" COMO ESTAS");
        System.out.println(h);

    }
}
