package curso.src;

public class animal {
    // generamos un constructor
    // como no hay atributos no hace falta el void
    public animal() {
        System.out.println("soy un animal");
    }

    // sobrecarga de metodos
    public animal(String tipo) {
        System.out.println("tipo: " + tipo);

    }
}

// aqui podemos hacer la sub clase
// extendemos desde el animal, herencias
class leon extends animal {
    public leon() {
        super("felino");// especifico el resultado
        System.out.println("Soy un Leon... ");
    }

}