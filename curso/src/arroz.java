package curso.src;

public class arroz {
    String marca;
    double peso;
    //generamos los getter and setters
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //para usar un get y set de diferentes cosas en la misma clase
    public double getPesogr() {
        return peso;
    }

    public void setPeso(double pesogr) {
        peso = pesogr;
    }

    public double getpesokg(){
        return peso/1000;
    }
    
   

}
