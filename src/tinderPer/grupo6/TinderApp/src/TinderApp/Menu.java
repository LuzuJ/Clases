package TinderApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Mascota> lsmasc = new ArrayList<>();
    public void showMenu(){
        Mascota Pepe = new Mascota("Pepe", "pequeño", "golden", "2" , "Yo", "jugueton", true);
        Mascota Jose = new Mascota("Jose", "enano", "chihuahua", "6" , "David", "lloron", true);
        Mascota miMascota = new Mascota();
        lsmasc.add(Pepe);
        lsmasc.add(Jose);

        do {
            System.out.println("-------- TINDER PET -------");
            System.out.println("1. Registrar \n2. MostrarLista \n3. Crear Match");

            Scanner sc = new Scanner(System.in);

            int option = sc.nextInt();

            switch (option){
                case 1:
                    miMascota = setDatos();
                    break;
                case 2:
                    showDatos();
                    break;
                case 3:
                    setMatch(miMascota);
                    break;
            }

        }while (true);
    }

    private void showDatos() {
        for (Mascota mascota:lsmasc) {
            mascota.showDatos();
        }
    }

    public Mascota setDatos(){
        Mascota miMascota = new Mascota();
        miMascota.setDatos();
        lsmasc.add(miMascota);
        return miMascota;
    }


    public void setMatch(Mascota miMascota) {
        System.out.println("Seleccione el perro con el que desea hacer match:");
        int contador = 0;
        for (int i = 0; i < lsmasc.size(); i++) {
            Mascota mascota = lsmasc.get(i);
            if (mascota.isEstadoMatch() && !mascota.getNombre().equals(miMascota.getNombre())) {
                System.out.println(contador + ". " + mascota.getNombre());
                contador++;
            }
        }
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Mascota otraMascota = lsmasc.get(option);
        miMascota.setEstadoMatch(false);
        otraMascota.setEstadoMatch(false);
        System.out.println("Match creado con éxito!");
    }

}
