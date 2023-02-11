package garage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButColores extends JFrame implements ActionListener {

    private JButton butVerde, butRojo;

    public ButColores() {

        this.setLayout(new FlowLayout());

        butVerde = new JButton("Verde");

        butRojo = new JButton("Rojo");

        butVerde.setBounds(50,50,75,50);
        butVerde.setBackground(Color.green);
        butVerde.addActionListener(this);
        butRojo.setBounds(150,50,75,50);
        butRojo.setBackground(Color.red);
        butRojo.addActionListener(this);

        this.add(butVerde);
        this.add(butRojo);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == butVerde) {

            getContentPane().setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Se presionó el boton verde");

        }else if(e.getSource() == butRojo) {

            getContentPane().setBackground(Color.yellow);
            JOptionPane.showMessageDialog(null,"Se presionó el boton rojo");
        }

        System.exit(0); //permite salir de la ventana luego del cierre del cuadro de dialogo


    }
}
