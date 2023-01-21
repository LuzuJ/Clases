package SegundoBimestre;
import java.io.*;

public class LeeFicheros {

	public static void main(String[] args) throws IOException { //excepciones
		// La ubicacion del archivo que quiero leer. 
	      File archivo = null;
	      // Puntero para leer los elementos del archivo.
	      FileReader fr = null; //algo como la linea activa
	      // Es el lugar de almacenamiento de las palabras. 
	      BufferedReader br = null; //todo lo almacenado o leido respecto al puntero
	      
	      /*
	       * 
	       * linea = br.readLine()
	       * if(linea.equals("valor")){
	       *   Escriba el nuevo valor con un FileWriter 
	       * }
	       * 
	       */
	      
	      FileWriter fichero = new FileWriter("archivos/prueba"); //donde va lo nuevo del archivo
	      PrintWriter pw = new PrintWriter(fichero);

	      
	      // Apertura del fichero y creacion de BufferedReader para poder
	      // hacer una lectura comoda (disponer del metodo readLine()).
	      //archivo = new File ("C:\\Users\\Pablo\\eclipse-workspace\\segundoBimenstreGr2\\archivos\\prueba");
	      archivo = new File ("archivos/documento1"); //archivo que quiero abrir
	      //De donde quiero que se lea la informacion. 
	      fr = new FileReader (archivo);
	      // Donde quiero almacenar la informacion. 
	      br = new BufferedReader(fr);
	 
	 
	      String prueba = br.readLine();
	      System.out.println(prueba + " linea 1");
	      
	      pw.println(prueba);
	      
	      prueba = br.readLine();
	      prueba.split(","); // dividir una oracion 
	      System.out.println(prueba + " linea 2");
	      
	      for (int i = 0 ; i < 4; i++) {
	    	  prueba = br.readLine();  //lee 4 linea
	    	  System.out.println(prueba + " linea " + i);
	    	  
	      }
	      

	      /*
	      String prueba = br.readLine();
	      System.out.println(prueba);
	      // Lectura del fichero
	      prueba = br.readLine();
	      System.out.println(prueba);
	      prueba = br.readLine();
	      System.out.println(prueba);
	      prueba = br.readLine();
	      System.out.println(prueba);
	      */
	      
	      String linea; //leer tofo el archivo
	      while((linea=br.readLine())!=null) { //leer hasta que el espacio no sea vacia
	    	  System.out.println(linea); //los espacios tambien se leen
	    	 // pw.println(linea);
	      }

	      fichero.close(); // para cerrar el lector
	      
	  /*
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Pablo\\eclipse-workspace\\segundoBimenstreGr2\\archivos\\prueba");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }*/


	}
}

