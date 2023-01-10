package UserInterface.CustomerControl;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PatButtonMenu  extends JButton implements MouseListener {
    PatButtonMenu(String label) {
        super(label);
        setPersonalizacion();
    }
    public PatButtonMenu(String label, String iconPath){
        super(label);
        setPersonalizacion();
        setIcon(new ImageIcon(iconPath));
    }

    void setPersonalizacion(){ 
        addMouseListener(this);
        setOpaque(false);
        setForeground(Color.WHITE);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
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
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}
