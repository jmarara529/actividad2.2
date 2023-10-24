import java.util.Scanner;

public class DibujandoCartas {

public static String numero;
public static String paloCarta;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el numero de la carta:");
        int carta = entrada.nextInt();

        System.out.println("introduce inicial del paloo (C=COPAS, E=ESPADAS, O=OROS, B=BASTOS):");
        char palo = entrada.next().charAt(0);

        String numerocarta = NumeroCarta(carta);

        String palocarta =PaloCarta(palo);

        dibujarcarta(numerocarta, palocarta);

    }

    private static String PaloCarta(char palo) {
        switch (palo){
            case 'o': case 'O':
                paloCarta ="OROS";
                break;
            case 'c': case 'C':
                paloCarta = "COPAS";
                break;
            case 'e': case 'E':
                paloCarta = "ESPADAS";
                break;
            case 'b': case 'B':
                paloCarta = "BASTOS";
                break;
            default:
                paloCarta = String.valueOf(palo);
                break;
        }

        return paloCarta;

    }

    private static String NumeroCarta(int carta) {
        String numero;
        switch (carta){

            case 1:
                numero = "AS";
                break;
            case 10:
                numero = "SOTA";
                break;
            case 11:
                numero = "CABALLO";
                break;
            case 12:
                numero = "REY";
                break;
            default:
                numero = String.valueOf(carta);
                break;

        }

        return numero;

    }

    public static void dibujarcarta(String numero, String palo) {

        for (int i = 0; i < 2; i++) {
            pintarFila('+', '-', "", 14, 'D');

            if (i == 0) {
                pintarFila('|', ' ', numero, 14, 'D');
                pintarFila('|', ' ', palo, 14, 'D');

                for (int j = 0; j < 4; j++) {
                    pintarFila('|', ' ', "", 14, 'D');
                }

                pintarFila('|', ' ', palo, 14, 'I');

            }
        }
    }

        public static void pintarFila(char delimitador, char relleno, String contenido, int tamano, char direccion){

            while (contenido.length() < (tamano-4)){
                if(direccion == 'D')
                    contenido = contenido + String.valueOf(relleno);
                else
                    contenido = String.valueOf(relleno) + contenido;
            }
            contenido = String.valueOf(delimitador) + String.valueOf(relleno) + contenido + String.valueOf(relleno) + String.valueOf(delimitador);

            System.out.println(contenido);

        }

}
