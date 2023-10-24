package clase;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce un numero (-1=exit)");
        int num = entrada.nextInt();

        do {

            multiplicacion(num);

            System.out.println("introduce un numero (-1=exit)");
            num = entrada.nextInt();

        }while (num >= 0);
        entrada.close();

    }

    private static void multiplicacion (int num){

        for (int multi = 1; multi <= 10; multi++){
            int resultado = num * multi;
            System.out.println(num + " * " + multi + " = " + resultado);

        }

    }

}
