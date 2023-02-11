package garage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackMenu extends JFrame implements ActionListener {

    private JMenu menu;
    private JMenuBar barra;
    private JMenuItem mit1, mit2, mit3;

    public BackMenu() {

        setLayout(new FlowLayout());

        barra = new JMenuBar();
        menu = new JMenu("Opciones de Color");

        mit1 = new JMenuItem("Rojo");
        mit1.addActionListener(this);
        mit2 = new JMenuItem("Verde");
        mit2.addActionListener(this);
        mit3 = new JMenuItem("Azul");
        mit3.addActionListener(this);

        setJMenuBar(barra);
        barra.add(menu);
        menu.add(mit1);
        menu.add(mit2);
        menu.add(mit3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Container c = this.getContentPane();

        if(e.getSource() == mit1) {

            c.setBackground(new Color(255,0,0));
        }else if(e.getSource() == mit2) {

            c.setBackground(new Color(0,255,0));
        }else if(e.getSource() == mit3) {

            c.setBackground(new Color(0,0,255));
        }
    }
}
