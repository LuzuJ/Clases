package garage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackTamanio extends JFrame implements ActionListener {

    private JMenuBar barra;
    private JMenu menuOpciones, menuColor, menuTamanio, menuSalir;
    private JMenuItem mitt1, mitt2, mitc1, mitc2, mitSalir;

    public BackTamanio() {

        setLayout(new FlowLayout());

        barra = new JMenuBar();
        menuOpciones = new JMenu("Opciones de Manejo");
        menuColor = new JMenu("Color");
        menuTamanio = new JMenu("Tamaño");
        menuSalir = new JMenu("Salir");

        mitt1 = new JMenuItem("640*480");
        mitt1.addActionListener(this);
        mitt2 = new JMenuItem("800*600");
        mitt2.addActionListener(this);
        mitc1 = new JMenuItem("Rojo");
        mitc1.addActionListener(this);
        mitc2 = new JMenuItem("Verde");
        mitc2.addActionListener(this);
        mitSalir = new JMenuItem("Salida");
        mitSalir.addActionListener(this);

        setJMenuBar(barra);
        barra.add(menuOpciones);
        barra.add(menuSalir);
        menuOpciones.add(menuColor);
        menuOpciones.add(menuTamanio);
        menuColor.add(mitc1);
        menuColor.add(mitc2);
        menuTamanio.add(mitt1);
        menuTamanio.add(mitt2);
        menuSalir.add(mitSalir);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == mitc1) {

            getContentPane().setBackground(new Color(255,0,0));
        }else if(e.getSource() == mitc2) {

            getContentPane().setBackground(new Color(0,255,0));
        }else if(e.getSource() == mitt1) {

            setSize(640,480);
        }else if(e.getSource() == mitt2) {

            setSize(800,600);
        }else if(e.getSource() == mitSalir) {

            System.exit(0);
        }

    }
}
