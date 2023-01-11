package jonathan_luzuriaga;

public class Integrante {
    protected int jjId;
    protected String jjNombre;

    public Integrante(int jjId, String jjNombre) {
        this.jjId=jjId;
        this.jjNombre=jjNombre;
    }
    public int jjSetIntegrante(){
        return jjId;
    }
    public String jjSetNombre(){
        return jjNombre;
    }
}

