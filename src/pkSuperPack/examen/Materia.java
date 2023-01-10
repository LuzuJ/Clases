package examen;

public class Materia {

    private final String codMat;
    private final String nombre;
    private final int creditos;
    private String aula;

    public Materia(String codMat, String nombre, int cred, String aula) {
        this.codMat = codMat;
        this.nombre = nombre;
        this.creditos = cred;
        this.aula = aula;
    }

    public String getCodMat() {
        return this.codMat;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String imprimirMateria() {

        return this.nombre + "(" + this.codMat + "), con " + this.creditos + " creditos. Aula " + this.aula + ".";
    }
}
