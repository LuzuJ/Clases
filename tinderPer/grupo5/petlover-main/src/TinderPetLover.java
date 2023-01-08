import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TinderPetLover {
	static Integer totalMascotas = 0;
	static String archivoUbicacion = "C:\\TINDER_PET_LOVER\\Mascota.txt";

	static void contarRegistros() {
		FileReader fr;
		try {
			fr = new FileReader(archivoUbicacion);
			BufferedReader bf = new BufferedReader(fr);
			Integer lNumeroLineasVacias = 0;
			String line;
			while ((line= bf.readLine()) != null) {
				if (!line.equals("")) {
					lNumeroLineasVacias++;
				}
			}
			totalMascotas = lNumeroLineasVacias;
			//System.out.print("numero de registro" + totalMascotas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Bienvenido a Tinder Pet Match");
		System.out.println("Tinder para mascotas");
		Scanner leer = new Scanner(System.in);
		while (x != 0) {
			contarRegistros();
			System.out.println("MENU:");

			System.out.println("1.- Registro");
			System.out.println("2.- Ver lista de mascotas");
			System.out.println("3.- Match");
			System.out.println("0.- Salir");
			x = leer.nextInt();
			switch (x) {
			case 1: {
				registro();
				break;

			}
			case 2: {

				listarMascotas();

				break;

			}
			case 3: {

				hacerMatch();

				break;

			}
			case 0: {

				System.out.println("SALIR.");

				break;

			}
			default: {
				System.out.println("Opcion incorrecta");

			}

			}

		}

		// TODO Auto-generated method stub

	}

	private static void hacerMatch() {
		
		// TODO Auto-generated method stub
		
	}

	static void listarMascotas() {
		try {
			FileReader reader = new FileReader(archivoUbicacion);
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			StringBuffer buffer = new StringBuffer();
			buffer.append("ID");
			buffer.append("\t");
			buffer.append("Nombre");
			buffer.append("\t");
	        buffer.append("Tipo");
	        buffer.append("\t");
	        buffer.append("Raza");
	        buffer.append("\t");
			buffer.append("Edad");
			buffer.append("\t");
			buffer.append("EstadoMatch");
			buffer.append("\t");
			buffer.append("Observacion");
			buffer.append("\t");
			buffer.append("Propietario");
			buffer.append("\t");
			buffer.append("MatchMascota");
			buffer.append("\n");
			System.out.println(buffer.toString());

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void registro() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa los datos de tu mascota");
		Mascota mascota = new Mascota();

		System.out.println("Edad:");
		mascota.setEdad(leer.nextInt());
		mascota.setEstadoMatch(true);
		mascota.setId(totalMascotas + 1);
		System.out.println("Nombre:");
		mascota.setNombre(leer.next());
		System.out.println("Observacion:");
		mascota.setObservacion(leer.next());
		System.out.println("Registrar propietario");
		mascota.setPropietario(registrarPropietario());
		System.out.println("Raza:");
		mascota.setRaza(leer.next());
		System.out.println("Tipo:");
		mascota.setTipo(leer.next());

		guardarMascota(mascota);

	}

	static void guardarMascota(Mascota mascota) {

		try {
			FileWriter writer = new FileWriter(archivoUbicacion, true);
			writer.write(mascota.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static Persona registrarPropietario() {

		return null;

	}

	Persona buscarPropietario() {
		return null;
	}

}
