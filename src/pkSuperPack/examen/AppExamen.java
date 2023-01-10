package examen;

public class AppExamen {

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Juan", "juan.juan@juan.com");
        System.out.println(est1.imprimirEstudiante());

        Profesor prof1 = new Profesor("Pedro","pedro.pedro@pedro.com", "Contabilidad");
        System.out.println(prof1.imprimirProfesor());

        System.out.println(est1.imprimirEstudiante().concat(prof1.imprimirProfesor()));

        System.out.println(prof1.imprimirProfesor());

        int a = 6;
        if(a > 3) {

            System.out.println("Verdad");
        } else {

            System.out.println("Falso");
        }

        /*Operador condicional puede reemplazar al if sencillo, depende de una escritura precisa*/

        System.out.println();
        String x = a < 3 ? "Verdad" : a < 6 ? "Casi verdad" : "Casi falso";

        System.out.println(x);

        Materia mat1 = new Materia("ISO123","Hidraulica",8,"E506");

        System.out.println(mat1.imprimirMateria());

        Examen exa1 = new Examen("hoy",20,mat1);

        exa1.setProfesor(prof1);
        exa1.setEstudiante(est1);
        exa1.setCalificacion(7.1);


        System.out.println(exa1.imprimirExamen());

        System.out.println();

        System.out.println(est1.imprimirEstudiante());

    }
}
