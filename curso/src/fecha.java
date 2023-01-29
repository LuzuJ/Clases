package curso.src;
//Los metodos GETTER(obtener datos) y SETTER(asignar datos) se usan para 
// crear, modificar, eliminar y ver los valores de las variables
public class fecha {
    //Creamos los atributos
    //los privados solo sirven para esta clase
    private int dia;
    private String mes;
    private int año;
    //En el foco para generarlos automaticamente
    
    //del valor asignado de aqui podemos extraer el valor que queremos
    public int getDia() {
        return dia;
    }
    //Aqui se deposita el valor, asignamos el valor
    public void setDia(int dia) {
        this.dia = dia;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }

}
