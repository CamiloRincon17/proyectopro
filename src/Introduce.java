import java.util.Scanner;;
public class Introduce {
   public static void main(String[] args) {
    System.out.println("Ingrese su nombre");
    Scanner in = new Scanner(System.in);
    String name =in.nextLine();
    System.out.println("Ingrese su edad ");
    int age =in.nextInt();
    System.out.println("ingrese su altura");
    int heigh =in.nextInt();
    System.out.println("su nombre es "+name+",su edad es "+age+" ,su altura es "+heigh);
   } 
}
