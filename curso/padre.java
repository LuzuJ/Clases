package curso;

//quitamos el publico por que aqui son datos muy privados
class padre {
    //este modificador trabaja con el metodo y clases amigas
    protected String nombre = "JONATHAN";

    public void saludo(){
        System.out.println("Buenos dias gente........");
    }

}

//estructura de la herencia, para poder heredar todo de padre lo extiende
class hijo extends padre{
    private String nombre_hijo = "Luzu";

    public static void main(String[] args) {
        hijo nuevo_hijo = new hijo();
        nuevo_hijo.saludo();
        System.out.println("tu hijo: " + nuevo_hijo.nombre_hijo);
    }

}