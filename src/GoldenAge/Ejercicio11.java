package GoldenAge;

import java.util.Scanner;

/*
Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
cuántos tienen notas mayores o iguales a 7 y cuántos menores.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int notasMayores = 0;
        int notasMenores = 0;
        int contadornotas= 0;
        System.out.println("Ingrese las 10 notas de los alumnos");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nota "+i);
            double nota = in.nextDouble();
            if(nota>=7){
                notasMayores++;
            }
            else{
                notasMenores++;
            }
        }
        System.out.println("Hay "+notasMayores+" notas mayores o iguales ");
        System.out.println("Hay "+notasMenores+" notas menores");
    }
}
