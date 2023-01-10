package UserInterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class FrameMaster extends JFrame  implements ActionListener{//implementando el listener de eventos
    ImageIcon icon;
    PanelMenu menu = new PanelMenu();

    public FrameMaster(String tilte, String pathIcon){
        setPersonalizacion( tilte,  pathIcon);

        menu.setBounds(450, 100, 200, 350);
        // png1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black),BorderFactory.createEmptyBorder(10, 15, 5, 15)));
        add(menu); 
    }

    public void setPersonalizacion(String tilte, String pathIcon){
        icon = new ImageIcon(pathIcon );                  // create an Imagelcon  -- ico

        setTitle(tilte);                               // Titulo
        setVisible(true);
        setLayout(null);
        setLocation(100, 50);
        setResizable(true);
        setSize(800, 600);

        setIconImage(icon.getImage()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new  Color(12,111,54)); 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
         
    }
}
