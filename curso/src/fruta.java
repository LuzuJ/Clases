package curso.src;
//SUPERCLASE
//no hace falta especificar lo public
class fruta {
    // generamos un metodo void sin datos
    public void color_fruta() {
        System.out.println("frutas tropicales");
    }
}

//SUBCLASE
//son diferentes resultados para una sola respuesta
class manzana extends fruta{
    //cada sub clase debe hacer mencion a cada superclase
    public void color_fruta(){
        System.out.println("manzana = rojo");
    }
}

class platano extends fruta{
    public void color_fruta(){
        System.out.println("platano = amarrillo");
    }
}

