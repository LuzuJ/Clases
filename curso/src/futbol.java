package curso.src;

//usamos el abstract anres de class
//clase restringida para crear objetos, solo se ingresa por herencia
public abstract class futbol {
    //metodo abstarct, sin valor en particular
    public abstract void ciudad();
    //metodo comun
    public void pais_origen(){
        System.out.println("pais: España");
    }
    
}

//SUBCLASE
class club extends futbol{
    //metodo
    public void ciudad(){
        System.out.println("ciudad = barcelona");
    }
}