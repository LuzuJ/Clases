package BusinessLogic.Entities;

public class Sexo {
    private int idSexo;
    private String nombre;
    private String estado;

    public Sexo(int idSexo, String nombre, String estado) {
        this.idSexo = idSexo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getIdSexo() {
        return idSexo;
    }
    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


}
