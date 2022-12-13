import pkHerencia.Hijo;
import pkHerencia.Padre;

public class App {
    public static void main(String[] args) {
        //Llamar clase
        Padre p = new Padre();
        Padre p2 = new Padre("Juanita", "Quimico", "F", 23);
        Padre p3 = new Padre("Juan");
        p.presentarse();
        p2.presentarse();
        p3.presentarse();

        Hijo h1 = new Hijo("Ana");
        
        h1.presentarse();


    }
}
