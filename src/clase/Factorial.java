package clase;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        do {

            System.out.println("introduce un numero");
            num = entrada.nextInt();
            if (num != -1) factorial(num);

        }while (num != -1);
    }

    private static void factorial(int num){
        int resultado = 1;
        for (int fac = 1;fac <= num; fac++){
            resultado = resultado * fac;
        }
        System.out.println("el resultado del factorial es: " + resultado);
    }

}
