package UserInterface.CustomerControl;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PatButtonMenu  extends JButton implements MouseListener {
     
    public PatButtonMenu(String label, String iconPath){
        super(label);
        setPersonalizacion(iconPath);
    }

    void setPersonalizacion(String iconPath){ 
        addMouseListener(this);
        setSize(20, 70);
        setBounds(50, 30, 90, 20); 

        
        setOpaque(false);
        setForeground(Color.GRAY);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setIcon(new ImageIcon(iconPath));
        setHorizontalAlignment(SwingConstants.LEFT);
        setFont(new Font ("MesloLGL Nerd Font", Font.BOLD | Font.LAYOUT_LEFT_TO_RIGHT, 12));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setForeground(Color.BLACK);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(Color.GRAY);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}
