package UserInterface.CustomerControl;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PatLabel extends JLabel implements MouseListener {

    PatLabel(String label){
        super(label);
        setPersonalizacion();
    }

    PatLabel(String label, String iconPath){
        super();
        setPersonalizacion();
        setIcon(new ImageIcon(iconPath));
    }
    
    void setPersonalizacion(){
        addMouseListener(this);
        setOpaque(false);
        setForeground(Color.blue);
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
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}
