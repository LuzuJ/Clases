package pkTinderPetLover;

import java.awt.Color;
import java.util.FormatFlagsConversionMismatchException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception{
        JFrame frm = new JFrame();
        frm. setTitle("Principal");                               
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frm.setResizable(false);                                   
        frm.setSize(1000,500);                       
        frm.setVisible(true);                                      
        //frmlcon image = new Imagelcon("logo.png");                 
        //frm.setlconlmage(image.getlmage());                        
        //frm.getContentPane().setBackground(new  Color(12,45,54));  
        ImageIcon image = new ImageIcon("Logo.png");
        frm.setIconImage(image.getImage());
        frm.getContentPane().setBackground(new Color(12,111,54));
        
    }

}
