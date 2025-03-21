import java.util.*;
public class Clock {
    public static void main(String[] args) {
        System.out.println("Ingrese la hora en formato HH:MM(24 horas)");
        Scanner in =new Scanner(System.in);
        String entrada =in.nextLine();
        in.close();
        if(entrada.length() !=5 || entrada.charAt(2) !=':'){
            System.out.println("Formato no valido");
            return;
        }
    char h1 = entrada.charAt(0);
    char h2 = entrada.charAt(1);
    char m1 = entrada.charAt(3);
    char m2 = entrada.charAt(4);
   int Hour = (h1-'0')*10+(h2-'0');
   int minutos =(m1-'0')*10 + (m2-'0');
 
    
   if (Hour < 0 || Hour > 23 || minutos < 0 || minutos > 59) {
    System.out.println("Hora no valida");
    return;
    
   
}
System.out.println("Hora ingresada: " + String.format("%02d:%02d", Hour, minutos));
if (minutos==0) {
    System.out.println("son las "+Hour+" en punto");
}
int Hour12=(Hour%12==0)?12:
Hour%12;
}
}