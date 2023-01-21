import java.util.Scanner;
public class ejercicio2Prueba {
	
	public static void main(String[] args) {
		Scanner ingresoDatos = new Scanner (System.in);
		//Definir variables
		String usuario;
		String nombrePadre;
		String nombreMadre;
		String textoNumeroHermanos;
		String textoNumeroHijos;
		String nombreEsposa;
		String nombreEmpresa;
		String textoPersonasCargo;
		String textoSueldo;
		
		int numeroHermanos;
		int numeroHIjos;
		int cargo;
		int sueldo;
		
		//Pedimos que ingrese los valores
		System.out.println("Ingrese su nombre");
		usuario = ingresoDatos.nextLine();
		
		System.out.println("Ingrese el nombre de sus padres");
		System.out.println("Padre");
		nombrePadre = ingresoDatos.nextLine();
		System.out.println("Madre");
		nombreMadre = ingresoDatos.nextLine();
		
		System.out.println("Ingrese numero de hermanos");
		textoNumeroHermanos= ingresoDatos.nextLine();
		numeroHermanos = Integer.parseInt(textoNumeroHermanos);
		
		System.out.println("Ingrese numero de hijos");
		textoNumeroHijos = ingresoDatos.nextLine();
		numeroHIjos = Integer.parseInt(textoNumeroHijos);
		
		System.out.println("Nombre de Esposa");
		nombreEsposa = ingresoDatos.nextLine();
		
		System.out.println("Esmpresa");
		nombreEmpresa = ingresoDatos.nextLine();
		
		System.out.println("Personas a cargo");
		textoPersonasCargo = ingresoDatos.nextLine();
		cargo = Integer.parseInt(textoPersonasCargo);
		
		System.out.println("Su sueldo");
		textoSueldo = ingresoDatos.nextLine();
		sueldo = Integer.parseInt(textoSueldo);
		
		System.out.println("Nombre usuario" + usuario);
		System.out.println("Nombre Padre" + nombrePadre);
		System.out.println("Nombre Madre"+ nombreMadre);
		System.out.println("Nombre esposa" + nombreEsposa);
		
		//se aplica next line y parse
		//12% del sueldo
		System.out.println("El 12% de sueldo es");
		System.out.println(sueldo*0.12);
		
		// La pension por hijo
		System.out.println("La pension a pagar por hijo es de ");
		System.out.println(sueldo/(50.25*numeroHIjos));
		
		// 12% equitativo
		System.out.println("Porcentaje equilibrado por hermano");
		System.out.println("Por cada hermano el sueldo es " + sueldo*0.12/(numeroHermanos));
		
		// empresa y esposa
		System.out.println("Nombre esposa "+ nombreEsposa);
		System.out.println("Nombre de la empresa" + nombreEmpresa);
	}

}
