package pkAprender;

public class Coche {
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "Blanco";
        coche1.marca = "Ferrari";
        coche1.km = 0;

        System.out.println("El color del coche es: " + coche1.color);
        System.out.println("La marca del carro es: " + coche1.marca);
        System.out.println("El kilometraje es de: " + coche1.km);

        Coche coche2 = new Coche();

        coche2.color = "Rojo";
        coche2.marca = "Audi";
        coche2.km = 100;

        System.out.println("El color del coche es: " + coche2.color);
        System.out.println("La marca del carro es: " + coche2.marca);
        System.out.println("El kilometraje es de: " + coche2.km);

    }
}
