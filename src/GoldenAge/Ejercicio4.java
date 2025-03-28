package GoldenAge;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int Sueldo=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el sueldo que gana a la semana");
        Sueldo=in.nextInt();
        if(Sueldo>=3000){
            System.out.println("Usted debe pagar impuestos");
        }
        else{
            System.out.println("por ser una persona poor no debe pagar impuestos");
        }
    }
}
