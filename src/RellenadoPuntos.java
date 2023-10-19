import java.util.Scanner;

public class RellenadoPuntos {

    public static int cadena;
    public static int entero = 0;
    public static char caracter;
    public static void main(String[] args) {

        parametros();



    }

    private static void parametros() {
        Scanner entrada = new Scanner(System.in);

        for (int contador = 1; contador <= 3; contador++){

            if (contador == 1){
                do{

                    System.out.println("introduce una cadena de caracteres: ");
                    String texto = entrada.next();
                    cadena = texto.length();

                    if (cadena > 80 ) {

                        System.out.println("la cadena deve tener entre cero y ochenta caracteres");

                    } else if (cadena < 0) {

                        System.out.println("la cadena deve tener entre cero y ochenta caracteres");

                    }
                }while (cadena <= 0 && cadena >= 80);

            } else if (contador == 2) {

                do{

                    System.out.println("introduce un numero entero");
                    entero = entrada.nextInt();

                    if (cadena > entero) System.out.println("el numero es inferior a la cadena.");

                } while (entero < cadena);

            } else if (contador == 3) {

                System.out.println("introduce (D) para añadir los puntos a la derecha o (I) para añadirlos a la izquierda");
                caracter = entrada.next().charAt(0);

            }

        }

        entrada.close();

    }

}
