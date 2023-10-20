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

        NumeroCarta(carta);

        PaloCarta(palo);



    }

    private static void PaloCarta(char palo) {
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
                paloCarta = "xxxxx";
                break;
        }
    }

    private static void NumeroCarta(int carta) {
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
    }

}
