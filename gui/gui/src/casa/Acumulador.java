package casa;

import java.awt.*;
import java.awt.event.*;

public class Acumulador extends Frame implements WindowListener {

    private Label bInicio;
    private Label bFin;
    private TextField inicio;
    private TextField fin;
    private int sumador;

    public Acumulador() {

        setLayout(new GridLayout(2,2));

        add(bInicio = new Label("Ingrese un entero: "));

        inicio = new TextField("Ingrese un numero", 10);
        inicio.setEditable(true);
        add(inicio);
        inicio.addActionListener(new Listener());

        add(bFin = new Label("La suma es: "));

        fin = new TextField(10);
        fin.setEditable(false);
        add(fin);

        addWindowListener(this);
        setTitle("Acumulador de numeritos");
        setSize(400,400);
        setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {


    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            int numSumado = Integer.parseInt(inicio.getText());
            sumador = sumador + numSumado;
            inicio.setText("Ingrese nuevo numero");
            fin.setText(" " + sumador + " ");

        }
    }
}
