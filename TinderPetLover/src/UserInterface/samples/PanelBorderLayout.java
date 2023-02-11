package UserInterface.samples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelBorderLayout extends JPanel implements ActionListener{
    
    JButton b0 = new JButton("NORTH");
    JButton b1 = new JButton("SOUTH");
    JButton b2 = new JButton("EAST");
    JButton b3 = new JButton("WEST");
    JLabel  lbl = new JLabel("CENTER");

    PanelBorderLayout(){
        //new BorderLayout()
        super(new BorderLayout(2, 3));//espacio entre las regiones, horizontal y vertical
        add(b0, BorderLayout.NORTH);
        add(b1, BorderLayout.SOUTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.WEST);
        add(lbl, BorderLayout.CENTER);
        setBackground(Color.red);
        b0.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this);
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
            System.out.println(e.getActionCommand());
        }
        
    }
}
