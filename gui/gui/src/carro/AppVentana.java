package carro;

import javax.swing.*;
import java.awt.*;

public class AppVentana {

    public static void main(String[] args) {

        /*Definicion de Contenedor y Marco para la GUI*/
        JFrame cuadro1 = new JFrame("Mi primer GUI");
        /*Definir la funcion de salida del contenedor*/
        cuadro1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Definir el tamanio del contenedor en la ventana*/
        cuadro1.setSize(400,320);

        /*Codigo de boton*/

        /*JButton boton1 = new JButton("Botón");
        cuadro1.getContentPane().add(boton1);
        JButton boton2 = new JButton("Boton");
        cuadro1.getContentPane().add(boton2);*/

        /*Creacion de una barra de menu tradicional*/
        JMenuBar menu1 = new JMenuBar();

        /*Crear menus de la barra de menu*/
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edición");
        JMenu ayuda = new JMenu("Ayuda");

        /*Agregar menus a la barra de menu*/
        menu1.add(archivo);
        menu1.add(edicion);
        menu1.add(ayuda);

        /*Crear items para el menu archivo*/
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem imprimir = new JMenuItem("Imprimir");

        /*Agregar items al menu archivo*/
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(imprimir);

        /*Especificar la adicion de la barra de menu al contenedor especificando su ubicacion*/
        cuadro1.getContentPane().add(BorderLayout.NORTH, menu1);

        /*Configurar la ventana dentro del contenedor; los componentes interactuables*/
        JPanel grilla1 = new JPanel();
        JLabel etiqueta1 = new JLabel("El texto va aqui");
        JTextField campoTexto1 = new JTextField("Campo de texto",20);
        campoTexto1.setEditable(false);
        JButton boton1 = new JButton("Aumentar");
        JButton boton2 = new JButton("Disminuir");

        grilla1.add(etiqueta1);
        grilla1.add(campoTexto1);
        grilla1.add(boton1);
        grilla1.add(boton2);

        cuadro1.getContentPane().add(BorderLayout.CENTER,grilla1);

        JTextArea texto1 = new JTextArea();

        //cuadro1.getContentPane().add(BorderLayout.CENTER,texto1);

        cuadro1.setVisible(true);

    }
}
