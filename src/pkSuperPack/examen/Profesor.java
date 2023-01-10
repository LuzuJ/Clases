package examen;

public class Profesor {

    private static int suma = 0;
    private final int codigo;
    private final String nombre;
    private final String correoInst;
    private final String materia;



    public Profesor(String nomProf, String correoProf, String materia) {

        this.codigo = suma++;
        this.nombre = nomProf;
        this.correoInst = correoProf;
        this.materia = materia;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoInst() {
        return correoInst;
    }

    public String getMateria() {
        return materia;
    }

    public String imprimirProfesor() {

        return "Profesor: " + this.nombre + "(" + this.codigo + "). Correo: " + this.correoInst +
                (". Materia a impartir: " + this.materia);
    }

    /*public void imprimirProfesor1() {

        System.out.println("Profesor: " + this.nombre + "(" + this.codigo + "). Correo: " + this.correoInst);
    }
    */
}
