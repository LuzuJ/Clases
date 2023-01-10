package examen;

public class Estudiante {

    private static int suma = 0;
    private final int codigo;
    private final String nombre;
    private final String correoInst;
    private double promedio;
    private boolean aprobacion;
    private char grado;

    public Estudiante(String nombre, String correoStud) {

        this.codigo = suma++;
        this.nombre = nombre;
        this.correoInst = correoStud;
        this.promedio = 0.0;
        this.aprobacion = false;
        this.grado = 'F';
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCorreoInst() {
        return this.correoInst;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public boolean isAprobacion() {
        return this.aprobacion;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setAprobacion(boolean aprobacion) {
        this.aprobacion = aprobacion;
    }

    public char getGrado() {
        return grado;
    }

    public void setGrado(char grado) {
        this.grado = grado;
    }

    public void aprobar() {

        if(this.promedio >= 7.0) {

            this.aprobacion = true;
        } else {

            this.aprobacion = false;
        }
    }

    public String imprimirEstudiante() {

        if(this.aprobacion) {

            return "Estudiante: " + this.nombre + "(" + this.codigo + "). Correo: " + this.correoInst +
                    "\n" + "Promedio: " + this.promedio + "(Aprobado, con grado " + this.grado + ").";
        } else {

            return "Estudiante: " + this.nombre + "(" + this.codigo + "). Correo: " + this.correoInst +
                    "\n" + "Promedio: " + this.promedio + "(Reprobado, con grado " + this.grado + ").";
        }


    }
}
