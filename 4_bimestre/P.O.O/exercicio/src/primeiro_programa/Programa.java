package primeiro_programa;

import carro_motor_roda.Motor;

public class Programa {
    public static void main(String[] args) {

        int num = 10;

        //System.out.print("O número é " + num);

        Motor motor1 = new Motor("Fiat", 2008, 18 );
        Motor motor2 = new Motor("Ferrari", 2023, 20);
        System.out.println(motor1);
        System.out.println(motor2);
    }



}
