package GoldenAge;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Numero =0;
        System.out.println("Ingrese un numero");
        Numero=in.nextInt();
        if(Numero==0){
            System.out.println("El numero es nulo");

        }
        else if(Numero<0){
            System.out.println("El numero es negativo");

        }
        else{
            System.out.println("El numero que ingreso es positivo");
        }
    }
}
