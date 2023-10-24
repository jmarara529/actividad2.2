package clase;

public class TrianguloPuntos {

    public static String punto = "*";
    public static int filas = 20;


    public static void main(String[] args) {

        int totalespacios = filas;

        for (int i = 1; i <= filas; i++) {

            imprimirespacios(totalespacios);
            System.out.println(punto);

            punto = "*" + punto + "*";
            totalespacios--;

        }

    }

    private static void imprimirespacios(int totalespacios) {

        for (int espacios = 0; espacios < totalespacios; espacios++) {

            System.out.print(" ");

        }


    }
}