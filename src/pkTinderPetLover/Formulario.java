package pkTinderPetLover;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javafx.scene.paint.Color;

/**
 * Formulario
 */
public class Formulario {
public static void main(String[] args) {
    JFrame frm = new JFrame();
        frm. setTitle("Principal");                               
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frm.setResizable(false);                                   
        frm.setSize(1000,500);                       
        frm.setVisible(true);                                      
        //frmlcon image = new Imagelcon("logo.png");                 
        //frm.setlconlmage(image.getlmage());                        
        //frm.getContentPane().setBackground(new  Color(12,45,54));  
        ImageIcon image = new ImageIcon("pet.png");
        frm.setIconImage(image.getImage());
        frm.getContentPane().setBackground(new Color(12,111,54));
        
}
    
}