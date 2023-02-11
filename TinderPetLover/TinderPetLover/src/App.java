import java.awt.BorderLayout;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import java.awt.FlowLayout; 
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;

import BusinessLogic.PetBL;
import BusinessLogic.UserBL;
import BusinessLogic.Entities.Pet;
import BusinessLogic.Entities.User;
import UserInterface.FrameMaster;
import Framework.*;


public class App {

    public static void test(){
        FlatLightLaf.setup();
        FlatLightLaf.supportsNativeWindowDecorations();
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } 
        
        JFrame frame = new JFrame();
        frame.setTitle("Title");
        frame.setSize(640, 480);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuFileSave = new JMenuItem("Save");
        menuFileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
        menu.add(menuFileSave);
        
        menuBar.add(menu);
        
        FlowLayout mainLayout = new FlowLayout(FlowLayout.LEFT);

        frame.setJMenuBar(menuBar);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        String datesString[] = {"Tuesday May-03-2022", "Monday May-02-2022"};
        @SuppressWarnings("rawtypes")
        JComboBox dateDropDown = new JComboBox<>(datesString);
       // dateDropDown.setFont(new Font("Calibri", Font.PLAIN, 17));
        dateDropDown.setVisible(true);
        
        mainPanel.add(dateDropDown);
    
        mainPanel.setVisible(true);
        frame.add(mainPanel);
        
        // JPanel textPanel = new JPanel(new LayoutManager());
        
        // JTextArea textArea = new JTextArea();
        // textPanel.add(textArea);
    
        // textPanel.setVisible(true);
        // frame.add(textPanel);
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws AppException, IOException {
        //APP.loadProperties();
        System.out.println("--------------------------");
        System.out.println(APP.getProperty(APP.GLOBAL.KEY_DB_FULLPATH));
        System.out.println("--------------------------");
        
        System.out.println("GET DATA FROM API_REST : << GET-USERS >> ");
        try {
            UserBL userBL = new UserBL();
            for (User p : userBL.getUsers()) 
                System.out.println(
                        "\n\t[+] USER" 
                        +"\n\t - Id: "        + p.getId() 
                        +"\n\t - Name: "      + p.getName().toUpperCase()
                        +"\n\t - Email: "     + p.getEmail()
                        +"\n\t - Phone: "     + p.getPhone()
                        +"\n\t - Website: "   + p.getWebsite()
                        +"\n\t - Company: "   + p.getEmpresa().toUpperCase());
        } catch (Exception e) {}
        
        System.out.println("GET DATA FROM SQLITE : << GET-PET >> ");
        try {
            PetBL pet =  new PetBL();
            for (Pet p : pet.GetAllPets()) {
                System.out.println("[Pet]" );
                System.out.println("Nombre:" + p.getNombre());
                System.out.println("Raza:" + p.getRaza());
            }
        } catch (Exception e) {}
       

        // Stream<Pet> stream=pet.GetAllPet();
        // stream  .map(p -> p.getNombre())
        //         .forEach(System.out::println);

        //dac.getPersonaID(1);
        //dac.getPersonaID(3);
        //dac.findPersonaNombre("Juan");
        //dac.getPersonaNombre("Juan");
        
        //////////////////
        Log.login("user", "pass");

        
        

        //SQLiteJDBC();
        //test();
        int age = 0;
        if (age <= 0){
           new EdadMenosCeroException("No puedes tener mascotas con cero edad...");
        }
        
        //Exception handling
        // try {
        //     DataBase db = new DataBase();
        //     db.ConnDB("SQLServer");
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        

        
        //FlatArcDarkContrastIJTheme.setup();
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                FrameMaster f = new FrameMaster("Pet-Lover","Resourse\\img\\logo.png");
            }
        });
    }
    
    // public class EdadMenosCeroException extends Exception{
    //     public EdadMenosCeroException(){}
    //     public EdadMenosCeroException(String message){
    //         super(message);
    //     }
    //     public EdadMenosCeroException(Throwable cause){
    //         super(cause) ;
    //     }
    //     public EdadMenosCeroException(String message, Throwable cause){
    //         super(message, cause);
    //     }
    // }
    // private static void validateAge(int age) throws EdadMenosCeroException{
    //     if (age < 0)
    //         throw new EdadMenosCeroException();
    //     //throw new Exception("0h no! Something went wrong! " ) ;
    //     //throw new EdadMenosCeroException("A e cannot be negative")
    //     //throw new EdadMenosCeroException('Oh no!",new RuntimeException());
    // }

}

