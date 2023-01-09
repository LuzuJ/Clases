package deberes;

public class Arbolito {
    public static void main(String[] args) {
        String result = null;
        int[] ints = { 1, 3, 5, 3, 5, 7, 3, 5, 7, 11, 3, 3, 3 };
        String asterisco = " * ";
        System.out.println("�rbol de Navidad:");
        for (int i = 0; i < ints.length; i++) {
            result = "";
            for (int j = 0; j < 20 - asterisco.length() * (ints[i] / 2); j++) {
                result += " ";
            }
            for (int j = 0; j < ints[i]; j++) {
                result += asterisco;
            }
            result += "\n";
            System.out.println(result);
        }

    }
}
