package pkAprender;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Metodos

    

    // Metodo para pedir al usuarion que digite dos numeros

    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }

    public void sumar() {
        suma = numero1 + numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    public void dividir() {
        division = numero1 / numero2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La suma division: " + division);
    }

    public void sumar(int numero1, int numero2){
        suma = numero1 +  numero2;
    }
    public void restar(int numero1, int numero2){
        resta = numero1 -  numero2;
    }
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 *  numero2;
    }
    public void division(int numero1, int numero2){
        division = numero1 /  numero2;
    }

}