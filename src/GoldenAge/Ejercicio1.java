package GoldenAge;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        numberOne = in.nextInt();
        System.out.println("ingrese el segundo numero");
        numberTwo = in.nextInt();
        if (numberOne >numberTwo) {
            System.out.println("la suma de estos numeros es " + (numberOne + numberTwo) + " y la diferencia es " + (numberOne - numberTwo) + "");
        } else {
          System.out.println("la divicion de los numeros es "+(numberOne/numberTwo)+" y la multiplicacion es "+(numberOne*numberTwo));
        }
    }
 }
