package pkPoliEstudiante;

public class Calendario {
    private String actividad;
    private String horario;

    public Calendario(String actividad, String horario){
        this.actividad = actividad;
        this.horario = horario;
    }

    public void showCalendar(){
        String[][] calendar = new String[12][7];
        calendar[0][0] = null;
        calendar[0][1]= "Lunes";
        calendar[0][2]= "Martes";
        calendar[0][3]= "Miercoles";
        calendar[0][4]= "Jueves";
        calendar[0][5]= "Viernes";
        calendar[0][6]= "Sabado";
        calendar[0][7]= "Domingo";

        calendar[1][0] = "5-6";
        calendar[2][0] = "6-7";
        calendar[3][0] = "7-8";
        calendar[4][0] = "8-9";
        calendar[5][0] = "10-11";
        calendar[6][0] = "11-12";
        calendar[7][0] = "12-13";
        calendar[8][0] = "13-14";
        calendar[9][0] = "15-16";
        calendar[10][0] = "16-17";
        calendar[11][0] = "17-18";
        calendar[12][0] = "18-19";

        calendar[6][2] = actividad;
        calendar[7][2]= horario;

        for (int f = 0; f < calendar.length; f++) {
            for (int c = 0; c < calendar[f].length; c++)
                if (calendar[f][c] != null) 
                    System.out.print(calendar[f][c]);
                else 
                    System.out.println(calendar[f][c] == null);
                
            System.out.println(" ");
        }

    }
}
