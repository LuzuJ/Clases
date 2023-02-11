package casa;

import java.awt.*;
import java.awt.event.*;

public class Contenedor extends Frame {

    private Label etContador;
    private TextField texContador;
    private Button butContador;
    private int contador;

    public Contenedor () {

        setLayout(new FlowLayout());
        etContador = new Label("Contador");
        add(etContador);

        texContador = new TextField(" " + contador + " ", 10);
        texContador.setEditable(false);
        add(texContador);

        butContador = new Button("Presione para contar");
        add(butContador);
        butContadorListener escuchante = new butContadorListener();
        butContador.addActionListener(escuchante);

        addWindowListener(

                /*
                Creacion del objeto evento que va a ser detectado cuando se haga clic en la x de la ventana
                * */
                new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {

                        dispose();
                    }
                }
        );

        setTitle("Contador de numeritos");
        setSize(300,300);
        setVisible(true);
    }

    private class butContadorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            contador++;
            texContador.setText(" " + contador + " ");

        }
    }
}

