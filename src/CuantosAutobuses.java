import java.util.Scanner;

public class CuantosAutobuses {

    public static int plazas = 55;
    public static void main(String[] args) {

        int autobuses = 0;
        int pasagerostotal = 0;
        int grupo = 1;

        Scanner entrada = new Scanner(System.in);

        for (int pasageros = -1; pasageros != 0; grupo++){

            System.out.println("introduce pasageros grupo "+ grupo + ":");
            pasageros = entrada.nextInt();
            pasagerostotal += pasageros;

        }

        if (pasagerostotal % plazas == 0) autobuses = pasagerostotal / plazas;
        else autobuses = (pasagerostotal / plazas) + 1;

        System.out.println("Se necesitarán " + autobuses + " autobuses.");

    }

}
