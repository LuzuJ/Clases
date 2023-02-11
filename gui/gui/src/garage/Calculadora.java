package garage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private JButton botSuma, botResta, botMulti, botDivi, botPot, botRaiz, botReset, botSalir;
    private JTextField texValor1, texValor2, texResult;
    private JLabel labNum1, labNum2, labResult;

    public Calculadora() {

        super("Calculadora primitiva 1");
        this.controles();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 175);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);

    }

    public void controles() {

        Container lineaVerde = getContentPane();
        lineaVerde.setLayout(null);

        botSuma = new JButton("Suma");
        botSuma.setBounds(50,50,75,25);
        botSuma.addActionListener(this);
        botResta = new JButton("Resta");
        botResta.setBounds(150,50,75,25);
        botResta.addActionListener(this);
        botMulti = new JButton("Multiplicacion");
        botMulti.setBounds(250,50,115,25);
        botMulti.addActionListener(this);
        botDivi = new JButton("Division");
        botDivi.setBounds(390,50,100,25);
        botDivi.addActionListener(this);
        botPot = new JButton("Potenciación");
        botPot.setBounds(515,50,115,25);
        botPot.addActionListener(this);
        botRaiz = new JButton("Raices");
        botRaiz.setBounds(650,50,75,25);
        botRaiz.addActionListener(this);
        botReset = new JButton("Reset");
        botReset.setBounds(300,85,75,25);
        botReset.addActionListener(this);
        botSalir = new JButton("Salir");
        botSalir.setBounds(400,85,75,25);
        botSalir.addActionListener(this);

        texValor1 = new JTextField(12);
        texValor1.setBounds(100,15,150,25);
        texValor1.setEditable(true);
        texValor2 = new JTextField(12);
        texValor2.setBounds(350,15,150,25);
        texValor2.setEditable(true);
        texResult = new JTextField(12);
        texResult.setBounds(600,15,150,25);
        texResult.setEditable(false);

        labNum1 = new JLabel("Numero 1");
        labNum1.setBounds(25,15,150,25);
        labNum2 = new JLabel("Numero 2");
        labNum2.setBounds(275,15,150,25);
        labResult = new JLabel("Resultado");
        labResult.setBounds(525,15,150,25);

        lineaVerde.add(labNum1);
        lineaVerde.add(texValor1);
        lineaVerde.add(labNum2);
        lineaVerde.add(texValor2);
        lineaVerde.add(labResult);
        lineaVerde.add(texResult);

        lineaVerde.add(botSuma);
        lineaVerde.add(botResta);
        lineaVerde.add(botMulti);
        lineaVerde.add(botDivi);
        lineaVerde.add(botPot);
        lineaVerde.add(botRaiz);

        lineaVerde.add(botReset);
        lineaVerde.add(botSalir);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        double num1 = 0;
        double num2 = 0;
        double resul;
        String resu;

        if(e.getSource() != botReset && e.getSource() != botSalir) {
            if (texValor1.getText().equals("") || texValor2.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Los Operandos no estan completos",
                        "Error de calculo", JOptionPane.ERROR_MESSAGE);
            } else {

                try {

                    num1 = Double.parseDouble(texValor1.getText());
                    num2 = Double.parseDouble(texValor2.getText());
                } catch (NumberFormatException f) {

                    JOptionPane.showMessageDialog(null, "Los operandos no son numeros",
                            "Error de Operacion", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        if (e.getSource() == botSuma) {

            resul = num1 + num2;
            resu = String.valueOf(resul);
            texResult.setText(resu);
        } else if (e.getSource() == botResta) {

            resul = num1 - num2;
            resu = String.valueOf(resul);
            texResult.setText(resu);
        } else if (e.getSource() == botMulti) {

            resul = num1 * num2;
            resu = String.valueOf(resul);
            texResult.setText(resu);
        } else if (e.getSource() == botDivi) {

            if (num2 == 0) {

                JOptionPane.showMessageDialog(null, "No se puede dividir para cero",
                        "Alerta de Error", JOptionPane.ERROR_MESSAGE);
            } else {

                resul = num1 / num2;
                resu = String.valueOf(resul);
                texResult.setText(resu);
            }
        } else if (e.getSource() == botPot) {

            resul = Math.pow(num1, num2);
            resu = String.valueOf(resul);
            texResult.setText(resu);
        } else if (e.getSource() == botRaiz) {
            num2 = 1/num2;
            resul = Math.pow(num1,num2) ;//num 1base num2 expo
            resu = String.valueOf(resul);
            texResult.setText(resu);
        } else if (e.getSource() == botReset) {

            texValor1.setText("");
            texValor2.setText("");
            texResult.setText("");
        } else if (e.getSource() == botSalir) {

            System.exit(0);
        }
    }
}
