package Framework;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    private final static Logger LOG_MONITOREO = Logger.getLogger("com.pruebas.proyecto");

    public static String login(String usuario, String password){
        String res = "";
   try {
        Handler consoleHandler = new ConsoleHandler(); //Estableceremos un manejador de errores
        Handler fileHandler = new FileHandler("app.log", true);
        /*Colocaremos la ruta donde se guardará el log, la propiedad true indica que siempre se escribirá sobre 
        el mismo archivo y no generará una copia hasta que este archivo sea igual a 5 mb de tamaño*/
        
         SimpleFormatter simpleFormatter = new SimpleFormatter();// Se establece únicamente para generar un formato para la presentación de los errores o el trace
         fileHandler.setFormatter(simpleFormatter);
         LOG_MONITOREO.addHandler(consoleHandler);
         LOG_MONITOREO.addHandler(fileHandler);
   
         consoleHandler.setLevel(Level.ALL); //Este comando comenzará el manejador de errores
         fileHandler.setLevel(Level.ALL); //Este comando se ejecuta para comenzar el proceso de registro del logger
         // En ambos comando se debe colocar el nivel de registro de errores en el log por ende se colocar Level.ALL
   
   /*El siguiente comando se utilizará para registrar lo que necesitemos ver dentro del log, aquí es donde definimos que datos se imprimiran en él*/
   
   LOG_MONITOREO.log(Level.INFO, "Nueva Solicitud de Logueo");
   LOG_MONITOREO.log(Level.INFO, "Usuario: " + usuario);
   LOG_MONITOREO.log(Level.INFO, "Contraseña: " + password);
   
   //Esta validación la realizaremos únicamente como ejemplo
   
   if(usuario.equals("emmax77") && password.equals("1234567")){
       LOG_MONITOREO.log(Level.INFO, "Logueo exitoso!");
       res = "Logueo exitoso!";
   }else{
       LOG_MONITOREO.log(Level.WARNING, "Usuario o contraseña incorrecto");
       res = "Usuario o contraseña incorrecto";
   }
   
   //Luego de realizar los registros debemos cerrar el hilo de conexión a nuestro archivo
   
   fileHandler.close();
   consoleHandler.close();
   
   } catch (Exception e) {
   //Registraremos la exception que ocurra en nuestro log
       LOG_MONITOREO.log(Level.SEVERE, e.getMessage());
       res = "Error, consulte con su proveedor del servicio";
   }
       return res;
   }
}
