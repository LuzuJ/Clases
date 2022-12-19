package pkPoliEstudiante;

//import java.util.Arrays;

public class Calendario {
    private String actividad;
    private String horario;

    public Calendario(String actividad, String horario){
        this.actividad = actividad;
        this.horario = horario;
    }

    public void showCalendar(){
        String[][] calendar = new String[13][8];
        for (int f = 0; f < calendar.length; f++)
            for (int c = 0; c < calendar[f].length; c++)
                calendar[f][c] = " ";

        calendar[0][0]= " "; calendar[0][1]= "Lun"; calendar[0][2]= "Mar";
        calendar[0][3]= "Mie"; calendar[0][4]= "Jue"; calendar[0][5]= "Vie";
        calendar[0][6]= "Sab"; calendar[0][7]= "Dom";

        calendar[1][0] = "5-6"; calendar[2][0] = "6-7"; calendar[3][0] = "7-8";
        calendar[4][0] = "8-9"; calendar[5][0] = "10-11"; calendar[6][0] = "11-12";
        calendar[7][0] = "12-13"; calendar[8][0] = "13-14"; calendar[9][0] = "15-16";
        calendar[10][0] = "16-17"; calendar[11][0] = "17-18"; calendar[12][0] = "18-19";

       
        for (int x = 0; x < calendar.length; x++) {
			System.out.print("|");
			for (int y = 0; y < calendar[x].length; y++) {
				System.out.print(calendar[x][y]);
				if (y != calendar[x].length - 1)
					System.out.print("\t");
			}
			System.out.println("|");
		}
//
    }
}
