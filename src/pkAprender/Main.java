package pkAprender;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion();

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operacion op1 = new Operacion();
        op1.sumar(n1, n2);
        op1.restar(n1, n2);
        op1.multiplicar(n1, n2);
        op1.division(n1, n2);

        op1.mostrarResultados();

        Persona p1 = new Persona("Jona", 15);
        p1.mostrarDatos();
        p1.correr();
        
        Persona p2 = new Persona("1424");
        p2.correr(100);


}

}