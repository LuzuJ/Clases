package jonathan.luzuriaga

import javax.swing.JOptionPane;

@epn.edu.ec;

public class Integrante {
    protected int jjId;
    protected String jjNombre;

    public void ingresar() {
        jjId = Integer.parseInt(JOptionPane.showInputDialog("Digite un identificacion"));
        jjNombre = (JOptionPane.showInputDialog("Digite su nombre"));
    }

    public void mostrarDatos(){
        System.out.println("Su nombre es: " + jjNombre);
        System.out.println("Su identificacion es: " + jjId);
    }
}
