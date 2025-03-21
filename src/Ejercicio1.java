
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num1 = 0;
        int Num2 = 0;
        System.out.println("ingrese el primer numero ");
        Num1 = in.nextInt();
        System.out.println("ingrese el segundo numero");
        Num2 = in.nextInt();
        if (Num1 > Num2) {
            System.out.println("la suma de estos numeros es " + (Num1 + Num2) + " y la diferencia es " + (Num1 - Num2) + "");
        } else {

        }
    }
}
