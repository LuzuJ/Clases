package UserInterface;


import java.awt.Color;
import java.awt.event.*;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import UserInterface.CustomerControl.PatButtonMenu;

public class PanelMenu extends JPanel implements ActionListener{
    
    PatButtonMenu btn1 = new PatButtonMenu("Logo"       ,"Resourse\\img\\animal\\png32\\bear.png");
    PatButtonMenu btn2 = new PatButtonMenu("Login"      ,"Resourse\\img\\animal\\png32\\bird.png");
    PatButtonMenu btn3 = new PatButtonMenu("Home"       ,"Resourse\\img\\animal\\png32\\cat.png");
    PatButtonMenu btn4 = new PatButtonMenu("Registro"   ,"Resourse\\img\\animal\\png32\\pig.png");
    PatButtonMenu btn5 = new PatButtonMenu("Contacto"   ,"Resourse\\img\\animal\\png32\\fox.png");
    PanelMenu(){
        /*  @   Logo / Nombre
         *  @   Login
         *  @   Home
         *  @   Registro
         */
        super(new GridLayout(6, 1, 0, 0));//filas, columnas, espacioFilas, espacioColumnas
        //setBackground(new Color(82, 90, 101));
        add(btn1);     add(btn2);     add(btn3);    add(btn4);     add(btn5);  
        add(new JButton("tets"));    
        
        btn1.addActionListener(this); btn2.addActionListener(this); btn3.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this){
            if(this.isVisible()){
                this.setVisible(false);
            }else
                this.setVisible(true);
        }
        else{
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            System.out.println(e.getActionCommand());
        }
        
    }
}
