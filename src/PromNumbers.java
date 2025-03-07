import java.util.*;
public class PromNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        int num1=in.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2=in.nextInt();
        System.out.println("ingrese el tercer numero");
        int num3=in.nextInt();
        int Promedio=(num1+num1+num3)/3;
        System.out.println("El promedio es "+Promedio);
    }
}
