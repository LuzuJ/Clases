package casa;

import java.awt.*;
import java.awt.event.*;

public class Clic extends Frame {

    private TextField texMouseX, texMouseY, texPosMouseX, texPosMouseY;
    private Label lbMouseX, lbMouseY, lbPosMouseX, lbPosMouseY;

    public Clic() {

        setLayout(new FlowLayout());

        lbMouseX = new Label("Posición de X");
        lbMouseY = new Label("Posición de Y");
        lbPosMouseX = new Label("Clic en X");
        lbPosMouseY = new Label("Clic en Y");

        texMouseX = new TextField(10);
        texMouseX.setEditable(false);
        texMouseY = new TextField(10);
        texMouseY.setEditable(false);
        texPosMouseX = new TextField(10);
        texPosMouseX.setEditable(false);
        texPosMouseY = new TextField(10);
        texPosMouseY.setEditable(false);

        add(lbMouseX);
        add(texMouseX);
        add(lbMouseY);
        add(texMouseY);

        add(lbPosMouseX);
        add(texPosMouseX);
        add(lbPosMouseY);
        add(texPosMouseY);

        MovMouse listener = new MovMouse();
        addMouseListener(listener);
        addMouseMotionListener(listener);

        addWindowListener(

                new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {

                        dispose();
                    }
                }
        );
        setTitle("Movimiento del Mouse");
        setSize(800,150);
        setVisible(true);

    }

    private class MovMouse implements MouseListener, MouseMotionListener {

        @Override
        public void mouseMoved(MouseEvent e) {

            texMouseX.setText(" " + e.getX() + " ");
            texMouseY.setText(" " + e.getY() + " ");
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            texPosMouseX.setText(" " + e.getX() + " ");
            texPosMouseY.setText(" " + e.getY() + " ");
        }

        @Override
        public void mouseDragged(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}
    }
}
