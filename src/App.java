//import java.util.ArrayList;
//import java.util.List;

//import pkPoliEstudiante.Estudiante;
import pkPoliEstudiante.Calendario;

//import pkHerencia.Hijo;
//import pkHerencia.Padre; //Importar siempre las herencias
//import pkArreglo.Cadena;

public class App {

    public static void main(String[] args) {


        Calendario e1 = new Calendario("Jugar", "11-12");
        e1.showCalendar();

        char izq[] = "         ".toCharArray(); 
        char der[] = "         ".toCharArray(); 
        int  len  = izq.length-1;
        for (int i = 0; i < len; i++) {
            izq[len-i] = der[i]= '+';
            System.out.println((new String(izq)) + (new String(der)));
        }
        System.out.println("_______|  |_______  :) luzuJ"); 

       // List<Estudiante> lsProg = new ArrayList<>();
//
//
       // //Estudiante badBUnny = new Estudiante();
       // Estudiante poliEstu = new Estudiante(1, "PepaPig", false);
       // poliEstu.showMe();
//
       // lsProg.add(poliEstu);



      //  Padre p1 = new Padre();
      //  Padre p2 = new Padre("Lucho");
      //  Padre p3 = new Padre("Maria", "Quimico", "F", 20);
      //  Hijo h3 = new Hijo("Pedro", "Quimico", "M", 20);
//
      //  //A pesar que hijo no tiene nada, al heredar de padre puede traer cosas del padre
      //  //como si fueran propias del hijo
      //  Hijo h1 = new Hijo("ANA");
      //  h1.presentarse();
      //  h3.presentarse();
      //  
      //  //Los llamamos 
      //  p1.presentarse();
      //  p2.presentarse();
      //  p3.presentarse();
//
//
      //  Cadena c1 = new Cadena();
      //  Cadena c2 = new Cadena();
      //  Cadena c3 = new Cadena();
      //  Cadena c4 = new Cadena();
      //  Cadena c5 = new Cadena();
      //  Cadena c6 = new Cadena();
      //  Cadena c7 = new Cadena();
      //  
//
      //  System.out.println(" ");
      //  c1.showArrayInt();
//
      //  System.out.println(" ");
      //  c2.showArrayChar();
//
      //  System.out.println(" ");
      //  c3.showArrayString();
      //  
      //  System.out.println(" ");
      //  c4.showMatrizInt();
//
      //  System.out.println(" ");
      //  c5.showMatrizIntAnormal();
//
      //  System.out.println(" ");
      //  c6.showMatrizCharLogo();

     // System.out.println(" ");
     // c7.showListString();

    }
}
