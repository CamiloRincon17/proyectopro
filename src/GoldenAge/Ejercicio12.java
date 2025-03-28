package GoldenAge;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantidadEmpleados =0, empleadoMayor =0,empleadoMenor=0;
        double Sueldoend=0;
        System.out.println("Ingrese la cantidad de empleados");
        cantidadEmpleados=in.nextInt();
        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("Ingrese el sueldo del empleado "+i);
            double sueldo = in.nextDouble();
            if(sueldo>=100 && 300>=sueldo){
                empleadoMenor++;
            }
            else if (sueldo>300){
                empleadoMayor++;
            }
         Sueldoend=Sueldoend+sueldo;
        }
        System.out.println("Hay "+empleadoMayor+" empleados con sueldo mayor a 300");
        System.out.println("Hay "+empleadoMenor+" empleados con sueldo entre 100 y 300");
        System.out.println("y el total de sueldo pagado a todos los usuarios es de "+Sueldoend);
    }
}
