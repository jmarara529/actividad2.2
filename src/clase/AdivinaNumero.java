package clase;

import java.util.Scanner;

public class AdivinaNumero {

    public static int NumMaquina =(int)(Math.random()*100+1);
    public static int intentos = 10;
    public static void main(String[] args) {

        int num = NumPerson();


    }

    private static int NumPerson(){

        Scanner entrada = new Scanner(System.in);
        int num;
        for (num = 0;num != NumMaquina ; intentos--) {

            System.out.println("intentos restantes = " + intentos);
            if (intentos != 0){

                System.out.println("introduce un numero");
                num = entrada.nextInt();

                mayoromenorigual(num);

            } else if (intentos == 0) {

                System.out.println("se acabaron los intentos");
                System.out.println("el numero era " + NumMaquina);
                System.exit(0);

            }


        }

        entrada.close();

        return num;

    }

    private static void mayoromenorigual(int num){
        if (num == NumMaquina){

            System.out.println("Felicidades, el numero " + num + " es el numero correcto");

            System.exit(0);

        }else if (num > NumMaquina){

            System.out.println("el numero es menor");

        }else {

            System.out.println("el numero es mayor");

        }

    }

}
