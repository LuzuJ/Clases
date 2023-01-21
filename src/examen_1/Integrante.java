public abstract class Integrante {
    protected int ID;
    protected String Nombre;

    //Extras
    protected int Edad;
    protected String Sexo;

    
    public Integrante(int id, int edad, String sexo, String Nombre){
        this.ID = id;
        this.Nombre = Nombre;
        //Extra
        this.Edad = edad;
        this.Sexo = sexo;
    }
}
