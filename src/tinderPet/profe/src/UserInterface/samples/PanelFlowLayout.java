package UserInterface.samples;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.*;
import java.awt.FlowLayout;

public class PanelFlowLayout extends JPanel implements ActionListener{

    JButton jb1= new JButton("FlowLayout B1 ");
    JButton jb2= new JButton("FlowLayout B2");
    JButton jb3= new JButton("FlowLayout B3");
    
    PanelFlowLayout(){
        super(new FlowLayout());
        
        add(jb1); 
        add(jb2); 
        add(jb3); 
        
        jb1.addActionListener(this); 
        //jb2.addActionListener(this); 
        //jb3.addActionListener(this);
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
