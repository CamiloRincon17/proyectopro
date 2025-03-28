package GoldenAge;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        int sueldo=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su sueldo");
        sueldo=in.nextInt();
        int CantidadAños=0;
        System.out.println("Ingrese la cantidad de años que ha trabajdo en la empresa");
        CantidadAños=in.nextInt();
        if(sueldo<500 && CantidadAños>=10){
            
            System.out.println("usted ha resivido un aumento de 20% a su sueldo actual de "+((sueldo*0.2)+sueldo));

        }
        else if(sueldo<500 && CantidadAños<10){
            System.out.println("usted ha resivido un aumento de 5% a su sueldo actual de "+((sueldo*0.05)+sueldo));

        }else if(sueldo>500){
            System.out.println("su sueldo es de "+sueldo);
        }

        }
    }

