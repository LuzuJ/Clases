package casa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Descontenedor extends Frame {

    private TextField tecNum;
    private Button butContar, butDescontar, butReset;
    int cont;

    public Descontenedor() {

        setLayout(new FlowLayout());
        add(new Label("Resultado Final"));

        tecNum = new TextField("0",10);
        tecNum.setEditable(false);
        add(tecNum);

        butContar = new Button("Contar");
        add(butContar);
        butDescontar = new Button("Descontar");
        add(butDescontar);
        butReset = new Button("Reset");
        add(butReset);

        TodosBotones butns = new TodosBotones();

        butContar.addActionListener(butns);
        butDescontar.addActionListener(butns);
        butReset.addActionListener(butns);

        addWindowListener(

                new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {

                        dispose();
                    }
                }
        );
        setTitle("Descontenedor");
        setSize(500,100);
        setVisible(true);

    }

    private class TodosBotones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String butLabel = e.getActionCommand();
            if(butLabel.equals(butContar.getLabel())) {

                cont++;


            }else if(butLabel.equals(butDescontar.getLabel())) {

                cont--;


            }else if(butLabel.equals(butReset.getLabel())) {

                cont = 0;
            }
            tecNum.setText(" " + cont + " ");

        }
    }
}
