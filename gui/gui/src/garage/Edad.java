package garage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Edad extends JFrame implements ActionListener {

    private JLabel lbEdad1, lbEdad2;
    private JButton butVal;
    private JTextField texRes1, texRes2;
    private Font fuente;

    public Edad() {

        super("Calculo de la edad");
        fuente = new Font("Arial",3,15);
        setLayout(null);

        lbEdad1 = new JLabel("Escriba el Nombre");
        lbEdad1.setBounds(120,50,200,40);

        lbEdad2 = new JLabel("Escriba la Edad");
        lbEdad2.setBounds(120,150,200,40);

        butVal = new JButton("Validación");
        butVal.setBounds(250,300,120,80);
        butVal.setFont(fuente);
        butVal.setBackground(Color.blue);
        butVal.setForeground(Color.white);
        butVal.addActionListener(this);

        texRes1 = new JTextField();
        texRes1.setBounds(120,100,180,30);
        texRes1.setEditable(true);

        texRes2 = new JTextField();
        texRes2.setBounds(120,200,180,30);
        texRes2.setEditable(true);

        add(lbEdad1);
        add(lbEdad2);
        add(butVal);
        add(texRes2);
        add(texRes1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        int edad = 0;
        try {

            edad = Integer.parseInt(texRes2.getText());
        }catch(NumberFormatException f) {

            JOptionPane.showMessageDialog(null,f);
            JOptionPane.showMessageDialog(null, "Solo valores numericos para la edad");
        }

        if(e.getSource() == butVal) {

            if(texRes1.getText().equals("")) {

                JOptionPane.showMessageDialog(null,"No se ha escrito nombre");
            } else if(edad > 21) {

                JOptionPane.showMessageDialog(null,"Puede comprar su cerveza");
                System.exit(0);
            }else {

                JOptionPane.showMessageDialog(null,"No puede tener su cerveza");
            }
        }

    }
}
