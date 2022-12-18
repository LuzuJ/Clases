package pkPoliEstudiante;

public class Estudiante {
    private String nombre;
    private Boolean depre;
    private int codigo;

    public Estudiante(){
        
    }

    public Estudiante(int codigo, String nombre, Boolean depre){
        this.nombre = nombre;
        this.depre  = depre;
        this.codigo = codigo;
    }

    public void showMe(){
        System.out.println("codigo= " + codigo);
        System.out.println("nombre = " + nombre);
        System.out.println("depre = " + depre );
        
    }

}
