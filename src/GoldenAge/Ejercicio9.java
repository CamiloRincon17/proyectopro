package GoldenAge;
import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int nota1=0;
        int nota2=0;
        int nota3=0;
            System.out.println("Ingresa la primera nota");
            nota1=in.nextInt();
            System.out.println("Ingresa la segunda nota");
            nota2=in.nextInt();
            System.out.println("Ingresa la tercera nota");
            nota3=in.nextInt();
        int proNotas=((nota1+nota2+nota3)/3);
        if(proNotas>=7){
            System.out.println("Promocionado con una nota de "+proNotas);

        }
        else if(proNotas>=4 && proNotas<7){
            System.out.println("Regular");
        }
        else{
            System.out.println("Reprobado");
        }


    }
}
