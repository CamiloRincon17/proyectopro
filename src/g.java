import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        System.out.println("Ingrese la hora en formato HH:MM(24 horas)");
        Scanner in = new Scanner(System.in);
        String entrada = in.nextLine();
        in.close();

        // Validate the input format
        if (entrada.length() != 5 || entrada.charAt(2) != ':') {
            System.out.println("Formato no valido");
            return;
        }

        // Extract hours and minutes
        char h1 = entrada.charAt(0);
        char h2 = entrada.charAt(1);
        char m1 = entrada.charAt(3);
        char m2 = entrada.charAt(4);

        // Convert characters to integers
        int hour = Integer.parseInt("" + h1 + h2);
        int minutos = Integer.parseInt("" + m1 + m2);

        // Validate the time
        if (hour < 0 || hour > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora no valida");
            return;
        }

        // Print the time
        System.out.println("Hora ingresada: " + String.format("%02d:%02d", hour, minutos));
    }
}