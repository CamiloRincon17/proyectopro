
import java.util.Scanner;

public class TresCifras{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int Numero= 0;
      int Cifras=0;
      Numero=in.nextInt();
      for (int i = 0; i < Numero; i++) {
        Cifras = Numero/100;
      }
     if (Cifras>4){
System.out.println("Error");
      }
System.out.println("La cantidad de cifras es "+Cifras);
    }
}