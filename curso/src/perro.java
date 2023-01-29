package curso.src;
//Esta es una clase perro pero no se puede ejecutar por que solo es una clase
public class perro {
    //Atributos de la clase, que necesita el objeto
    int     iD;
    String  raza;
    int   tamano;
    int     edad;
    String  color;
    int     precio;

    //Constructor va con los paremetros que necesitamos
    public perro (int iD, String raza, int tamano, int edad, String color, int precio){
        //Palabra reservada this
        //esto para poder asignar a cada valor
        this.iD     = iD;
        this.raza   = raza;
        this.tamano = tamano;
        this.edad   = edad;
        this.color  = color;
        this.precio = precio;
    }

    //Esto es un metodo o una accion que puede hacer el objeto perro
    //Nombre del comportamiento o el metodo de la accion que deseamos
    public void correr(){
        System.out.println("El perro esta corriendo...");
    }

    public void datos(){
        System.out.println("Id: " + iD);
        System.out.println("Raza: " + raza);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Precio: " + precio);
    }


}
