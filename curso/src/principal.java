package curso.src;
//Aqui siempre va todo por que es el metodo main


public class principal {
       public static void main(String[] args) {
              /**
               * ------- PERRO----------
               * //aqui debemos crear el perro, asignamos un nombre al objeto, creamos un
               * "perro"
               * //ya que creamos nuevo objeto perro necesitamos llevar todas las cosas que
               * creamos en el constructor
               * perro perr_1 = new perro(1, "chiguagua", 15, 5, "negro", 15);
               * //metodo de ejecucion
               * perr_1.correr();
               * perr_1.datos();
               * 
               * System.out.println();
               * 
               * //clase objeto_crear = crar objeto(new) donde pertenece (valores para crear
               * el objet)
               * perro perro_2 = new perro(2, "Pastor aleman", 50, 5, "Anaranjado", 45);
               * perro_2.datos();
               */

              // -----------ALUMNO
              // //alumno alumno_nuevo = new alumno();
              // //System.out.println("Nombre: " + alumno_nuevo.nombre);
              // //genero la creacion de un objeto
              // alumno alumno1 = new alumno("Luzuriaga", 19);
              // alumno alumno2 = new alumno("Jonathan", 20);
              // alumno1.respuesta();
              // alumno2.respuesta();
              //
              // System.out.println();
              //
              // //ejecutamos el metodo static
              // //el punto siempre trae los metodos o lo que se desee comparar
              // alumno alumno_mayor = alumno.mayor(alumno1, alumno2);
              // System.out.println("Alumno mayor edad: ");
              // alumno_mayor.respuesta();
              //
              System.out.println();

              // ---------------FECHA-----
              // //Creamos objetos con referencias a la clase fecha
              // fecha f1 = new fecha();
              // f1.setDia(24);
              // f1.setMes("junio");
              // f1.setAño(2023);
              // System.out.println("dia: " + f1.getDia());
              // System.out.println("mes: " + f1.getMes());
              // System.out.println("año: " + f1.getAño());

              // Vamos con herencias, Padre (super clase), hijo(subclase)
              // para reutilizar el codigo.

              //// -----------------THIS
              //// this para invocar un cosntructor y metodo de una clase actual y para
              // persona p1 = new persona(38, "Ely");
              // persona p2 = new persona(40, "Mari");
              // p1.datos();
              // p2.datos();

              // ----------------ANIMAL
              // Super, accede a los miembros de las super clases, para reemplazar en la sub
              // clase
              // es solo si es necesario variables de las superclases. herencia

              // leon l1 = new leon();

              // ------------ARROZ
              // Encapsulamiento: agrupacion de metodos dentro de una sola clase, "como"
              // lograr una funcionalidad
              // Declarar las variables de una clase privada, set a get,
              // es para restringir los datos de un codigo, solo lectura o solo escritura
              // la clase puede tener el control total de los datos, abstraccion es otra cosa,

              //// creamos el objeto
              // arroz arr1 = new arroz();
              // arroz arr2 = new arroz();
              //// asignamos los valores del arroz
              // arr1.setMarca("Grano de arroz");
              // arr1.setPeso(100);
              //
              // arr2.setMarca("Rico");
              // arr2.setPeso(50000);
              //// traemos los valores que asignamos
              // System.out.println(arr1.getMarca() + " peso en gr: " + arr1.getPesogr());
              // System.out.println(arr2.getMarca() + " peso en Kg: " + arr2.getpesokg());

              //----------CLASE EXTERNA
              // clases Anidadas, juntar las clases para que sea mas legible y facil de
              // manejar
              // clases dentro de otras clases

              // creamos el objeto
             //clase_externa obj_externo = new clase_externa();
             //// con el punto usamos el punto para ingrear al siguiente nivel
             //// para poder acceder al objeto interno debe generarse el new en la clase
             //// ecterna
             //
             //clase_externa.clase_interna obj_interno = obj_externo.new clase_interna();

             //// con esto generamos para static y con el valor interno.
             ////clase_externa.clase_interna obj_interno = new clase_interna();

             // llamamos igual como todo
             //// si es privada ya no se puede acceder a la clase,
             //System.out.println(obj_interno.y + obj_externo.x);

             //clase_externa obj_externo = new clase_externa();
             ////esto llamamos como el anterior
             //clase_externa.clase_interna obj_interno = obj_externo.new clase_interna();
             ////println llamamos el metodo interno de la clase desde la clase interna
             //System.out.println(obj_interno.obj_interno_metodo());

             //Clase abstarcta, es una clase que tiene metodo que no pueden ser desarrolladas por falta de informacion
             //usaremos sub clases que tengan la informacion disponible
             //abstract para eso y para no instanciar las clases

             ///------------PAIS
             ////creamos el objeto, para el pais necesitamos una ciudad
             //ciudad paris = new ciudad();
             ////llamamos a informacion para trabajar con la clase abstarct, por herencia
             //paris.informacion();

             //---------------FRUTAS
             //Polimorfismmo
             //muchas clases que estan relacionadas entre si por herencias, codigos consistentes
             //sobrecarga de datos
             //Se usa para reutilizar codigo, reusa lo de ina clase ya existente

            //fruta nueva_fruta = new fruta();
            //fruta manzana = new manzana();
            //fruta platano = new platano();

            //nueva_fruta.color_fruta();
            //manzana.color_fruta();
            //platano.color_fruta();

            //------------ FUTBOL
            //Abstraccion
            //Proceso de ocultar detalles y mostar lo esencial al usuario

            //creamos un objeto desde la subclase que nos interese
            club barcelona_fc = new club();
            barcelona_fc.ciudad();
            //mencion a la clase abstarcta
            barcelona_fc.pais_origen();

       }


}
