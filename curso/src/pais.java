package curso.src;

//usaremos el abstarct para ello
abstract class pais {
    //void si no tengo ningun valor para usar, la clase debe ser heredada
    public  void informacion(){
        System.out.println("Ciudad Europea");

    }
} 

class ciudad extends pais {

    
}
