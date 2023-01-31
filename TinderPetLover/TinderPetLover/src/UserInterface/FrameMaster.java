package UserInterface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

import UserInterface.CustomerControl.PatButtonMenu;

import javax.swing.ImageIcon;


public class FrameMaster extends JFrame  implements ActionListener{//implementando el listener de eventos
    ImageIcon icon;
    PanelMenu menu = new PanelMenu();
    PatButtonMenu btnMenu = new PatButtonMenu(""   ,"Resourse\\img\\app\\msn.png");
    public FrameMaster(String tilte, String pathIcon){
        setPersonalizacion( tilte,  pathIcon);
        btnMenu.setBounds(5,5,40,40);
        btnMenu.addActionListener(this);
        
        menu.setBounds(5, 55, 200, 350);
        // png1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black),BorderFactory.createEmptyBorder(10, 15, 5, 15)));
        add(btnMenu);
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
        //getContentPane().setBackground(new  Color(12,111,54)); 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnMenu){
            if(menu.isVisible()){
                menu.setVisible(false);
            }else
                menu.setVisible(true);
        }
        else{
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            System.out.println(e.getActionCommand());
        }
    }
}
