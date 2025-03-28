package GoldenAge;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Porcentaje = 0;
        System.out.println("Ingrese el porcentaje de de preguntas correctas");
        if(Porcentaje>=90){
            System.out.println("Usted esta en el Nivel Maximo");
        }
        else if(Porcentaje>=75 && Porcentaje <90){
            System.out.println("Usted esta en el Nivel Medio");
        }
        else if (Porcentaje>=50 && Porcentaje <75){
            System.out.println("Usted esta en el Nivel Regular");
        }
        else{
            System.out.println("Usted es una mierda esta en Fuera de nivel");

        }
    }
}
