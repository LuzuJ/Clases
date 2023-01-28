package curso;

public class alumno {
   // //Modificadores de acceso
   // public String nombre = "Jonathan";
   // //es privada debo llamarla de otra manera
   // private int edad     = 12;
//
   // //para datos privados que no queremos que se muestren,
   // //publico desde cualquier lugar del codigo, private solo desde esta clase
   // 
   // public static void main(String[] args) {
   //     alumno alumno_nuevo = new alumno();
   //     System.out.println("edad: " + alumno_nuevo.edad);
    //}


    //private String nombre;
    //private int edad;
    ////constructor para depositar valores
    //public alumno (String nombre, int edad){
    //    this.nombre = nombre;
    //    this.edad = edad;
    //}
//
    ////La unica manera de mediante un constructor tener los private
    //public void respuesta(){
    //    System.out.println(this.nombre + " edad: " + this.edad);
    //}
//
    ////Metodo de acceso - no necesita acceso - donde podemos encontrar los valores
    ////-mayor - (alumno de la clase- nombre para diferenciarlos)
    ////esto para que de un constructor podamos utilizar los valores
//
    //public static alumno mayor(alumno alum1, alumno alum2){
    //    //para que reconozca que atributo quiero que compare .edad
    //    if (alum1.edad>= alum2.edad) {
    //        return alum1;
    //    }else{
    //        return alum2;
    //    }
    //}

    //METODO CON FINAL
    //son datos que jamas van a cambia
    final int edad = 20;
    final double pi = 3.1415;

    public static void main(String[] args) {
        alumno luzu = new alumno();
        System.out.println(luzu.pi);
    }


}
