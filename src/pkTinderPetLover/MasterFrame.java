package pkTinderPetLover;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javafx.scene.paint.Color;

Jpanel p;

MasterFrame() {

    JFrame frm = new JFrame();
        frm.setTitle("Principal");                               
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frm.setResizable(false);                                   
        frm.setSize(1000,500);                       
        frm.setVisible(true);                                      
        ImageIcon image = new ImageIcon("Logo.png");
        frm.setIconImage(image.getImage());
        frm.getContentPane().setBackground(new Color(12,111,54));
        
}
