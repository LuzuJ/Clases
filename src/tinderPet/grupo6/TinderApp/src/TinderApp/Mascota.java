package tinderPet.grupo6.TinderApp.src.TinderApp;

import java.util.Scanner;

public class Mascota {

    private String nombre, tipo, raza, edad, propietario, observacion;
    private Boolean estadoMatch;

    public Mascota(){
        estadoMatch = true;
    }
    public Mascota(String nombre, String tipo, String raza, String edad,String propietario, String observacion,Boolean estadoMatch){

        this.nombre = nombre;
        this.tipo = tipo;
        this.raza=raza;
        this.edad= edad;
        this.propietario = propietario;
        this.observacion = observacion;
        this.estadoMatch = true;
    }

    public void setDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es el nombre?");
        nombre = sc.nextLine();
        System.out.println("Cual es el tipo?");
        tipo = sc.nextLine();
        System.out.println("Cual es la raza?");
        raza = sc.nextLine();
        System.out.println("Cual es la edad?");
        edad = sc.nextLine();
        System.out.println("Cual es el propietario?");
        propietario = sc.nextLine();
        System.out.println("Observacion:");
        observacion = sc.nextLine();


    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoMatch() {
        return estadoMatch;
    }

    public void setEstadoMatch(boolean estadoMatch) {
        this.estadoMatch = estadoMatch;
    }

    public void showDatos(){
        System.out.println("Nombre :" + nombre + "\n Tipo:" + tipo + "\n Raza:" + raza + "\n Edad:" + edad + "\n Propietario: " + propietario + "\n Observacion: " + observacion + "\n DisponibleParaMatch: " + estadoMatch + "\n ---------------");
    }



}
