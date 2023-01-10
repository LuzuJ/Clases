package examen;

public class Examen {

    private final String fecha;
    private final int preguntas;
    private double calificacion;
    private Estudiante estudiante;
    private final Materia materia;
    private Profesor profesor;

    public Examen(String fecha, int pregs, Materia materia) {

        this.fecha = fecha;
        this.preguntas = pregs;
        this.calificacion = 0.0;
        this.estudiante = null;
        this.materia = materia;
        this.profesor = null;
    }

    public String getFecha() {
        return fecha;
    }

    public int getPreguntas() {
        return preguntas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calif) {
        if(this.profesor!=null) {

            char gr = 'F';

            if (calif == 10.0) {

                gr = 'A';
                this.estudiante.setGrado(gr);
                this.estudiante.setPromedio(calif);
            } else if (calif >= 8.0) {

                gr = 'B';
                this.estudiante.setGrado(gr);
                this.estudiante.setPromedio(calif);
            } else if (calif >= 7.0) {

                gr = 'C';
                this.estudiante.setGrado(gr);
                this.estudiante.setPromedio(calif);
            } else if (calif >= 6.5) {

                gr = 'D';
                this.estudiante.setGrado(gr);
                this.estudiante.setPromedio(calif);
            } else if (calif >= 5.0) {

                gr = 'E';
                this.estudiante.setGrado(gr);
                this.estudiante.setPromedio(calif);
            } else {

                gr = 'F';
                this.estudiante.setGrado(gr);
                this.estudiante.setPromedio(calif);
            }

            this.estudiante.aprobar();
            //return gr;
        } else{

            System.out.println("No se puede calificar sin profesor");
        }
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {

        if(profesor.getMateria().equals(this.materia.getNombre())) {

            this.profesor = profesor;
        } else {

            System.out.println("El profesor no puede ser asignado a este examen");
        }
    }
    /*

    Funcion basada en los parametros del examen que permite asignar el valor de aprobacion y grado de
    un estudiante en funcion de una calificacion ingresada
    public char gradoEstudiante(double calif) {

        char gr = 'F';

        if(calif == 10.0) {

            gr = 'A';
            this.estudiante.setGrado(gr);
            this.estudiante.setPromedio(calif);
        } else if (calif >= 8.0) {

            gr = 'B';
            this.estudiante.setGrado(gr);
            this.estudiante.setPromedio(calif);
        }else if (calif >= 7.0) {

            gr = 'C';
            this.estudiante.setGrado(gr);
            this.estudiante.setPromedio(calif);
        } else if (calif >= 6.5) {

            gr = 'D';
            this.estudiante.setGrado(gr);
            this.estudiante.setPromedio(calif);
        } else if (calif >= 5.0) {

            gr = 'E';
            this.estudiante.setGrado(gr);
            this.estudiante.setPromedio(calif);
        } else {

            gr = 'F';
            this.estudiante.setGrado(gr);
            this.estudiante.setPromedio(calif);
        }

        this.estudiante.aprobar();
        return gr;
    }
    */

    public String imprimirExamen() {

        return "Examen de " + this.materia.getNombre() + " rendido por " + this.estudiante.getNombre() +
                " obtuvo una calificacion de " + this.calificacion + ". Profesor asignado: " +
                this.profesor.imprimirProfesor();
    }


}
