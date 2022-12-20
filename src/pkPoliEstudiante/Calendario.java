package pkPoliEstudiante;

//import java.util.Arrays;

public class Calendario {
    private String actividad;
    private String horario;
    private String dia;

    public Calendario(String actividad, String horario, String dia) {
        this.actividad = actividad;
        this.horario = horario;
        this.dia = dia;
    }

    public void showCalendar() {

        String[][] calendar = new String[12][7];
        String[][] vacia = new String[12][7];
        for (int f = 0; f < calendar.length; f++)
            for (int c = 0; c < calendar[f].length; c++)
                calendar[f][c] = " ";
        calendar[0][0] = " ";
        calendar[0][1] = "Lun";
        calendar[0][2] = "Mar";
        calendar[0][3] = "Mie";
        calendar[0][4] = "Jue";
        calendar[0][5] = "Vie";
        calendar[0][6] = "Sab";

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

        int posicion = 0, posicion2 = 0;

        switch (dia) {
            case "lunes":
                posicion = 1;
                break;
            case "martes":
                posicion = 2;
                break;
            case "miercoles":
                posicion = 3;
                break;
            case "jueves":
                posicion = 4;
                break;
            case "viernes":
                posicion = 5;
                break;
            case "sabado":
                posicion = 6;
                break;
            default:
                System.out.println("Ingrese Nuevamente");
                break;
        }
        switch (horario) {
            case "5-6":
                posicion2 = 1;
                break;
            case "6-7":
                posicion2 = 2;
                break;
            case "7-8":
                posicion2 = 3;
                break;
            case "8-9":
                posicion2 = 4;
                break;
            case "9-10":
                posicion2 = 5;
                break;
            case "11-12":
                posicion2 = 6;
                break;
            case "12-13":
                posicion2 = 7;
                break;
            case "13-14":
                posicion2 = 8;
                break;
            case "14-15":
                posicion2 = 9;
                break;
            case "15-16":
                posicion2 = 10;
                break;
            case "16-17":
                posicion2 = 11;
                break;
            case "17-18":
                posicion2 = 12;
                break;
            default:
                System.out.println("Ingrese nuevamente");
                break;
        }
        for (int x = 0; x < calendar.length; x++) {
            System.out.print("|");
            for (int y = 0; y < calendar[x].length; y++) {
                System.out.print(calendar[x][y]);
                if (y != calendar[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("|");
        }

    }
}
