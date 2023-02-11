package UserInterface.samples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

import javax.swing.JButton;
import javax.swing.ImageIcon;
public class FrameLayout extends JFrame  implements ActionListener{//implementando el listener de eventos
    PanelGridLayout png1 = new PanelGridLayout();
    PanelBorderLayout png2 = new PanelBorderLayout();
    PanelFlowLayout png3 = new PanelFlowLayout();

    JButton btnP1 = new JButton("Panel 1"); 
    JButton btnP2 = new JButton("Panel 2"); 
    JButton btnP3 = new JButton("Panel 3");

    public FrameLayout(String Titulo){
        this.setTitle(Titulo);                               // Titulo
        ImageIcon image = new ImageIcon("Resourse\\img\\logo.png");                  // create an Imagelcon  -- ico
        this.setIconImage(image.getImage());                         // change icon of frame
        this.setLayout(null);
        setPersonalizacion();

        btnP1.setBounds(450, 30, 90, 20); 
        btnP2.setBounds(550, 30, 90, 20); 
        btnP3.setBounds(650, 30, 90, 20);

        btnP1.addActionListener(this); 
        btnP2.addActionListener(this); 
        btnP3.addActionListener(this);
        add(btnP1); 
        add(btnP2); 
        add(btnP3);

        //panels
        png1.setBounds(10, 10, 400, 200); 
        png2.setBounds(10, 220, 400, 250); 
        png3.setBounds(10, 470, 400, 150);
        // png1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black),BorderFactory.createEmptyBorder(10, 15, 5, 15)));
        add(png1); 
        add(png2); 
        add(png3); 
    }

    public void setPersonalizacion(){
        setVisible(true);
        setLocation(100, 50);
        setResizable(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new  Color(12,111,54)); 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
        
        if(e.getSource() == btnP1){
            if(png1.isVisible()){
                png1.setVisible(false);
            }else
                png1.setVisible(true);
        }else if(e.getSource() == btnP2){
            if(png2.isVisible()){
                png2.setVisible(false);
            }else
                png2.setVisible(true);
            
        }else if(e.getSource() == btnP3){
            if(png3.isVisible()){
                png3.setVisible(false);
            }else
                png3.setVisible(true);
            
        }else{
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            System.err.println(e.getActionCommand());
        }
    }
}
