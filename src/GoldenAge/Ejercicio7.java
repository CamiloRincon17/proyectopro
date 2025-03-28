package GoldenAge;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int numero =0,cantidadDigitos=0,numerOriginal=0;
        System.out.println("Ingrese un numero");
            numero=in.nextInt();
            numerOriginal=numero+1;
            if (numerOriginal>=1000) {
                System.out.println("El numero que acaba de ingresar tiene mas de 3 cifras");
                System.out.println("Vuelva a ingresar el numero");
                numero=in.nextInt();
                
            }
        for (int i = 0; i < numero; i++) {
            numero=numero/10;
            cantidadDigitos=cantidadDigitos+1;
        }

        switch (cantidadDigitos) {
            case 1:
                System.out.println("Su numero tiene 1 cifras");
                break;
            case 2:
                System.out.println("Su numero tiene 2 cifras");
                break;
            case 3:
                System.out.println("su numero tiene 3 cifras");
                break;
            default:
        }
    }
}
