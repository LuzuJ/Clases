package jonathan_luzuriaga;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona extends Integrante{

    public int jjEdad;
    public String jjSexo;
    static ArrayList<Integrante> integrante = new ArrayList<Integrante>();

    public Persona(int jjId, String jjNombre, int jjEdad, String jjSexo){
        super(jjId, jjNombre);
        this.jjEdad = jjEdad;
        this.jjSexo = jjSexo;
    }

    public static void newPerson() {
        int jjId;
        String jjNombre;
        int jjEdad;
        String jjSexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE POR FAVOR");
        System.out.print("Digite su codigo(ID):");
        jjId = sc.nextInt();
        System.out.print("Nombre");
        jjNombre = sc.nextLine();
        System.out.print("Edad: ");
        jjEdad = sc.nextInt();
        System.out.print("Sexo: ");
        jjSexo = sc.nextLine();
        
        Persona persona = new Persona(jjId, jjNombre, jjEdad, jjSexo);
        integrante.add(persona);


    }

}
