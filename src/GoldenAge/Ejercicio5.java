package GoldenAge;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int Num1=0,Num2=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        Num1=in.nextInt();
        System.out.println("Ingrese el segundo numero");
        Num2=in.nextInt();
        if(Num1>Num2){
            System.out.println("El numero "+Num1+" es mayor que "+Num2);

        }
        else{
            System.out.println("El numero "+Num2+" es mayor que "+Num1);
        }
    }
}
