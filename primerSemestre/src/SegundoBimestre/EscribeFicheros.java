package SegundoBimestre;
/*
* Administracion de archivos: para iniciar, este programa sera su primera idea de base de datos 
* BDD, dado que, se tendra persistencia (Es almaceanar datos los cuales nos es perderan en 
* el tiempo) de los datos ingresados en un programa. 
* 
* Un archivo, es un espacio de memoria en donde se puede escribir o leer datos de manera persistente. 
* Es un conjunto organizado de unidades de informacion (bits) almacenados en un dispositivo.
* 
* 1) Archivo binario. Representado por bits, que contiene informacion de CUALQUIER TIPO y que tiene como proposito
* procesamiento y almacenamiento de datos por el ordenador. 
* Los archivos binarios se distiguen de dos maneras, la primera es por la extesion del archivo, y la segunda manera es por
* el encabezado del archivo(meta datos). Los encabezados o meta datos, son los datos que tienen la informacion de que tipo
* de archivo es, y como procesarlo.  
* 
* 2) Archivo de texto: Es un conjunto de caracteres estructurados en distintas lineas. Son utilizados en diferentes 
* lenguajes de programacion. Cada de uno de los archivos de texto se ejecutaran de diferente manera dependiendo del 
* entorno de donde ser los use. 
* 
* Propiedades de los archivos: 
* Leer: Es poder utilizar la informacion dentro del archivo. 
* Escribir: Es editar o cambiar la informacion dentro de un archivo. 
* Ejecutar: Es Procesar y analizar la informacion contenida dentro de un archivo. 
* 
* Ubicacion de los archivos: esta dado por una ruta, a esta ruta se le denomia path en ingles. Se puede tener 
* dos tipos de ruta o paths.
* 
*  1) Path absoluto: Es una direccion exacta donde se encuentra un archivo. Esta direccion no cambia, y esta
*  asociada con la computadora donde se creo el archivo. 
* 
*  2) Path relativo: Es aquella direcion de memoria que no depende de la computadora donde se haya creado el 
*  archivo. 
*/
import java.io.*;
import java.util.Scanner;
public class EscribeFicheros {

	public static void main(String[] args) throws IOException
	{
		// Objeto que me permite crear un archivo, si es que no se encuentra dentro ubicacion solicitada. 
        FileWriter nomDocumento = null;
        // Objeto que me permite escribir dentro un archivo. 
        PrintWriter cursorDeEscritura = null;
        //
        Scanner ingresoD = new Scanner(System.in);
        //fichero = new FileWriter("C:\\Users\\HP\\OneDrive\\Escritorio\\Universidad\\Primer Semestre\\Programación 1\\Eclipse IDE\\Programacion12022A\\archivos\\documento1.java");
        // El inicio de todo archivo, es la ubicacion o path. 
        nomDocumento = new FileWriter("archivos/documento1");
        
        //Donde crear el cursor
        cursorDeEscritura = new PrintWriter(nomDocumento);
        System.out.println("Hola, mi primera impresion");
        cursorDeEscritura.println("Hola, esta es la primera impresion dentro de mi archivo");
        cursorDeEscritura.println("Este es un archivo de texto que contiene nombres ");
        cursorDeEscritura.println("Esta es mi segunda linea de impresion");
        cursorDeEscritura.println(6+9);
        cursorDeEscritura.println("Una ecuación diferencial es una ecuación matemática que relaciona una función con sus derivadas. En las matemáticas aplicadas, las funciones usualmente representan cantidades físicas, las derivadas representan sus razones de cambio, y la ecuación define la relación entre ellas.");
        cursorDeEscritura.append('c');
        cursorDeEscritura.append("Texto anadido");
        cursorDeEscritura.append("Texto 2 anadido");
        System.out.println();
        cursorDeEscritura.println();
        for (int i = 0; i < 10; i++) {
        	 cursorDeEscritura.println("Linea " + i);
        }
        System.out.println("Introduzca su nombre ");
        String nombre = ingresoD.nextLine();
        cursorDeEscritura.println(nombre);
        
        System.out.println("Introduzca su apellido");
        String apellido = ingresoD.nextLine();
        cursorDeEscritura.append(apellido);
        
        System.out.println(apellido);
        
       nomDocumento.close(); 
       /*  
        try
        {
            //fichero = new FileWriter("C:\\Users\\Pablo\\eclipse-workspace\\segundoBimenstreGr2\\archivos\\Prueba2");
            fichero = new FileWriter("archivos/PruebaArchivosCarperta/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }*/

	}

}
