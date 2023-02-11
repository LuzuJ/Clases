package UserInterface.samples;

import java.awt.Color;
import java.awt.event.*;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelGridLayout extends JPanel implements ActionListener{
    JButton btn11 = new JButton("gl_btn_11"); 
    JButton btn12 = new JButton("gl_btn_12"); 
    JButton btn13 = new JButton("gl_btn_13"); 
    JButton btn21 = new JButton("gl_btn21"); 
    JButton btn22 = new JButton("gl_btn22"); 
    // JButton btn23 = new JButton("gl_btn23"); 
    // JButton btn = new JButton("btn extra"); 
    //"Resourse\\iconsApp.png");

    PanelGridLayout(){
        /*  Organización en filas y columnas
         *  @   @   @
         *  @   @   @
         */
        super(new GridLayout(2, 3, 8, 10));//filas, columnas, espacioFilas, espacioColumnas
        setBackground(new Color(82, 90, 101));
        add(btn11);     add(btn12);     add(btn13);
        add(btn21);     add(btn22);     //add(btn23);

        btn11.addActionListener(this); btn12.addActionListener(this); btn13.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btn11){
             JFrame frm  = new JFrame();                                  
        frm.setTitle("Principal");                                   
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        frm.setResizable(false);                                     
        frm.setSize(500,500);                                        
        frm.setVisible(true);

        }
        else{
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            System.out.println(e.getActionCommand());
        }
        
    }
}
