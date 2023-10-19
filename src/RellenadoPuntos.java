import java.util.Scanner;

public class RellenadoPuntos {

    public static int cadena;
    public static int entero = 0;
    public static char caracter;
    public static String texto;
    public static void main(String[] args) {

        parametros();

        resultado();

    }

    private static void parametros() {
        Scanner entrada = new Scanner(System.in);

        for (int contador = 1; contador <= 3; contador++){

            //entrada de cadena de texto y cuenta la cadena de caracteres.

            if (contador == 1){
                do{

                    System.out.println("introduce una cadena de caracteres: ");
                    texto = entrada.next();
                    cadena = texto.length();

                    if (cadena > 80 )
                        System.out.println("la cadena deve tener entre cero y ochenta caracteres");

                }while (cadena >= 80);

                //introduce el numero que tiene que completar con puntos

            } else if (contador == 2) {

                do{

                    System.out.println("introduce un numero entero");
                    entero = entrada.nextInt();

                } while (entero < 0);

                //especifica si los puntos iran a la derecha o izquierda

            } else {

                System.out.println("introduce (D) para añadir los puntos a la derecha o (I) para añadirlos a la izquierda");
                caracter = entrada.next().charAt(0);

            }

        }

        entrada.close();

    }

    private static void resultado(){

        int totalpuntos = entero - cadena;

        if (cadena > entero){

            //comprueba la longitud de la cadena y muestra si cabe o no

            System.out.println("la cadena no cabe.");

        }else if (caracter == 'I' || caracter == 'i'){

            //añade los puntos a la izquierda

            CalcularPuntos(totalpuntos);

            System.out.print(texto);

        } else if (caracter == 'D' || caracter == 'd') {

            //añade los puntos a la derecha

            System.out.print(texto);

            CalcularPuntos(totalpuntos);

        }else System.out.println("la direccion deve ser I o D");

    }

    private static void CalcularPuntos(int totalpuntos) {

        //añade la cantidad de puntos necesarios para completar la cadena
        for (int puntos = 0; puntos < totalpuntos; puntos++){

            System.out.print(".");

        }
    }

}
