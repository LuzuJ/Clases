package pkTinderPetLover;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt. Color;
public class TinderPetLover {
    public static void main(String[] args) {
        JFrame frm = new JFrame();
        frm. setTitle("Principal");                               
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frm.setResizable(false);                                   
        frm.setSize(1000,500);
        frm.setVisible(true);                                       
        ImageIcon image = new ImageIcon("Logo.png");
        frm.setIconImage(image.getImage());
        frm.getContentPane().setBackground(new Color(12,11,54));



    }
}
