
import java.util.Scanner;

public class PrimosGemelos{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador=0;
        System.out.println("Ingrese el primer numero");
        int inicio = in.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int End = in.nextInt();
        System.out.println("El primer numero es: "+inicio+" y el segundo es "+End);
        if(inicio<0 || End<inicio){
        System.out.println("Rango no valido");
        in.close();
        return;
        }
        for (int i = inicio; i <= End; i++) {
         if(i<=1){
          continue;
         }
         if(i==2){
            contador+=1;
            System.out.println(i);
         }
         if(i%2==1){

            contador +=1;
            System.out.println(i);

        }
        contador=contador/2;
        }
        System.out.println("la cantidad de primos gemelos antes del "+End+" es "+contador);      
        
    }
        
    }
