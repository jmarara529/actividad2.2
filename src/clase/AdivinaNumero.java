package clase;

import java.util.Scanner;

public class AdivinaNumero {

    public static int NumMaquina =(int)(Math.random()*100+1);
    public static int intentos = 10;
    public static void main(String[] args) {

        int num;
        Scanner entrada = new Scanner(System.in);




        mayoromenor(num);

        entrada.close();

    }

    private static void mayoromenor(int num){

        if (num > NumMaquina) System.out.println("el numero es menor");
        else System.out.println("el numero es mayor");

    }

}
