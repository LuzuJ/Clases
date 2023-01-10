package factura;

import java.util.Locale;
import java.util.Scanner;

public class Computador {

    private int id;
    private String marca;
    private double precio;
    private int garantia;
    private boolean usado;
    private String color;
    private double peso;
    private String tipo;
    private double consumoEnergia;

    public Computador(int id, String marca, double precio, int garantia, boolean usado, String color, double peso,
                      String tipo, double consumoEnergia) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
        this.garantia = garantia;
        this.usado = usado;
        this.color = color;
        this.peso = peso;
        this.tipo = tipo;
        this.consumoEnergia = consumoEnergia;
    }

    public Computador() {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el id del equipo");
        this.id = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la marca");
        this.marca = sc.nextLine();

        System.out.println("Ingrese el precio inicial");
        this.precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese el tiempo de garantia en meses");
        this.garantia = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese si el equipo es nuevo o no");
        String usado = sc.nextLine();
        if(usado.equals("Nuevo")) {

            this.usado = false;
        } else {

            this.usado = true;
        }

        System.out.println("Ingrese el color del equipo");
        this.color = sc.nextLine();

        System.out.println("Ingrese el peso del equipo");
        this.peso = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese el tipo del equipo");
        this.tipo = sc.nextLine();

        System.out.println("Ingrese el consumo medio de energia");
        this.consumoEnergia = sc.nextDouble();
        sc.nextLine();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public void imprimirComputador() {

        System.out.println("ID: " + this.id + " Marca: " + this.marca + " Precio Unitario: " + this.precio
                + "Tipo de equipo" + this.tipo);

    }

    public double pesoAniadido(Computador ad) {

        double a;
        a = this.peso + ad.peso;
        this.peso = a;
        return a;
    }
}
