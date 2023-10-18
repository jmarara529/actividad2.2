import java.util.Scanner;

public class ContandoNumeros {

    /*
    programa que te pide diez numeros por teclado y te dicen cuantos son negativos, cuantos positivos y cuantos son cero.
     */
    public static void main(String[] args) {

        int negativos = 0;
        int positivos = 0;
        int cero = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){

            System.out.println("introduce numero "+ i + ":");
            int numero = entrada.nextInt();

            if(numero < 0){
                negativos++;
            } else if (numero == 0) {
                cero++;
            } else if (numero > 0) {
                positivos++;
            }

        }

        System.out.println("numeros positivos: "+ positivos);
        System.out.println("numeros negativos: "+ negativos);
        System.out.println("numeros cero: "+ cero);

    }

}
