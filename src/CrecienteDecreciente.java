import java.util.Scanner;

public class CrecienteDecreciente {

    public static void main(String[] args) {
        int creciente = 0;
        int decreciente = 0;
        int igual = 0;
        int num;
        int ant = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        do {
            contador++;

            if (contador == 1) {
                System.out.println("introduce un numero (un numero negativo termina el programa):");
                num = entrada.nextInt();
            }else {

                System.out.println("introduce un numero (un numero negativo termina el programa)");
                num = entrada.nextInt();
                if (num > ant)creciente++;
                else if (num < ant && num >= 0) decreciente++;
                else if (num == ant) igual++;
            }
            ant = num;

        } while (num > 0);

        if (igual > 0 || creciente > 0 && decreciente > 0) System.out.println("la cadena no es creciente ni decreciente");
        else if (decreciente > 0 && creciente == 0) System.out.println("La cadena es decreciente");
        else if (creciente > 0 && decreciente == 0 ) System.out.println("La cadena es creciente");
        else if (creciente == 0 && decreciente == 0 && igual == 0) System.out.println("no se han introducido numeros");

    }

}
