//import java.util.ArrayList;
//import java.util.List;

//import pkPoliEstudiante.Estudiante;
import java.time.Period;
import java.util.Scanner;

import pkPoliEstudiante.Calendario;

//import pkHerencia.Hijo;
//import pkHerencia.Padre; //Importar siempre las herencias
//import pkArreglo.Cadena;

public class App {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            boolean bandera = false;

            while (bandera == false) {
                  System.out.println("Igrese el dia y la hora para ingresar");
                  System.out.println("Ingrese el dia");
                  String dia = sc.nextLine().toLowerCase();
                  System.out.println("Ingrese la hora");
                  String hora = sc.nextLine().toLowerCase();
                  System.out.println("Ingrese la actividad");
                  String actividad = sc.nextLine();

                  Calendario e1 = new Calendario(actividad, hora, dia);
                  e1.showCalendar();
                  System.out.println("Desea seguir ingreando?");
                  String preguntas = sc.nextLine().toLowerCase();
                  if (preguntas.equals("si")) {
                        bandera = false;
                  } else {
                        bandera = true;
                  }
            }

            // List<Estudiante> lsProg = new ArrayList<>();
            //
            //
            // //Estudiante badBUnny = new Estudiante();
            // Estudiante poliEstu = new Estudiante(1, "PepaPig", false);
            // poliEstu.showMe();
            //
            // lsProg.add(poliEstu);

            // Padre p1 = new Padre();
            // Padre p2 = new Padre("Lucho");
            // Padre p3 = new Padre("Maria", "Quimico", "F", 20);
            // Hijo h3 = new Hijo("Pedro", "Quimico", "M", 20);
            //
            // //A pesar que hijo no tiene nada, al heredar de padre puede traer cosas del
            // padre
            // //como si fueran propias del hijo
            // Hijo h1 = new Hijo("ANA");
            // h1.presentarse();
            // h3.presentarse();
            //
            //
            // //Los llamamos
            // p1.presentarse();
            // p2.presentarse();
            // p3.presentarse();
            //
            //
            // Cadena c1 = new Cadena();
            // Cadena c2 = new Cadena();
            // Cadena c3 = new Cadena();
            // Cadena c4 = new Cadena();
            // Cadena c5 = new Cadena();
            // Cadena c6 = new Cadena();
            // Cadena c7 = new Cadena();
            //
            //
            // System.out.println(" ");
            // c1.showArrayInt();
            //
            // System.out.println(" ");
            // c2.showArrayChar();
            //
            // System.out.println(" ");
            // c3.showArrayString();
            //
            // System.out.println(" ");
            // c4.showMatrizInt();
            //
            // System.out.println(" ");
            // c5.showMatrizIntAnormal();
            //
            // System.out.println(" ");
            // c6.showMatrizCharAnormal();

            // System.out.println(" ");
            // c7.showListString();

            sc.close();
      }
}
